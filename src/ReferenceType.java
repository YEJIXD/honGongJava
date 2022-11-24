public class ReferenceType {
    public static void main(String[] args) {
        /*
        * Primitive Type (기본 타입)
            1) 정수 (bytem short, int, long)
            2) 실수 (float, double)
            3) 문자 (char)
            4) 논리 (boolean)

            - 실제 값을 변수 안에 저장
            - Stack 영역에 직접 값을 가지고 있음

        * Reference type (참조 타입)
            1) 배열 타입
            2) 열거 타입
            3) 클래스
            4) 인터페이스

         - 메모리의 번지(주소)를 변수 안에 저장 (∴ 주소를 통해 객체를 참조한다는 뜻에서 "참조 타입"이라 부름)
         - Stack 영역에 Heap 영역의 객체 주소를 가진다.

        */

        // Primitive Type과 Reference Type의 메모리 영억
        int age = 25; // Stack 영역에 "값" 저장
        String name = "yeji"; // Stack 영역에 "변수의 주소" 저장

        /*
        # 메모리 사용 영역
        JVM은 운영체제에서 할당받은 메모리 영역을 세부 영역으로 구분하여 사용한다.

        1) Method Area
           - JVM이 시작할 때 생성되고 모른 스레드가 공유하는 영역
           - 코드에서 사용되는 클래스들을 클래스 로더로 읽어 클래스별로 정적 필드(static field)와 상수(constant), 메소드 코드, 생성자(constructor) 코드 등을 분류하여 저장

        2) Heap Area
           - 객체와 배열이 생성되는 영역
           - 여기에 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 참조한다.
           - 만일 참조하는 변수나 필드가 없다면 의미없는 객체가 되기 때문에 JVM이 이것을 쓰레기로 취급하고 Garbage Collector를 실행시켜 자동으로 제거한다.
           - 따라서, 개발자는 객체를 제거하기 위해 별도의 코드를 작성할 필요가 없다.

        3) JVM Stack
           - 메소드를 호출할 때마다 Frame을 추가(push)하고 메소드가 종료되면 해당 프레임을 제거(pop)하는 동작을 수행한다.
           - 프레임 내부에는 로컬 변수 스택이 있는데, Primitive Type과 Reference Type이 push되거나 pop 된다.
           - 스택 영역에 변수가 생성되는 시점은 초기화가 될 때, 즉 최초로 변수에 값이 저장될 때이다.
           - 변수는 선언된 블록 안에서만 스택에 존재하고, 블록을 벗어나면 스택에서 제거된다.
        */

        /*
        * 참조 변수의 ==, != 연산
          - Primitive Type : 변수의 값이 같은지 아닌지
          - Reference Type : 동일한 객체를 참조하는지 아닌지 (변수의 값이 Heap 영역의 객체 주소이기 때문에 > 주소 비교하는 것과 동일)

          var1 (객체 1 참조)
          var2 (객체 2 참조)
          var3 (객체 2 참조)

          var1 == var2      // false
          var1 != var2      // true
          > 다른 객체를 참조하고 있기 때문에

          var2 == var3      // true
          var2 != var3      // false
          > 동일한 객체를 참조하고 있으므로
        */

        /*
        * null과 NullPointerExcepetion
          - Reference Type 변수는 "Heap 영역의 객체를 참조하지 않는다는 뜻"으로 null 값을 가질 수 있다.
            null 값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 Stack 영역에 생성된다.

         # Java의 예외
           참조 변수를 사용하면서 가장 많이 발생하는 예외 중 하나 : NullPointerException
           * 참조 변수가 null을 가지고 있을 경우, 참조 객체가 없으므로 변수를 통해 객체를 사용할 수 없다.
           * 만약 null 상태에서 있지도 않은 객체의 데이터(field)나 메소드를 사용하는 코드를 싱행하면 NullPointerException 발생
       
           > NullPointerException 발생 시 해결 방법
             참조 변수를 추적해서 객체를 참조하도록 수정하는 것
       
        * */
        // 1. 배열(Reference Type)을 null 값으로 초기화
        int[] arr = null;
        // arr[0] = 10;
        // arr이 참조하는 배열 객체가 없기 때문에 NullPointerException 발생

        // 2. String은 class이므로 참조 타입 > str 변수가 참조하는 String 객체가 없기 때문에 NullPointerException 발생
        String str = null;
        System.out.println("총 문자수 : " + str.length());
        
        
        /*
        * String Type
          - 문자열을 String 변수에 저장한다는 말은 엄밀히 말하면 틀린 표현
          > 문자열은 String 객체로 생성되고, 변수는 String 객체를 참조하기 때문에

          String name = "yeji";
          String hobby = "java";

          1) name 변수와 hobby 변수는 Stack 영역에 생성되고, 문자열 리터럴인 "yeji"와 "java"는 Heap 영역에 String 객체로 생성됨
          2) name 변수와 hobby 변수에는 String 객체의 주소 값이 저장됨
        * */
    }
}
