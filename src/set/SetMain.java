package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMain {
    static void main(String[] args) {
        //Set은 무조건 HashSet
        //List - ArrayList
        //Map - HashMap 90%
        //set은 중복 허용 안 하는 자료구조.
        //주로 로또, 쇼핑몰의 최근 본 상품 목록 등을 중복 없이 추가하고 구성할 때 씀.
        //순서를 보장하지 않음.(들어가는대로 자기 마음대로 함.)
        Set<String> fruits = new HashSet<>(Arrays.asList("apple", "banana"));
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println("과일 바구니 사이즈 : " + fruits.size());
        //입력은 5개(apple, banana, grape, mango, banana)로 했지만
        // banana가 중복이기 때문에 출력하면 4개로 나옴.

        for (String f : fruits){
            System.out.println(f);
            //순서를 보장하지 않기 때문에 banana - apple - grape - mango로 나옴.
        }

    }
}
