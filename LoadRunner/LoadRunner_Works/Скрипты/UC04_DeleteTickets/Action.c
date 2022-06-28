Action()
{

	int i;
	
	web_set_max_html_param_len("4294967295");
	
	lr_start_transaction("UC04_DeleteTickets");
	
	homePage();

	lr_start_transaction("clickToRegProfile");
	
	web_reg_find("Text=First time registering?", LAST);

	web_url("sign up now", 
		"URL=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/home.html", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("clickToRegProfile",LR_AUTO);

	lr_think_time(5);

	regProfile();
	
	lr_think_time(5);

	login();
	
	lr_think_time(5);

	lr_start_transaction("clickItinerary");
	
	web_reg_find("Text=Itinerary",LAST);

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
	
	web_url("Itinerary Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("clickItinerary",LR_AUTO);

	lr_think_time(5);
	
	 lr_save_string("", "c_buffer");

    for (i=1;i<=2;i++)
    {
        lr_param_sprintf("c_buffer", "%s%d=on&", lr_eval_string("{c_buffer}"), i);
    }

    lr_param_sprintf("c_buffer",
    "%s=on&",
    lr_eval_string("{c_flightids_count}"));

    for (i=1;i<=atoi(lr_eval_string("{c_flightids_count}"));i++)
    {
        lr_param_sprintf("c_buffer",
        "%sflightID=%s&",
        lr_eval_string("{c_buffer}"),
        lr_paramarr_idx("c_flightids",
        i));

        lr_param_sprintf("c_buffer",
        "%s.cgifields=%s&",
        lr_eval_string("{c_buffer}"),
        lr_paramarr_idx("c_cgifields",
        i));
    }

   lr_save_string(lr_eval_string("{c_buffer}removeFlights.x=36&removeFlights.y=4"), "c_wcr");

	lr_start_transaction("deleteTicket");
	
   web_set_max_html_param_len("4294967295");
	
	lr_save_string(lr_eval_string(lr_eval_string("{c_flightids_{c_flightids_count}}")),
    "c_cancelflight");
	
	web_reg_find("Text={c_cancelflight}", "Fail=Found", LAST);
	
	web_submit_data("itinerary.pl",
		"Action=http://localhost:1080/cgi-bin/itinerary.pl",
		"Method=POST",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl",
		"Snapshot=t7.inf",
		"Mode=HTML",
		ITEMDATA,
		"Name=1", "Value=on", ENDITEM,
		"Name=flightID", "Value=210297416-100265-JB", ENDITEM,
		"Name=flightID", "Value=210297416-177189-JB", ENDITEM,
		"Name=flightID", "Value=210297424-254142-JB", ENDITEM,
		"Name=flightID", "Value=210297424-331066-JB", ENDITEM,
		"Name=flightID", "Value=33492785-41-JB", ENDITEM,
		"Name=flightID", "Value=334-0-92", ENDITEM,
		"Name=flightID", "Value=0-5-", ENDITEM,
		"Name=flightID", "Value=0-6-20", ENDITEM,
		"Name=.cgifields", "Value=6", ENDITEM,
		"Name=.cgifields", "Value=3", ENDITEM,
		"Name=.cgifields", "Value=7", ENDITEM,
		"Name=.cgifields", "Value=2", ENDITEM,
		"Name=.cgifields", "Value=8", ENDITEM,
		"Name=.cgifields", "Value=1", ENDITEM,
		"Name=.cgifields", "Value=4", ENDITEM,
		"Name=.cgifields", "Value=5", ENDITEM,
		"Name=removeFlights.x", "Value=40", ENDITEM,
		"Name=removeFlights.y", "Value=7", ENDITEM,
		LAST);

//	lr_save_string(lr_eval_string("{deleteID}"), "deleteTicket");
//	
//	web_reg_find("{deleteTicket}",LAST);

	lr_end_transaction("deleteTicket",LR_AUTO);
	
	lr_end_transaction("UC04_DeleteTickets",LR_AUTO);

	return 0;
}