package myJavaPracticeTest1;

public class HahyemTest2 {

	//��ȭ��ȣ ���
	/*��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
	��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
	��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��,
	� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/
	
	/*contains VS startWith
	contain �޼ҵ�� ���ڿ� �ȿ� Ư���� ���ڿ��� ���ԵǾ��ִ����� Ȯ���� �� ���
	startWith �޼ҵ�� ���ڿ��� Ư�� ���ڿ��� �����ϴ��� Ȯ���� �� ���
	
	���ξ�: �Ļ�� ����� �����, ����̳� �ܾ��� �տ� �پ� ���ο� �ܾ �ǰ� �ϴ� ��.*/
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = true;
		for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[i].startsWith(phone_book[j])){
                	answer = false;
                }
                if(phone_book[j].startsWith(phone_book[i])){
                	answer = false;
                }
            }
        }
        System.out.println("answer = "+answer);
	}

}
