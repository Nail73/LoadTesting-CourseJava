Action()
	
{
	lr_start_transaction("UC03_BuyTickets");

	homePage();

	login();
	
	lr_start_transaction("clickToFlights");
	
	web_reg_find("Text=Find Flight",LAST);

		web_url("Search Flights Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"TargetFrame=body", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		LAST);
			
	lr_end_transaction("clickToFlights",LR_AUTO);

	lr_start_transaction("searchTicket");
	
/*Correlation comment - Do not change!  Original value='020;338;06/25/2022' Name ='outboundFlight_1' Type ='ResponseBased'*/
	web_reg_save_param_attrib(
		"ParamName=outboundFlight",
		"TagName=input",
		"Extract=value",
		"Name=outboundFlight",
		"Ordinal=ALL",
		"Type=radio",
		SEARCH_FILTERS,
		"IgnoreRedirections=No",
		LAST);
		
	web_reg_find("Text/IC=<blockquote>Flight departing from <B>{Town}</B> to <B>{Town2}</B> on <B>{DepartDate}</B>",LAST);
		
	web_submit_data("reservations.pl", 
		"Action=http://localhost:1080/cgi-bin/reservations.pl", 
		"Method=POST", 
		"TargetFrame=", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl?page=welcome", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=depart", "Value={Town}", ENDITEM, 
		"Name=departDate", "Value={DepartDate}", ENDITEM, 
		"Name=arrive", "Value={Town2}", ENDITEM, 
		"Name=returnDate", "Value={ReturnDate}", ENDITEM, 
		"Name=numPassengers", "Value={NumPassengers}", ENDITEM, 
		"Name=seatPref", "Value={SeatingPreference}", ENDITEM, 
		"Name=seatType", "Value={TypeOfSeat}", ENDITEM, 
		"Name=.cgifields", "Value={TypeOfSeat}", ENDITEM, 
		"Name=.cgifields", "Value={SeatingPreference}", ENDITEM, 
		"Name=findFlights.x", "Value=38", ENDITEM, 
		"Name=findFlights.y", "Value=6", ENDITEM, 
		"Name=.cgifields", "Value=seatType", ENDITEM, 
		"Name=.cgifields", "Value=seatPref", ENDITEM, 
		LAST);
		
      
 	lr_end_transaction("searchTicket",LR_AUTO);
	
	lr_start_transaction("departureTime");
	
	web_reg_find("Text=Flight Reservation",LAST);

	lr_save_string(lr_eval_string(lr_paramarr_random("outboundFlight")),"outboundFlightVal");
	
	web_submit_data("reservations.pl_2",
		"Action=http://localhost:1080/cgi-bin/reservations.pl",
		"Method=POST",
		"TargetFrame=",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/reservations.pl",
		"Snapshot=t17.inf",
		"Mode=HTML",
		ITEMDATA,
		"Name=outboundFlight", "Value={outboundFlightVal}", ENDITEM,
		"Name=numPassengers", "Value={NumPassengers}", ENDITEM,
		"Name=advanceDiscount", "Value=0", ENDITEM,
		"Name=seatType", "Value={TypeOfSeat}", ENDITEM,
		"Name=seatPref", "Value={SeatingPreference}", ENDITEM,
		"Name=reserveFlights.x", "Value=47", ENDITEM,
		"Name=reserveFlights.y", "Value=12", ENDITEM,
		LAST);
	
	lr_end_transaction("departureTime",LR_AUTO);

	lr_start_transaction("paymentDetails");
	
	web_reg_find("Text=Thank you for booking through Web Tours.",LAST);
	
	if (atoi(lr_eval_string("{NumPassengers}")) == 1) {

	web_submit_data("reservations.pl_3",
		"Action=http://localhost:1080/cgi-bin/reservations.pl",
		"Method=POST",
		"TargetFrame=",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/reservations.pl",
		"Snapshot=t18.inf",
		"Mode=HTML",
		ITEMDATA,
		"Name=firstName", "Value={PayFirstName}", ENDITEM,
		"Name=lastName", "Value={PayLastName}", ENDITEM,
		"Name=address1", "Value={PayAddress1}", ENDITEM,
		"Name=address2", "Value={PayAddress2}", ENDITEM,
		"Name=pass1", "Value={PayFirstName}  {PayLastName}", ENDITEM,
		"Name=creditCard", "Value={CreditCard}", ENDITEM,
		"Name=expDate", "Value={ExpDate}", ENDITEM,
		"Name=oldCCOption", "Value=", ENDITEM,
		"Name=numPassengers", "Value={NumPassengers}", ENDITEM,
		"Name=seatType", "Value={SeatingPreference}", ENDITEM,
		"Name=seatPref", "Value={TypeOfSeat}", ENDITEM,
		"Name=outboundFlight", "Value={outboundFlightVal}", ENDITEM,
		"Name=advanceDiscount", "Value=0", ENDITEM,
		"Name=buyFlights.x", "Value=63", ENDITEM,
		"Name=buyFlights.y", "Value=6", ENDITEM,
		"Name=.cgifields", "Value=saveCC", ENDITEM,
		LAST);
	} else if (atoi(lr_eval_string("{NumPassengers}")) == 2) {
		
		web_submit_data("reservations.pl_3",
		"Action=http://localhost:1080/cgi-bin/reservations.pl",
		"Method=POST",
		"TargetFrame=",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/reservations.pl",
		"Snapshot=t18.inf",
		"Mode=HTML",
		ITEMDATA,
		"Name=firstName", "Value={PayFirstName}", ENDITEM,
		"Name=lastName", "Value={PayLastName}", ENDITEM,
		"Name=address1", "Value={PayAddress1}", ENDITEM,
		"Name=address2", "Value={PayAddress2}", ENDITEM,
		"Name=pass1", "Value={PayFirstName}  {PayLastName}", ENDITEM,
		"Name=pass2", "Value={Pass2}", ENDITEM,
		"Name=creditCard", "Value={CreditCard}", ENDITEM,
		"Name=expDate", "Value={ExpDate}", ENDITEM,
		"Name=oldCCOption", "Value=", ENDITEM,
		"Name=numPassengers", "Value={NumPassengers}", ENDITEM,
		"Name=seatType", "Value={SeatingPreference}", ENDITEM,
		"Name=seatPref", "Value={TypeOfSeat}", ENDITEM,
		"Name=outboundFlight", "Value={outboundFlightVal}", ENDITEM,
		"Name=advanceDiscount", "Value=0", ENDITEM,
		"Name=buyFlights.x", "Value=63", ENDITEM,
		"Name=buyFlights.y", "Value=6", ENDITEM,
		"Name=.cgifields", "Value=saveCC", ENDITEM,
		LAST);
		
	} else if (atoi(lr_eval_string("{NumPassengers}")) == 3) {
		
		web_submit_data("reservations.pl_3",
		"Action=http://localhost:1080/cgi-bin/reservations.pl",
		"Method=POST",
		"TargetFrame=",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/reservations.pl",
		"Snapshot=t18.inf",
		"Mode=HTML",
		ITEMDATA,
		"Name=firstName", "Value={PayFirstName}", ENDITEM,
		"Name=lastName", "Value={PayLastName}", ENDITEM,
		"Name=address1", "Value={PayAddress1}", ENDITEM,
		"Name=address2", "Value={PayAddress2}", ENDITEM,
		"Name=pass1", "Value={PayFirstName}  {PayLastName}", ENDITEM,
		"Name=pass2", "Value={Pass2}", ENDITEM,
		"Name=pass3", "Value={Pass3}", ENDITEM,
		"Name=creditCard", "Value={CreditCard}", ENDITEM,
		"Name=expDate", "Value={ExpDate}", ENDITEM,
		"Name=oldCCOption", "Value=", ENDITEM,
		"Name=numPassengers", "Value={NumPassengers}", ENDITEM,
		"Name=seatType", "Value={SeatingPreference}", ENDITEM,
		"Name=seatPref", "Value={TypeOfSeat}", ENDITEM,
		"Name=outboundFlight", "Value={outboundFlightVal}", ENDITEM,
		"Name=advanceDiscount", "Value=0", ENDITEM,
		"Name=buyFlights.x", "Value=63", ENDITEM,
		"Name=buyFlights.y", "Value=6", ENDITEM,
		"Name=.cgifields", "Value=saveCC", ENDITEM,
		LAST);
		
	}
	
	lr_end_transaction("paymentDetails",LR_AUTO);
		
	lr_start_transaction("clickItinerary");
	
	web_reg_find("Text=Itinerary Button",LAST);

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
	
	logout();
	
	lr_end_transaction("UC03_BuyTickets",LR_AUTO);

	return 0;
}