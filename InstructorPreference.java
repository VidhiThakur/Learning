package BioScheduler;

import java.util.ArrayList;

public class InstructorPreference {
    String name;
    preferenceData preferenceData;

    public preferenceData getPreferenceData() {
        return preferenceData;
    }

    public void setPreferenceData(preferenceData preferenceData) {
        this.preferenceData = preferenceData;
    }

    public static class preferenceData{
        ArrayList<SlotData> preferredSlots;
        ArrayList<SlotData> availableSlots;
        ArrayList<SlotData> notAvailableSlots;
        Boolean all3ShiftsOnSingleDay;
        Boolean availableOnMonday;

        public ArrayList<SlotData> getNotAvailableSlots() {
            return notAvailableSlots;
        }

        public void setNotAvailableSlots(ArrayList<SlotData> notAvailableSlots) {
            this.notAvailableSlots = notAvailableSlots;
        }

        public Boolean getAll3ShiftsOnSingleDay() {
            return all3ShiftsOnSingleDay;
        }

        public void setAll3ShiftsOnSingleDay(Boolean all3ShiftsOnSingleDay) {
            this.all3ShiftsOnSingleDay = all3ShiftsOnSingleDay;
        }

        public Boolean getAvailableOnMonday() {
            return availableOnMonday;
        }

        public void setAvailableOnMonday(Boolean availableOnMonday) {
            this.availableOnMonday = availableOnMonday;
        }

        public ArrayList<SlotData> getAvailableSlots() {
            return availableSlots;
        }

        public void setAvailableSlots(ArrayList<SlotData> availableSlots) {
            this.availableSlots = availableSlots;
        }

        public ArrayList<SlotData> getPreferredSlots() {
            return preferredSlots;
        }

        public void setPreferredSlots(ArrayList<SlotData> preferredSlots) {
            this.preferredSlots = preferredSlots;
        }
    }

    public static class SlotData{
        String day;
        String timeSlot;

        public String getTimeSlot() {
            return timeSlot;
        }

        public void setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InstructorPreference{" +
                "name='" + name + '\'' +
                ", preferenceData=" + preferenceData +
                '}';
    }

    public static class NoOfClassesPerInstructor{
        String name;
        Integer noOfClasses;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getNoOfClasses() {
            return noOfClasses;
        }

        public void setNoOfClasses(Integer noOfClasses) {
            this.noOfClasses = noOfClasses;
        }

        @Override
        public String toString() {
            return "NoOfClassesPerInstructor{" +
                    "name='" + name + '\'' +
                    ", noOfClasses=" + noOfClasses +
                    '}';
        }
    }
}
