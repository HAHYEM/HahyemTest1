package myJavaPracticeTest1;

public class HahyemTest2 {

	//전화번호 목록
	/*전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
	전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
	전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
	어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.*/
	
	/*contains VS startWith
	contain 메소드는 문자열 안에 특정한 문자열이 포함되어있는지를 확인할 때 사용
	startWith 메소드는 문자열이 특정 문자열로 시작하는지 확인할 때 사용
	
	접두어: 파생어를 만드는 접사로, 어근이나 단어의 앞에 붙어 새로운 단어가 되게 하는 말.*/
	
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
