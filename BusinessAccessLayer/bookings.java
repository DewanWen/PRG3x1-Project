package PRG3x1_Project.BusinessAccessLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class bookings implements getdata
{
    private String status;
    private Date eventDate;
    private Integer bookNum;
    private String clientName;
    private Double balance;
    
    public bookings(Date eventDate, Integer bookNum, String clientName, Double balance) {
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
    public Date getEventDate() {
        return eventDate;
    }
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    @Override
    public String toString() {
        return "bookings [eventDate=" + eventDate + ", status=" + status + "]";
    }
    
    public static void Update(Integer bookNumUp)// change only menu item for centain record of client
    {
        List<bookings> userBook = new ArrayList<>();
        Integer count = 0;
        while (!count.equals(userBook.size())) 
        {
          //  if () {
                
          //  }
        }
    }
    @Override
    public
    void getData() {
        // TODO Auto-generated method stub
        
    }
    
    
}
