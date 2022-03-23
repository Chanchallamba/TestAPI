package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC5_DeleteRequest 

{
	@Test
	public void Testcase5 () throws IOException 
	{
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		HttpMethod http = new HttpMethod(p);
		Response re= http.Delete("CompanyName", TC1_PostRequest.residValue);
		System.out.println("**********Testcase5**********");
		System.out.println("Status Code is " + re.statusCode());
				
	}

}
