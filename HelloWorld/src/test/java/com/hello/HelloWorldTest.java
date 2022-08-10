package com.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;				


public class HelloWorldTest extends HelloWorldApplicationTests {
 
	@Test
	public void Hello() {
	HelloWorldController hello=new HelloWorldController();
//	System.out.println(hello.Hello());
	assertEquals(hello.Hello(),"Hello World");
	}

}
