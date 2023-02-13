public class Exercise2_7 {
    public static void main(String[] args) {
        //2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2"); // "12"
        System.out.println(true+""); // "true"
        System.out.println('A' + 'B'); // 131
        System.out.println('1' + 2); // 51
        System.out.println('1' + '2'); // 99
        System.out.println('J' +"ava"); // "Java"
        System.out.println("true + null"); // 오류! boolean 타입이랑 null은 연산할 수 없다. 스트링으로 바꿔서 출력했다.
    }
}
