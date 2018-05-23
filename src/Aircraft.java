package airlineflightschedule;

public class Aircraft {
    
    public static String aircraft;

    //Aircraft names
    public static final String AIR_321= "Airbus 321";//QATAR
    public static final String BOE_777= "Boeing 777 Hawaii";//UNITED
    public static final String AIR_320= "Airbus 320";//DRAGONAIR
    public static final String BOE_787= "Boeing 787";//JETSTAR
    public static final String BOE_737= "Boeing 737";//ALASKA
    public static final String AIR_319= "Airbus 319";//AMERICAN
    public static final String BOMBARD= "Bombardier CRJ700";//DELTA
    public static final String EMBRA= "Embraer E190";//JETBLUE
    
    public static String getAircraftName(){
        if (Airline.airlineCode.equalsIgnoreCase(Airline.ALASKA_CODE)){
            aircraft = BOE_737;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.AMERICAN_CODE)){
            aircraft = AIR_319;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DELTA_CODE)){
            aircraft = BOMBARD;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETBLUE_CODE)){
            aircraft = EMBRA;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.QATAR_CODE)){
            aircraft = AIR_321;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.UNITED_CODE)){
            aircraft = BOE_777;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DRAGONAIR_CODE)){
            aircraft = AIR_320;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETSTAR_CODE)){
            aircraft = BOE_787;
        }
        
        return aircraft;
    }//getAircraftname
    
}
