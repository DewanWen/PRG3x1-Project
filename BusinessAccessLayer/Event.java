package PRG3x1_Project.BusinessAccessLayer;

import java.sql.Date;
import java.sql.Time;

public class Event
{
    private String typeEvent;
    private int adults; // amount adults and kids
    private int kids;
    private Date date; // date and time of event. Date in dd/mm/yy format.
    private Time time; // Time in 24hour format
    private String venue; // Address and city
    private String theme; // Event theme eg. Pirates, Forest folk, Under The Sea

}
