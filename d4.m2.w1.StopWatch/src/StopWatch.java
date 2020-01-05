
import java.util.Date;

public class StopWatch {
    private double startTime, endTime;

    public StopWatch() {
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        Date dateStart = new Date();
        startTime = dateStart.getTime();
    }

    public void end() {
        Date dateEnd = new Date();
        endTime = dateEnd.getTime();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}