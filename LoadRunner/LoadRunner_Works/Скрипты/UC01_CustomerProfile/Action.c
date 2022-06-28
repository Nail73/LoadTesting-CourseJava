Action()
{

	lr_start_transaction("UC01_CustomerProfile");
	
	homePage();

	lr_start_transaction("clickToRegProfile");
	
	web_reg_find("Text=First time registering?", LAST);

	web_url("sign up now", 
		"URL=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/home.html", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);
	
	lr_end_transaction("clickToRegProfile",LR_AUTO);

	lr_think_time(5);

	regProfile();
	
	lr_think_time(5);

	lr_start_transaction("saveProfile");
	
	web_reg_find("Text/IC=<blockquote>Welcome, <b>{Username}</b>, to the Web Tours reservation pages.",LAST);

		web_url("button_next.gif", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("saveProfile",LR_AUTO);
	
	lr_end_transaction("UC01_CustomerProfile",LR_AUTO);

	return 0;
}