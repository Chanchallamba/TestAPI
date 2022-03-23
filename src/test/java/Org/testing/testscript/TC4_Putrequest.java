package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonFile;
import Org.testing.Utilites.JsonVariableReplacemnt;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC4_Putrequest 
{
	@Test
	public void Testcase4() throws IOException
	{		
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		String body=  JsonFile.LoadJsonFile("../API_FrameworkPart2/src/test/java/Orrg/Testing/Resources/Updatedbodydata.json");
		body = JsonVariableReplacemnt.JsonReplacement(body, "id", TC1_PostRequest.residValue);
		HttpMethod http = new HttpMethod(p);
		Response re=  http.PutMethod(body, "CompanyName", TC1_PostRequest.residValue);
		System.out.println("************Testcase4**********");
		System.out.println("Status is " + re.statusCode());
		System.out.println("Data is " + re.asString());
	}

}
