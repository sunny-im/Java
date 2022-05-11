import java.util.Scanner;

public class breakContinueEx {
    public static void main(String[] args) {
        // break 반복문 탈출
        Scanner sc = new Scanner(System.in);

        String pw = "1234";

        while(true) {
            System.out.println("비밀번호를 입력해주세요");
            String inputPw = sc.nextLine();

            if(inputPw.equals(pw)) {
                System.out.println("비밀번호가 일치합니다.");
                break;
            }
            System.out.println("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("---------------------------------");
        // continue

    }
}
