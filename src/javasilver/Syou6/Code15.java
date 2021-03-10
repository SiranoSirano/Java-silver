package javasilver.Syou6;

public class Code15 {
	public void method(int num) {
		if(num < 0) return;
		System.out.println("A");
		return;
		System.out.println("B"); //到達不能なコードがある場合はコンパイルエラーとなる
		}
}
