public class Exercise1a {
    //Código da atividade
    public static void main(String[] args) {
        int x = 1;
        while (x < 10){
            if (x > 3){
                System.out.println("big x");
            }
            //x++;
        }
    }
}
//O código entra na repetição while mas não consegue sair pois não tem nenhum incremento
//nem se finaliza entrando no if.
//Para corrigir eu adicionaria um x++; na linha 9.