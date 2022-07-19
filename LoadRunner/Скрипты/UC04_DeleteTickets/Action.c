Action()
{
	int i;
	
	lr_start_transaction("UC04_DeleteTickets");
	
	homePage();

	login();
	
	lr_start_transaction("clickItinerary");
	
	web_reg_find("Text=No flights have been reserved.",
                 "SaveCount=not_flights",
                 LAST);
	
	if (atoi(lr_eval_string("{not_flights}")) > 0) {
		web_reg_find("Text=No flights have been reserved.",LAST);
	} else {
		web_reg_find("Text=Flights List",LAST);
	}
		
    web_url("Itinerary Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);
		
	web_reg_save_param("c_flightids",
	   "lb=<input type=\"hidden\" name=\"flightID\" value=\"", "rb=\"  />",
	   "ord=all",
	   LAST);
	
	 web_reg_save_param("c_cgifields",
	   "lb=<input type=\"hidden\" name=\".cgifields\" value=\"",
	   "rb=\"  />",
	   "ord=all",
	   LAST);
	
	web_url("Itinerary Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);
	
	lr_end_transaction("clickItinerary",LR_AUTO);
	
	lr_start_transaction("deleteTicket");

   lr_param_sprintf("c_buffer", "%s=on&", lr_eval_string("{c_flightids_count}"));
    	
   lr_save_string(lr_eval_string("{c_buffer}removeFlights.x=39&removeFlights.y=11"), "c_wcr");

    lr_save_string(lr_eval_string(lr_eval_string("{c_flightids_{c_flightids_count}}")), "c_cancelflight");

    web_reg_find("Text={c_cancelflight}", "Fail=Found", LAST);

      	
    	web_submit_data("itinerary.pl", 
		"Action=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=flightID", "Value={c_cancelflight}", ENDITEM, 
		"Name=.cgifields", "Value={c_cancelflight}", ENDITEM, 
		"Name=removeFlights.x", "Value=39", ENDITEM, 
		"Name=removeFlights.y", "Value=11", ENDITEM, 
		LAST);
    
    
	lr_end_transaction("deleteTicket",LR_AUTO);
	
	lr_end_transaction("UC04_DeleteTickets",LR_AUTO);

	return 0;
}