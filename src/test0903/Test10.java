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

    public static void main(String[] args) {

        StringFunc sf = Test10::func;

        String str = "Korea,Australia,China,Germany,Spain,Turkey";
        String result = sf.modify(str);
        System.out.println(result);
    }
}
