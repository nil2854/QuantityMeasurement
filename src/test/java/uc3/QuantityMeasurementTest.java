package uc3;

import org.junit.jupiter.api.Test;
import org.uc3.Length;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void testFeetEquality_SameValue(){
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(feet1, feet2);
    }

    @Test
    public void testInchesEquality_SameValue(){
        Length inc1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inc2 = new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(inc1, inc2);
    }

    @Test
    public void testFeetInches_Comparison(){
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inc = new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(feet, inc);
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void testInchesEquality_DifferentValue(){
        Length inc1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inc2 = new Length(2.0, Length.LengthUnit.INCHES);
        assertNotEquals(inc1, inc2);
    }

    @Test
    public void testCrossEquality_DifferentValue(){
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inc = new Length(2.0, Length.LengthUnit.INCHES);
        assertNotEquals(feet, inc);
    }

    @Test
    public void testFeetEquality_SameReferance(){
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(feet, feet);
    }

    @Test
    public void testFeetEquality_NullComparison(){
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(feet, null);
    }
}
