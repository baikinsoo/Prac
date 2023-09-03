package test0902;

class MyClass1 implements MyInterface {
    @Override
    public void print() {
        System.out.println("MyClass1");
    }
}
class MyClass2 implements MyInterface {

    @Override
    public void print() {
        System.out.println("MyClass2");
    }
}

class Verify1 implements Verify {

    @Override
    public boolean check(int n) {
        return (n % 2) == 0;
    }
}

public class Class {

    public static void test(MyInterface mi) {
        mi.print();
    }


    public static MyInterface test2() {
        MyInterface mi = new MyInterface() {
            @Override
            public void print() {
                System.out.println("test2() 메서드에서 반환된 MyInterface");
            }
        };
        return mi;
    }

    public static MyInterface test3() {
        return new MyInterface() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
    }

    public static void main(String[] args) {

        MyClass1 myClass1 = new MyClass1();
        MyClass2 myClass2 = new MyClass2();
        myClass1.print();
        myClass2.print();

        MyInterface mi = new MyInterface() {
            @Override
            public void print() {
                System.out.println("익명 클래스로 구현");
            }
        };

        (new MyInterface() {
            @Override
            public void print() {
                System.out.println("선언, 생성, 호출을 한번에 처리");
            }
        }).print();

        test(myClass1);
        test(mi);

        MyInterface mi2 = test2();
        mi2.print();

        MyInterface m = test3();
        m.print();

//        public static MyInterface test3() {
//            return new MyInterface() {
//                @Override
//                public void print() {
//                    System.out.println("Hello");
//                }
//            };
//        }

        MyInterface m2 = () -> System.out.println("Hello");
        m2.print();
        // 인터페이스는 구현체가 있어야 하고, 위의 코드는 추상 메서드를 구현한 코드이다.

        Verify v1 = new Verify1();
        System.out.println(v1.check(10));

        Verify v2 = (n) -> (n * 2) == 20;
        System.out.println(v2.check(10));
    }
}