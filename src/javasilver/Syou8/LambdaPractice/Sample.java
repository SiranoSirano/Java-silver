package javasilver.Syou8.LambdaPractice;

public class Sample{
	  public static void main(String[] args){
	    MyInterface obj =  new MyInterface() {
	    	public void myMethod(Object val) {

	    	}
	    };
	  }
	}
	interface MyInterface{
	  public abstract void myMethod(Object val);
	}
	/*
	 * 引数がtで(t) -> {　};
	 *といったラムダ式でも問題ない
	 *引数の型も引数の()も、メソッドの{}もリターンも省略できる
	 *
	 *
	 */




