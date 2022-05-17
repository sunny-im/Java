public class FunctionEx {
    public static void main(String[] args) {
        Hello();
        HelloTo("sunny");
        printSum(3,5);
        int result = sum(2,4);  // 메소드가 값을 반환하기 때문에 result라는 변수에 값을 담는다.
        System.out.println(result);

        int[] sumAndProduct = addAndMultiply(2,3);
        System.out.println("sum : " + sumAndProduct[0]);
        System.out.println("product : " + sumAndProduct[1]);

        Hola("바보");
        System.out.println("-----");
        Hola("sunny");

        System.out.println("-----");

        Hola2("바보");
        System.out.println("-----");
        Hola2("sunny");
    }



    // 인사를 했다면 true, 그렇지 않다면 false를 반환한다.
    public static boolean  Hola2(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운말 사용합시다!!!");
            return false;
        }
        System.out.println(name + "님, 홀라~!");
        return true;
    }

    public static void Hola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운말 사용!!!");
        } else {
        System.out.println(name + "님, 안녕하세요!");
        }

        if (name.equals("바보")) {
            System.out.println("바르고 고운말 사용!!!");
            return; // return 키워드를 사용하여 메소드를 빠져나갈 수 있는 기능도 제공한다.
        }
            System.out.println(name + "님, 안녕하세요!");

    }

    // 두 정수를 더한 값과 곱한 값을 반환한다.
    public static int[] addAndMultiply(int a, int b) {
        int sum = a+b;
        int product = a*b;

        int [] result = {sum, product}; // 정수형 배열!

        return result; // 배열을 반환!
    }

    // 두 정수를 더한 값을 반환한다.
    public static int sum(int a, int b) {
        return a+b;// 메소드의 반환 값
    }

    // 1+2=3의 형태로 덧셈을 출력한다.
    public static void printSum(int a, int b) {
        //System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "+" + b + "=" + sum(a,b));
    }

    // 입력값이 존재하는 메소드
    public static void HelloTo(String name) {
        System.out.println("Hello, "+name);
    }

    public static void Hello() {
        System.out.println("Hello");
    }
}
