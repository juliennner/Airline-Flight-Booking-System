/*JULIA WANGECHI THAITHI
ENNM221-0277/2020
MECHATRIONIC ENGINEERING
JAVA PROGRAMMING PROJECT
*/
/*
 * STEP 1: SIGNING IN (DONE)
- Name
- ID Number
- Email
- PHONE number
- Password 

STEP 2: CHOICE
a) Booking Flights
b) Cancelling flights
c) Checking available flights

a)BOOKING FLIGHTS
-List available flights (numbers, destinations, arrival and departure, vacant 
seats, availabilty).
- Ask user which flight to book.
- Confirm booking'
-Display the booked flight.

b)CANCELLING FLIGHTS
-List available flights (numbers, destinations, arrival and departure, vacant 
seats, availabilty)
- Ask user which flight to cancel
- Confirm cancelling
-Display the cancelled flight

c) CHECKING FLIGHT AVAILABILITY
-List available flights (numbers, destinations, arrival and departure, vacant 
seats, availabilty)
- Ask user which flight to check its availability
-Display the chosen flight




 */
package airlineflights;

import java.util.Scanner;
public class Airlineflights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
    {
    try
     
    {
    flight();
    }
    catch(Exception e)
     {
     System.out.println("YOU HAVE ENTERED AND INCORRECT KEY. PLEASE TRY AGAIN.");
     }
    }
 public static void flight()
 {
  //The system probes the customer to key in his/her personal details when signing up for the airline reservation service.
  Scanner UserInput=new Scanner(System.in);
  System.out.println("Enter your name: ");
  //The user is to key in his/her official names using characters.
  
  String name=UserInput.next();
  System.out.println("Enter your PIN: ");
  //The user is to key in his/her PIN number using integers.
  
  int pin=UserInput.nextInt();
  System.out.println("Enter your ID Number: ");
  //The user is to key in his/her personal identification number using integers.
  
  int id_number=UserInput.nextInt();
  System.out.println("Enter your e-mail address");
  //The user is to key in his/her email address using characters.
  
  String email=UserInput.next();
  System.out.println("Your name is: "+ name+ "\nYour PIN is: "+ pin +"\nYour ID Number is: " + id_number+ "\nYour e-mail address is: " + email);
  //The system then displays the output of the user's information. In case the output is faulty, the user can try again.
  int decision=Selection();
  if (decision==1)
  {
   
   int[] vacantseats=booking();
  }
  //If the user selects the first option, he/she will be redirected to the booking section.
  
  else if (decision==2)
  {

  int[] vacantseats=cancelling();
  }
  //If the user selects the second option, he/she will be redirected to the cancelling section.
  else if (decision==3)
  {
   
   boolean[] vacantseats=checking(); 
   
   //If the user selects the third option, he/she will be redirected to the checking section.
  }
 }
   
 
 
 public static int Selection()
  //The system then displays the selection, where the user has to choose the service he/she would like.
  //The choices are booking a flight, cancelling a flight, or checking the availability of a flight. 
         
 {
  System.out.println("How would you like to be served?:\n 1)Booking flights \n 2)Cancelling flights \n 3)Checking avaiable flights\n\n Choose"
   + "1,2 OR 3:");
  
  Scanner UserInput=new Scanner (System.in);
  int option=UserInput.nextInt();
  return option;
  //The system then directs the user to the next step in accordance to the choice he/she has made.
 
  
 }
 public static void printer(int[]x,String[]y,String[]z,String[]k,int[]m,boolean[]w)
 {
  for(int i=0; i<y.length;i++)
  {
   System.out.println((i+1)+") "+x[i]+" "+y[i]+" "+z[i]+" "+k[i]+" "+m[i]+" "+w[i]);
   
   
  }
  
 }
 
 // If the user chooses the booking option, the system will display the flight numbers, their arrival and departure times, the vacant seats, their availability and destination.


public static int[] booking(){
  int [] flightnumbers={001,002,005};
  //The system displays the flight numbers of the airlines that are available for flight.
  
  String []arrivaltime={"0700","1030","1455"};
  //The system displays the arrival time of the respective airlines according to their flight numbers.
  
  String []departuretime={"1200","1600","1750"};
  //The system displays the departure time of the respective airlines according to their flight numbers.
  
  int []vacantseats={34,12,0};
  //The system displays the vacant seats of the respective airlines according to their flight numbers.
  
  boolean []availability={true,false,false};
  //The system displays the availability of the respective airlines according to their flight numbers.
  
  String [] destination = {"TOKYO","ACCRA","NAIROBI"};
  //The system displays the destinations of the respective airlines according to their flight numbers.
  
  printer(flightnumbers,destination,arrivaltime,departuretime,vacantseats,availability);
  
  
  Scanner UserInput=new Scanner (System.in);
  System.out.println("Choose the flight you'd like to book:");
  //The system prompts the user to choose the flight he/she would like to book.
  
  int fn=UserInput.nextInt()-1;
  //The system then displays the position of the flight number.
  
  vacantseats[fn] -=1;
  //Upon booking, one of the vacant seats in that particular flight would be occupied, hence reducing the number of vacant seats by one.
  
  System.out.println("YOU HAVE BOOKED THIS FLIGHT:\n"+flightnumbers[fn]+" "+destination[fn]+" "+arrivaltime[fn]+" "+departuretime[fn]+" "+vacantseats[fn]+" "
   + ""+availability[fn]);
  //The system then displays the  the system will display the flight number of the chosen flight,its arrival and departure times, vacant seats, its availability and destination.
 

return vacantseats;
  
  
  
  
   
  
 }
 public static int [] cancelling(){
// If the user chooses the cancelling option, the system will first display the flight numbers, their arrival and departure times, the vacant seats, their availability and destination.
   
int [] flightnumbers={001,002,005};
  //The system displays the flight numbers of the airlines that are available for flight.
  
  String []arrivaltime={"0700","1030","1455"};
  //The system displays the arrival time of the respective airlines according to their flight numbers.
  
  String []departuretime={"1200","1600","1750"};
  //The system displays the departure time of the respective airlines according to their flight numbers.
  
  int []vacantseats={34,12,0};
  //The system displays the vacant seats of the respective airlines according to their flight numbers.
  
  boolean []availability={true,false,false};
  //The system displays the availability of the respective airlines according to their flight numbers.
  
   String [] destination = {"TOKYO","ACCRA","NAIROBI"};
   //The system displays the destinations of the respective airlines according to their flight numbers.
   
  printer(flightnumbers,destination,arrivaltime,departuretime,vacantseats,availability);
  
  
  Scanner UserInput=new Scanner (System.in);
  System.out.println("Choose the flight you'd like to cancel:");
  //The system prompts the user to choose the flight he/she would like to book.
    
  int fn=UserInput.nextInt()-1;
  //The system then displays the position of the flight number of thr flight.
    
  vacantseats[fn] +=1;
  //Upon booking, one of the vacant seats in that particular flight would be unoccupied, hence increasing the number of vacant seats by one.
  
    System.out.println("YOU HAVE CANCELLED THIS FLIGHT:\n"+flightnumbers[fn]+" "+destination[fn]+" "+arrivaltime[fn]+" "+departuretime[fn]+" "+vacantseats[fn]+" "
   + ""+availability[fn]);
  //The system then displays the  the system will display the flight number of the cancelled flight,its arrival and departure times, vacant seats, its availability and destination.
 
    
  
  
  
  return vacantseats;
 }


public static boolean[] checking(){
int [] flightnumbers={001,002,005};
  //The system displays the flight numbers of the airlines that are available for flight.
  
  String []arrivaltime={"0700","1030","1455"};
  //The system displays the arrival time of the respective airlines according to their flight numbers.
  
  String []departuretime={"1200","1600","1750"};
  //The system displays the departure time of the respective airlines according to their flight numbers.
  
  int []vacantseats={34,12,0};
  //The system displays the vacant seats of the respective airlines according to their flight numbers.
  
  boolean []availability={true,false,false};
  //The system displays the availability of the respective airlines according to their flight numbers.
  
   String [] destination = {"TOKYO","ACCRA","NAIROBI"};
   //The system displays the destinations of the respective airlines according to their flight numbers.
   
   printer(flightnumbers,destination,arrivaltime,departuretime,vacantseats,availability);
  
   
  Scanner UserInput=new Scanner (System.in);
  System.out.println("Choose the flight you'd like to check its availability:");
  //The system prompts the user to choose the flight he/she would like to check its availability.
  
  int posn = UserInput.nextInt() - 1;
  //The system displays the position of the flight number of the airline flight.

  
if (availability[posn]==true)
{
  
   System.out.println("YOU HAVE CHECKED THE AVAILABLE FLIGHT(S):\n"+flightnumbers[posn]+" "+destination[posn]+" "+arrivaltime[posn]+" "+departuretime[posn]+" "+vacantseats[posn]+" "
   + ""+availability[posn]);
   
   //If the availability is true, the system then displays the available flight(s) along with their destinations,arrival and departure times, vacant seats and their availability.
   
  }
  else if (availability[posn]==false)
  {
   
System.out.println("YOU HAVE CHECKED THE UNAVAILABLE FLIGHT(S):\n"+flightnumbers[posn]+" "+destination[posn]+" "+arrivaltime[posn]+" "+departuretime[posn]+" "+vacantseats[posn]+" "
   + ""+availability[posn]);
//If the availability is true, the system then displays the available flight(s) along with their destinations,arrival and departure times, vacant seats and their availability.
   

}
  return availability;
}
}
