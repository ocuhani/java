
public class Calculator {
    //la some de a et b
    public  double add(double a , double b){
        return a+b;
    }
    //la some de a et b
    public  double division(double a , double b){
             try {
                 return a/b;

             }catch (Exception e){
                 e.getMessage();
             }
        return 0;
    }
    //la some de a et b
    public  double dultiplying(double a , double b){
        return a*b;
    }
    //la some de a et b
    public  double subtracting(double a , double b){
        return a-b;
    }

}
