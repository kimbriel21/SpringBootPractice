package com.api.data;
import static org.junit.Assert.*;

import okhttp3.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


public class SomeTest {
	@Before
	public void before(){
		//run this before unit test
		System.out.println("before");
	}

	@BeforeClass
	public static void beforeClass(){
		System.out.println("before class");
	}

	@After
	public void after(){
		System.out.println("after");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("after class");
	}

	@Test
	public void sample_test() {

	}

	@Test
	public void sample_test2() {
		//this will fail
//		assertEquals(5,4);
		System.out.println("sample_test2");


	}

}
