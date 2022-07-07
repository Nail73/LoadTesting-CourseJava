Action()
{

	lr_start_transaction("homePage");

	web_url("WebTours", 
		"URL=http://localhost:1080/WebTours", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("homePage",LR_AUTO);

	lr_think_time(25);

	lr_start_transaction("login");

	web_submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"TargetFrame=body", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=userSession", "Value=134163.78817335zQAVAtQpiftVzzzHtVtAzpcQQVcf", ENDITEM, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=bean", ENDITEM, 
		"Name=JSFormSubmit", "Value=off", ENDITEM, 
		"Name=login.x", "Value=57", ENDITEM, 
		"Name=login.y", "Value=7", ENDITEM, 
		LAST);

	lr_end_transaction("login",LR_AUTO);

	lr_think_time(23);

	lr_start_transaction("clickItinerary");

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

	lr_think_time(26);

	lr_start_transaction("deleteTicket");

	web_submit_data("itinerary.pl", 
		"Action=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=1", "Value=on", ENDITEM, 
		"Name=flightID", "Value=210297424-100296-JB", ENDITEM, 
		"Name=flightID", "Value=210297416-177189-JB", ENDITEM, 
		"Name=flightID", "Value=210297416-254112-JB", ENDITEM, 
		"Name=flightID", "Value=210297424-331066-JB", ENDITEM, 
		"Name=flightID", "Value=210297424-407989-JB", ENDITEM, 
		"Name=flightID", "Value=33492785-48-JB", ENDITEM, 
		"Name=flightID", "Value=0-5-M", ENDITEM, 
		"Name=flightID", "Value=0-0-", ENDITEM, 
		"Name=flightID", "Value=8-6-", ENDITEM, 
		"Name=.cgifields", "Value=6", ENDITEM, 
		"Name=.cgifields", "Value=3", ENDITEM, 
		"Name=.cgifields", "Value=7", ENDITEM, 
		"Name=.cgifields", "Value=9", ENDITEM, 
		"Name=.cgifields", "Value=2", ENDITEM, 
		"Name=.cgifields", "Value=8", ENDITEM, 
		"Name=.cgifields", "Value=1", ENDITEM, 
		"Name=.cgifields", "Value=4", ENDITEM, 
		"Name=.cgifields", "Value=5", ENDITEM, 
		"Name=removeFlights.x", "Value=44", ENDITEM, 
		"Name=removeFlights.y", "Value=12", ENDITEM, 
		LAST);

	lr_end_transaction("deleteTicket",LR_AUTO);

	return 0;
}