package javasilver.Syou8.LambdaPractice.Code4;

public class Test{
	public static void main(String args[]) {
		String val = "hello";
		Function f = () ->{

			System.out.println(val);
		};
		val = "test";
		f.test();
	}
}