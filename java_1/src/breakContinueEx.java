import java.util.Scanner;

public class breakContinueEx {
    public static void main(String[] args) {
        // break 반복문 탈출!
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
        // continue 반복문의 처음으로 돌아간다!
        //for
        for(int i=0; i<10; i++){
            if(i%2==0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        //while
        int j =0;
        while(j<10) {
            if(j%2==0) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
