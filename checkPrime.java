package practice.com;

//import java.util.Scanner;

public class checkPrime{
	public static void printprimeNum(int i) {
		int temp=0;
		for(int j=2; j<=i/2; j++) {
	    	  if(i%j==0) {
	    		  temp=temp+1;
	    	  }
	      }
	      if(temp>0) {
	    
	      }
	      else {
	    	  System.out.print(i+",");
	    	  
	    	  
	    	  
	    	  
	      }
	      
	}
	  public static void main(String[] args) { 	   
	       for(int i=1; i<100; i++) {
	    	   printprimeNum(i);
	       }
	  }
}
