public class Calculator {
    public static void main (String arg[]){
        System.out.println("Hello Rose");
        Calculator calculator = new Calculator();
        System.out.println(calculator.Sum(1,3));
        System.out.println(calculator.Subtract(3,2));

    }
    public int Sum(int a, int b) {
        return a+b;
    }
    public int Subtract(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public float division(float a, float b){
        return a/b;
    }
}
