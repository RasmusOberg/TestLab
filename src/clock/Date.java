package clock;

public class Date {
    private int theYear = 2000;
    private int theMonth = 1;
    private int theDay = 1;

    public String dateSet(int year, int month, int day){
        theYear = year;
        theMonth = month;
        theDay = day;
        return "Date is set!";
    }

    public String showDate(){
        return theYear + "/" + theMonth + "/" + theDay;
    }
}
