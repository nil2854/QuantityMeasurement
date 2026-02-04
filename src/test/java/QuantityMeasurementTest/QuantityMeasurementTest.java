package QuantityMeasurementTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.example.QuantityMeasurement.FeetCompare;
import org.example.QuantityMeasurement.InchesCompare;

public class QuantityMeasurementTest {

    @Test
    public void testFeetEquality_SameValue(){
        FeetCompare f1=new FeetCompare(1.0);
        FeetCompare f2=new FeetCompare(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        FeetCompare f1=new FeetCompare(1.0);
        FeetCompare f2=new FeetCompare(2.0);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_NullComparison(){
        FeetCompare f1=new FeetCompare(1.0);
        assertFalse(f1.equals(null));
    }

    @Test
    public void testFeetEquality_NonNumericInput(){
        FeetCompare f1=new FeetCompare(1.0);
        assertFalse(f1.equals("one"));
    }

    @Test
    public void testFeetEquality_SameReferance(){
        FeetCompare f1=new FeetCompare(1.0);
        assertTrue(f1.equals(f1));
    }
    //for inches
    @Test
    public void testInchesEquality_SameValue(){
        InchesCompare i1=new InchesCompare(1.0);
        InchesCompare i2=new InchesCompare(1.0);
        assertTrue(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_DifferentValue(){
        InchesCompare i1=new InchesCompare(1.0);
        InchesCompare i2=new InchesCompare(2.0);
        assertFalse(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_NullComparison(){
        InchesCompare i1=new InchesCompare(1.0);
        assertFalse(i1.equals(null));
    }

    @Test
    public void testInchesEquality_NonNumericInput(){
        InchesCompare i1=new InchesCompare(1.0);
        assertFalse(i1.equals("one"));
    }

    @Test
    public void testInchesEquality_SameReferance(){
        InchesCompare i1=new InchesCompare(1.0);
        assertTrue(i1.equals(i1));
    }

}

