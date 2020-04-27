package oop.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    //Junit <- framework

    //TDD <- TEST DRIVEN DEVELOPMENT  <- given when then

    // Exception


    @Test
    public void givenEvenBaseAndHeight_wheGetArea_thenValidAreaIsReturn()
    {
        //given:
        Triangle triangle= new Triangle();
        triangle.setBase(2);
        triangle.setHeight(5);

        //when:
        double area =triangle.getArea();

        //then:
        assertEquals("Area is not valid", 5, area,0);
    }


    @Test
    public void givenOddBaseAndHeight_wwhenGetArea_thenValidAreaIsReturned()
    {
        //given:
        Triangle triangle= new Triangle();
        triangle.setBase(3);
        triangle.setHeight(5);

        //when;
        double area =triangle.getArea();

        //then:
        assertEquals("Area is not valid", 7.5, area, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeBase_whenSetBase_thenIllegalArgumentExceptionIsThrow()
    {
        //given;
        Triangle triangle= new Triangle();

        //when:
        triangle.setBase(-3);

        //then: exception was trown

    }
    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeBase_whenSetHeight_thenIllegalArgumentExceptionIsThrow()
    {
        Triangle triangle= new Triangle();

        triangle.setHeight(-3);


    }
}

