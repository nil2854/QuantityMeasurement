package org.uc4;

public class QuantityMeasurement {

    public static void main(String args[]){

        Length L1 = new Length(1.0, Length.LengthUnit.FEET);
        Length L2 = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("Result for Feet to Inches: ---" + L1.equals(L2));

        Length L3 = new Length(1.0, Length.LengthUnit.YARDS);
        Length L4 = new Length(91.44, Length.LengthUnit.CENTIMETERS);
        System.out.println("Result for Yards to Inches : ---" + L3.equals(L4));

        Length L5 = new Length(100.0, Length.LengthUnit.CENTIMETERS);
        Length L6 = new Length(39.3701, Length.LengthUnit.INCHES);
        System.out.println("Result for Centimeter to Inches : ---" + L5.equals(L6));

    }
}
