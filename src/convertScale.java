public class convertScale {
    public static Object convertScale(Object number, int radixOrigin, int radixToTranslate) {
        Object numberTranslate = null;
        if ( radixToTranslate <2 || radixToTranslate > 36){
            throw new IllegalArgumentException("ALARM неверно введен разряд системы исчисления radixToTranslate");
        }
//        if (radixToTranslate == radixOrigin){
//            throw new IllegalArgumentException("ALARM radixToTranslate == radixOrigin");
//        }
        if (radixOrigin <= 9 && radixOrigin >= 2) {

            System.out.println("Исходный разряд в области [2,9]");

            if (radixToTranslate<=9){
                Object numberTranslateTemp;
                numberTranslateTemp = toTenScaleFrom.translateToTen((Double) number, radixOrigin);
                numberTranslate = fromTenScaleTo.fromTenScaleTo((Double) numberTranslateTemp, radixToTranslate);

            }
            if (radixToTranslate >=2){
                Object numberTranslateTemp;
                numberTranslateTemp = toTenScaleFrom.translateToTen((Double) number, radixOrigin);
                numberTranslate = fromTenScaleTo.fromTenScaleTo((Double) numberTranslateTemp, radixToTranslate);

            }

        } else {

            if (radixOrigin == 10) {
                System.out.println("Исходный разряд = 10");
                if (radixToTranslate<=9){
                    numberTranslate = Double.parseDouble(fromTenScaleTo.fromTenScaleTo((Double) number, radixToTranslate));
                }
                if (radixToTranslate >10){
                    numberTranslate = fromTenScaleTo.fromTenScaleTo((Double) number,radixToTranslate);
                }

            } else {
                if (radixOrigin <= 36 && radixOrigin >= 11) {
                    System.out.println("Исходный разряд в области [11,36]");
                    if (radixToTranslate<=36){
                        Object numberTranslateTemp;
                        numberTranslateTemp = fromSixteenScaleToTen.translateFromSixteenScaleToTen((String) number, radixOrigin);
                        numberTranslate = fromTenScaleTo.fromTenScaleTo((Double) numberTranslateTemp, radixToTranslate);
                    }
                    if (radixToTranslate >= 11){
                        Object numberTranslateTemp;
                        numberTranslateTemp = fromSixteenScaleToTen.translateFromSixteenScaleToTen((String) number, radixOrigin);
                        numberTranslate = fromTenScaleTo.fromTenScaleTo((Double) numberTranslateTemp, radixToTranslate);
                    }
                } else {
                    System.out.println("ALARM");
                }
            }
        }
        return numberTranslate;
    }
}
