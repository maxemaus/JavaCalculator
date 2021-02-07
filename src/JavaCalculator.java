import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] parts = s.split("\\s");
        int n = parts.length;
        if (n < 3 || n > 3){
            try {
                throw new Exception("Не верные данные");
            } catch (Exception e){
                e.printStackTrace();
                System.exit(0);
            }
        }
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean roman1 = false;
        boolean roman2 = false;

        for (int i = 0; i < roman.length; i++){
            if (roman[i].equals(parts[0])){
                roman1 = true;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(parts[2])) {
                roman2 = true;
            }
        }
        if ((roman1 == false && roman2) || roman1 && roman2 == false){
            try {
                throw new Exception("Не верные данные");
            } catch (Exception e){
                e.printStackTrace();
                System.exit(0);
            }
        }
        if (roman1 && roman2){
            int arabic1 = RomanNumbers.toInt(parts[0]);
            int arabic2 = RomanNumbers.toInt(parts[2]);
            String toRoman = RomanNumbers.toRoman(calculate(arabic1, parts[1], arabic2));
            System.out.println(toRoman);
            System.exit(0);
        }

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
            if ((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)){
                try {
                    throw new Exception("Введите числа от 1 до 10 включительно");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        System.out.println(calculate(num1, parts[1], num2));
    }
    public static int calculate (int a, String b, int c){
        int result = 0;
        if (b.equals("+")) {
            result = a + c;
        } else if (b.equals("-")) {
            result = a - c;
        } else if (b.equals("*")) {
            result = a * c;
        } else if (b.equals("/")) {
            result = a / c;
        } else {
            try {
                throw new Exception("Неизвестная операция, повторите ввод");
            } catch (Exception e){
                e.printStackTrace();
            }
            System.exit(0);
        }
        return result;
    }

}
