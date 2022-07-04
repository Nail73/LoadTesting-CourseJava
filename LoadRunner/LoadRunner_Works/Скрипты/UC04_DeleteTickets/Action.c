Action()
{

	int i;
	
	lr_start_transaction("UC04_DeleteTickets");
	
	homePage();

	login();
	
	lr_think_time(5);

	lr_start_transaction("clickItinerary");
	
	web_reg_find("Text=Flights List",LAST);
		
    web_url("welcome.pl", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);
		
	   	web_reg_save_param("c_flightids",
    	"lb=<input type=\"hidden\" name=\"flightID\" value=\"",
    	"rb=\"  />",
    	"ord=all",
    	LAST);

    	web_reg_save_param("c_cgifields",
    	"lb=<input type=\"hidden\" name=\".cgifields\" value=\"",
    	"rb=\"  />",
    	"ord=all",
    	LAST);
	
	lr_end_transaction("clickItinerary",LR_AUTO);

	lr_think_time(5);
	
	lr_start_transaction("deleteTicket");

    	lr_param_sprintf("c_buffer", "%s=on&", lr_eval_string("{c_flightids_count}"));
    	
    	for (i=1;i<=atoi(lr_eval_string("{c_flightids_count}"));i++) {
    	
        	lr_param_sprintf("c_buffer", "%sflightID=%s&", lr_eval_string("{c_buffer}"), lr_paramarr_idx("c_flightids", i));

        	lr_param_sprintf("c_buffer", "%s.cgifields=%s&", lr_eval_string("{c_buffer}"), lr_paramarr_idx("c_cgifields", i));
    	}

    	lr_save_string(lr_eval_string("{c_buffer}removeFlights.x=36&removeFlights.y=4"), "c_wcr");

    	lr_save_string(lr_eval_string(lr_eval_string("{c_flightids_{c_flightids_count}}")), "c_cancelflight");

    	web_reg_find("Text={c_cancelflight}", "Fail=Found", LAST);
    	
    	web_url("welcome.pl", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("deleteTicket",LR_AUTO);
	
	lr_end_transaction("UC04_DeleteTickets",LR_AUTO);

	return 0;
}