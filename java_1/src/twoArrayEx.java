import java.util.Arrays;

public class twoArrayEx {
    public static void main(String[] args) {
        //2차원배열
        String[][] days = {
                {"월", "화", "수", "목" ,"금" , "토" , "일"},
                {"1", "2", "3", "4", "5", "6", "7"},
                {"1월", "2월", "3월", "4월", "5월", "6월"}
        };
        System.out.println(Arrays.toString(days[0])); // [월, 화, 수, 목, 금, 토, 일]
        System.out.println(Arrays.toString(days[1])); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(days[2])); // [1월, 2월, 3월, 4월, 5월, 6월]
    }
}
