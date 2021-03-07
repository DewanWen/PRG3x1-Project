package PRG3x1_Project.BusinessAccessLayer;

public abstract class Event
{
    String typeEvent;
    int adults; // amount adults and kids
    int kids;
    int attendance;
    String date; // date and time of event. Date in dd/mm/yy format.
    String time; // Time in 24hour format
    String venue; // Address and city
    String theme; // Event theme eg. Pirates, Forest folk, Under The Sea

    //add a and b to get the capacity of the event
    public abstract Integer totalNumber(Integer a, Integer b);

}
