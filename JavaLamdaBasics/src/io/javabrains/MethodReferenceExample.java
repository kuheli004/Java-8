package io.javabrains;

public class MethodReferenceExample implements Runnable{
  
  
  public static void main(String[] args) {
    Thread t=new Thread(MethodReferenceExample::perform);
    t.run();
   /* Thread myLamdaThread=new Thread(()->System.out.println("hello lambda thread"));
    myLamdaThread.run();*/
   }
 public static void perform(){
   System.out.println("hello");
 }
@Override
public void run() {
  System.out.println("world");
  
}
   
   

}
