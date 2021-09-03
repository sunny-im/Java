package com.koreait.use;
/*
 -d 옵션은 
1) 해당 클래스를 컴파일 시, 선언된 패키지를 자동으로 생성해준다 !!
2) 지정한 디렉토리로 .class 파일을 생성해 준다.
*/

// 자바에서는 나와 다른 경로에 있는 class는 import 명령어로 
// 경로(.class 파일)를 포함하여 클래스명을 명시해준다.
//import /Users/sunnyim/Desktop/Sunny/0810_bicData/koreait2108_workspace/app0819/bin/com/koreait/animal/Cat.class;
//위 처럼 사용하게 되면 다른 컴퓨터/os에서는 찾을 수 없으므로.. path를 설정 후 입력

class UseCat{  // 쓰임을 당하는게 아니라 Cat을 쓰기 위함이므로 public 안씀
    public static void main(String[] args){
        Cat c1 = new Cat();
        System.out.println("지금 살아있는 고양이는" + c1);
    }
}