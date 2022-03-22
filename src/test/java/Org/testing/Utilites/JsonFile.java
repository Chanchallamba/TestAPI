package Org.testing.Utilites;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFile
{
	public static String LoadJsonFile(String Path) throws FileNotFoundException
	{
		File f = new File(Path);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo= new JSONObject(jt);
		return jo.toString();
		
	}

}
