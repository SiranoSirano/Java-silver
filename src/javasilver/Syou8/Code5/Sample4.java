package javasilver.Syou8.Code5;

import java.util.function.Predicate;
//ラムダ式関数型インターフェースのPredicateをつかったサンプルコード

public class Sample4 {

	public static void main(String[] args) {
		Predicate<String> p = str ->{
			return "" .equals(str); //Predicate型で文字列が空白ならTRUE、違うときはFALSEと出力する
		};
		System.out.println(p.test(args[0]));
	}

}
