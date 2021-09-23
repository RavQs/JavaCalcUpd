import java.util.*;

public class Converter {
    public static String toRoman(int num) {

        int[]   numbers = {  100,   90, 50,   40,   10,    9,    5,    4,    1 };
        String[] letters = { "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
        String roman = "";
        int N = num;

        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman; //Получаем Int -> Возвращаем String
    }


    public static int toArabic(String roman)
    {
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);

        int result=0;

        for(int i=0;i<roman.length();i++)
        {
            char ch = roman.charAt(i);

            //Case 1
            if(i>0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i-1)))
            {
                result += numbersMap.get(ch) - 2*numbersMap.get(roman.charAt(i-1));
            }

            else
                result += numbersMap.get(ch);
        }

        return result; //Получаем String -> Возвращаем Int
    }
}
