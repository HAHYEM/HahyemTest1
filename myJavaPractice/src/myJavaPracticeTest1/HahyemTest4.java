package myJavaPracticeTest1;

import java.util.*;

public class HahyemTest4 {
	public static void main(String[] args) {
		/* ����Ʈ�ٹ�
		 * https://www.welcomekakao.com/learn/courses/30/lessons/42579?language=java
		 * ��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. �뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.

		���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
		�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
		�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
		�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, ����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
		
		getOrDefault : key ���� ���ٸ� �Է½� ������ default ���� ��ȯ
		*/
		
		int[] answer = {};
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		Map<String, Integer> gMap = new HashMap<>();
		Map<String, List> sMap = new HashMap<>();
		
		for(int i= 0; i<genres.length; i++) {
			Song song = new Song(i, plays[i]);
			
			/*genres*/
			gMap.put(genres[i], gMap.getOrDefault(genres[i], 0)+plays[i]);
			
			/*Hash�� �� �帣�� value�� ���Ǹ���Ʈ�� ����*/
			List songList = sMap.getOrDefault(genres[i], new ArrayList());
			songList.add(song);
			sMap.put(genres[i], songList);
		}
		/* �帣������� ���� */
		List<String> gList = sortByValue(gMap);
		List<Integer> answerList = new ArrayList<>();
		
		for(int i = 0; i<gList.size(); i++) {
			List sList = sMap.get(gList.get(i));
			Collections.sort(sList);
			
			for(int j=0; j<2; j++) {
				Song song = (Song)sList.get(i);
				answerList.add(song.idx);
				if(sList.size() == 1) {
					break;
				}
			}
		}
		int[] answerArray = new int[answerList.size()];
		for(int i=0; i<answerList.size(); i++) {
			answerArray[i] = answerList.get(i);
		}
		
		for(int j=0; j<answerList.size(); j++) {
			System.out.println(answerArray[j]);
		}
	}
	
	public static List sortByValue(final Map<String, Integer> map) {
		List<String> list = new ArrayList();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String key1, String key2) {
				if(map.get(key1) > map.get(key2)) {
					return -1;
				}else if(map.get(key1) == map.get(key2)){
					return 0;
				}else{
					return 1;
				}
			}
		});
		return list;
	}
	
	static class Song implements Comparable<Song>{
		int idx;
		int play;
		
		public Song(int idx, int play) {
			this.idx = idx;
			this.play = play;
		}
		
		@Override
		public int compareTo(Song song) {
			if(this.play > song.play) {
				return -1;
			}
			if(this.play == song.play) {
				return 0;
			}
			return 1;
		}
		
	}
}
