import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
//        String input = scanner.nextLine();  // 한 줄 단위로 출력 , "치킨은 살 안찐다!" 입력 시
//        System.out.println(input);  // "치킨은 살 안찐다!" 전체 출력
//
//        String input2 = scanner.next();  // 띄어쓰기 단위로 출력
//        System.out.println(input2); // "치킨은" 만 출력됨.

        System.out.println("숫자를 입력해 주세요");
        String intInput = scanner.nextLine(); // 50 입력 시
        System.out.println(intInput + 1);   // 숫자+문자열 = 문자열, 즉 501 출력된다.

        int intValue = Integer.parseInt(intInput); // int로 형변환 !
        System.out.println(intValue + 1);   // 51 출력
    }
}
