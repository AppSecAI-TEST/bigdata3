package step18.ex2;

public abstract class ElectMotor {
  int kwh;
  
  public void on() {
    System.out.println("전원을 넣는다.");
  }
  
  public void off() {
    System.out.println("전원을 끊는다.");
  }
  
  public void charge() {
    System.out.println("충전한다.");
  }
}
