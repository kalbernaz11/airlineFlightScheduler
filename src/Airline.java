package airlineflightschedule;

import java.util.Scanner;

public class Airline {
    public static Scanner sc = new Scanner(System.in);
    
    //Airline Codes
    public static final String ALASKA_CODE = "AS";
    public static final String AMERICAN_CODE = "AA";
    public static final String DELTA_CODE = "DL";
    public static final String JETBLUE_CODE = "B6";
    public static final String QATAR_CODE = "QR";
    public static final String UNITED_CODE = "UA";
    public static final String DRAGONAIR_CODE = "KA";
    public static final String JETSTAR_CODE = "JQ";
    
    //Airline Names
    public static final String ALASKA = "Alaska Airlines";
    public static final String AMERICAN = "American Airlines";
    public static final String DELTA = "Delta Airlines";
    public static final String JETBLUE = "JetBlue Airways";
    public static final String QATAR = "Qatar Airways";
    public static final String UNITED = "United Airlines";
    public static final String DRAGONAIR = "Dragonair";
    public static final String JETSTAR = "JetStar";
    
    public static String aircraft;
    
    public static String airlineCode;
    public static String airLineName;
    
    public static String confirm;
    
    public static String airlineMenu(){
        //gets user selection of airline
        boolean isValid = false;
        
        while (isValid == false){
        System.out.println("Please enter an Airline code: ");
        System.out.println("\n" + ALASKA_CODE + ": " + ALASKA);
        System.out.println(AMERICAN_CODE + ": " + AMERICAN);
        System.out.println(DELTA_CODE + ": " + DELTA);
        System.out.println(JETBLUE_CODE + ": " + JETBLUE);
        System.out.println(QATAR_CODE + ": " + QATAR);
        System.out.println(UNITED_CODE + ": " + UNITED);
        System.out.println(DRAGONAIR_CODE + ": " + DRAGONAIR);
        System.out.println(JETSTAR_CODE + ": " + JETSTAR);
        airlineCode = sc.nextLine();
        
            if (airlineCode.equalsIgnoreCase (ALASKA_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (AMERICAN_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (DELTA_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (JETBLUE_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (QATAR_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (UNITED_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (DRAGONAIR_CODE)){
                isValid = true;
                break;
            } if (airlineCode.equalsIgnoreCase (JETSTAR_CODE)){
                isValid = true;
                break;
            } else {
                System.out.println("\n" + airlineCode + " not found. Please try again.");
                isValid = false;
            }

        }//while

        return airlineCode;
    }//airlineMenu
    
    public static String airLines(){
        //displays name of airline
        switch (airlineCode){
            case ALASKA_CODE:
                airLineName = ALASKA;
                break;
            case AMERICAN_CODE:
                airLineName = AMERICAN;
                break;
            case DELTA_CODE:
                airLineName = DELTA;
                break;
            case JETBLUE_CODE:
                airLineName = JETBLUE;
                break;
            case QATAR_CODE:
                airLineName = QATAR;
                break;
            case UNITED_CODE:
                airLineName = UNITED;
                break;
            case DRAGONAIR_CODE:
                airLineName = DRAGONAIR;
                break;
            case JETSTAR_CODE:
                airLineName = JETSTAR;
                break;
        }//switch
        
        return airLineName;
    }
    
    public static int cargoCapacity(int cargo){
        if (airlineCode.equals(ALASKA_CODE)){
            cargo = 0;
        }
        
        return cargo;
    }//cargoCapacity
    
    
    
}//class Airline 