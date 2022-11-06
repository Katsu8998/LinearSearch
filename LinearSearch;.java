package LinearSearch;

public class Main {

	public static void main(String[] args) {
		int[] testScore = { 10, 10, 30, 55, 77, 90, 100, 87 };
		int value = 87;
		int j = 0;
		int count = -1;
		for (int i = 0; i < testScore.length; i++) {
			if (testScore[i] == value) {
				count = i;
				break;
			}
		}
		if (count < 0) {
			System.out.println("見つかりません");
		} else {
			System.out.println(value + "は" + count + "番目にあります");

		}
	}
}
