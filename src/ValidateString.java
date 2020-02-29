public class ValidateString {
    boolean validate(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!(s.charAt(i) >=65 && s.charAt(i) <= 90) && !(s.charAt(i) >= 97 && s.charAt(i) <= 122)
                    && !(s.charAt(i) >=48 && s.charAt(i) <= 57))
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Ankush321";
        ValidateString ob1 = new ValidateString();
        if(ob1.validate(s))
        {
            System.out.printf("Its valid string");
        }
        else
        {
            System.out.printf("Not valid String");
        }
    }
}
