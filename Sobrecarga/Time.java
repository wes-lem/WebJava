public class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public Time(){
        this(0,0,0);
    }

    public Time(Time time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int hour, int minute, int second){
        if (hour < 0 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
            throw new IllegalArgumentException("Valores fora do padrão");
        }else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}
