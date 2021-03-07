package PRG3x1_Project.BusinessAccessLayer;

import java.util.ArrayList;
import java.util.List;

public class Client implements getdata
{
    private String fName;
    private String lName;
    private String phoneNum;
    private String cEmail;
    private String pword;


    List<Client> allClients = new ArrayList<>(getData()); // to call list to other classes
    
    
    public Client(String fName, String lName, String phoneNum, String cEmail, String pword) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
        this.cEmail = cEmail;
        this.pword = pword;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    @Override
    public String toString() {
        return "Client [fName=" + fName + ", lName=" + lName + ", phoneNum=" + phoneNum + "cEmail=" + cEmail + "]";
    }

    public List<Client> getData() {
        List<Client> cList = new ArrayList<>();

        // get data from acces layer
        return cList;
    }

    
}


