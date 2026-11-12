package lambda;

//함수형 인터페이스
//자바 스크립트 : 화살표함수, 자바: 람다표현식
//부르는 이름만 다르고 내용은 똑같음.
@FunctionalInterface
public interface Calc {
    int calc(int x, int y);
}
