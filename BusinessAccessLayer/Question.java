package PRG3x1_Project.BusinessAccessLayer;


public abstract class Question 
{
    abstract void typeEvent();
    abstract void attendance(); // amount adults and kids
    abstract void dateTime(); // date and time of event. Time in 24hour format
    abstract void venue(); // Address and city
    abstract void theme(); // Event theme eg. Pirates, Forest folk, Under The Sea
}
