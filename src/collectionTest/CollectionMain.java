package collectionTest;

import java.util.*;

public class CollectionMain {
    static void main(String[] args) {
        Dog dog1 = new Dog(1, "닥스훈트", 5);
        Dog dog2 = new Dog(2, "퍼그", 3);
        Dog dog3 = new Dog(3, "말티즈", 10);
        //1. list에 추가
        //<>를 가지는 배열이라는 뜻.
        //<String> 이면 문자열을 가지는 배열
        //<Dog> 이면 Dog를 가지는 배열
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        System.out.println("== ArrayList 출력(일반 for) ==");
        for (int i = 0; i< dogList.size(); i++){
            System.out.println(dogList.get(i));
        }
        System.out.println("== ArrayList 출력(향상된 for) ==");
        for (Dog dog : dogList){
            System.out.println(dog);
        }
        //2. set에 추가
        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(dog3);
        dogSet.add(dog2);
        dogSet.add(dog1);
        dogSet.add(dog3); // 예측 : 중복되서 입력이 되면 안 됨.
        System.out.println("== Set 출력(향상된 for) ==");
        for (Dog dog : dogSet){
            System.out.println(dog);
        }

        //map에 추가
        Map<Integer, Dog> dogMap = new HashMap<>();
        dogMap.put(dog1.getId(), dog1);
        dogMap.put(dog2.getId(), dog2);
        dogMap.put(dog3.getId(), dog3);
        //ㄴ Key1 = dog1 이라는 뜻.

        System.out.println("================");
        dogMap.forEach((key, value)->
                System.out.println(dogMap.get(key)));
    }
}
