package legacyclasses;

import java.util.Date;

public class date {
    public static void main(String args[]) {
        Date d = new Date();

        System.out.println("Current date is " + d);

        int month = d.getMonth() + 1; 
        int year = d.getYear() + 1900; 

        System.out.println(month);
        System.out.println(year);
        System.out.println(d.getMinutes());
        System.out.println (d.getHours());
    }
}