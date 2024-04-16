public class StaticProxyCalculator implements Calculator {

    private Calculator calculator;
    public StaticProxyCalculator(Calculator target){
        calculator=target;
    }
    @Override
    public int add(int i, int j) {
        System.out.println("i = " + i + ", j = " + j);
        int sum=calculator.add(i,j);
        System.out.println("calculator = " + sum);
        return 0;
    }

    @Override
    public int subtract(int i, int j) {
        System.out.println("i = " + i + ", j = " + j);
        int sum=calculator.subtract(i,j);
        System.out.println("calculator = " + calculator);
        return 0;
    }
}
