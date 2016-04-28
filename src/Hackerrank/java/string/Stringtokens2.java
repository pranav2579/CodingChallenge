package Hackerrank.java.string;

import java.util.Scanner;



    public class Stringtokens2 {

      
        public static void main(String[] args) 
        {

            int count = 0;
            int i = 0;
        	Scanner scan = new Scanner(System.in);
        	String s1 = scan.nextLine();
            
        	String[] tokens = s1.split("[!,?._'@ ]");
        	System.out.println(tokens.length);
            for(String element: tokens)
              {
            	 //element
                 System.out.println(element);
              }
              
          

          
        }
    }
