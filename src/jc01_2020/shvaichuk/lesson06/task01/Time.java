package jc01_2020.shvaichuk.lesson06.task01;

public class Time {
	private byte seconds;
	private byte minutes;
	private byte hours;
	
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
	
	public int compareTo(Time time) {
		if (this.getFullSeconds() > time.getFullSeconds())
			return 1;
		else if (this.getFullSeconds() < time.getFullSeconds())
			return -1;
		return 0;
	}
	
	public void printTime() {
		System.out.println(String.format("%02dh:%02dm:%02ds", hours, minutes, seconds));
	}
}
