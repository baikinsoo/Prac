import java.util.function.Function;

public class ExFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer / 10 * 10;
            }
        };

        Function<Integer, Integer> f2 = i -> i / 10 * 10;

        Function<String, Integer> f3 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> f4 = (String s) -> Integer.parseInt(s);

        Function<String, Integer> f5 = Integer::parseInt;

        int inputValue = 25;

        int result1 = f1.apply(inputValue);
        int result2 = f2.apply(inputValue);
        int result3 = f3.apply("10");
        int result4 = f4.apply("10");
        int result5 = f5.apply("10");

        System.out.println("f1("+inputValue +") = "+result1);
        System.out.println("f2("+inputValue +") = "+result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
    }
}