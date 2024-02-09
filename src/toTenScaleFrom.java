public class toTenScaleFrom {
    public static double translateToTen(double number, int radixOrigin){
        int intPartNumber = getNumberToTenInt((int) number, radixOrigin);
        double doublePatrNumber = getNumberToTenDouble(number, radixOrigin);

        Double numberTranslate = intPartNumber + doublePatrNumber;


        return numberTranslate;
    }

    private static int getNumberToTenInt(int number, int radixOrigin){
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

    private static double getNumberToTenDouble(double number, int radixOrigin){
        Double numberTranslate = 0.0;
        Integer numberInt = getDoublePart(number);
        int len = String.valueOf(Math.abs(numberInt)).length();//Узнать длинну числа (будет 8)
        int temp_number = numberInt;//создать переменную для теста
        double[] a1 = new double[len];//создать массив с длинной указанной в len
        for (int i = len - 1; i > -1; i--){//заполнить массив с конца
            a1[i] =  ((temp_number%10)*Math.pow(radixOrigin,-i-1));//присвоить остаток от деления этому числу
            temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления
        }
        for (int i = 0; i < len; i++) {
            numberTranslate = (numberTranslate + a1[i]);
        }
        return numberTranslate;
    }

    private static int getDoublePart(double number){
        String str_number = String.valueOf(number);
        String ostatok = str_number.substring(str_number.indexOf(".") + 1);
        Integer ostatok_int = Integer.valueOf(ostatok);
        return ostatok_int;
    }
}
