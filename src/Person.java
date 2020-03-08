import java.util.ArrayList;

public class Person {
    String lastName;
    String name;
    String phone;
    int dateDay;
    int dateMonth;
    int dateYear;
    int number;
    Person(String lastName, String name, String phone, int dateDay, int dateMonth, int dateYear){
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
        this.dateDay= dateDay;
        this.dateMonth=dateMonth;
        this.dateYear=dateYear;
    }
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getDateDay() {
        return dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDateDay(int dateDay) {
        this.dateDay = dateDay;
    }

    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }

}
