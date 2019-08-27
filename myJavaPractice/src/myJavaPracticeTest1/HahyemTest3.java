package myJavaPracticeTest1;

import java.util.HashMap;
import java.util.Map;

public class HahyemTest3 {

	/*����
	�����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.
	���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� ���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ�
	�������� û������ �߰��� �԰ų� ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.
	�����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	*/
	public static void main(String[] args) {
		//String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		int answer = 1;
		Map<String, Integer> spyMap = new HashMap<>();
		for(String[] clothe : clothes) {
			if(!spyMap.containsKey(clothe[1])) {
				spyMap.put(clothe[1], 1);
			} else {
				spyMap.put(clothe[1], spyMap.get(clothe[1])+ 1);
			}
		}
		for(Integer value : spyMap.values()) {
			answer = answer * (value + 1);
		}
		System.out.println("answer: " + (answer - 1));
		
	}

}
