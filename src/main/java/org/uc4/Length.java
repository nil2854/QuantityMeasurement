package org.uc4;

public class Length {

    private final double value;
    private final org.uc4.Length.LengthUnit unit;

    public enum LengthUnit {

        FEET(12.0), INCHES(1.0),
        YARDS(36.0), CENTIMETERS(0.393701);

        private final double coversationFactor;

        LengthUnit(double coversationFactor) {
            this.coversationFactor = coversationFactor;
        }

        public double getConversationFactor(){
            return coversationFactor;
        }
    }

    public Length(double value, org.uc4.Length.LengthUnit unit){
        this.value = value;
        this.unit = unit;
    }

    private double ConvertToActualUnit(){
        return this.value * this.unit.getConversationFactor();
    }

    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()) return false;

        org.uc4.Length other = (org.uc4.Length) obj;

        System.out.println("ConvertToActualUnit1---" + this.ConvertToActualUnit());
        System.out.println("ConvertToActualUnit2---" + other.ConvertToActualUnit());

        return Double.compare(Double.parseDouble(String.format("%.2f", this.ConvertToActualUnit())), Double.parseDouble(String.format("%.2f", other.ConvertToActualUnit()))) == 0;
    }


}

