package ATIVIDADE_5;

public class Exercise_2 {
    class Multifor {
        public static void main(String[] args){
            for (int i = 0; i < 4 ; i++){
                for (int j = 4; j > 2; j--){
                    System.out.print(i + j + " ");
                }
                if (i == 1){
                    i++;
                }
            }
        }
    }
}
