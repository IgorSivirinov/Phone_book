import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CompDate c = new CompDate();
        CompABC cABC = new CompABC();
        ArrayList <Person> person= new <Person> ArrayList();
        Person[] myArray=person.toArray(new Person[person.size()]);
        String lastName;
        String name;
        String phone;
        int dateDay;
        int dateMonth;
        int dateYear;
        while (true) {
            System.out.println("1. Добавиь              2. Удалить\n" +
                               "3. Показать по алфавиту 4. Показать по дате ");
            int ot = in.nextByte();
            switch (ot){
                case 1:

                    System.out.print("");
                    String i = in.nextLine();
                    System.out.println("Фамилия: ");
                    lastName = in.nextLine();
                    System.out.println("Имя:");
                    name=in.nextLine();
                    System.out.println("Дата рождения в форме дд мм гггг");
                    dateDay=in.nextInt();
                    dateMonth=in.nextInt();
                    dateYear=in.nextInt();
                    System.out.print("");
                    i = in.nextLine();
                    System.out.println("Номер телефона:");
                    phone=in.nextLine();
                    person.add(new Person(lastName,name,phone,dateDay,dateMonth,dateYear));
                    break;
                case 2:
                    for (int r = 0; r < person.size(); r++) {

                    System.out.println("Контакт №" + (r + 1));
                    System.out.println("\nФамилия:        " + person.get(r).getLastName());
                    System.out.println("Имя:            "   + person.get(r).getName());
                    System.out.println("Дата рождения:  "   + person.get(r).getDateDay() + "." + person.get(r).getDateMonth() + "." + person.get(r).getDateYear());
                    System.out.println("Номер телефона: "   + person.get(r).getPhone() + "\n\n");

                }
                    System.out.println("Номер контакта: ");
                    int t = in.nextInt()-1;
                    person.remove(t);
                    break;
                case 3:
                    myArray=person.toArray(new Person[person.size()]);

                    Arrays.sort(myArray, cABC);
                    for (int r = 0; r < person.size(); r++) {
                        System.out.println("\nФамилия:        " + myArray[r].getLastName());
                        System.out.println("Имя:            " + myArray[r].getName());
                        System.out.println("Дата рождения:  " + myArray[r].getDateDay() + "." + myArray[r].getDateMonth() + "." + myArray[r].getDateYear());
                        System.out.println("Номер телефона: " + myArray[r].getPhone() + "\n\n");
                    }
                        break;
                        case 4:
                            myArray = person.toArray(new Person[person.size()]);
                            Arrays.sort(myArray, c);
                            for (int r = 0; r < person.size(); r++) {
                                System.out.println("\nФамилия:        " + myArray[r].getLastName());
                                System.out.println("Имя:            " + myArray[r].getName());
                                System.out.println("Дата рождения:  " + myArray[r].getDateDay() + "." + myArray[r].getDateMonth() + "." + myArray[r].getDateYear());
                                System.out.println("Номер телефона: " + myArray[r].getPhone() + "\n\n");
                            }
                            break;
            }

        }

    }
}

