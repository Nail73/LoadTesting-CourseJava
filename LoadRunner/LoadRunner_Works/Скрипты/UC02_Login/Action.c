Action()
{
	lr_start_transaction("UC02_Login");

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

	lr_start_transaction("logout");
	
	web_reg_find("Text=Web Tours",
		LAST);

	web_url("SignOff Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("logout",LR_AUTO);
	
	lr_end_transaction("UC02_Login",LR_AUTO);

	return 0;
}