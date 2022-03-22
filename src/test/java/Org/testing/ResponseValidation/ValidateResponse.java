package Org.testing.ResponseValidation;

import Org.testing.Utilites.JsonParsingByOrgJson;
import io.restassured.response.Response;

public class ValidateResponse 
{
	public static boolean StatusCodeValidation(int expectedstatuscode, Response re) 
	{
		if(expectedstatuscode==re.statusCode())
		{
			System.out.println("Status code matched");
			return true;
		}
		
		else 
		{
			System.out.println("Status code didn't match");
			return false;
		}
	}
	
	public static boolean DataValidate(String expectedData, Response re, String Keyname)
	
	{
		String actualdata= JsonParsingByOrgJson.parseJson(re.asString(), Keyname);
		if(actualdata.equals(expectedData))
		{
			System.out.println("Data Matched");
			return true;
			
		}
		else
		{
			System.out.println("Data isn't matching");
			return false;
			
		}
	}

}
