package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMain {
    static void main(String[] args) {
        // map은 키와 값의 쌍으로 구성되어 있음.
        // HashMap 많이 씀 : 순서 보장 안 함.
        // -> 키에 대한 순서 보장 안 함.
        //LinkedHashMap : 입력된 순서까지 보장함.

        //Map<키 타입, 자료 타입> : Map<Integer, String>
       Map<Integer, String> store = new HashMap<>();
//        Map<Integer, String> store = new LinkedHashMap<>();
        store.put(2, "물");
        store.put(5, "짜장면");

        //키 : 5 조회
        System.out.println(store.get(5));
        //키 값이 중복되서 들어오면 어떻게 될까?
        // == update
        //map -> 입력 : put, 업데이트 : put
        //put() : 키가 없으면 추가, 있으면 수정
        System.out.println("=========");
        store.put(5, "울면");
        System.out.println(store.get(5));
        // 존재 여부 확인
        // 키 존재 확인
        System.out.println(store.containsKey(10));
        // 값 존재 확인
        System.out.println(store.containsValue("물"));

        // 간짜장 : 키 = 3, value = 간짜장
        store.put(3, "간짜장");
        //전체 출력
        //키 : 값 형태로
        //1. for 루프로 출력 : 키뭉치로 회전
        //키의 타입이 문자일 수도 있고 무조건 int가 아닐 수 있기 때문에
        //int i = 0; 형식이 안 됨.
        //for(키 타입 변수명 : keySet
        System.out.println("### for 루프로 출력 : 키뭉치로 회전");
        for (Integer i : store.keySet()){
            System.out.println(i + " : " + store.get(i));
        }

        System.out.println("### forEach루프로 출력 : 키뭉치로 회전");
        //ㄱ ★★★★★ java Script에서도 나옴.
        store.forEach((key, value)->
                        System.out.println(key + " : " + value)
                );
    }
}
