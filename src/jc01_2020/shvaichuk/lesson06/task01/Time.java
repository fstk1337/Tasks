package jc01_2020.shvaichuk.lesson06.task01;

public class Time {
    byte seconds;
    byte minutes;
    byte hours;

    public Time() {

    }

    public Time(byte seconds, byte minutes, byte hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public Time(int fullSeconds) {
        this.hours = (byte) (fullSeconds / 3600);
        fullSeconds = fullSeconds % 3600;
        this.minutes = (byte) (fullSeconds / 60);
        this.seconds = (byte) (fullSeconds % 60);
    }

    public int getFullSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    /*public boolean compareTo(Time time) {
        if (this.seconds == time.seconds && this.minutes == time.minutes && this.hours == time.hours)
            return true;
        else
            return false;
    }*/
    public boolean compareTo(Time time) {
        if (this.getFullSeconds() == time.getFullSeconds())
            return true;
        else
            return false;
    }
}
