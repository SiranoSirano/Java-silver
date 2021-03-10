package javasilver.Syou8.LambdaPractice;

public class Service {
	private Algorithm logic;
	public void setLogic(Algorithm logic) {
		this.logic = logic;
	}
	/*
	 * Logicインターフェースを実現していればその動作を行う、
	 * また具体的にどんな動作をするか知る必要はないので、
	 * 変更は容易になりスタートエンドの間にthis.logic.perform(name)として出力される
	 */
	public void doProcess(String name) {
		System.out.println("start");
		this.logic.perform(name);
		System.out.println("end");
	}
}
