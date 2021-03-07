package PRG3x1_Project.BusinessAccessLayer;

import java.util.ArrayList;
import java.util.List;

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
    List<Event> allEvents = new ArrayList<>(getData());
    //add a and b to get the capacity of the event
    public abstract Integer totalNumber(Integer a, Integer b);

    public Event() {
    }

    public Event(String typeEvent, int adults, int kids, int attendance, String date, String time, String venue,
            String theme) {
        this.typeEvent = typeEvent;
        this.adults = adults;
        this.kids = kids;
        this.attendance = attendance;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.theme = theme;
    }

    public List<Event> getData() {
        List<Event> eList = new ArrayList<>();

        // get data from acces layer
        return eList;
    }
}
