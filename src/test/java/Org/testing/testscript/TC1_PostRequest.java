package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonFile;
import Org.testing.Utilites.JsonParsingByOrgJson;
import Org.testing.Utilites.JsonVariableReplacemnt;
import Org.testing.Utilites.PropertyFile;
import Org.testing.Utilites.RandomNumber;
import io.restassured.response.Response;

public class TC1_PostRequest 
{
	static String residValue; 
	@Test
	public void Testcase1() throws IOException 
	{
		
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		String body=  JsonFile.LoadJsonFile("../API_FrameworkPart2/src/test/java/Orrg/Testing/Resources/bodyData.json");
		body = JsonVariableReplacemnt.JsonReplacement(body, "id", RandomNumber.GenerateRandomNumber());
		HttpMethod http = new HttpMethod(p);
		Response r= http.PostMethod("CompanyName", body);	
		System.out.println("**************Testcase1*************");
		System.out.println("Status code is " + r.statusCode());
		residValue= JsonParsingByOrgJson.parseJson(r.asString(), "id");
		
		
	}

}
