Exercise2blass Exercise2b {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1){
            x = x - 1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
    
//}
//O código não compila pois não foi declarada a classe do arquivo
//Para corrigir é necessário adicionar public class Exercise1b{}
