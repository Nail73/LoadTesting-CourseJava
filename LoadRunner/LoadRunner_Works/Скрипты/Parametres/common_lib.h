homePage(){
	lr_start_transaction("homePage");

	web_add_auto_header("DNT", 
		"1");
	
	web_reg_find("Text=Welcome to the Web Tours site",LAST);

/*Correlation comment - Do not change!  Original value='134169.922316727zQAVDzfpDHQVzzzHtVtAipVQccHf' Name ='userSession' Type ='ResponseBased'*/
	web_reg_save_param_attrib(
		"ParamName=userSession",
		"TagName=input",
		"Extract=value",
		"Name=userSession",
		"Type=hidden",
		SEARCH_FILTERS,
		"IgnoreRedirections=No",
		"RequestUrl=*/nav.pl*",
		LAST);

	web_url("WebTours", 
		"URL=http://localhost:1080/WebTours/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		LAST);

	web_set_sockets_option("SSL_VERSION", "AUTO");

	lr_end_transaction("homePage",LR_AUTO);
	
	return 0;
}

clickToRegProfile()
{

	lr_start_transaction("clickToRegProfile");
	
	web_reg_find("Text=First time registering?",
		LAST);
		
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
	
	return 0;
}

login(){
lr_start_transaction("login");
	
	web_reg_find("Text/IC=<blockquote>Welcome, <b>{Username}</b>, to the Web Tours reservation pages.",
		LAST);

	web_submit_data("login.pl_2",
		"Action=http://localhost:1080/cgi-bin/login.pl",
		"Method=POST",
		"TargetFrame=info",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/nav.pl?in=home",
		"Snapshot=t6.inf",
		"Mode=HTML",
		ITEMDATA,
		"Name=userSession", "Value={userSession}", ENDITEM,
		"Name=username", "Value={Username}", ENDITEM,
		"Name=password", "Value={Password}", ENDITEM,
		"Name=JSFormSubmit", "Value=off", ENDITEM,
		"Name=login.x", "Value=58", ENDITEM,
		"Name=login.y", "Value=7", ENDITEM,
		LAST);

	lr_end_transaction("login",LR_AUTO);
	
	return 0;
	}
	
	logout(){
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
	
	return 0;
	}
	