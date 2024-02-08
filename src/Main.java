import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // GetNumberTen.getNumberTen(1010.1010,2);
       // getNumberTwo(1010.1010, 10);
       // getNumberToTen(12345.0, 10, 2);

//
//        for (int i = 0; i <= 10; i++) {
//            double doub = number % 10 ;
//            number = number / 10;
//            System.out.println(doub);
//            ints.add(i, (int) doub);
//        }
//        System.out.println(ints);

//        Integer number = 12345;
//        List<Integer> ints = new ArrayList<>();
//        Integer numberTranslate = 0;
//        int len = String.valueOf(Math.abs(number)).length();//Узнать длинну числа (будет 8)
//        int temp_number = number;//создать переменную для теста
//        int[] a1 = new int[len];//создать массив с длинной указанной в len
//
//        for (int i = 0; i < len ; i++){//заполнить массив с конца
//
//            a1[i] = (int) ((temp_number%10)*Math.pow(6,i));//присвоить остаток от деления этому числу
//            System.out.println(a1[i] + " " + i);
//            temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления
//        }
//        for (int i = 0; i < len; i++) {
//            numberTranslate = numberTranslate + a1[i];
//        }
//        System.out.println(Arrays.toString(a1));//показать готовый массив
//        System.out.println(numberTranslate);
        System.out.println(getNumberToTenInt(12345, 6));
        System.out.println(getNumberToTenDouble(12345.12345, 6));
        int b = getNumberToTenInt(12345, 6);
        double c = getNumberToTenDouble(12345.12345, 6);
        double a = b + c;
        System.out.println(a);
    }


        public static int getNumberToTenInt(int number, int radixOrigin){
            Integer numberTranslate = 0;

            int len = String.valueOf(Math.abs(number)).length();//Узнать длинну числа (будет 8)
            int temp_number = number;//создать переменную для теста
            int[] a1 = new int[len];//создать массив с длинной указанной в len
            for (int i = 0; i < len ; i++){//заполнить массив с конца
                a1[i] = (int) ((temp_number%10)*Math.pow(radixOrigin,i));//присвоить остаток от деления этому числу
                temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления
            }
            for (int i = 0; i < len; i++) {
                numberTranslate = numberTranslate + a1[i];
            }
            return numberTranslate;
        }

    public static double getNumberToTenDouble(double number, int radixOrigin){
        Double numberTranslate = 0.0;
        Integer numberInt = getDoublePart(number);
        int len = String.valueOf(Math.abs(numberInt)).length();//Узнать длинну числа (будет 8)
        int temp_number = numberInt;//создать переменную для теста
        double[] a1 = new double[len];//создать массив с длинной указанной в len
        for (int i = len - 1; i > -1; i--){//заполнить массив с конца
            a1[i] =  ((temp_number%10)*Math.pow(radixOrigin,-i-1));//присвоить остаток от деления этому числу
            temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления
        }
        System.out.println(Arrays.toString(a1));
        for (int i = 0; i < len; i++) {
            numberTranslate = (numberTranslate + a1[i]);
        }
        return numberTranslate;
    }

    public static int getDoublePart(double number){
        String str_number = String.valueOf(number);
        String ostatok = str_number.substring(str_number.indexOf(".") + 1);
        Integer ostatok_int = Integer.valueOf(ostatok);
        return ostatok_int;
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
