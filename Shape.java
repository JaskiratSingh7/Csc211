public class Shape
{
    public static int numSide;
    
    public Shape()
    {
        numSide=0;
    }
    
    public static void setSide(int a)
    {
        numSide=a;
    }
    
    public static int getSide()
    {
        return numSide;
    }
}

class Circle extends Shape
{
    public Circle()
    {
        super.numSide = 0;
    }
}

class Rectangle extends Shape
{
    public Rectangle()
    {
        super.numSide=4;
    }
}


public class Main
{
	public static void main(String[] args) {
	    Circle c1 = new Circle();
	    int sides = c1.getSide();
		System.out.println("The number of sides of a Circle: " + sides);
		Rectangle r1 = new Rectangle();
		int a = r1.getSide();
		System.out.println("The number of sides of a Rectangle: " + a);
	}
}


