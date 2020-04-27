package oop.unittesting;

public class Circle
{

    int radio;

    public void setRadio(int radio)
    {
        if(radio <=0)
        {
            throw new IllegalArgumentException("Radious must be greater than zero");
        }
        this.radio=radio;
    }

    public int getRadio()
    {
        return radio;
    }

    public double getArea()
    {
        return (3.1415 * (radio * radio) );
    }

}
