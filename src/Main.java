import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // GetNumberTen.getNumberTen(1010.1010,2);
       // getNumberTwo(1010.1010, 10);
        getNumber(12345.0, 10, 2);

        }

        public static String getNumber(Double number, int radixOrigin, int radixTo){
            Integer digitCount = (int) (Math.log10(number) + 1);
            System.out.println("Разрядность числа " + number + " равна " + digitCount);
            System.out.println("нужно привести из " + radixOrigin + " системы в " + radixTo);
            number.toString().length();


        return null;
        }

        public static String getInRadixInt(Double number, int radixOrigin, int radixTo){
        List<Character> digits = getDigitTable();

        if (radixTo <2 || radixTo >= digits.size() || number < 0){
            throw new IllegalArgumentException();
        }
        StringBuilder valueStr = new StringBuilder();

            return valueStr.toString();
        }

    public static String getInRadixDouble(double number, int radix ){
        List<Character> digits = getDigitTable();

        if (radix <2 || radix >= digits.size() || number < 0){
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
