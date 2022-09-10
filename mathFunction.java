class mathFunction { 

void multiplay(int x, int y){
    System.out.println(x*y);
}
void multiplay(double x, double y){
    System.out.println(x*y);
}void multiplay(double x, int y){
    System.out.println(x*y);
}
}

class ma{
 public static void main(String[] args) {
    
    mathFunction math =new mathFunction();
    math.multiplay(1,1);
    math.multiplay(2.1,1.3);
    math.multiplay(1.3,1);
}

}
