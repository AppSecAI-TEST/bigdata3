/* 부동소수점 값을 저장할 변수 선언
 * => 메모리의 크기에 따라 2가지 유형을 제공한다.
 *    float(4), double(8)
 */
package step02;

public class Test04_1 {
  public static void main(String[] args) {
    // float의 경우 유효자릿수 7자리의 부동소수점을 저장할 수 있다.
    // 부동소수점이 2진수로 바뀔 때 완전하게 바뀌지 못하는 
    // 문제로 인해 유효자릿수의 값을 넣더라도 짤릴 수 있음을 항상 명심하라!
    float f1 = 9.876987f;
    float f2 = 987698.7f;
    System.out.println(f1);
    System.out.println(f2);

    // 유효자릿수를 벗어난다고 해서 컴파일 오류가 발생하는 것은 아니다.
    // 단지 값이 짤릴 뿐이다.
    f1 = 9.8769874f;
    f2 = 9876987.4f;
    System.out.println(f1);
    System.out.println(f2);

    // 4바이트 메모리에 8바이트 부동소수점을 넣는다면?
    //f1 = 9.876987; // 컴파일 오류!
    //f2 = 987698.7; // 컴파일 오류!
    //f1 = 3.14; // 컴파일 오류!
    // 부동소수점 뒤에 F 또는 f가 붙지 않으면 8바이트 부동소수점이 된다.
    
    // 부동소수점 변수를 사용하면서 가장 많이 오해하는 것!
    // => 컴파일할 때 오류가 발생하지 않았다고 해서 정상적이라고 생각하는 것!
    float f = 987654321.987654321f; 
    System.out.println(f); // 부동소수점은 메모리의 크기를 넘는 
                           // 유효범위를 벗어난 값을 넣으면 
                           // 오류가 발생하지 않고 단지 값이 짤릴 뿐이다.
    System.out.println("------------------------------");
    
    // 부동소수점을 사용할 때 조심해야 할 것!
    // => 각각의 값은 유효범위에 있을 지라도,
    //    계산을 수행한 후의 값이 유효범위를 넘을 수 있다.
    float x = 98765.43f; // 유효자릿수 7자리 
    float y = 12.34567;  // 유효자릿수 7자리
    System.out.println(x);
    System.out.println(y);


  }

}
 