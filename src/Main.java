import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  System.out.println(fromSixteenScaleToTen.translateFromSixteenScaleToTen("123A.0", 13));
      //  System.out.println(fromTenScaleTo.fromTenScaleTo(123.123, 16));
        // fromSixteenScaleToTen.translateFromSixteenScaleToTen("263", 14);
        // fromSixteenScaleToTen.translateFromSixteenScaleToTen("128", 14);
      //  System.out.println(fromTenScaleTo.fromTenScaleTo(701, 14));

        System.out.println(fromSixteenScaleToTen.translateFromSixteenScaleToTen("10.0", 16));

      System.out.println( mathOptionsDifferentScale.summOptionsDifferentScale(10.0, 9, 10.0, 9, 10));
      System.out.println( mathOptionsDifferentScale.summOptionsDifferentScale("12.0", 16, 10.0, 10, 10));
      System.out.println(mathOptionsDifferentScale.summOptionsDifferentScale(1100.0, 2,"A123.0",16,10));
        //  Double a = Double.parseDouble("12.12");
//        System.out.println(Double.parseDouble(convertScale.convertScale(10.0, 9, 10 ).toString()));
//        System.out.println(mathOptionsDifferentScale.convertObjectToDoubleTenScale(10.0,9));

//        Object number111 = convertScale.convertScale("12.12",16,10);

//        String a = "12.12";
//        Object b = "12.12";
//        Double c = 12.12;
//       Double b1 = Double.parseDouble(b.toString());
//        convertScale.convertScale(b,16,10);
//        System.out.println(b.toString().equals(a));
//        System.out.println(b1 == c);
//        System.out.println(b1 + c);
//
//        System.out.println(b.toString().equals(c.toString()));
//        System.out.println(b == c.toString());
//
//        System.out.println(b1.equals(c));
//        System.out.println(Double.parseDouble(a) == c);
    }

}

