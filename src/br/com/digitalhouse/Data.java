package br.com.digitalhouse;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(){

    }
    public Data(int newDay,int newMonth,int newYear){
        setDay(newDay);
        setMonth(newMonth);
        setYear(newYear);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay){
        day=newDay;
    }

    public void setMonth(int newMonth){
        month=newMonth;
    }

    public void setYear(int newYear){
        year=newYear;
    }

    @Override
    public String toString() {
        return "Data{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
