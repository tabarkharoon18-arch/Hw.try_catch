/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.custom_checked_exceptions;

/**
 *
 * @author hp-user
 */
public class WorkshopRegistration {
   public void registerParticipant (String name,int age ) throws InvalidAgeException{
   if(age<18){
   throw new InvalidAgeException("Registration denied for"+name+":Must be at least 18 years old (provided age:"+ age +").");
   }else{
   System.out.println("Registration successful for "+name );
   }
       
       }
           
}
