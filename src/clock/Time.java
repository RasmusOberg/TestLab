package clock;

public class Time {
    private int theHour = 0;
    private int theMinunte = 0;
    private int theSecond = 0;

    public String timeSet(int hour, int minute, int second){
        theHour = hour;
        theMinunte = minute;
        theSecond = second;
        return "Time is set!";
    }

    public String showTime(){
        return theHour + ":" + theMinunte + ":" + theSecond;
    }

    public int getTheHour() {
        return theHour;
    }

    public int getTheMinunte() {
        return theMinunte;
    }

    public int getTheSecond() {
        return theSecond;
    }
}
