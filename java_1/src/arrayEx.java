import java.util.Arrays;

public class arrayEx {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목" ,"금" , "토" , "일"};
        System.out.println(days[2]);
        System.out.println(days[6]);
        // System.out.println(days[7]); // 에러 ArrayIndexOutOfBoundsException

        System.out.println(days.length);

        System.out.println("---------------------------------");

        days[0] = "월월";
        // for
        for(int i=0; i<days.length; i++) {
            System.out.println(days[i] + "요일");
        }
        System.out.println("---------------------------------");
        // for-each
        for (String day : days) {           // for(타입 반복문안에서 지칭할 이름 : 적용할 배열)
            System.out.println(day + "요일");
        }

        System.out.println("---------------------------------");
        // 배열 갯수 추가
        String[] days2 = Arrays.copyOf(days,8);  // 기존 7개에서 8개로 변경
        days2[7] = "일주일 끝";
        for (String day : days2) {
            System.out.println(day);
        }

        System.out.println("---------------------------------");
        // 배열 통으로 출력하기 Arrays.toString()
        System.out.println(days);  // Ljava.lang.String;@66048bfd
        System.out.println(Arrays.toString(days)); // [월월, 화, 수, 목, 금, 토, 일]

    }

}
