public class Day5Assignment1{  
 public void finalize(){
    System.out.println("Garbage collected");
}  
 public static void main(String args[]){  
  Day5Assignment1 obj=new Day5Assignment1();  
  obj=null;  
  System.gc();
 }  
}  