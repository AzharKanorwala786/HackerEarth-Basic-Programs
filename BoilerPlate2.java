package boilerplate.pkg2;
//Hackerearth BoilerPlate
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BoilerPlate2 {

  public static void main(String[] args) throws Exception {
      
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
     int a[] = new int[100];
     int b[] = new int[100];
     int N = Integer.parseInt(br.readLine());              //Test Cases Input
        
      for (int i = 0; i < N; i++) {
                                                            //for inputs like 4 2 5 6   lines-20-26 
	String temp = br.readLine();  
        String[] array = temp.trim().split("\\s+");

         for (int j = 0; j < array.length; j++) {
             a[j] = Integer.parseInt(array[j]);
           }		   
                                                            //continue if you want the same split input on next line                                              
    	   String  line1 = br.readLine();    
           String[] str1 = line1.trim().split("\\s+");
           
	    for (int k = 0; k < str1.length; k++) {
                  b[k] = Integer.parseInt(str1[k]);
             }     
         }
     }       
 }
