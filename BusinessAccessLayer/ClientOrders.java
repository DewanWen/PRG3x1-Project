package PRG3x1_Project.BusinessAccessLayer;

public class ClientOrders implements getdata
{
    private Integer bookNum ;
    private String bookStatus;

    

    public ClientOrders(Integer bookNum, String bookStatus) {
        this.bookNum = bookNum;
        this.bookStatus = bookStatus;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "ClientOrders [bookNum=" + bookNum + ", bookStatus=" + bookStatus + "]";
    }

    @Override
    public
    void getData() {
        // TODO Auto-generated method stub
        
    }

    

    
}