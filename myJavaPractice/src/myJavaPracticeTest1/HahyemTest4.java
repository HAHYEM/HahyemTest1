package myJavaPracticeTest1;

import java.util.*;

public class HahyemTest4 {
	public static void main(String[] args) {
		/* 베스트앨범
		 * https://www.welcomekakao.com/learn/courses/30/lessons/42579?language=java
		 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

		속한 노래가 많이 재생된 장르를 먼저 수록합니다.
		장르 내에서 많이 재생된 노래를 먼저 수록합니다.
		장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
		노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
		
		getOrDefault : key 값이 없다면 입력시 설정한 default 값을 반환
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
			
			/*Hash는 각 장르당 value로 음악리스트를 가짐*/
			List songList = sMap.getOrDefault(genres[i], new ArrayList());
			songList.add(song);
			sMap.put(genres[i], songList);
		}
		/* 장르순위대로 정렬 */
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
