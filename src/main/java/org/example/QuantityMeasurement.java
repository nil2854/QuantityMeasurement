package org.example;
import java.util.Scanner;

public class QuantityMeasurement {
    public static class FeetCompare {
        private final double value;

        //compare constructor for feet
        public FeetCompare(double value) {
            this.value = value;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            FeetCompare f = (FeetCompare) obj;
            return Double.compare(this.value, f.value) == 0;
        }
    }

    public static class InchesCompare {
        private final double value;

        //compare constructor for inches
        public InchesCompare(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            InchesCompare other = (InchesCompare) obj;
            return Double.compare(this.value, other.value) == 0;
        }

    }

    static boolean CheckFeetEquality (double v1, double v2){
        FeetCompare f1 = new FeetCompare(v1);
        FeetCompare f2 = new FeetCompare(v2);
        return f1.equals(f2);
    }

    static boolean CheckInchesEquality(double v1, double v2){
        InchesCompare i1 = new InchesCompare(v1);
        InchesCompare i2 = new InchesCompare(v2);
        return i1.equals(i2);
    }

    public static void main(String[] args) {
        System.out.println("Quantity Measurement Application");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first feet value:");
        double ft1 = sc.nextDouble();

        System.out.println("Enter second feet value:");
        double ft2 = sc.nextDouble();

        boolean feetResult = CheckFeetEquality(ft1, ft2);
        System.out.println("Feet Equality Result: " + feetResult);

        System.out.println("Enter first inches value:");
        double inc1 = sc.nextDouble();

        System.out.println("Enter second inches value:");
        double inc2 = sc.nextDouble();

        boolean inchesResult = CheckInchesEquality(inc1, inc2);
        System.out.println("Inches Equality Result: " + inchesResult);
    }

}
