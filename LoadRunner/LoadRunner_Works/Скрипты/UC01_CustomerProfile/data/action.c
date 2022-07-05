Action()
{

	lr_start_transaction("1_transaction");

	web_add_auto_header("DNT", 
		"1");

	web_url("WebTours", 
		"URL=http://localhost:1080/WebTours/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);

	web_set_sockets_option("SSL_VERSION", "AUTO");

	lr_end_transaction("1_transaction",LR_AUTO);

	lr_think_time(7);

	lr_start_transaction("2_transaction reg");

	web_url("sign up now", 
		"URL=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/home.html", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	lr_think_time(118);

	web_submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"TargetFrame=info", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=username", "Value=Ivan", ENDITEM, 
		"Name=password", "Value=iviv", ENDITEM, 
		"Name=passwordConfirm", "Value=iviv", ENDITEM, 
		"Name=firstName", "Value=Ivan", ENDITEM, 
		"Name=lastName", "Value=Ivanov", ENDITEM, 
		"Name=address1", "Value=Glinki", ENDITEM, 
		"Name=address2", "Value=Detroit", ENDITEM, 
		"Name=register.x", "Value=34", ENDITEM, 
		"Name=register.y", "Value=5", ENDITEM, 
		LAST);

	lr_think_time(32);

	web_submit_data("login.pl_2", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"TargetFrame=info", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=username", "Value=Ivan123", ENDITEM, 
		"Name=password", "Value=iviv", ENDITEM, 
		"Name=passwordConfirm", "Value=iviv", ENDITEM, 
		"Name=firstName", "Value=Ivan", ENDITEM, 
		"Name=lastName", "Value=Ivanov", ENDITEM, 
		"Name=address1", "Value=Glinki", ENDITEM, 
		"Name=address2", "Value=Detroit", ENDITEM, 
		"Name=register.x", "Value=51", ENDITEM, 
		"Name=register.y", "Value=12", ENDITEM, 
		LAST);

	lr_think_time(4);

	web_url("button_next.gif", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("2_transaction reg",LR_AUTO);

	return 0;
}