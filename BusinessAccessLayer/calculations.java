package PRG3x1_Project.BusinessAccessLayer;

public class calculations 
{
    //maths here
    //we need to multiply the number of adults by a certain price then if adults are >40 then 15% discount
    //this might need to utilize private fields for the purposes of capsulation

    //Adults will be charged R60 per person
    //childern will be chraged R35 per child
    //we shall take 10% of the total cost as solely for profit
    //When the customer pays in full then they get an additional 5% discount
    //the above is not entirely true, the customers does not get 15% discount 
    //the customer gets a 10% - this is counteracted by the 10% profit and the business does not lose anything
    //instead they gain a loyal customer

    Double total = 0.0; //total <=> amount

    public void pay(){
        System.out.println("Pay today in full and qualify for an additional 5% discount");
    }

    public Double charges(Integer adults, Integer children){

        total = 1.1*(double)(adults*60 + children *35);

        //verify if they qualify for the discount or not
        if(adults > 40){

            total *= 0.85;

        }

        return total;

    }
}
