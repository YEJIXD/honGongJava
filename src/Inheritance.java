import InheritanceEx.Car;

public class Inheritance {
    /*
    * 상속(Inheritance)
      - 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 중복되는 코드를 줄일 수 있다.

      * 클래스 상속
        - 현실에서는 부모가 자식을 선택해서 물려주지만, 프로그램에서는 자식이 부모를 선택
        - 자식 클래스를 선언할 때, 어떤 부모 클래스를 상속받을 것인지 결정하고 선택된 부모 클래스는 extends 뒤에 작성

        * SportsCar 참고
           class SportsCar extends Car {
                // 필드
                // 생성자
                // 메소드
            }
        *
        
        1) Java는 다중 상속 지원 X (여러 개의 부모 클래스를 상속할 수 없음)
          class SportsCar extends Car, Car2 { }
          > Car2는 사용 X 
    * */


}
