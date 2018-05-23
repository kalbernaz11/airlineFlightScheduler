package airlineflightschedule;

public class PassengerCapacity {
    
    public static int passengerCapacity;
    public static int firstClass;
    public static int economy;
    
    public static int getPassengerCapacity(){
        if (Airline.airlineCode.equalsIgnoreCase(Airline.ALASKA_CODE)){
            passengerCapacity = 144;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.AMERICAN_CODE)){
            passengerCapacity = 134;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DELTA_CODE)){
            passengerCapacity = 65;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETBLUE_CODE)){
            passengerCapacity = 100;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.QATAR_CODE)){
            passengerCapacity = 177;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.UNITED_CODE)){
            passengerCapacity = 344;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DRAGONAIR_CODE)){
            passengerCapacity = 158;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETSTAR_CODE)){
            passengerCapacity = 335;
        }
        
        return passengerCapacity;
    }//getPassengerCapacity
    
    public static int getFirstClassCapacity(){
        if (Airline.airlineCode.equalsIgnoreCase(Airline.ALASKA_CODE)){
            firstClass = 12;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.AMERICAN_CODE)){
            firstClass = 12;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DELTA_CODE)){
            firstClass = 17;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETBLUE_CODE)){
            firstClass = 16;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.QATAR_CODE)){
            firstClass = 12;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.UNITED_CODE)){
            firstClass = 130;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DRAGONAIR_CODE)){
            firstClass = 8;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETSTAR_CODE)){
            firstClass = 21;
        }
        return firstClass;
    }//getFirstClassCapacity
    
    public static int getEconomyCapacity(){
        if (Airline.airlineCode.equalsIgnoreCase(Airline.ALASKA_CODE)){
            economy = 132;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.AMERICAN_CODE)){
            economy = 112;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DELTA_CODE)){
            economy = 48;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETBLUE_CODE)){
            economy = 84;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.QATAR_CODE)){
            economy = 165;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.UNITED_CODE)){
            economy = 214;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.DRAGONAIR_CODE)){
            economy = 150;
        } if (Airline.airlineCode.equalsIgnoreCase(Airline.JETSTAR_CODE)){
            economy = 314;
        }
        return economy;
    }//getEconomyCapacity

}//class PassengerCapacity

