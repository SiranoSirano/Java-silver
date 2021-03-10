package javasilver.Syou8;

import java.util.function.Consumer;


public class Code８ {

	public static void main(String[] args) {
		Consumer<String> func = str ->{
			System.out.println("Hello " +str);
			//strを受け取りこの処理の中でHelloとともに出力する
		};
		func.accept("Java");
		//Consumerインターフェースのメソッドで(”Java”)を受け取っている
	}
}
