import java.util.HashSet;
import java.util.Set;

public class setEx {
    public static void main(String[] args) {
        // list는 순서가 있고 중복값을 허용하며 특정 위치의 값에 접근할 수 있지만
        // set은 순서가 없고 중복값을 허용하지 않으며 특정 위치의 값에 접근할 수 없다!!
        Set<String> myFoods = new HashSet<>();

        myFoods.add("치킨");
        myFoods.add("피자");
        myFoods.add("골뱅이무침");
        myFoods.add("피자");
        System.out.println(myFoods); // [골뱅이무침, 치킨, 피자]  순서가 맘대로 나온다 !

    }
}
