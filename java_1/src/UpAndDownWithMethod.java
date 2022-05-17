import java.util.Random;
import java.util.Scanner;

public class UpAndDownWithMethod {

    public static int randomNum;   // 멤버변수 1
    public static Scanner sc = new Scanner(System.in); // 멤버면수 2

    public static void main(String[] args) {
        Random random = new Random();
        randomNum = random.nextInt(365);

        int attempt = 0;

        while (attempt < 8) {
            boolean isCorrect = play();

            if (isCorrect) {
                break;
            }

            attempt ++;
            System.out.println(attempt + "회 시도하였습니다.");
        }
        System.out.println("게임을 종료합니다.");

    }
    public static boolean play(){
        System.out.println("숫자를 입력하세요");
        int input = sc.nextInt();

        if (input == randomNum) {
            System.out.println("올 정답!");
            return true;
        } else if (input > randomNum) {
            System.out.println("Down!!!");
        } else {
            System.out.println("UP!!!!");
        }
        return false;
    }
}
