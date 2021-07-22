package apiaut;

import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClass.baseclass;
import Util.utils;




public class Tests extends baseclass  {

	utils ut = new utils();
	
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void config() {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
	}
	
	
	
	//GET
	@Test
	public static void test1() {
		String url = "https://jsonplaceholder.typicode.com/posts/1";
		
		given().log().all()
		.when().get(url)
		.then().log()
		.all().statusCode(200);
	}
	
	@AfterTest
	public void tearDown() {
		extent.endTest(test);
		test.log(LogStatus.INFO,"ending");
		extent.flush();
		test.log(LogStatus.INFO,"push the data to report");
		test.log(LogStatus.INFO,"close will clear all the resources");
		extent.close();
	}
		
		@BeforeTest
		public void config1() {
			extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
		}
	
	//POST
	@Test
	public static void test2() {
		String url = "https://jsonplaceholder.typicode.com/posts";
		String requestBody2="{\r\n"
				+ "    \"id\": 101\r\n"
				+ "}";
		given().log().all().header("Content-Type", "application/json")
		.and().body(requestBody2)
		.when().post(url)
		.then().log().all()
		.statusCode(201);
	}
	
	@AfterTest
	public void tearDown1() {
		extent.endTest(test);
		test.log(LogStatus.INFO,"ending");
		extent.flush();
		test.log(LogStatus.INFO,"push the data to report");
		test.log(LogStatus.INFO,"close will clear all the resources");
		extent.close();
	}
		
		@BeforeTest
		public void config2() {
			extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
		}
	
	//PUT
		@Test
		public static void test3() {
			String url = "https://jsonplaceholder.typicode.com/posts/1";
			String requestBody="{\r\n"
					+ "    \"id\": 1\r\n"
					+ "}";
			given().log().all().header("Content-Type", "application/json")
			.and().body(requestBody)
			.when().put(url)
			.then().log().all()
			.statusCode(200);
		}
		
		@AfterTest
		public void tearDown2() {
			extent.endTest(test);
			test.log(LogStatus.INFO,"ending");
			extent.flush();
			test.log(LogStatus.INFO,"push the data to report");
			test.log(LogStatus.INFO,"close will clear all the resources");
			extent.close();
		}
			@BeforeTest
			public void config3() {
				extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
			}
		
		//PATCH
				@Test
				public static void test4() {
					String url = "https://jsonplaceholder.typicode.com/posts/1";
					String requestBody3="{\r\n"
							+ "    \"userId\": 1,\r\n"
							+ "    \"id\": 1,\r\n"
							+ "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\r\n"
							+ "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\r\n"
							+ "}";
					given().log().all().header("Content-Type", "application/json")
					.and().body(requestBody3)
					.when().patch(url)
					.then().log().all()
					.statusCode(200);
				}
				
				@AfterTest
				public void tearDown3() {
					extent.endTest(test);
					test.log(LogStatus.INFO,"ending");
					extent.flush();
					test.log(LogStatus.INFO,"push the data to report");
					test.log(LogStatus.INFO,"close will clear all the resources");
					extent.close();
}
}
