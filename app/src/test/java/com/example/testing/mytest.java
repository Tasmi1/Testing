package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class mytest {

    Arithematic arithematic = null;
    @Before
    public void setUp()
    {
        arithematic = new Arithematic();
    }
        @Test
        public void testAddition()
        {
            Arithematic arithematic = new Arithematic();
            float expectedResult = 10;
            float actualResult = arithematic.add(4,6);
            assertEquals(expectedResult,actualResult);
        }


    @Test
    public void testSubstraction()
    {
        Arithematic arithematic = new Arithematic();
        float expectedResult = 8;
        float actualResult = arithematic.substract(10,2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide()
    {
        Arithematic arithematic = new Arithematic();
        float expectedResult = 25;
        float actualResult = arithematic.divide(50,2);
        assertEquals(expectedResult,actualResult);
    }

    @After
    public void tearDown()
    {
        arithematic = null;
    }





}
