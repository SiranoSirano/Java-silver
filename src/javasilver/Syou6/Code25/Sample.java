package javasilver.Syou6.Code25;

public class Sample {
	public Sample() {
		this("B");
		System.out.println("A");
	}
	public Sample(String str) {
		//Bの処理はここの行へと移行する

		System.out.println(str);
	}
}
