public class Exercise2_4 {
    public static void main(String[] args) {
        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
        byte b = 127; // byte는 -128~127 범위의 숫자만 저장할 수 있다
        char c = ' '; //캐릭터 타입은 빈 캐릭터는 안 되고 초기화할 때 공백으로 초기화 한다.
        char answer = 'n'; //캐릭터 타입은 문자를 저장하는 타입이고 문자열은 String 타입이다. String을 저장할 때에는 큰따옴표로 감싸야한다.
        float f = 3.14f; //float 타입을 초기화할 때에는 리터럴에 접미사 f를 붙여줘야 한다. 그리고 자바는 줄 끝마다 세미콜론을 붙여야 한다.
        double d = 1.4e3f; //double 타입의 리터럴은 접미사 d이고 생략도 가능하다.
    }
}
