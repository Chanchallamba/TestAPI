package Org.testing.Utilites;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public static Properties LoadPropertyFile(String Path) throws IOException
	{
		File f = new File(Path);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p;
	}

}
