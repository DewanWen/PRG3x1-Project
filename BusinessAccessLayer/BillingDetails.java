
public class BillingDetails 
{
    private String accNum;
    private String accOwner;
    private String address;
    private String zipCode;
    private String city;
    private String branchCode;
    private String bankName;

    public BillingDetails(String accNum, String accOwner, String address, String zipCode, String city,
            String branchCode, String bankName) {
        this.accNum = accNum;
        this.accOwner = accOwner;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.branchCode = branchCode;
        this.bankName = bankName;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BillingDetails [accNum=" + accNum + ", accOwner=" + accOwner + ", address=" + address + ", bankName="
                + bankName + ", branchCode=" + branchCode + ", city=" + city + ", zipCode=" + zipCode + "]";
    }
}
