// 로또 생성
// 숫자는 총7개 겹치면안됨
// i1~i7 까지 만들어서 돌릴거임 for문을 할지 while 문을 할지 모르겠음 ->  실패함 생각해보니까 그럼 math.random 쓰는게 아님
// 보너스 따로 빼야함 length-1; 해주면 6개 출력되니까 마지막은 배열 주소값 출력 따로해주면 될듯

public class Lotto {

	public static void main(String[] args) {

		
		System.out.println("인생 직진");
		
		int num[] = new int[7];

		for (int a = 0; a < num.length; a++) {

			num[a] = (int) (Math.random() * 45) + 1; 
			// 총 45까지니까 45곱하고 Math.random 은 기본이 0부터 1사이의 숫자니까 0~44까지 계산됨 그래서 1더해줌

			for (int b = 0; b <= a - 1; b++) {

				while (num[a] == num[b]) {
					num[b] = (int) (Math.random() * 45) + 1;
				}
			}
		}
		for (int a = 0; a < num.length-1; a++) {
			
			System.out.print(num[a] + " ");
		}
		System.out.println(" 보너스 값은 " + num[6] + " 입니다.");

	}//main 끝

}
