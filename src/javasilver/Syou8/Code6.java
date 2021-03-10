package javasilver.Syou8;

import java.util.function.Supplier;

public class Code6 {

	public static void main(String[] args) {
		Supplier<String> func =() ->{
			//ここで（引数）を受け取らずに処理の結果を返している
			return "Hello Lambda";
		};
		System.out.println(func.get());
	}

}
