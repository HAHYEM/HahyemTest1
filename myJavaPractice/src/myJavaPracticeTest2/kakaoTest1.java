package myJavaPracticeTest2;

public class kakaoTest1 {
	public static void main(String[] args) {
	/*������ ó�� �������� �ǰ� ���� ����ġ�� ���ڿ��� �����ϴ� ����� ���� ���θ� �ϰ� �ֽ��ϴ�.
	 * �ֱٿ� �뷮�� ������ ó���� ���� ������ ��ս� ���� ����� ���� ���θ� �ϰ� �ִµ�, ���ڿ����� ���� ���� �����ؼ� ��Ÿ���� ���� �� ������ ������ �ݺ��Ǵ� ������ ǥ���Ͽ� �� ª�� ���ڿ��� �ٿ��� ǥ���ϴ� �˰����� �����ϰ� �ֽ��ϴ�.
	 * ������ ���� aabbaccc�� ��� 2a2ba3c(���ڰ� �ݺ����� �ʾ� �ѹ��� ��Ÿ�� ��� 1�� ������)�� ���� ǥ���� �� �ִµ�, �̷��� ����� �ݺ��Ǵ� ���ڰ� ���� ��� ������� ���ٴ� ������ �ֽ��ϴ�.
	 * ���� ���, abcabcdede�� ���� ���ڿ��� ���� ������� �ʽ��ϴ�. ����ġ�� �̷��� ������ �ذ��ϱ� ���� ���ڿ��� 1�� �̻��� ������ �߶� �����Ͽ� �� ª�� ���ڿ��� ǥ���� �� �ִ��� ����� ã�ƺ����� �մϴ�.
	 * ���� ���, ababcdcdababcdcd�� ��� ���ڸ� 1�� ������ �ڸ��� ���� ������� ������, 2�� ������ �߶� �����Ѵٸ� 2ab2cd2ab2cd�� ǥ���� �� �ֽ��ϴ�.
	 * �ٸ� ������� 8�� ������ �߶� �����Ѵٸ� 2ababcdcd�� ǥ���� �� ������, �̶��� ���� ª�� �����Ͽ� ǥ���� �� �ִ� ����Դϴ�.
	 * �ٸ� ����, abcabcdede�� ���� ���, ���ڸ� 2�� ������ �߶� �����ϸ� abcabc2de�� ������, 3�� ������ �ڸ��ٸ� 2abcdede�� �Ǿ� 3�� ������ ���� ª�� ���� ����� �˴ϴ�.
	 * �̶� 3�� ������ �ڸ��� �������� ���� ���ڿ��� �״�� �ٿ��ָ� �˴ϴ�.
	 * ������ ���ڿ� s�� �Ű������� �־��� ��, ���� ������ ������� 1�� �̻� ������ ���ڿ��� �߶� �����Ͽ� ǥ���� ���ڿ� �� ���� ª�� ���� ���̸� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * ����� �� #1
	 * ���ڿ��� 1�� ������ �߶� �������� �� ���� ª���ϴ�.
	 * ����� �� #2
	 * ���ڿ��� 8�� ������ �߶� �������� �� ���� ª���ϴ�.
	 * ����� �� #3
	 * ���ڿ��� 3�� ������ �߶� �������� �� ���� ª���ϴ�.
	 * ����� �� #4
	 * ���ڿ��� 2�� ������ �ڸ��� abcabcabcabc6de �� �˴ϴ�.
	 * ���ڿ��� 3�� ������ �ڸ��� 4abcdededededede �� �˴ϴ�.
	 * ���ڿ��� 4�� ������ �ڸ��� abcabcabcabc3dede �� �˴ϴ�.
	 * ���ڿ��� 6�� ������ �ڸ� ��� 2abcabc2dedede�� �Ǹ�, �̶��� ���̰� 14�� ���� ª���ϴ�.
	 * ����� �� #5
	 * ���ڿ��� ���� �պ��� ������ ���̸�ŭ �߶�� �մϴ�.
	 * ���� �־��� ���ڿ��� x / ababcdcd / ababcdcd �� �ڸ��� ���� �Ұ��� �մϴ�.
	 * �� ��� ��� ���ڿ��� �߶� ������� �����Ƿ� ���� ª�� ���̴� 17�� �˴ϴ�.*/
		
	}
	static String s = "xababcdcdababcdcd";
	
	public int soulution() {
		int answer = 0;
		
		for(int i=1; i<(s.length()/2)+1; i++) {
			int result = getSplit(s, i, 1).length();
			answer = i == 1 ? result : (answer > result ? result : answer);
		}
		return answer;
	}
	
	public String getSplit(String s, int n, int repeat) {
		String result = "";
		if(s.length() < n) {
			return s;
		}
		String preString = s.substring(0, n);
		String postString = s.substring(n, s.length());
		
		if(!postString.startsWith(preString)){
            if(repeat ==1) return result += preString + getSplit(postString, n, 1);
            return result += Integer.toString(repeat) + preString + getSplit(postString, n, 1);
        }
		
		return result += getSplit(postString, n, repeat+1);
	}
	
	
}
