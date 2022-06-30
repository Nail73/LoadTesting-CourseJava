Action()
{
	lr_start_transaction("UC02_Login");

	homePage();

	login();

	lr_think_time(5);
	
	lr_start_transaction("clickToFlights");
	
	web_reg_find("Text=Find Flight",LAST);

	web_url("Search Flights Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("clickToFlights",LR_AUTO);

	logout();
		
	lr_end_transaction("UC02_Login",LR_AUTO);

	return 0;
}