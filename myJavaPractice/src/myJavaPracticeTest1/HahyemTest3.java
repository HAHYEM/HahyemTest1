package myJavaPracticeTest1;

import java.util.HashMap;
import java.util.Map;

public class HahyemTest3 {

	/*위장
	스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
	예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면
	다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
	스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
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
