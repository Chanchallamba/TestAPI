package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonFile;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC7_PostEmployeeRecords 
{
	static String reMessage;
	//@Test
	public void Testcase7() throws IOException 
	{
		
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		String body=  JsonFile.LoadJsonFile("../API_FrameworkPart2/src/test/java/Orrg/Testing/Resources/DummyBodyData.json");
		HttpMethod http = new HttpMethod(p);
		Response r= http.PostMethod("Dummy_API2_Employee", body);	
		
		System.out.println("**************Testcase7*************");
		System.out.println("Status code is " + r.statusCode());
		System.out.println("Response is "+ r.asString());	
		//reMessage= JsonParsingByOrgJson.parseJson(r.asString(), "id");

	}
}
