/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicines;


public class Medicines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome To Medicines Company");
        System.out.println("\n Patient Information:");
        
        PatientInfo patient = new PatientInfo();
        
        System.out.println("Name: "+patient.getName());
        System.out.println("Doctor Name: "+patient.getDoctorName());
        
        PurchasedMedicines medicines = new PurchasedMedicines();
        
        System.out.println("\n Purchased Information: ");
       
        System.out.println("\n Purchased Medicines Name: "+medicines.getPurchasedMedicines());
        System.out.println("Number of Tablets Purchased: "+medicines.getNumberOfTablets());
        System.out.println("Total Price: "+medicines.getTotalPrice());
        System.out.println("Thank you For Being Here!");
        
    }
    
}
