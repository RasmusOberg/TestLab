package clock;

public class Clock {
    private Time theTime;
    private Date theDate;
    private State currentState = State.DISPLAY_TIME;
    private State newState;

    public String changeMode(){
        String oldState = currentState.toString();
        switch (currentState){
            case DISPLAY_TIME:
                newState = State.DISPLAY_DATE;
                break;
            case DISPLAY_DATE:
                newState = State.DISPLAY_TIME;
                break;
            case CHANGE_TIME:

                break;
            case CHANGE_DATE:

                break;
        }
        currentState = newState;
        return "Went from " + oldState + " to " + currentState.toString();
    }

    public String ready(){
        switch (currentState){
            case DISPLAY_TIME:
                newState = State.CHANGE_TIME;
                break;
            case DISPLAY_DATE:
                newState = State.CHANGE_DATE;
                break;
            case CHANGE_TIME:

                break;
            case CHANGE_DATE:

                break;
        }
        currentState = newState;
        return null;
    }

    public String set(int p1, int p2, int p3){
        switch (currentState){
            case DISPLAY_TIME:

                break;
            case DISPLAY_DATE:

                break;
            case CHANGE_TIME:
                newState = State.DISPLAY_TIME;
                break;
            case CHANGE_DATE:
                newState = State.DISPLAY_DATE;
                break;
        }
        currentState = newState;
        return null;
    }



}
