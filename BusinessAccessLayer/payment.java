package PRG3x1_Project.BusinessAccessLayer;

public abstract class payment 
{
    Double amount;
    Double balance;

    public abstract void pay(double amount, double balance);
}
