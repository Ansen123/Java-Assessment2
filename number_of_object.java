import java.io.*;
import java.util.*;
class number_of_object
{
static int count;
number_of_object()
{
count+=1;
}
public static void main(String args[])
{
number_of_object ob1=new number_of_object();
number_of_object ob2=new number_of_object();
number_of_object ob3=new number_of_object();
number_of_object ob4=new number_of_object();
number_of_object obj5=new number_of_object();
number_of_object ob6=new number_of_object();
number_of_object ob7=new number_of_object();
number_of_object ob8=new number_of_object();
number_of_object ob9=new number_of_object();
number_of_object ob10=new number_of_object();
System.out.println(" Number of object = "+count);
}
}