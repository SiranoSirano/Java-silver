package javasilver.Syou8;

import java.util.function.Function;

public class Code7 {
	public static void main(String[] args) {
		Function<String,Integer> func = (str) ->{ //String型で引数を受け取り、Integer型で出力する
			return Integer.parseInt(str); //String型からparseInt型に変換
		};
		System.out.println(func.apply("100")*2);//String型の100を変換したparseInt型で計算し、Integer型で出力
	}
}
