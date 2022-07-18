/* Other classes will communicate to this class 
 * This class will store all the passenger inforamtions
 */


public class passengerInfo {
    static String fromDestination,toDestination,departingDate,arrivalDate,
    seatNumber,selectedFlight, firstName, lastName, passportNo;
    passengerInfo(String from,String to,String depart,String arrival){
        this.fromDestination = from;
        this.toDestination = to;
        this.departingDate = depart;
        this.arrivalDate = arrival;
    }
    public static void setDepartAirport(String airport){
        fromDestination = airport;
    }
    public static String getDepartAirport(){   
        return fromDestination;
    }  
    public static void setArrivalAirport(String airport){
        toDestination = airport;
    }      
    public static String getArrivalAirport(){
        return toDestination;
    } 
    public static void setDepartDate(String date){
        departingDate = date;
    }
    public static String getDepartDate(){
        return departingDate;
    } 
    public static void setArrivalDate(String date){
        arrivalDate = date;
    }          
    public String getarrivalDate(){
        return arrivalDate;
    }
    public static void setSeatNumber(String seat){
        seatNumber = seat;       
    }
    public static String getSeatNumber(){             
        return seatNumber;
    }
    public static void setSelectedFlight(String flight){
        selectedFlight = flight;
    }
    public static String getSelectedFlight(){
        return selectedFlight;
    }
    public static void setFirtsName(String name){
        firstName = name;
    }
    public static String getFirstName(){
        return firstName;
    }
    public static void setLastName(String name){
        lastName = name;
    }
    public static String getLastName(){
        return lastName;
    }
    public static void setPassportNo(String number){
        passportNo = number;
    }
    public static String getPassportNo(){
        return passportNo;
    }    
}
