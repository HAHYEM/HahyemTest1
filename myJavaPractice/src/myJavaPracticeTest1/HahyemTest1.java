package myJavaPracticeTest1;

import java.util.Arrays;

public class HahyemTest1 {
	//�������� ���� ����
	/*������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
	�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��,
	�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0; i < completion.length; i++){
            if(!(participant[i].equals(completion[i]))){
            }
        }
        System.out.println( participant[i]);
    }
}
