import java.util.*;

public class TestFraction {
    private int numerator;
    private int denominator;

    public TestFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double calValue()
    {
        return (double)numerator/denominator;
    }

    public String reduceFraction()
    {
        int gcd=greatestCommonDivisor(numerator,denominator);


        int n=numerator/gcd;
        int d=denominator/gcd;
        return n+"/"+d;
    }

    private int greatestCommonDivisor(int a,int b)
    {
        while(b!=0)
        {
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }

    public static void main(String[] args) {

        TestFraction fraction=new TestFraction(1330,4260);

        System.out.println(fraction.calValue());

        System.out.println(fraction.reduceFraction());

    }
}
