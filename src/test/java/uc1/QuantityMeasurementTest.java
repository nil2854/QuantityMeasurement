package uc1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.uc1.QuantityMeasurement.CompareValue;

public class QuantityMeasurementTest {

    @Test
    public void testFeetEquality_SameValue(){
        CompareValue f1=new CompareValue(1.0);
        CompareValue f2=new CompareValue(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        CompareValue f1=new CompareValue(1.0);
        CompareValue f2=new CompareValue(2.0);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_NullComparison(){
        CompareValue f1=new CompareValue(1.0);
        assertFalse(f1.equals(null));
    }

    @Test
    public void testFeetEquality_SameReferance(){
        CompareValue f1=new CompareValue(1.0);
        assertTrue(f1.equals(f1));
    }
}
