package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelCustomerMain {
    static void main(String[] args) {
        // Customer를 리스트에 담도록 선언
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("이순신", 40, 100));
        customerList.add(new Customer("김유신", 20, 100));
        customerList.add(new Customer("홍길동", 13, 50));
        //1. 전체 명단 출력
        System.out.println("1. 전체 명단 출력");
        customerList.stream()
                .forEach(x -> System.out.println(x));

        //2. 이름만 출력
        //원본과 결과가 다를 때 map사용
        System.out.println("2. 이름만 출력");
        customerList.stream()
                .map(x -> x.getName())
                .forEach(x -> System.out.println(x));

        //3. 총 여행 비용 출력
        System.out.println("3. 총 여행 비용 출력");
        int totalPrice = customerList.stream()
                //정수로 계산할 수 있게 mapToInt를 해야 .sum이 나옴.
                //.sum 안 나오면 이것부터 확인해보자.
                .mapToInt(x -> x.getPrice())
                .sum();
        System.out.println("총 여행 경비 : " + totalPrice);

        //4. 20세 이상 데이터(filter)의 이름만(map) 오름차순 정렬(sort)로 출력(forEach)
        System.out.println("4. 20세 이상 데이터의 이름만 오름차순으로 출력");
        customerList.stream()
                .filter(x -> x.getAge() >= 20)
                .map(x -> x.getName())
                .sorted()
                .forEach(x -> System.out.println(x));

        //5. 20세 이상(filter)의 전체 자료 내림차순(sort)으로 출력(forEach)
        System.out.println("5. 20세 이상의 전체 자료 내림차순으로 출력");
        //자바 or 자바스크립트에서 정렬은 늘 문제......
        //오름차순은 잘 되는데 내림차순은 복잡함.
        customerList.stream()
                .filter(x -> x.getAge() >= 20)
                // 클래스 내부의 별도 필드를 기준으로 정렬할 때
                //sort가 2개가 있는데 긴 문장이 있는 sort를 선택 후 사용
                .sorted(Comparator.comparing(
                        Customer::getName
                        //ㄴ 이 상태로 끝나면 오름차순이 기본이 됨.
                ).reversed()) //역정렬 해주는 명령어(5번의 핵심)

                .forEach(x -> System.out.println(x));

    }
}
// 정리 : stream은 원본이 일회용
//한 번 만들고 결과보고
//원본에서 수정하는 게 아닌, 잠깐 만들고 버리는 용도.
//stream은 다 collection(map, ArrayList emd)에서 돌아감.
//순서대로 .을 찍으며 진행(체인징 기법)
//원본을 안 바꾸고 원하는 애들만 걸러내려면 filter
//다른 형태로 바꾸는 것은 map
