package io.javabrains;

import java.util.function.BiConsumer;

public class lambdaExceptionExample {

  public static void main(String[] args) {
  int arr[]={1,2,3,4,5};
  int key=0;
  process(arr,key,wrapperLamda((v,k)->System.out.println(v/k)));
 
  }

  private static void process(int[] arr, int key,BiConsumer<Integer,Integer> consumer) {
  for(int i:arr)
    consumer.accept(i, key);
    
  }
  private static BiConsumer<Integer,Integer> wrapperLamda(BiConsumer<Integer,Integer> consumer){
    return (v,k)->{
    try{
  
      consumer.accept(v,k);
      
    }
    
    catch(ArithmeticException e){
     System.out.println("divide by zero coming from wrapped LambdA");
    }
    };
  }

}
