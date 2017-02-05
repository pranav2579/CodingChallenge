package javaproblems;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Pranav on 05/02/17.
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();



        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), (Integer.parseInt(month)-1), Integer.parseInt(day));

        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        switch(day_of_week){
            case 1:{
                System.out.println("SUNDAY");
                break;
            }
            case 2:{
                System.out.println("MONDAY");
                break;
            }
            case 3:{
                System.out.println("TUESDAY");
                break;
            }
            case 4:{
                System.out.println("WEDNESDAY");
                break;
            }
            case 5:{
                System.out.println("THURSDAY");
                break;
            }
            case 6:{
                System.out.println("FRIDAY");
                break;
            }
            case 7:{
                System.out.println("SATURDAY");
                break;
            }

        }

    }

}
