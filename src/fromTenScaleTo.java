import java.util.ArrayList;
import java.util.List;

public class fromTenScaleTo {
    public static String fromTenScaleTo (double number, int radix){
        String numberTranslate = null;

        if (getInRadixDouble(number,radix).equals("0")){
            numberTranslate = getInRadixInt((int)number,radix);
        } else {
            numberTranslate = getInRadixInt((int)number,radix) +"."+getInRadixDouble(number,radix);
        }
//        System.out.print(getInRadixInt((int)number,radix) + ",");
//        System.out.print(getInRadixDouble(number,radix));
 //       double numberTranslate = Double.parseDouble(Double.parseDouble(getInRadixInt((int)number,radix))+getInRadixDouble(number,radix));

        return numberTranslate;
    }

    private static String getInRadixInt(int number, int radix ){
        List<Character> digits = getDigitTable();

        if (radix <2 || radix >= digits.size()+1 || number < 0){
            throw new IllegalArgumentException();
        }
        StringBuilder valueStr = new StringBuilder();
        while (number > 0){
            valueStr.insert(0,digits.get((int) (number % radix)));
            number = number / radix;
        }
        return valueStr.toString();
    }

    private static String getInRadixDouble(double number, int radix ){
        List<Character> digits = getDigitTable();

        if (radix <2 || radix >= digits.size()+1 || number < 0){
            throw new IllegalArgumentException();
        }
        StringBuilder valueStr = new StringBuilder();

        double ostatok = number % 1;
        for (int i = 0; i < 12; i++){
            ostatok = ostatok * radix;

            valueStr.append(digits.get((int) (ostatok)));
            ostatok = ostatok % 1;

            if (ostatok == 0){
                break;
            }
        }
        return valueStr.toString();
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
