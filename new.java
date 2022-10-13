class A
{
  void m1();                                                       A =new A ---- m1()  m1(int)
                                                                   A-new B ----- m1() -m1()  m1|(int) m1 (int int)
  void m1(int);
}                                                                   D = new A    --- a.m1()
class B extends A
{
  void m1();
  
  void m1(int,int);
}
class C  extends B
{
  void m1();
  
  void m1(int,int,int);
}
class D extends C
{
  void m1();
  
  void m1(int,int,int,int,int);
}
public static void main(String args[]){
   A a= new B();
  // a.m1();        
   

