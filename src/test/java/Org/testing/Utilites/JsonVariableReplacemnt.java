package Org.testing.Utilites;

import java.util.regex.Pattern;

public class JsonVariableReplacemnt
{
	public static String JsonReplacement(String data, String Keyname, String Keyvalue)
	{
		data= data.replaceAll(Pattern.quote("{{"+Keyname+"}}"), Keyvalue);
		return data;
		
	}

}
