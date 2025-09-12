package ATIVIDADE_4;
public class Exercise_2a {
    class //static XCopy{

        public static void main (String[] args){
            int orig = 42;
            XCopy x = new XCopy();
            int y = x.go(orig);

            System.out.println(orig + " " + y);
        }

        int go (int arg){
            arg = arg * 2;
            return arg;
        }
    }
}

//O código em questão não é compilavel pois contem erro
//A classe main não pode ser instanciada dentro de outra se a classe "mae" não for também static
//Neste casso adicionaria o Static a classe XCopy