package lesson_19.homeWork19;

public class Calculator {



public static double sum (double a, double b ){
return a+b;
}
public static double multiply(double a, double b ){
    return a*b;

}
public static double minus(double a, double b ){
    return a-b;
}
public static double divide (double a , double b){
    if(b==0) return Integer.MAX_VALUE;
    return a/b;
}



}
