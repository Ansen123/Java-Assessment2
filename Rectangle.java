import java.util.*;
class Rectangle{

  
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
      
        this.length = length;
        this.breadth = breadth;
    }



    Rectangle(int length, int breadth){
    
        this.length = length;
        this.breadth = breadth;

    }

   void getArea()
    {
        System.out.println(length * breadth); 
    }

void  getPerimeter()
    {

 System.out.println(2 * (length + breadth)); 
   
    }
}




class FindRectangleArea
{
    public static void main(String arg[])
    {

 Scanner input =new Scanner(System.in);
System.out.println("Enter Breadth :");
int a=input.nextInt();
System.out.println("Enter length :");
int b=input.nextInt();
System.out.println("Enter Breadth :");
Double c=input.nextDouble();
System.out.println("Enter length :");
Double d=input.nextDouble();
 Rectangle area1= new Rectangle(a, b);
 Rectangle area2= new Rectangle(c, d);  
area1.getPerimeter();
area1.getArea();
area2.getArea();
area2.getPerimeter();
    }
}
