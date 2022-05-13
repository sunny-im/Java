import java.util.Scanner;

public class forWhileEx {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println("for문 현재 반복횟수 : " + i);
        }
        System.out.println("---------------------------------");
        int i = 0;
        while(i < 10) {
            System.out.println("while문 현재 반복횟수 : " + i);
            i++;
        }

        System.out.println("---------------------------------");
        //구구단
        for (int k=2; k<5; k++) {
            for (int j=1; j<10; j++) {
                System.out.println(k +"단 : " + k + "X" + j + "=" + k*j);
            }
        }

        System.out.println("---------------------------------");
        // 비밀번호 맞을 때까지 입력하기 while
        String pw = "abc123";
        Scanner sc = new Scanner(System.in);

        System.out.println("비밀번호를 입력해주세요");
        String inputPw = sc.nextLine();

        while (inputPw.equals(pw) != true) {
            System.out.println("비밀번호를 다시 입력해주세요");
            inputPw = sc.nextLine();
        }
        System.out.println("비밀번호가 일치합니다.");

        System.out.println("---------------------------------");
        // 비밀번호 맞을 때까지 입력하기 do-while
        String pw2 = "abc12345";
        String inputPw2;

        do {
            System.out.println("비밀번호를 입력해주세요");
            inputPw2 = sc.nextLine();
        }
        while (inputPw2.equals(pw2) != true); {
        }
        System.out.println("비밀번호가 일치합니다.");
 
    }
}
