package airlineflightschedule;

import java.util.Scanner;

public class FlightSchedule {

    //data attributes
    public static Scanner sc = new Scanner(System.in);

    public static String departure;
    public static String arrival;
    public static String interOrDom;//interanational or domestic flight

    public static final String BOS = "BOS";
    public static final String ATL = "ATL";
    public static final String PEK = "PEK";
    public static final String HND = "HND";
    public static final String LAX = "LAX";
    public static final String ORD = "ORD";
    public static final String JFK = "JFK";
    public static final String SFO = "SFO";
    public static final String CLT = "CLT";
    public static final String LAS = "LAS";
    public static final String PHX = "PHX";

    //constructors
    public static String getDeparture()
    {
        System.out.println("Departure: ");
        departure = sc.next();
        return departure;
    }//getDeparture

    public static String getArrival()
    {
        System.out.println("Arrival: ");
        arrival = sc.next();
        return arrival;
    }//getArrival

    public static String interOrDomestic()
    {
    System.out.println("International or domestic: (I/D)");
    interOrDom = sc.next();
    return interOrDom;
    }
}//FlightSchedule
