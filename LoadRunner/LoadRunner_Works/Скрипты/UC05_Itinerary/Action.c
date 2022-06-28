Action()
{

	lr_start_transaction("UC05_Itinerary");
	
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
	
	lr_end_transaction("UC05_Itinerary",LR_AUTO);

	return 0;
}