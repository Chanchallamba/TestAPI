package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonParsingByOrgJson;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC3_GetAll
{
	
	@Test
	public void Testcase3() throws IOException
	{
	Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
	HttpMethod http = new HttpMethod(p);
	Response re= http.GetAll("CompanyName");
	System.out.println("**********Testcase3**********");
	System.out.println("Status Code is " + re.statusCode());
	JsonParsingByOrgJson.parseallIDs(re.asString(), "id");
	
	}
}
