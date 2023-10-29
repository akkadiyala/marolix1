import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadData {
public static String getLocator(String filename,String key) throws Exception
{
	String filepath=".//locators//"+filename+".properties";
	FileInputStream instream = new FileInputStream(filepath);
	
	Properties pro = new Properties();
	pro.load(instream);
	return pro.getProperty(key);
}

public static void main(String[] args) throws Exception {
	String target=ReadData.getLocator("myApp", "target");
	System.out.println("Target = "+target);
}


/*
 1. load file   --> load(FileInputStream Object)
 2. get property value---> getProperty()
 
 nature: non static , access : by object class: Properties package: java.util
 */
}

