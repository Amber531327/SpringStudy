public class Test {
    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        StaticProxyCalculator staticProxyCalculator = new StaticProxyCalculator(calculator);
        staticProxyCalculator.add(2,5);
    }
}
