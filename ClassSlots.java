package BioScheduler;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassSlots {
    private Days Day;
    private ArrayList TimeSlots;

    public Days getDay() {
        return Day;
    }

    public void setDay(Days day) {
        Day = day;
    }

    public ArrayList getTimeSlots() {
        return TimeSlots;
    }

    public void setTimeSlots(ArrayList timeSlots) {
        TimeSlots = timeSlots;
    }

    enum Days
    {
        Monday,Tuesday,Wednesday,Thursday,Friday;
    }

    @Override
    public String toString() {
        return "ClassSlots{" +
                "day=" + Day +
                ", timeSlot=" + TimeSlots +
                '}';
    }
}
