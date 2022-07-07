/* Other classes will communicate to this class 
 * This class will store all the passenger inforamtions
 */


public class passengerInfo {
    static String fromDestination,toDestination,departingDate,arrivalDate;
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
        System.out.println("From getDepartAirport passengerInfo:");
        System.out.println(fromDestination);        
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

}
