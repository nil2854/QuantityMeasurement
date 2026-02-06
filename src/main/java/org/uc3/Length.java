package org.uc3;

public class Length {

    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {

        FEET(12.0), INCHES(1.0);

        private final double coversationFactor;

        LengthUnit(double coversationFactor) {
            this.coversationFactor = coversationFactor;
        }

        public double getConversationFactor(){
            return coversationFactor;
        }
    }

    public Length(double value, LengthUnit unit){
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

        Length other = (Length) obj;

        return Double.compare(this.ConvertToActualUnit(), other.ConvertToActualUnit()) == 0;
    }


}
