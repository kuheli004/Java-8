package io.javabrains;

public class RunnableExample {

  public static void main(String[] args) {
   Thread t=new Thread(new Runnable(){

    @Override
    public void run() {
   System.out.println("runnable example");
      
    }
     
   });
   t.run();
   Thread myLamdaThread=new Thread(()->System.out.println("hello lambda thread"));
   myLamdaThread.run();
  }
public static void perform(){
  System.out.println();
}
  
  
}
