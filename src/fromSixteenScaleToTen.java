import java.util.ArrayList;
import java.util.List;

public class fromSixteenScaleToTen {
    public static double translateFromSixteenScaleToTen(String number, int radixOrigin){
        int intPartNumber = getNumberToTenInt(number, radixOrigin);
        double doublePatrNumber = getNumberToTenDouble(number, radixOrigin);
        Double numberTranslate = intPartNumber + doublePatrNumber;
        return numberTranslate;
    }


    private static int getNumberToTenInt(String number, int radixOrigin){
        Integer numberTranslate = 0;
        number = getIntPart(number);
        int len = number.length();//Узнать длинну числа (будет 8)

        int[] a1 = new int[len];//создать массив с длинной указанной в len
        for (int i = 0; i < len ; i++){//заполнить массив
            a1[i] = (int) ((getDigitTable().indexOf(number.charAt(i)))*Math.pow(radixOrigin,len - 1-i));
        }
        for (int i = 0; i < len; i++) {
            numberTranslate = numberTranslate + a1[i];
        }
        return numberTranslate;
    }

    private static double getNumberToTenDouble(String number, int radixOrigin){
        Double numberTranslate = 0.0;
        number = getDoublePart(number);
        int len = number.length();//Узнать длинну числа (будет 8)
        double[] a1 = new double[len];//создать массив с длинной указанной в len
        for (int i = len - 1; i > -1; i--){//заполнить массив с конца
            a1[i] =  (((getDigitTable().indexOf(number.charAt(i))))*Math.pow(radixOrigin,-i-1));//присвоить остаток от деления этому числу
        }
        for (int i = 0; i < len; i++) {
            numberTranslate = numberTranslate + a1[i];
        }
        return numberTranslate;
    }


    private static String getDoublePart(String number){
        String ostatok = number.substring(number.indexOf(".") + 1);
        return ostatok;
    }

    private static String getIntPart(String number){
        String ostatok = number.substring(0, number.indexOf("."));
        return ostatok;
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
