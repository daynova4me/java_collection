package arrayList;

import java.util.ArrayList;
import java.util.List;

//커밋 안 한 애들은 빨간색으로 이름이 나옴.

public class ArrayListMain {
    static void main(String[] args) {
        // List 타입의 컬렉션을 생성하는 것.
        //해당 List 안에 담을 내용을 String 타입의 문자열.
        //<> : 제네릭(Generic)이라고 한다.
        //컬렉션에담을 수 있는 것은 모두 객체여야 함.
        List<String> colors = new ArrayList<>();
        //List<배열에 넣을 내용 (String)>
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("White"); //중복 허용함.
        //크기 출력
        System.out.println("colors 리스트의 크기 : " + colors.size());
        //색인으로 접근
        System.out.println("1번 인덱스의 내용 : " + colors.get(1));
        //for 루프로 출력
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("index : " + i + ". value : " + colors.get(i));

        }
        //삭제
        //pink 삭제, 없으면 없음.
        //한방에 삭제하기
        System.out.println("=======================");
        colors.remove("Pink");
        for (int j = 0; j < colors.size(); j++) {
            System.out.println("index : " + j + ". value : " + colors.get(j));
        }
        System.out.println("=======================");

        //Black이 있는지 먼저 확인하고, 있으면 삭제
        int findIndex = colors.indexOf("Black");
        System.out.println("index =" + findIndex);
        if (findIndex == -1){
            System.out.println("색이 없음");
        }else {
            colors.remove(findIndex);
        }
        //Black이 있는지 여부 확인
        //함수위에 ctrl + alt + v를 누르면 리턴타입을
        //자동으로 확인해서 만들어 준다.
        boolean isExist = colors.contains("Black");
        if (isExist) {
            System.out.println("있음");
        }else {
            System.out.println("없음");
        }

        System.out.println("=======================");
        colors.set(0, "Yellow");
        //for-each로 출력
        for (String color : colors) {
            System.out.println(color);
            //colors의 배열을 color라는 이름으로 하나 넣으면 String화 해줘.
        }
    }
}
