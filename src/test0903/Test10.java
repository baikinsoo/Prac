package test0903;

interface StringFunc {
    String modify(String s);
}

public class Test10 {

    static String func(String s) {
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c==',')
                result += " ";
            else result += c;
        }
        return result;
    }

    // 인스턴스 메서드 참조
    String func1(String s) {
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c==',')
                result += " ";
            else result += c;
        }
        return result;
    }

    public static void main(String[] args) {

        StringFunc sf = Test10::func;

        Test10 obj = new Test10();
        StringFunc sf1 = obj::func1;

        String str = "Korea,Australia,China,Germany,Spain,Turkey";
        String result = sf.modify(str);
        System.out.println(result);

        String str1 = "Korea,Australia,,Germany,Spain,";
        String result1 = sf1.modify(str1);
        System.out.println(result1);
    }
}
