public class CPPStudent {
    private String sName;
    private int numberOfClasses, hoursPerWeek;

    public String getName() {
        return sName;
    }

    public int getTotalHours() {
        return hoursPerWeek;
    }

    public void setHours(int time) {
        hoursPerWeek = time;
    }

    public String toString() {
        return sName + " has registerd for " + numberOfClasses + " classes";
    }
}
