package Org.testing.Utilites;

import org.json.JSONObject;
import org.json.XML;

public class Conversion
{
	public static String XmltoJson(String xmlData )
	{
		JSONObject js= XML.toJSONObject(xmlData);
		return js.toString();
	}
	
	public static String JsontoXml(String jsonData)
	
	{
		JSONObject ob= new JSONObject(jsonData);
		String xml_data= XML.toString(ob);
		return xml_data;
	}
	

}
