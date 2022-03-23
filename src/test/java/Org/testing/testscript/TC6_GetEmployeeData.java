package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonParsingByOrgJson;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC6_GetEmployeeData
{
	@Test
	public void Testcase6 () throws IOException
	{
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		HttpMethod http = new HttpMethod(p);
		Response r= http.GetMethod1("Dummy_API_EmployeeRecords", 25, 1001);
		System.out.println("**************Testcase6**************");
		System.out.println("Status code is " + r.statusCode());
		System.out.println("Response data" + r.asString());
		JsonParsingByOrgJson.parseallIDs(r.asString(), "id");

		
		
	}


}
