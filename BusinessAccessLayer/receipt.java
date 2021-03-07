package PRG3x1_Project.BusinessAccessLayer;

import java.util.Date;
import java.util.Random;

public class receipt 
{
       // printing a receipt here
    // we need to instantiate the classes that we will be using to print the receipt

    Integer custnumber;
    Random rn = new Random();

    // intances of classes here
    calculations ca = new calculations();// this will tell how much is due

    //important classes
    Question quiz = new Question();
    

    public void PrintingTheReceipt() {

        

        // here we design how the invoive will look like
        String company = "Delicious-Catering";
        Date date = new Date();

        custnumber = rn.nextInt(1000);

        // printing the receipt
        System.out.println(company.toUpperCase() + "\t\t\t\t" + "Cust" + custnumber);
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Name: "  );
        System.out.println("Surname: ");
        System.out.println("Phone number: ");
        System.out.println("Email: ");
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("Type: " + "\t" + "Venue: " + "\t" + "Date: " + "\t" + "Time: " + "\t" + "Status: ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Capacity: ");
        System.out.println("Balance: ");
        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("Printed on: " + "\t\t\t" + date);
        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("Please keep the receipt as proof of booking and payment.");
        System.out.println("\n---------------------------------------------------------------");

        //

    }
}
