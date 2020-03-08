import java.util.Comparator;

import static java.lang.Character.toLowerCase;

public class CompABC implements Comparator<Person> {
    @Override
    public int compare(Person m1, Person m2) {
        if (LetterNumber(toLowerCase(m1.getLastName().charAt(0))) > LetterNumber(toLowerCase(m2.getLastName().charAt(0))))
            return -1;
        else if (LetterNumber(toLowerCase(m1.getLastName().charAt(0))) < (LetterNumber(toLowerCase(m2.getLastName().charAt(0)))))
            return 1;
        else return 0;
    }
    private int LetterNumber(char letter){
        if (letter=='a'||letter=='а') return 1;
        else if (letter=='b'||letter=='б') return 2;
        else if (letter=='c'||letter=='в') return 3;
        else if (letter=='d'||letter=='г') return 4;
        else if (letter=='e'||letter=='д') return 5;
        else if (letter=='f'||letter=='е') return 6;
        else if (letter=='g'||letter=='ё') return 7;
        else if (letter=='h'||letter=='ж') return 8;
        else if (letter=='i'||letter=='з') return 9;
        else if (letter=='j'||letter=='и') return 10;
        else if (letter=='k'||letter=='й') return 11;
        else if (letter=='l'||letter=='к') return 12;
        else if (letter=='m'||letter=='л') return 13;
        else if (letter=='n'||letter=='м') return 14;
        else if (letter=='o'||letter=='н') return 15;
        else if (letter=='p'||letter=='о') return 16;
        else if (letter=='q'||letter=='п') return 17;
        else if (letter=='r'||letter=='р') return 18;
        else if (letter=='s'||letter=='с') return 19;
        else if (letter=='t'||letter=='т') return 20;
        else if (letter=='u'||letter=='у') return 21;
        else if (letter=='v'||letter=='ф') return 22;
        else if (letter=='w'||letter=='х') return 23;
        else if (letter=='x'||letter=='ц') return 24;
        else if (letter=='y'||letter=='ч') return 25;
        else if (letter=='z'||letter=='ш') return 26;
        else if (             letter=='щ') return 27;
        else if (             letter=='ъ') return 28;
        else if (             letter=='ы') return 29;
        else if (             letter=='ь') return 30;
        else if (             letter=='э') return 31;
        else if (             letter=='ю') return 32;
        else if (             letter=='я') return 33;
        else return 0;
    }
}
