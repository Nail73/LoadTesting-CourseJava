Action()
{
	int i;
	int randNum;
	
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
	
	randNum = rand()%atoi(lr_eval_string("{c_flightids_count}")) + 1;
	
	lr_save_int(randNum, "randNum");
	
	lr_save_string(lr_paramarr_idx("c_flightids", randNum), "cancel_ticket_id");
	
	lr_start_transaction("deleteTicket");

      	web_reg_find("Text={cancel_ticket_id}", "Fail=Found", LAST);
    	web_submit_form("itinerary.pl", 
		"Snapshot=t13.inf", 
		ITEMDATA, 
		"Name={randNum}", "Value=on", ENDITEM, 
		"Name=removeFlights.x", "Value=40", ENDITEM, 
		"Name=removeFlights.y", "Value=13", ENDITEM, 
		LAST);
    
    
	lr_end_transaction("deleteTicket",LR_AUTO);
	
	lr_end_transaction("UC04_DeleteTickets",LR_AUTO);

	return 0;
}