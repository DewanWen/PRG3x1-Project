package PRG3x1_Project.BusinessAccessLayer;

import java.util.Scanner;

public class Card extends payment
{
    private String cardType;
    private String expMonth;
    private String expYear;

    public Card(String cardType, String expMonth, String expYear) {
        this.cardType = cardType;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    @Override
    public void pay() 
    {
        bookings bk = new bookings(bookings.getData());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Desired Amount to pay. (numbers only with ',' seperating Rand and cent)");
        double amount = sc.nextDouble();
        double balance = bookings.getBalance();  // Get balance from clients record
        receipt slip = new receipt();
        
        if (amount >=(0.5*balance)) 
        {
            bookings.Update(sc.nextInt());
        }
        notification payConfirm = new notification("Payment", bookings.getBookingStatus(), slip.PrintingTheReceipt());
    }

    
}
