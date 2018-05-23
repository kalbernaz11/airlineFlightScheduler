/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineflightschedule;

import static airlineflightschedule.FlightSchedule.ATL;
import static airlineflightschedule.FlightSchedule.BOS;
import static airlineflightschedule.FlightSchedule.CLT;
import static airlineflightschedule.FlightSchedule.HND;
import static airlineflightschedule.FlightSchedule.JFK;
import static airlineflightschedule.FlightSchedule.LAS;
import static airlineflightschedule.FlightSchedule.LAX;
import static airlineflightschedule.FlightSchedule.ORD;
import static airlineflightschedule.FlightSchedule.PEK;
import static airlineflightschedule.FlightSchedule.PHX;
import static airlineflightschedule.FlightSchedule.SFO;
import java.util.Scanner;

public class MainApp {
    
    public static Scanner sc = new Scanner(System.in);
    
    //Menu options
    public static final int SET_CLOCK = 1;
    public static final int CLEAR_SCHEDULE = 2;
    public static final int ADD_AIRLINE = 3;
    public static final int ADD_FLIGHT = 4;
    public static final int CANCEL_FLIGHT = 5;
    public static final int SHOW_FLIGHT_INFO = 6;
    public static final int SHOW_DEPARTURES = 7;
    public static final int SHOW_ARRIVALS = 8;
    public static final int FIND_FLIGHTS = 9;
    public static final int EXIT = 10;
    
    public static int menuChoice;
    
    
    
    public static void main(String[] args) {
        FlightSchedule flightSchedule = new FlightSchedule();
        
        for (;;) {

            boolean isValid = false;

            menuChoice = welcome();
            switch (menuChoice) {
                
                case SET_CLOCK:
                    SetClock.setClockMessage();
                    while(isValid == false){
                        SetClock.getDay();
                        SetClock.getTime();
                        System.out.println("\nTime entered is: " + SetClock.time);
                        System.out.println("Day entered is: " + SetClock.day);
                        System.out.println("Would you like to continue? (Y/N)");
                        String confirm = sc.nextLine();
                        if (confirm.equalsIgnoreCase ("y")){
                            isValid = true;
                        } else {
                            isValid = false;
                        }
                    }
                    break;
                case CLEAR_SCHEDULE:
                    break;
                case ADD_AIRLINE:
                    isValid = false;
                    while (isValid == false){
                        Airline.airlineMenu();
                        String airlineChoice = Airline.airLines();
                        String aircraft = Aircraft.getAircraftName();
                        int passengerTotal = PassengerCapacity.getPassengerCapacity();
                        int firstClassTotal = PassengerCapacity.getFirstClassCapacity();
                        int economyTotal = PassengerCapacity.getEconomyCapacity();

                        System.out.println("\nYou have chosen " + airlineChoice + ".");
                        System.out.println("Designated aircraft will be " + aircraft + ".");
                        System.out.println("The number of total passengers is " + passengerTotal + ".");
                        System.out.println("The number of available First Class seats are " + firstClassTotal + ".");
                        System.out.println("The number of available Economy seats are " + economyTotal + ".\n");
                        System.out.println("Would you like to add this choice? (Y/N)");
                        String confirm = sc.nextLine();
                        if (confirm.equalsIgnoreCase ("y")){
                            isValid = true;
                        } else {
                            isValid = false;
                        }
                    }//while
                    break;
                case ADD_FLIGHT:
                    System.out.println("_________________________________________________");

                    System.out.println("Available airports:\n"
                    + BOS + "\n"
                    + ATL + "\n"
                    + PEK + "\n"
                    + HND + "\n"
                    + LAX + "\n"
                    + ORD + "\n"
                    + JFK + "\n"
                    + SFO + "\n"
                    + CLT + "\n"
                    + LAS + "\n"
                    + PHX + "\n");

            System.out.println("_________________________________________________");
                    break;
                case CANCEL_FLIGHT:
                    break;
                case SHOW_FLIGHT_INFO:
                    break;
                case SHOW_DEPARTURES:
                    break;
                case SHOW_ARRIVALS:
                    break;
                case FIND_FLIGHTS:
                    break;
                case EXIT: 
                    //when option is selected, program is closed
                    System.out.println("GoodBye!");
                    return;
                default:
                    System.out.println("\n***ERROR! That is not a valid entry! Please try again.***\n");//error for when an option is entered that is not available
                    break;
            }//switch
        }//for

    }//main

    
    public static int welcome(){
        for (;;) {
            boolean isValid = false;

            //displays menu options
            System.out.println("Welcome to the Airline Flight Scheduler!");
            System.out.println("\nMain Menu: \n");
            
            System.out.println(SET_CLOCK + ": Set Clock");

            System.out.println(CLEAR_SCHEDULE + ": Clear Schedule");

            System.out.println(ADD_AIRLINE + ": Add Airline");
            
            System.out.println(ADD_FLIGHT + ": Add Flight");

            System.out.println(CANCEL_FLIGHT + ": Cancel Flight");

            System.out.println(SHOW_FLIGHT_INFO + ": Show Flight Information");
            
            System.out.println(SHOW_DEPARTURES + ": Show Departures");
            
            System.out.println(SHOW_ARRIVALS + ": Show Arrivals");
            
            System.out.println(FIND_FLIGHTS + ": find Flights Between Two Airports");
            
            System.out.println(EXIT + ": Exit Program");

            
            while (isValid == false) {
                System.out.println("Make your choice by entering a corresponding number.");
                System.out.println(">>> ");

                if (sc.hasNextInt()) {//validate user entry as int
                    menuChoice = sc.nextInt();
                    isValid = true;
                } else {
                    System.out.println("\n***ERROR! That is not a valid entry. Please retry.***\n");//error message for anything other than int
                }
                sc.nextLine();

                if (isValid == true && menuChoice <= 0) {//error messages for nonexisting options
                    System.out.println("\n***ERROR! Invalid option. Please enter a number 1 through 10.***\n");
                    isValid = false;
                } else if (isValid == true && menuChoice >= 11) {
                    System.out.println("\n***ERROR! Invalid option. Please enter a number 1 through 10.***\n");
                    isValid = false;
                } else if (isValid == true && menuChoice >= 1 || menuChoice <= 10) {
                    isValid = true;
                }

            }//while
            return menuChoice;
        }//for
    }//welcome
    
}//MainApp class
