/* 
 */
package step06;

public class Test06_4 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  static Score create(String name, int kor, int eng, int math) {
    Score obj = new Score();
    obj.name = name;
    obj.kor = kor;
    obj.eng = eng;
    obj.math = math;
    return obj;
  }
  
  static void compute(Score obj) {
    obj.sum = obj.kor + obj.eng + obj.math;
    obj.aver = obj.sum / 3f;
  }

  static void print(Score obj) {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        obj.name, obj.kor, obj.eng, obj.math, obj.sum, obj.aver);
  }
  
  public static void main(String[] args) {
    Score s1 = create("홍길동", 100, 90, 80);
    Score s2 = create("임꺽정", 90, 80, 70);
    Score s3 = create("유관순", 80, 70, 60);
    
    compute(s1);
    compute(s2);
    compute(s3);
    
    print(s1);
    print(s2);
    print(s3);
  }

}





