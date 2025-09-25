package ATIVIDADE_5;

public class Exercise_1 {
    class Output{
        public static void main(String[] args){
            Output output = new Output();
            output.go();
    }


    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++){
            value++;
            if (i > 4){
                System.out.println(++value + " ");
            }
        if (value > 14){
            System.out.println(" i = " + i);
            break;
            }
        }
    }
}
}

//O resultado da execução do código é:
//13 15 i = 6