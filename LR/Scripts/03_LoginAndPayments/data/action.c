Action()
{

	lr_start_transaction("1_transaction");

	web_set_user("Jojo1", 
		lr_unmask("62d7e8159a0e07e0c8"), 
		"18.212.178.84:80");

	web_add_cookie("_ga=GA1.1.1388469942.1658230230; DOMAIN=18.212.178.84");

	web_add_cookie("_gid=GA1.1.1625982162.1658230230; DOMAIN=18.212.178.84");

	web_add_cookie("userCart=%7B%22userId%22%3A-1%2C%22productsInCart%22%3A%5B%5D%7D; DOMAIN=18.212.178.84");

	web_add_auto_header("DNT", 
		"1");

	web_url("18.212.178.84", 
		"URL=http://18.212.178.84/", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_url("ALL", 
		"URL=http://18.212.178.84/catalog/api/v1/DemoAppConfig/parameters/by_tool/ALL", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	web_add_cookie("_gat=1; DOMAIN=18.212.178.84");

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceGetAccountConfigurationRequest");

	web_custom_request("GetAccountConfigurationRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/GetAccountConfigurationRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetAccountConfigurationRequest xmlns=\"com.advantage.online.store.accountservice\"></GetAccountConfigurationRequest></soap:Body></soap:Envelope>", 
		LAST);

	web_url("categories", 
		"URL=http://18.212.178.84/catalog/api/v1/categories", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		LAST);

	web_url("search", 
		"URL=http://18.212.178.84/catalog/api/v1/deals/search?dealOfTheDay=true", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	web_url("popularProducts.json", 
		"URL=http://18.212.178.84/app/tempFiles/popularProducts.json", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		LAST);

	web_url("home-page.html", 
		"URL=http://18.212.178.84/app/views/home-page.html", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("1_transaction",LR_AUTO);

	lr_start_transaction("login");

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceAccountLoginRequest");

	web_custom_request("AccountLoginRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/AccountLoginRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><AccountLoginRequest xmlns=\"com.advantage.online.store.accountservice\"><email></email><loginPassword>Bean1</loginPassword><loginUser>Jojo1</loginUser></AccountLoginRequest></soap:Body></soap:Envelope>", 
		LAST);

	web_set_sockets_option("INITIAL_AUTH", "BASIC");

	web_add_cookie("userCookieSmqbzEQmVhbjE="
		"%7B%22name%22%3A%22Jojo1%22%2C%22userPassword%22%3A%22Bean1%22%2C%22email%22%3A%22%22%2C%22response%22%3A%7B%22success%22%3Atrue%2C%22userId%22%3A583919293%2C%22reason%22%3A%22Login%20Successful%22%2C%22token%22%3A%22eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ3d3cuYWR2YW50YWdlb25saW5lc2hvcHBpbmcuY29tIiwidXNlcklkIjo1ODM5MTkyOTMsInN1YiI6Ikpvam8xIiwicm9sZSI6IlVTRVIifQ.7lhiG31HevKMw4STp6BbAZRaO2qyzJEVSzcx2w2w5WY%22%2C%22sessionId%22%3A%221821b6036fd%407E6714B1F6%5Ei%25583919293%22%2C%22t_authoriz"
		"ation%22%3A%22Sm9qbzE6QmVhbjE%3D%22%2C%22accountType%22%3A20%7D%7D; DOMAIN=18.212.178.84");

	web_add_cookie("lastLogin=userCookieSmqbzEQmVhbjE; DOMAIN=18.212.178.84");

	web_url("583919293", 
		"URL=http://18.212.178.84/order/api/v1/carts/583919293", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);

	web_custom_request("583919293_2", 
		"URL=http://18.212.178.84/order/api/v1/carts/583919293", 
		"Method=PUT", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		"Body=[{\"hexColor\":\"C3C3C3\",\"productId\":19,\"quantity\":1},{\"hexColor\":\"414141\",\"productId\":18,\"quantity\":3}]", 
		LAST);

	lr_end_transaction("login",LR_AUTO);

	lr_think_time(18);

	lr_start_transaction("clickToBasket");

	web_url("583919293_3", 
		"URL=http://18.212.178.84/order/api/v1/carts/583919293", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		LAST);

	web_url("shoppingCart.html", 
		"URL=http://18.212.178.84/app/views/shoppingCart.html", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("clickToBasket",LR_AUTO);

	lr_start_transaction("checkout");

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceGetAccountByIdRequest");

	lr_think_time(23);

	web_custom_request("GetAccountByIdRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/GetAccountByIdRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetAccountByIdRequest xmlns=\"com.advantage.online.store.accountservice\"><accountId>583919293</accountId><base64Token>Basic Sm9qbzE6QmVhbjE=</base64Token></GetAccountByIdRequest></soap:Body></soap:Envelope>", 
		LAST);

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceGetAccountByIdNewRequest");

	web_custom_request("GetAccountByIdNewRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/GetAccountByIdNewRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetAccountByIdNewRequest xmlns=\"com.advantage.online.store.accountservice\"><accountId>583919293</accountId><base64Token>Basic Sm9qbzE6QmVhbjE=</base64Token></GetAccountByIdNewRequest></soap:Body></soap:Envelope>", 
		LAST);

	web_url("583919293_4", 
		"URL=http://18.212.178.84/order/api/v1/carts/583919293", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		LAST);

	web_custom_request("shippingcost", 
		"URL=http://18.212.178.84/order/api/v1/shippingcost/", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		"EncType=application/json;charset=utf-8", 
		"Body={\"seaddress\":{\"addressLine1\":\"\",\"addressLine2\":\"\",\"city\":\"\",\"country\":\"us\",\"postalCode\":\"\",\"state\":\"\"},\"secustomerName\":\"Jojo1 \",\"secustomerPhone\":\"\",\"senumberOfProducts\":4,\"setransactionType\":\"SHIPPING_COST\",\"sessionId\":\"0F63C8D138A2B52B36FED1FF9129C315\"}", 
		LAST);

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceGetAccountPaymentPreferencesRequest");

	web_custom_request("GetAccountPaymentPreferencesRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/GetAccountPaymentPreferencesRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t17.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetAccountPaymentPreferencesRequest xmlns=\"com.advantage.online.store.accountservice\"><accountId>583919293</accountId><base64Token>Basic Sm9qbzE6QmVhbjE=</base64Token></GetAccountPaymentPreferencesRequest></soap:Body></soap:Envelope>", 
		LAST);

	web_url("orderPayment-page.html", 
		"URL=http://18.212.178.84/app/order/views/orderPayment-page.html", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t18.inf", 
		"Mode=HTML", 
		LAST);

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceGetCountriesRequest");

	web_custom_request("GetCountriesRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/GetCountriesRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t19.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetCountriesRequest xmlns=\"com.advantage.online.store.accountservice\"></GetCountriesRequest></soap:Body></soap:Envelope>", 
		LAST);

	lr_end_transaction("checkout",LR_AUTO);

	lr_start_transaction("orderPayment");

	web_add_header("SOAPAction", 
		"com.advantage.online.store.accountserviceAddMasterCreditMethodRequest");

	lr_think_time(88);

	web_custom_request("AddMasterCreditMethodRequest", 
		"URL=http://18.212.178.84:8081//accountservice/ws/AddMasterCreditMethodRequest", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/xml", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t20.inf", 
		"Mode=HTML", 
		"EncType=text/xml; charset=UTF-8", 
		"Body=<?xml version=\"1.0\" encoding=\"UTF-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><AddMasterCreditMethodRequest xmlns=\"com.advantage.online.store.accountservice\"><cardNumber>4886488612151515</cardNumber><expirationDate>122027</expirationDate><cvvNumber>454</cvvNumber><customerName>Jojo</customerName><accountId>583919293</accountId><base64Token"
		">Basic Sm9qbzE6QmVhbjE=</base64Token></AddMasterCreditMethodRequest></soap:Body></soap:Envelope>", 
		LAST);

	web_custom_request("583919293_5", 
		"URL=http://18.212.178.84/order/api/v1/orders/users/583919293", 
		"Method=POST", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t21.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		"Body={\"orderPaymentInformation\":{\"Transaction_AccountNumber\":\"112987298763\",\"Transaction_Currency\":\"USD\",\"Transaction_CustomerPhone\":\"\",\"Transaction_MasterCredit_CVVNumber\":\"454\",\"Transaction_MasterCredit_CardNumber\":\"4886488612151515\",\"Transaction_MasterCredit_CustomerName\":\"Jojo\",\"Transaction_MasterCredit_ExpirationDate\":\"122027\",\"Transaction_PaymentMethod\":\"MasterCredit\",\"Transaction_ReferenceNumber\":0,\"Transaction_SafePay_Password\":\"\",\""
		"Transaction_SafePay_UserName\":\"\",\"Transaction_TransactionDate\":\"20072022\",\"Transaction_Type\":\"PAYMENT\"},\"orderShippingInformation\":{\"Shipping_Address_Address\":\"\",\"Shipping_Address_City\":\"\",\"Shipping_Address_CountryCode\":40,\"Shipping_Address_CustomerName\":\"Jojo1 \",\"Shipping_Address_CustomerPhone\":\"\",\"Shipping_Address_PostalCode\":\"\",\"Shipping_Address_State\":\"\",\"Shipping_Cost\":1637,\"Shipping_NumberOfProducts\":4,\"Shipping_TrackingNumber\":0},\""
		"purchasedProducts\":[{\"hexColor\":\"C3C3C3\",\"productId\":19,\"quantity\":1,\"hasWarranty\":false},{\"hexColor\":\"414141\",\"productId\":18,\"quantity\":3,\"hasWarranty\":false}]}", 
		LAST);

	web_custom_request("583919293_6", 
		"URL=http://18.212.178.84/order/api/v1/carts/583919293", 
		"Method=DELETE", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t22.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("orderPayment",LR_AUTO);

	return 0;
}