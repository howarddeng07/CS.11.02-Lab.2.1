
public class Main {

    public static void main(String[] args) {
        int sum = add(3, 8);
        System.out.println("Sum: " + sum);

        int sumFour = add(3, 8, 4, 9);
        System.out.println("Sum of Four Numbers: " + sumFour);

        String morningMsg = morningGreeting("Toby Fox");
        System.out.println(morningMsg);

        String afternoonMsg = afternoonGreeting("Mac Miller");
        System.out.println(afternoonMsg);

        String tripleStr = triple("oohbaby");
        System.out.println(tripleStr);

        double halfValue = half(8);
        System.out.println("Half Value: " + halfValue);

        double halfValue2 = half(17);
        System.out.println("Half Value: " + halfValue2);


        int roundPosValue = roundPositiveValueToNearestInteger(8.5);
        System.out.println("Rounded Positive Value: " + roundPosValue);

        int roundPosValue2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println("Rounded Positive Value: " + roundPosValue2);

        int roundNegValue = roundNegativeValueToNearestInteger(-8.5);
        System.out.println("Rounded Negative Value: " + roundNegValue);

        int roundNegValue2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println("Rounded Negative Value: " + roundNegValue2);

    }

    public static int add(int a, int b) {
       return a+b;
    }

    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static String morningGreeting(String name){
        return "早上好, "+ name +"!";
    }

    public static String afternoonGreeting(String name){
        return "下午好, "+ name +"!";
    }

    public static String triple(String a){
        return a.repeat(3);
    }

    public static double half(int a){
        return (a/2.0);
    }

    public static int roundPositiveValueToNearestInteger(double a){
        return (int) Math.round(a);
    }

    public static int roundNegativeValueToNearestInteger(double a){
        return (int) Math.round(Math.abs(a)) * -1;
    }

}
