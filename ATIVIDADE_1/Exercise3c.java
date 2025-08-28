public class Exercise3c {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5){
            
            y = y + 2;
            if (y > 4){
                y = y - 1;
            }
            
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }
}
//Resultado 02 14 38
//Resultado correto 02 14 25 36 47
