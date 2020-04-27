package oop.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void givenValidRadio_whenGetArea_validAreaIsReturned(){
        //given:
        Circle circle = new Circle();
        circle.setRadio(10);

        //when
        double area= circle.getArea();

        //then:
        assertEquals("Area for circle is not valid",314.15,area, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenANegativeRadio_whenSetRadio_theIllegalArgumentExceptionWasThrown(){
                //given:
        Circle circle = new Circle();

        //when:
        circle.setRadio(-10);

        //then:  IllegalArgumentException was thrown
    }
}
