package Hackerrank.java.string;

import java.io.*;
    import java.util.*;



    public class Stringtokens {

      
        public static void main(String[] args) 
        {

        
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
        //Complete the code
          StringTokenizer ST = new StringTokenizer(s);
          int count = ST.countTokens();
          System.out.println(count);
          while(ST.hasMoreTokens())
          {
        	  String token = ST.nextToken();
        	  System.out.println(token);
          }

        }
    }
