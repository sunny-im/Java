package java8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class java8_test {

	// <Optional>

	public String getCityOfMemberFromOrder(Order order) {
		Optional<Order> maybeOrder = Optional.ofNullable(order);
		if (maybeOrder.isPresent()) {
			Optional<Member> maybeMember = Optional.ofNullable(maybeOrder.get());
			if (maybeMember.isPresent()) {
				Optional<Address> maybeAddress = Optional.ofNullable(maybeMember.get());
				if (maybeAddress.isPresent()) {
					Address address = maybeAddress.get();
					Optinal<String> maybeCity = Optional.ofNullable(address.getCity());
					if (maybeCity.isPresent()) {
						return maybeCity.get();
					}
				}
			}
		}
		return "Seoul";
	}

	int length = Optional.ofNullable(getText()).map(String::length).orElse(0);

	public String getCityOfMemberFromOrder (Order order){
	    return Optional.ofNullable(order)    // ofNullable()로(명시된 값이 null이 아니면 명시된 값을 가지는 Optional 객체를 반환, 명시된 값이 null이면 비어있는 Optional 객체를 반환) 
	                                        // Order 객체를 Optional로 감싸줌
	        .map(Order::getMember)      // (인스턴스 :: 메소드명 또는 new),  map() 연쇄호출... Optional 객체 3번 변환함!
	        .map(Member :: getAddress)
	        .map(Address :: getCity)
	        .ofElse("Seoul");       // 값이 있으면 반환하고, 그렇지 않으면 다른값(인수로 전달된 값=Seoul) 반환?
	}

	// <Lambda>  익명함수(함수의 이름이 없는 함수)의 한 종류
	// (매개변수목록) -> {함수몸체(or 실행문, 표현식)}

	public String hello(){
	    return "하이하이 난 자바 람다식(익명함수)다!!! !";
	}

	()->"하이하이 난 자바 람다식(익명함수)다!!! !";

	// 
	@FunctionalInterface        // 1개의 함수만 갖도록 제한, 여러개 함수 선언 시 에러 발생 
	public class Lambda {
	    LamdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
	}

	// 일반
	public class Lambds {
	    public static void main(String args[]){
	        Runnable r = new Runnable() {
	            public void run(){
	                System.out.print ("하이룽");
	            }
	        };
	        r.run();
	    }

	    // 람다
	    public static void main (String args[]) {
	        Runnable r2 = () -> System.out.print ("하이룽");
	    }
	    r2.run();
	}

	// 스트림 (입출력의 스트림이 아님 !!!) - 데이터를 추상화하여 다룸! 다양한 방식으로 저장된 데이터를 읽고 쓰기 ! , 1회성, 내부반복, 필터-맵 연산, parallelStream() 병렬처리
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(5);
	list.add(3);


	Stream<Integer> stream= list.stream();
	stream.forEach(System.out::print);

	//
	IntStream stream = Stream.iterate(2,n -> n+2);

}
