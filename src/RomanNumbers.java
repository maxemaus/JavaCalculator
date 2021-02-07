public enum RomanNumbers {
    I("I", 1),
    II("II", 2),
    III("III", 3),
    IV("IV", 4),
    V("V", 5),
    VI("VI", 6),
    VII("VII", 7),
    VIII("VIII", 8),
    IX("IX", 9),
    X("X", 10),
    ;
    private String value;
    private int key;

    RomanNumbers(String value, int key) {
        this.value = value;
        this.key = key;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public static int toInt(String value){
        int a = 0;
        for (RomanNumbers i: RomanNumbers.values()){
            if (value.equals(i.getValue())) {
                a = i.getKey();
            }
        }
        return a;
    }
    public static String toRoman(int x){
        if (x == 0) {
            return "Null";
        }
        String s = "";
        if (x < 0) {
            s += "minus ";
            x = Math.abs(x);
        }
        while (x >= 100) {
            s += "C";
            x -= 100;
        }
        while (x >= 90) {
            s += "XC";
            x -= 90;
        }
        while (x >= 50) {
            s += "L";
            x -= 50;
        }
        while (x >= 40) {
            s += "XL";
            x -= 40;
        }
        while (x >= 10) {
            s += "X";
            x -= 10;
        }
        while (x >= 9) {
            s += "IX";
            x -= 9;
        }
        while (x >= 5) {
            s += "V";
            x -= 5;
        }
        while (x >= 4) {
            s += "IV";
            x -= 4;
        }
        while (x >= 1) {
            s += "I";
            x -= 1;
        }
        return s;
    }
}
