package lambda;

public class LambdaExpression {
    static void main(String[] args) {
        //1. 전달하는 값이 두 개 이상일 때는 항상 () 안에 넣어야 한다.
        // 2. 결과를 리턴할 때 처리 절차가 여러 줄일 때는 항상 {} 안에 넣어야 한다.
        //그리고 return 구문도 반드시 필요함.
        //3. 리턴할 문장이 단 한 문장이면 return 생략 가능.
        Calc add = (x, y) -> {return x + y; };
        Calc minus = (x, y) -> x - y;
        System.out.println(add.calc(3,2));
    }
}
