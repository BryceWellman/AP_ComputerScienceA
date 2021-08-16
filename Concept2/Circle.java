public class Circle           //Class declaration
{
    private double radius;    //instance variable

    public Circle()           //No-argument constructor
    {

    }
    public Circle(double rad)                //parameterized constructor
    {
        radius = rad;
    }
    public double getRadius()                //accessor method
    {
        return radius;
    }
    public void setRadius(double rad)        //Mutator Method
    {
        radius = rad;
    }
    public double getArea()                  //Method that calculates area
    {
        return 3.14 * radius * radius;
    }

}