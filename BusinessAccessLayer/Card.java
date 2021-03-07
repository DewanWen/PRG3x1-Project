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
    public void pay(double amount, double balance) 
    {
        Scanner sc = new Scanner(System.in);
        notification payConfirm = new notification("Payment", "", "");
        if (amount >=(0.5*balance)) 
        {
            bookings.Update(sc.nextInt());
        }
    }

    
}
