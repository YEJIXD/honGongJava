public class Interface {
    /*
    * Interface
       : 개발 코드와 객체가 설로 통신하는 접점 역할
         > 개발 코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출시킨다.
           - 그렇기 때문에 개발 코드는 객체의 내부 구조를 알 필요가 없고 인터페이스의 메소드만 알고 있으면 된다.
         
    * Interface를 두는 이유
      - 개발 코드가 직접 객체의 메소드를 호출하면 간단한데 왜 중간에 두는가
      > 개발 코드를 수정하지 않고, 사용하는 객체를 변경할 수 있도록 하기 위해서
      > 인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에 따라서 실행 내용과 리턴값이 다를 수 있다.
      
    * Interface 선언
       - '~.java' 형태의 소스 파일로 작성 > 컴파일러 (javac)를 통해 '.class' 형태로 컴파일되기 때문에 물리적 형태는 클래스와 동일
       - 소스 작성 시, 선언하는 방법이 다름
       
       [public] interface 인터페이스명 { . . . }
      
      # 클래스는 필드, 생성자, 메소드를 구성 멤버로 가지는데, 인터페이스는 상수 필드, 추상 메소드만을 구성 멤버로 가짐

    * */
    interface a {
        // 상수
        int num = 1;
        
        // 추상 메소드
        String str(String date, String time);
    }
    
    /* 상수 필드(constant field) 선언
        Interface는 객체 사용 방법을 정의한 것이므로 실행 시 데이터를 저장할 수 있는 인스턴스 또는 정적 필드를 선언할 수 X
        그러나 상수 필드는 선언이 가능 (단, 상수는 인터페이스에 고정된 값으로 실행 시에 데이터를 바꿀 수 X)
        
        상수는 public static final로 선언
        따라서, 인터페이스에 선언된 필드는 모두 public static final의 특성을 가짐 (public static final 생략 시 > 컴파일 과정에서 자동으로 붙음)

        [public static final] 타입 상수이름 = 값;
    * */
    public interface RemoteControl {
        public int MAX_VOLUME = 10;
        public int MIN_VOLUME = 0;
    }
    
    /*
    * 추상 메소드 선언
      - 인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행됨
        > 따라서, 인터페이스의 메소드는 실행 블록이 필요없는 추상 메소드로 선언한다.
        
      # 추상 메소드 : 리턴 타입, 메소드 이름, 매개 변수만 기술 (중괄호 {}를 붙이지 않는 메소드)
      
      - 인터페이스에 선언된 추상 메소드는 모두 public abstract의 특성을 갖기 때문에 public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙음
      * 
    * */
    
    public interface RemoteControle2{
        // 상수
        public int MAX_VOLUME = 10;
        public int MIN_VOLUME = 0;
        
        // 추상 메소드 > 메소드 선언부만 작성
        public void turnOn();
        public void turnOff();
        public void setVolume(int volume);
    }
}


