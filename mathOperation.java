import java.util.*;
class mathOperation{
int x,y;
double  r;

void init()
{
Scanner input =new Scanner(System.in);

System.out.println("Enter the First value");

x=input.nextInt();
System.out.println("Enter the Second  value");
y=input.nextInt();

}



void add(){
 int r=x+y;
System.out.println(" Value Is "+r);
}

void multiplay(){

 int r=x*y;
System.out.println(" Value Is "+r);

}

void power(){
double r=Math.pow(x,y);
System.out.println(" Value Is "+r);

}


void display(){
add();
multiplay();
power();

}
}
class mathOperationdemo{
public static void main(String[] args) {

mathOperation operation= new mathOperation();
operation.init();
operation.display();
}
}



