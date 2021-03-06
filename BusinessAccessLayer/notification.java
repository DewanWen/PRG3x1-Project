package PRG3x1_Project.BusinessAccessLayer;


public class notification 
{
    private String changeMade;
    private String bookingStatus;
    private String receipt;

    public notification(String changeMade, String bookingStatus, String receipt) {
        this.changeMade = changeMade;
        this.bookingStatus = bookingStatus;
        this.receipt = receipt;
    }

    public String getChangeMade() {
        return changeMade;
    }

    public void setChangeMade(String changeMade) {
        this.changeMade = changeMade;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    @Override
    public String toString() {
        return "notification [bookingStatus=" + bookingStatus + ", changeMade=" + changeMade + "]\n"+" [receipt=" + receipt
                + "]";
    }

    
}
