package org.uc1;

import java.util.Scanner;

public class QuantityMeasurement {

    public static class CompareValue {
        public double value;
        public CompareValue(double value) {
            this.value = value;
        }

        public boolean equals(Object val) {
            if (this == val) {
                return true;
            }
            if (val == null) {
                return false;
            }
            CompareValue other = (CompareValue) val;
            return Double.compare(this.value, other.value) == 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st value:");
        double value1 = scanner.nextDouble();
        System.out.print("Enter 2nd value:");
        double value2 = scanner.nextDouble();
        CompareValue opt1 = new CompareValue(value1);
        CompareValue opt2 = new CompareValue(value2);

        boolean result = opt1.equals(opt2);
        System.out.println("Value are equal -- " + result);
        scanner.close();
    }
}
