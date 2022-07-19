import java.util.function.UnaryOperator;

public class Main {
    private static String PREFIX = "__prefix__";
    private static String SUFFIX = "__suffix__";
	
	// fix the operator code
    public static UnaryOperator<String> operator = str -> PREFIX+str+SUFFIX;

    public static void main(String[] args) {
        String res = operator.apply("  hello").replaceAll("\\s+","");
        System.out.println(res); // __prefix__hello__suffix__
    }
}
