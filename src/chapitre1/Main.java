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
         b1*q1*2.f/x --> float et 250.0 **/

        // EXERCICE 3 : quels resultats fournit ce programme ?

        /**
         * y = Infinity
         * Infinity divise par 0 = Infinity
         * 15 divise par 0 = Infinity
         * 0.0 divise par 0.0 = NaN
         * NaN + 1 = NaN
         * +Infinity/-Infinity = NaN
         */

        // EXERCICE 4 : donner le type et la valeur des expressions

        char cc = 60, ce = 'e', cg = 'g';
        byte bb =10;

        /**
         * c+1 --> int et 61
         * 2*c --> int et 120
         * cg - ce --> int et 2
         * b*c --> int et 600
         */


        // EXERCICE 5 : quels resultats fournit ce programme ?

        /**
         * &&1 faux
         * i = 10 j = 5
         * & faux
         * i = 10 j = 6
         * &&2 vrai
         * i = 10 j =7
         * || vrai
         * i = 10 j = 7
         */

        // EXERCICE 6 : éliminer les parenthèses superflues

        /**
         * a = (x+5) --> a = x+5
         * a = (x=y)+2 --> same
         * a = (x = (y+2)) --> a = x = y+2
         * (a<b) && (c<d) --> a<b && c<d
         * (i++) * (n+p) --> i++ * (n+p)
         * x += (n%p) --> x += n%p
         * n = (p+=5) --> n = (p+=5)
         */

        // EXERCICE 7 : dire si l'expression est correct
        /**
         * byte b ; short p ; int n; long q;
         * final int N=10;
         * float x ; double y;
         *
         * b = n --> faux
         * b=25 --> juste
         * b = 500 --> faux
         * x = 2*q --> vrai, conversion de long en float
         * y=b*b --> vrai, conversion de byte en double
         * p=b*b --> faux
         * b=b+5 -->faux
         * p=5*N-3 --> vrai
         */


    }
}
