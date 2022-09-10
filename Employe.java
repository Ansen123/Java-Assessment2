import java.util.Scanner;
public class Employe{
    String Name;
    int empid;
    int ass1;
    int ass2;
    int ass3;
    int sum;
    double percentage;
  
  public  Employe(String  Name,int empid,int ass1,int ass2,int ass3) {
    this.Name=Name;
    this.empid=empid;
    this.ass1=ass1;
    this.ass2=ass2;
    this.ass3=ass3;
  }
  
  
  
  
public void add(){
    sum=this.ass1+this.ass2+this.ass3;
    System.out.println("Sum of Your Assessment is :"+sum);
   
    
}

public void percentage(){
    
      percentage=(sum*100)/300;
      System.out.println("Your percentage is  :"+percentage);
     
     
}


public void result(){
     
    if(this.ass1<75 || this.ass2 <75 || this.ass3<75){
        
        System.out.println("Demoted");
       
      
        
    }
    else{
           System.out.println("Promoted");
        
    }
    
    
    
    
    
}
public  void display(){
     System.out.println("Hai "+this.Name);
  }
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Name :");
    String Name=sc.nextLine();
    System.out.println("Enter the Employee ID :");
    int a=sc.nextInt();
    System.out.println("Please Enter First Assessment :");
    int b=sc.nextInt();
    System.out.println("Please Enter Second Assessment :");
    int c=sc.nextInt();
    System.out.println("Please Enter Thrid Assessment  :");
    int d=sc.nextInt();
    Employe student1 = new Employe(Name,a,b,c,d);


    student1.display();
    student1.add();
    student1.percentage();
    student1.result();
}
}