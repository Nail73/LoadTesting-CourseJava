Action()
{
	int i;
	
	lr_start_transaction("UC01_CustomerProfile");
	
	homePage();
	
	lr_start_transaction("clickToRegProfile");
	
	web_reg_find("Text=First time registering? Please complete the form below",LAST);
	
	lr_param_sprintf("Login", "%s", lr_eval_string("{Username}{RandomLetter}"));
	lr_param_sprintf("Pass", "%s", lr_eval_string("{Password}"));
	
	for (i = 1; i < atoi(lr_eval_string("{RndNumber}")); i++) {
		lr_param_sprintf("Login", "%s%s", lr_eval_string("{Login}"), lr_eval_string("{RandomLetter}"));
		lr_param_sprintf("Pass", "%s%s%s", lr_eval_string("{Pass}"), lr_eval_string("{RandomLetter}"), lr_eval_string("{RndNumber}"));
	}

	web_add_header("DNT", 
		"1");

	web_url("login.pl", 
		"URL=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/home.html", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);
	
	lr_end_transaction("clickToRegProfile",LR_AUTO);

	lr_start_transaction("regProfile");

	web_reg_find("Text/IC=Thank you, <b>{Login}</b>, for registering and welcome to the Web Tours family.",LAST);
	
		web_submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"TargetFrame=info", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=username", "Value={Login}", ENDITEM, 
		"Name=password", "Value={Pass}", ENDITEM, 
		"Name=passwordConfirm", "Value={Pass}", ENDITEM, 
		"Name=firstName", "Value={FirstName}", ENDITEM, 
		"Name=lastName", "Value={LastName}", ENDITEM, 
		"Name=address1", "Value={StreetAddress}", ENDITEM, 
		"Name=address2", "Value={City}", ENDITEM, 
		"Name=register.x", "Value=34", ENDITEM, 
		"Name=register.y", "Value=5", ENDITEM, 
		LAST);
	
	lr_end_transaction("regProfile",LR_AUTO);
	
	lr_start_transaction("saveProfile");
	
	web_reg_find("Text/IC=Welcome, <b>{Login}</b>, to the Web Tours reservation pages.",LAST);

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

	logout();
	
	lr_end_transaction("UC01_CustomerProfile",LR_AUTO);

	return 0;
}