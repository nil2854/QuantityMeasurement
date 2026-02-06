package org.uc3;

public class QuantityMeasurement {

    public static void main(String args[]){

        Length L1 = new Length(1.0, Length.LengthUnit.FEET);
        Length L2 = new Length(12.0, Length.LengthUnit.INCHES);

        System.out.println("Result : ---" + L1.equals(L2));

    }
}
