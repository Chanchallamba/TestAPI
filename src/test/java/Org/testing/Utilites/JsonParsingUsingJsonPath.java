package Org.testing.Utilites;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{
	public static String ParseJson(String path, Response re)
	{
		return re.jsonPath().get(path);
	}

}
