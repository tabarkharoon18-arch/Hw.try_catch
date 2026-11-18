
package hw.custom_checked_exceptions;


public class HWCustom_checked_Exceptions {

    
    public static void main(String[] args) {
    WorkshopRegistration registration = new WorkshopRegistration();
    try{
    registration.registerParticipant("Ahmed", 16);
    }    
    catch(InvalidAgeException e) {
    System.out.println(e.getMessage());
    }
    }
    
}
