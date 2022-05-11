import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        // 랜덤숫자 출력하기
        Random random = new Random();
        int randomNumber = random.nextInt(256);  // 0부터 256사이의 숫자를 랜덤으로 출력
        System.out.println(randomNumber);

        System.out.println("---------------------------------");

        // 지연시간 추가하기
        System.out.println("지금 무슨 생각을 하고 있는지 맞춰볼께!");
        try {
            Thread.sleep(3000);  // 밀리초로 입력 ! 3초 후 출력된다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("돈까스 !");

        System.out.println("---------------------------------");

        // 숫자맞추기 게임
        System.out.println("0부터 365사이에서 숫자 하나 뽑겠습니다.");
        System.out.println("제가 뽑은 숫자를 맞춰보세욤 !!");

        int randomNumber2 = random.nextInt(365);
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<8; i++) {
            System.out.println(8 - i + "번의 기회가 있습니다.");

            System.out.println("예상한 숫자를 입력하세요");
            String input = sc.nextLine();
            int guess = Integer.parseInt(input);

            if(randomNumber2 == guess) {
                System.out.println("정답입니다 !!!!!");
                break;
            }
            else if (randomNumber2 < guess) {
                System.out.println("down!!");
            } else {
                System.out.println("up !!");
            }
            if (i==7){
                System.out.println("다음기회에 ㅜㅜ");
            }
        }
        System.out.println("게임 종료!!!");
    }
}
