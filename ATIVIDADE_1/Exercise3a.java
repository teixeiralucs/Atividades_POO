public class Exercise3a {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5){
            
            y = x - y;
            
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }
}
// Resultado final 00 11 21 32 42