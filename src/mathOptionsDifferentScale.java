import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mathOptionsDifferentScale {
    List<Character> options = new ArrayList<>(Arrays.asList('+','-','/','*'));

    public static double summOptionsDifferentScale (Object number1, int radixNumber1, Object number2, int radixNumber2, int finalRadix){
        double summ = 0;
        Double number11 = 0.0;
        Double number22 = 0.0;
        if (radixNumber1 == 10){
            number11 = (Double) number1;
        }
        if (radixNumber2 == 10){
            number22 = (Double) number2;
        }
        number11 = convertObjectToDoubleTenScale(number1, radixNumber1);
        number22 = convertObjectToDoubleTenScale(number2, radixNumber2);
        summ = number11 + number22;
        return summ;
    }

    public static double convertObjectToDoubleTenScale(Object number, int radixOrigin){
        double numDouble = 0.0;
        if (radixOrigin == 10){
            numDouble = (double) number;
        }else {
            numDouble =Double.parseDouble(convertScale.convertScale(number, radixOrigin, 10).toString()) ;
        }
        return numDouble;
    }

}
