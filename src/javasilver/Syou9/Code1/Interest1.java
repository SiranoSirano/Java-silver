package javasilver.Syou9.Code1;

public class Interest1 {

	public static void main(String[] args) {
		// 貯金計算プログラム
		// 利息の計算:元金40万円を1年ごとに入金していき年利息３%で、
		// 20年積み立てすると、いくらとなりますか。
		// ソース：厳
//			Interest1.java    moneyをfloatではなく、整数で宣言した場合

		int   i, year;
		float   r = (float) 1.03;     // 年利率
	    int     money = 400000;       // 元金
	    year = 20;                   // 預け入れ年数
	    for (i = 0; i < year; i++) {
	        money = (int)(  money * r );
	     }
	    System.out.println("総額"+ money+ "円です");
	}
}
