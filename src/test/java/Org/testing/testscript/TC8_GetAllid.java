package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;
import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonParsingByOrgJson;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC8_GetAllid 
{
//	@Test
	public void Testcase8 () throws IOException
	{
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		HttpMethod http = new HttpMethod(p);
		Response re= http.GetAll("Dummy_Getall_Employeedata");
		System.out.println("**********Testcase8**********");
		System.out.println("Status Code is " + re.statusCode());
		System.out.println("Data is "+ re.asString());
		JsonParsingByOrgJson.parseallIDs(re.asString(), "id");
		
	}

}
