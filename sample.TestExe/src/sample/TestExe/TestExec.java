package sample.TestExe;

public class TestExec {

	public static void main(String[] args) {

		try {
			// TODO 自動生成されたメソッド・スタブ
			Runtime r = Runtime.getRuntime();
			Process process = r.exec("notepad Test.txt");

		}catch(Exception e) {

		} finally {

		}

	}

}
