class A{
 public static int i=10;
 int j;
 
 //static initializer block will be invoked class loading (first use in code) time
 static 
 {
      System.out.println("in static block A "+i);
      i=20;
 }
 
 //initializer block will be invoked on every instantiate
 {
  j=100;
 }
 
}

class B{
public static int j=20;

  //static initializer block will be invoked class loading (first use in code) time
  static
  {
      System.out.println("in static block B "+j);
      j=50;
      A.i=90;
  }
}

//----test 1----
class Test1{
public static void main(String [] args){
System.out.println(A.i); //will load class only
}
}
//Output will be
//in static block 10
//20

//----test 2----
class Test2{
public static void main(String [] args){
System.out.println(B.j); //will load class B first then class A
System.out.println(A.i);
}
}

//Output will be
//in static block B 20
//in static block A 10
//50
//90
