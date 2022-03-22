package Org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.TestSteps.HttpMethod;
import Org.testing.Utilites.JsonParsingByOrgJson;
import Org.testing.Utilites.PropertyFile;
import io.restassured.response.Response;

public class TC9_Get_a_Record
{
	//@Test
	public void Testcase9() throws IOException
	{
		Properties p = PropertyFile.LoadPropertyFile("../API_FrameworkPart2/URI.properties");
		HttpMethod http = new HttpMethod(p);
		Response r= http.GetMethod("Dummy_Geta_ParticularData", "1");
		System.out.println("**************Testcase9**************");
		System.out.println("Status code is " + r.statusCode());
		System.out.println("Response data" + r.asString());
		//JsonParsingByOrgJson.parseallIDs(r.asString(), "id");

		
	}

}
