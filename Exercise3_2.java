public class Exercise3_2 {
    public static void main(String[] args){
        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //출력결과: true
        // y >= 5 는 true, x < 0은 false, x > 2는 false. &&연산자가 먼저이기에 false && false는 false, true || false는 true.
        System.out.println(y += 10 - x++); // x++ --> x = x + 1 --> x += 1
        //출력결과: 13
        //먼저 x++을 수행한다 x++은 x를 반환하고 x에 1을 더해준다. 그러면 x++의 결과는 2이다. 대입연산자와 산술연산자 중에 산술연산자가 우선순위이므로
        //10-2를 수행한다. 결과는 8이다. 다시 y += 8를 수행하고 y를 리턴한다. 그러므로 결과는 13이다.
        System.out.println(x += 2);
        //출력결과: 5
        // 2번에 프리트에서 x에 1을 더했기 때문에 현재 x 값은 3이다. x+=2는 x= x + 2와 같으니 5를 출력한다.
        System.out.println(!('A' <= c && c <= 'Z'));
        //출력결과: false
        //괄호가 있기에 괄호 안을 먼저 연산하다. 'A' <= c는 true이고 c<'Z'는 true이다. true && true도 여전히 true이며 !true는 false이다.
        System.out.println('C' - c);
        //출력결과: 2
        //'C'는 아스키코드로 67이고 변수 c에 저장된 'A'는 65이다. 그러므로 빼면 2이다.
        System.out.println('5' - '0');
        //출력결과: 5
        //아스키코드에서 5와 0은 5개가 차이 나므로 5이다.
        System.out.println(c + 1);
        //출력결과: 66
        //변수 c에 저장된 'A'는 65이므로 하나 더하면 66이다.
        System.out.println(++c);
        //출력결과: 'B'
        //현재 변수에 저장된 값은 'A'인데 여기에 1을 더하면 아스키코드가 66인 'B'가 된다. 그리고 출력한다.
        System.out.println(c++);
        //출력결과: 'B'
        //현재 변수에 저장된 값은 'B'인데(바로 위에 프린트할 때 1 증가해서) 먼저 출력을 하고 변수에 1을 더한다.
        // 그러면 현재 c에 저장된 값은 아스키코드가 67인 'C'가 되지만 이 연산자는 출력을 하고 증가를 하는 것이기에 증가하기 전의 값인 'B'가 출력된다.
        System.out.println(c);
        //출력결과: 'C'
        //원래 초기화할 때 저장된 값은 'A'였는데 위에 프린트 두번하면서 c를 두번 증가시켜서 현재 저장된 값은 아스키코드가 67인 'C'이다.
    }
}
