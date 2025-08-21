public class Exercise1c{
    //public static void main(String[] args){
        int x = 5;
        while (x > 1){
            x = x - 1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
//}
//o Código não compila pois não foi declarada a classe main
//Para corrigir é necessário colocar public static void main(String[] args){}