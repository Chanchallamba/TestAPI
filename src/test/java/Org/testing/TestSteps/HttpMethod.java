package Org.testing.TestSteps;

import java.util.Properties;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HttpMethod
{
	Properties probject;
	
	public HttpMethod(Properties probject)
	{
		this.probject = probject;
	}
	public Response PostMethod(String URIKey, String Body)
	{
		Response re=
		given()
		.contentType(ContentType.JSON)
		.body(Body)
		.when()
		.post(probject.getProperty(URIKey));
		return re;	
	}
	
	public Response GetMethod(String URIKey, String Endpoint)
	{
		String uri = probject.getProperty(URIKey) + "/" + Endpoint;
		Response re=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return re;
	}
	
	public Response GetAll(String UriKey)
	{
		String uri = probject.getProperty(UriKey);
		Response re=
		given() .contentType(ContentType.JSON)
		.when() .get(uri);
		return re;	
	}
	public Response PutMethod(String bodydata, String urikey, String Endpoint)
	{
		String uri = probject.getProperty(urikey) + "/" + Endpoint;
		Response res=
		given() .contentType(ContentType.JSON) .body(bodydata)
		.when() .put(uri);
		return res;
	}
	
	public Response Delete(String UriKey, String Endpoint)
	{
		String uri = probject.getProperty(UriKey)+"/" + Endpoint;
		Response re=
		given() .contentType(ContentType.JSON)
		.when() .delete(uri);
		return re;
	}
	public Response GetMethod1(String URIKey, int i, int j)
	{
		String uri = probject.getProperty(URIKey) + "?" + "noofRecords=" +i + "&"+ "idStarts="+ j;
		Response re=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return re;
		
	}
}