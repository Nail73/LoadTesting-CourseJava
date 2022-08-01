Action()
{

	lr_start_transaction("01_BuyAndBasket");
	
	lr_start_transaction("clickToSite");
	
	web_add_cookie("_ga=GA1.1.1388469942.1658230230; DOMAIN=18.212.178.84");

	web_add_cookie("_gid=GA1.1.1625982162.1658230230; DOMAIN=18.212.178.84");

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

	web_add_cookie("userCart=%7B%22userId%22%3A-1%2C%22productsInCart%22%3A%5B%5D%7D; DOMAIN=18.212.178.84");

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

	lr_end_transaction("clickToSite",LR_AUTO);

	lr_start_transaction("clickToProducts");
	
	web_url("products", 
		"URL=http://18.212.178.84/catalog/api/v1/categories/3/products", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		LAST);

	web_url("attributes", 
		"URL=http://18.212.178.84/catalog/api/v1/categories/attributes", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);

	web_url("category-page.html", 
		"URL=http://18.212.178.84/app/views/category-page.html", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("clickToProducts",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("clickToProductPage");
	
	web_url("18", 
		"URL=http://18.212.178.84/catalog/api/v1/products/18", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		LAST);

/*Correlation comment - Do not change!  Original value='false' Name ='CorrelationParameter' Type ='RecordReplay'*/
	web_reg_save_param_json(
		"ParamName=CorrelationParameter",
		"QueryString=$[0].products[0].attributes[3].showInFilter",
		SEARCH_FILTERS,
		"Scope=Body",
		LAST);

/*Correlation comment - Do not change!  Original value='414141' Name ='CorrelationParameter_1' Type ='RecordReplay'*/
	web_reg_save_param_json(
		"ParamName=CorrelationParameter_1",
		"QueryString=$[0].products[6].colors[1].code",
		SEARCH_FILTERS,
		"Scope=Body",
		LAST);

/*Correlation comment - Do not change!  Original value='BLACK' Name ='CorrelationParameter_2' Type ='RecordReplay'*/
	web_reg_save_param_json(
		"ParamName=CorrelationParameter_2",
		"QueryString=$[0].products[6].colors[1].name",
		SEARCH_FILTERS,
		"Scope=Body",
		LAST);

	web_url("all_data", 
		"URL=http://18.212.178.84/catalog/api/v1/categories/all_data", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		LAST);

	web_url("products_2", 
		"URL=http://18.212.178.84/catalog/api/v1/categories/3/products", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		LAST);

	web_url("product-page.html", 
		"URL=http://18.212.178.84/app/views/product-page.html", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("clickToProductPage",LR_AUTO);

	lr_start_transaction("checkBasket");
	
	web_add_cookie("userCart=%7B%22userId%22%3A-1%2C%22productsInCart%22%3A%5B%7B%22productId%22%3A18%2C%22imageUrl%22%3A%223300%22%2C%22productName%22%3A%22HP%20Pro%20Tablet%20608%20G1%22%2C%22color%22%3A%7B%22code%22%3A%22{CorrelationParameter_1}%22%2C%22name%22%3A%22{CorrelationParameter_2}%22%2C%22inStock%22%3A10%2C%22%24%24hashKey%22%3A%22object%3A239%22%7D%2C%22quantity%22%3A2%2C%22price%22%3A479%2C%22hasWarranty%22%3A{CorrelationParameter}%7D%5D%7D; DOMAIN=18.212.178.84");

	web_add_header("DNT", 
		"1");

	lr_think_time(5);
	
	web_url("user-not-login-page.html", 
		"URL=http://18.212.178.84/app/order/views/user-not-login-page.html", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://18.212.178.84/", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("checkBasket",LR_AUTO);
	
	lr_end_transaction("01_BuyAndBasket",LR_AUTO);

	return 0;
}