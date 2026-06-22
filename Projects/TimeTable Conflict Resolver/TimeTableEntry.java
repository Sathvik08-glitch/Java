public class TimeTableEntry {

    private String subject;
    private String day;
    private int startingtime;
    private int endingtime;

    public TimeTableEntry(String subject, String time, int startingtime, int endingtime){
        this.subject = subject;
        this.day = time;
        this.startingtime = startingtime;
        this.endingtime = endingtime;
    }

    public String getSubject(){
        return subject;
    }
    public String getDay(){
        return day;
    }
    public int getStartingTime(){
        return startingtime;
    }
    public int getEndingTime(){
        return endingtime;
    }
    @Override
    public String toString(){
        return subject + "|" + day + "|" + startingtime + ":00 - " + endingtime + ":00";
    }
}