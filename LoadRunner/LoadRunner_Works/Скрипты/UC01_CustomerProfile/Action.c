<<<<<<< HEAD
Action()
{
	
	lr_start_transaction("UC01_CustomerProfile");
	
	homePage();

	clickToRegProfile();

	lr_think_time(5);

	lr_start_transaction("regProfile");
	
		
		web_reg_find("Text/IC=<blockquote>Thank you, <b>{Username}{RandomLetter}</b>, for registering and welcome to the Web Tours family.",LAST);

		web_submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"TargetFrame=info", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=username", "Value={Username}{RandomLetter}", ENDITEM, 
		"Name=password", "Value={Password}", ENDITEM, 
		"Name=passwordConfirm", "Value={Password}", ENDITEM, 
		"Name=firstName", "Value={FirstName}", ENDITEM, 
		"Name=lastName", "Value={LastName}", ENDITEM, 
		"Name=address1", "Value={StreetAddress}", ENDITEM, 
		"Name=address2", "Value={City}", ENDITEM, 
		"Name=register.x", "Value=34", ENDITEM, 
		"Name=register.y", "Value=5", ENDITEM, 
		LAST);
	
	lr_end_transaction("regProfile",LR_AUTO);
	
	lr_think_time(5);

	lr_start_transaction("saveProfile");
	
	web_reg_find("Text=Welcome",
		LAST);

	
	//web_reg_find("Text/IC=<blockquote>Welcome, <b>{Username}{RandomLetter}</b>, to the Web Tours reservation pages.",LAST);

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
	
	lr_think_time(5);

	logout();
	
	lr_end_transaction("UC01_CustomerProfile",LR_AUTO);

	return 0;
=======
Action()
{
	
	lr_start_transaction("UC01_CustomerProfile");
	
	homePage();

	clickToRegProfile();

	lr_think_time(5);

	lr_start_transaction("regProfile");
	
		
		web_reg_find("Text/IC=<blockquote>Thank you, <b>{Username}{RandomLetter}</b>, for registering and welcome to the Web Tours family.",LAST);

		web_submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"TargetFrame=info", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=username", "Value={Username}{RandomLetter}", ENDITEM, 
		"Name=password", "Value={Password}", ENDITEM, 
		"Name=passwordConfirm", "Value={Password}", ENDITEM, 
		"Name=firstName", "Value={FirstName}", ENDITEM, 
		"Name=lastName", "Value={LastName}", ENDITEM, 
		"Name=address1", "Value={StreetAddress}", ENDITEM, 
		"Name=address2", "Value={City}", ENDITEM, 
		"Name=register.x", "Value=34", ENDITEM, 
		"Name=register.y", "Value=5", ENDITEM, 
		LAST);
	
	lr_end_transaction("regProfile",LR_AUTO);
	
	lr_think_time(5);

	lr_start_transaction("saveProfile");
	
	web_reg_find("Text=Welcome",
		LAST);

	
	//web_reg_find("Text/IC=<blockquote>Welcome, <b>{Username}{RandomLetter}</b>, to the Web Tours reservation pages.",LAST);

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
	
	lr_think_time(5);

	logout();
	
	lr_end_transaction("UC01_CustomerProfile",LR_AUTO);

	return 0;
>>>>>>> 32ac712d1d8db92f181522dcbdf1d5b5637a0702
}