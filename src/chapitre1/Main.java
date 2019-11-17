package chapitre1;

public class Main {

    public static void main(String[] args) {

        // EXERCICE 1 : éliminer les parenthèses superflues
        double a =1, b=2 ,c=5, n=6, p=4, x=10, y=9, z=3;
        double exp1 = a+b - 2*c;
        double expr2 =  2*x / (y*z);
        double expr3 = (x+3) * (n%p);
        double expr4 = -a / -(b+c);
        double expr5 = x/y % -z;
        double expr6 = x / (y% -z);

        // EXERCICE 2 : donner le type et la valeur des expressions suivantes

        byte b1 =10, b2 = 20;
        short p1 = 200;
        int n1 = 500;
        long q1 = 100;
        float x1 = 2.5f;
        double y1 = 5.25f;

        /** b1+b2 --> int et 30
        p1+b1 --> int et 210
         b1*b2 --> int et 200
         q1+p1 * (b1+b2) --> long et 6100
         x1+q1*n1 --> float et 50 002.5
         b1*q1/x1 --> float et 400.0
         b1*q1*2./x --> double et 800.0
         b1*q1*2.f/x --> float et 250.0**/

    }
}
