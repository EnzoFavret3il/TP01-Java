import static org.junit.Assert.*;

import junit.framework.Assert;
public class FizzTest {
	FizzBuzz fiz=new FizzBuzz();
	public void Test1() {
		Assert.assertEquals(fiz.Mot(3),"Fizz");
	}
	public void Test2() {
		Assert.assertEquals(fiz.Mot(6),"Fizz");
	}
	public void Test3() {
		Assert.assertEquals(fiz.Mot(5),"Buzz");
	}
	public void Test4() {
		Assert.assertEquals(fiz.Mot(10),"Buzz" );
		
	}
	public void Test5() {
		Assert.assertEquals(fiz.Mot(7), "7");
	}
	public void Test6() {
		Assert.assertEquals(fiz.Mot(15),"FizzBuzz" );
	}
	public void Test7() {
		Assert.assertEquals(fiz.Mot(43), "43");
	}
}
