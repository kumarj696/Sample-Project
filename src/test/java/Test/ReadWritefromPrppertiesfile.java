package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritefromPrppertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties properties=new Properties();
		 FileInputStream inputstream =new FileInputStream("D:\\POM\\YouTube\\src\\test\\resources\\Properties\\Testdata.properties");
		 properties.load(inputstream);
		 System.out.println(properties.getProperty("browser"));
		 System.out.println(properties.getProperty("url"));
		 
		 
		 FileOutputStream outputstream =new FileOutputStream("D:\\POM\\YouTube\\src\\test\\resources\\Properties\\Testdata.properties");
		 properties.setProperty("testdata", "12343221678");
		 properties.store(outputstream, "This is customer data from tc1");
		 
	}

}
