package Org.testing.Utilites;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingByOrgJson 
{
	public static String parseJson(String data, String Keyname)
	{
		JSONObject jo = new JSONObject(data);
		return jo.get(Keyname).toString();
	}
	
	public static void parseallIDs(String data, String Keyname)
	{
		JSONArray ja = new JSONArray(data);
		int l = ja.length();
		for(int i = 0; i<l; i++)
		{
			JSONObject ob= ja.getJSONObject(i);
			System.out.println(ob.get(Keyname));
			
			
			
		}
	}
}
