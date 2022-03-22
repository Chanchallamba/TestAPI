package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC2_GetRequest
{
	//@Test
	public void Testcase2 () throws IOException
	{
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		HttpMethod http = new HttpMethod(p);
		Response r =  http.GetMethod("CompanyName", TC1_PostRequest.residValue);
		System.out.println("**************Testcase2**************");
		System.out.println("Status code is " + r.statusCode());
		System.out.println("Response data" + r.asString());
	}

}
