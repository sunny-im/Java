import java.util.ArrayList;
import java.util.List;

public class collectionLoopEx {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("치킨");
        foods.add("피자");
        foods.add("짜짱면");
        foods.add("삼겹살");

        for (String food : foods) {
            System.out.println(food + "먹고싶다");
        }

        System.out.println("--------------");

        // 사이즈를 비교할 수 있다.
        if (foods.size() == 0) {
            System.out.println("목록이 비어있습니다");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다.");
        }

        System.out.println("--------------");
        if (foods.isEmpty()) {      // 값이 비어있으면 true
            System.out.println("목록이 비어있습니다");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다.");
        }
    }
}
