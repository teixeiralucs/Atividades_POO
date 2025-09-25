package ATIVIDADE_5;

public class Exercise_3 {
    public static void main(String[] args){
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++){
            for (int inner = 4; inner > 1; inner--){
                //x = x + 0;
                y = y -2;
                if (x ==6){
                    break;
                }
            x = x + 3;                
            }
        y = y - 2;
        }
    System.out.println(x + " " + y);
    }

}
//A resposta é 6. x = x + 0; e a saida esperada é a f) 6 14