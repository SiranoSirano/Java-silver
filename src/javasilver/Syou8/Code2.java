package javasilver.Syou8;

public class Code2 {

	public static void main(String[] args) {
		Function f = (name) -> {
		return  "hello,"+ name;
		};
		//insert code here
		System.out.println(f.test("Lambda"));
	}
	private static interface Function{
		String test(String name);
	}

}
