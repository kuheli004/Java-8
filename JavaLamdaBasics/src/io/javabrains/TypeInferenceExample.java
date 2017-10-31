package io.javabrains;

public class TypeInferenceExample {

  public static void main(String[] args) {
    printLamda(s->s.length());
   // TypeInterfaceLambda  t=s->s.length();
  //  System.out.println(t.getLength("kuheli"));

  }
  public static void printLamda(TypeInterfaceLambda  t){
    System.out.println(t.getLength("learning java 8"));
  }
  
  interface TypeInterfaceLambda{
    int getLength(String s);
    
  }

}