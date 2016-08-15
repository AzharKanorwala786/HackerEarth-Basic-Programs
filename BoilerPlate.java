package BoilerPlate;
import java.io.*;
import java.util.Arrays;

public class BoilerPlate {

   public static void print(Object ob) {
       
       System.out.println(ob);
   }
    
   public static int TestCases() throws Exception{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //Comment this line when done
       print("Enter Test-Cases");
       int testcases = Integer.parseInt(br.readLine()); 
       return testcases;
   }
   public static int[] Split_Inputs() throws Exception {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       print("Enter elements to split:-");
       String temp = br.readLine();
       String temp_array[] = temp.trim().split("\\s+");
       int array[] = new int[temp_array.length];
       for( int i = 0; i<temp_array.length;i++) {
           array[i]= Integer.parseInt(temp_array[i]);
       }
//     System.out.println(Arrays.toString(array));
       return array;
   }
   public static int Single_Inputs() throws Exception {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       print("Enter an Single Number");
       int input = Integer.parseInt(br.readLine());
       return input;
   }
   @SuppressWarnings("unused")
    public static void main(String args[] ) throws Exception {
      
      int test_cases;
      int input;
      int array[] = null;
      test_cases = TestCases();
      for(int i =0; i<test_cases;i++) { 
         input = Single_Inputs();
         array = Split_Inputs();
      }
      print(Arrays.toString(array));
    }
}