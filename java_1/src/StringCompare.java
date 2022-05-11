import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();

        System.out.println(a == b); // b에 치킨을 입력해면 false, 단순히 문자가 같음을 보는게 아닌 메모리상의 위치(주소값)을 비교한다.
        System.out.println(a.equals(b)); // 문자열을 비교할 땐 equals()를 이용. 해당 값은 true가 나옴
    }
}
