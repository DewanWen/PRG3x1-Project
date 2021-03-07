package PRG3x1_Project.BusinessAccessLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class bookings implements getdata
{
    private String status;
    private String eventDate;
    private Integer bookNum;
    private String clientName;
    private Double balance;
    
    public bookings(String eventDate, Integer bookNum, String clientName, Double balance) {
        this.status = "Booked";// booked by default when created
        this.eventDate = eventDate;
        this.bookNum = bookNum;
        this.clientName = clientName;
        this.setBalance(balance);
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public Integer getBookNum() {
        return bookNum;
    }
    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEventDate() {
        return eventDate;
    }
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
    @Override
    public String toString() {
        return "bookings [eventDate=" + eventDate + ", status=" + status + "]";
    }
    
    public static void Update(Integer bookNumUp)// change only for centain record of client, Done by admin/Miss Rachel
    {
        Scanner sc = new Scanner(System.in);
        List<bookings> userBook = new ArrayList<>();
        Integer count = 0;
        while (!count.equals(userBook.size())) 
        {
            
            count++;
        }
        System.out.println("1.Payment recieved \n"+"2.Menu change"+"3.Cancel event");
        int input = sc.nextInt();
            switch (input) 
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            
                default:
                    break;
            }
    }
    @Override
    public
    void getData() {
        // TODO Auto-generated method stub
        
    }
    
    
}
