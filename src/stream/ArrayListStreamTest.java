package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStreamTest {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("AdWard");
        list.add("jack");
        //전체 리스트 출력
        list.stream().forEach(x -> System.out.print(x + "\t"));

        // 정렬 후 출력(스트림 또는 체인이라고 부름)
        //앞에서부터 옆으로 흐르듯이 실행하는 것.
        list.stream().sorted().forEach(x -> System.out.print(x + "\t"));

        //각 요소의 문자열 길이 출력
        // 원본을 다른 형태의 데이터로 바꾸는 함수 : map()★★★★★
        //["Tomas", "Adward", "Jack"] -> [5, 6, 4] -> 출력
        list.stream()
                .map(s -> s.length())
                .forEach(x -> System.out.print(x + "\t"));
                                    // Tomas의 철자가 5자이니까 s로 들어와서
                                    // s.length<Tomas의 철자 수>로 배열에 넣는 것.
        //변수는 같은 s를 안 써도 됨.

        //문자열(list.stream())의 길이가
        // 5개 이상인 애들만(filter) 정렬(sort)해서 출력(print)
        //map 안 씀. 계속 바뀌니까..
        //filter는 원본을 바꾸지 않는다.
        System.out.println("========");
        list.stream()
                .filter(x -> x.length() >= 5)
                .sorted()
                .forEach(x -> System.out.print(x + "\t"));

        System.out.println();
        System.out.println("============");

        //정수 배열 가공
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //intList의 합계 계산
        int sum = intList.stream()
                .mapToInt(x -> x.intValue())
                .sum();
        System.out.println("리스트의 합 : " + sum);
    }
}
