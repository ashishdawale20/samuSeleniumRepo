package ejaruti.UnitTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGRunner {

	public static void main(String[] args) {
		
		
		//Create an object of testNG
		TestNG objTNG =new TestNG();
		
		//Define a list of String
		List<String> suites= new ArrayList<String>();
		
		//Add the TestNG xml file
		suites.add("C:\\Users\\ADMIN\\Desktop\\Codebase\\Finsys\\testngLogin.xml");
		suites.add("C:\\Users\\ADMIN\\Desktop\\Codebase\\Finsys\\testngCreateCompany.xml");
		suites.add("C:\\Users\\ADMIN\\Desktop\\Codebase\\Finsys\\testngDeleteCompany.xml");
		suites.add("C:\\Users\\ADMIN\\Desktop\\Codebase\\Finsys\\testngEditCompany.xml");
		
		//Set the suites to Run
		objTNG.setTestSuites(suites);
		
		//Call the Run Method
		objTNG.run();
		
	}

}
