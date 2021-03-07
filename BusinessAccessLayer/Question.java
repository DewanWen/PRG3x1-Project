package PRG3x1_Project.BusinessAccessLayer;

import java.util.Scanner;

public class Question extends Event
{

    public Question() {
        
    }
    enum EventType
    {
        Wedding, BusinessFinction, Birthday, Baptism, Other;
    }
    public void run()
    {
        questions();
    }
    public void questions() {
    // calculations class instant here
    calculations ca = new calculations();
        
        Scanner sn = new Scanner(System.in);

        System.out.println("\n-----------------------------------------\n");
        int input = sn.nextInt(); // to
        switch (input) {
            case 1:    // Wedding
                typeEvent = "Wedding";
                break;
            case 2:     //BusinessFinction
                typeEvent = "BusinessFinction";
                break;
            case 3:     //Birthday
                typeEvent = "Birthday";
                break;
            case 4:     //Baptism
                typeEvent = "Baptism";
                break;
            case 5:     //Other
                typeEvent = "Other";
                break;
        }
        // date
        System.out.println("When will the event be taking place?");
        System.out.println("Please enter the date (use DD/MM/YYYY): ");
        typeEvent = sn.nextLine();
        System.out.println("\n-----------------------------------------\n");
        // time
        System.out.println("Please enter the time: ");
        time = sn.nextLine();
        System.out.println("\n-----------------------------------------\n");
        // number of kids
        System.out.println("Please enter the number of anticipated kids: ");
        kids = sn.nextInt();
        System.out.println("\n-----------------------------------------\n");
        // venue
        System.out.println("Please enter the name (or address) of the venue: ");
        venue = sn.nextLine();
        System.out.println("\n-----------------------------------------\n");
        // number of adults
        System.out.println("Please enter the number of anticipated Adults: ");
        adults = sn.nextInt();
        
        if (adults > 40) {
            System.out.println("You qualify for our 15% discount");
        }
        System.out.println("\n-----------------------------------------\n");
        // deco
        String choice;
        System.out.println("Would you like us to also provide deco for the event");
        System.out.println("Please choose enter Y for Yes or N for No");
        choice = sn.nextLine();

        if (choice.toUpperCase() == "Y") {
            System.out.println("Please enter the theme of the event: ");
            theme = sn.next();
        } else {
            theme = "No, thank you. I have this one covered.";
        }
        System.out.println(ca.charges(adults, kids));

        System.out.println("\n-----------------------------------------\n");
    
    }
    @Override
    public Integer totalNumber(Integer a, Integer b) {

        // We need toknow the number of kids and adults for catering purposes
        this.adults = a;
        this.kids = b;

        return attendance = adults + kids;
    }
}
