package org.TestNg.Practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest1 {

@Test

public void displayTest()
{
	String url = System.getProperty("URL");
	String browser=	System.getProperty("BROWSER");
	String username=System.getProperty("USERNAME");
	String password=System.getProperty("PASSWORD");
Reporter.log("Executing Test1" , true);
System.out.println("Url------->"+url);
System.out.println("browser------->"+browser);
System.out.println("Username------->"+username);
//hi
System.out.println("Password------->"+password);
//hiiiee
//Bye
//hi
//hieee
//me
//Bye
//hi
String url2 = System.getProperty("Url");
String browser31=	System.getProperty("browser");
System.out.println();
}
@Test
public void display1Test()
{
Reporter.log("Executing Test2" , true);

System.out.println("Pass");
System.out.println("Fail");
System.out.println("yes");

}}
