import java.util.Comparator;

class CompDate implements Comparator<Person> {
    @Override
    public int compare(Person m1, Person m2) {
        int date1 = m1.getDateDay()+m1.getDateMonth()*30+m1.getDateYear()*365;
        int date2 = m2.getDateDay()+m2.getDateMonth()*30+m2.getDateYear()*365;

        if (date1 > date2)
            return -1;
        else if (date1 < date2)
            return 1;
        else return 0;
    }

}

