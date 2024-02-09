import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      //  System.out.println(toTenScaleFrom.translateToTen(12122.1, 6));
      //  System.out.println(fromTenScaleTo.fromTenScaleTo(36.36,36));
        char c = 'Z';
        System.out.println(getDigitTable().indexOf('Z'));
    }
    private static List<Character> getDigitTable(){
        ArrayList<Character> digits = new ArrayList<>();
        for (char i = '0';  i <= '9';  i++){
            digits.add(i);
        }
        for (char i = 'A';  i <= 'Z';  i++){
            digits.add(i);
        }
        return digits;
    }
}
