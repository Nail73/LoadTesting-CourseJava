public class main {
    public static void main(String[] args) {
        Character ch = new Character('x');
        char x = '9';
        {
            if (Character.isDigit(x)) {
                int y = Character.getNumericValue(x);
                System.out.println(y);
            }
        }


    }
}
