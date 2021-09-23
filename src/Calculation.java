public class Calculation {
    public static String doMath(Number firstNum, Number secondNum, String math) throws Exception   { //

        int result = 0;

        switch (math){
            case "+":
                result = firstNum.getValue() +  secondNum.getValue();
                break;
            case "-":
                result = firstNum.getValue() -  secondNum.getValue();
                break;
            case "*":
                result = firstNum.getValue() *  secondNum.getValue();
                break;
            case "/":
//                if(secondNum.getValue() == 0){
//                    throw  new Exception("Ошибка деления на 0");
//                }
                result = firstNum.getValue() /  secondNum.getValue();
                break;
            default:
                throw new Exception("invalid char");
        }
        if (firstNum.getType() == TypeNumber.ROMAN) {
            return Converter.toRoman(result);
        } else return String.valueOf(result);
    }
}



