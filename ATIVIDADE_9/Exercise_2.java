package ATIVIDADE_9;

public class Exercise_2 {
    public class Animal {
        public Animal(){
            System.out.println("Making an Animal");
        }
    }
    public class Hippo extends Animal{
        public Hippo(){
            System.out.println("Making a Hippo");
        }
    }
    public class TestHippo{
        public static void main (String[] args){
            System.out.println("Stating...")
            Hippo h = new Hippo();
        }
    }
}
//Resposta A... Test Hippo
            //  Starting...
            // Making an Animal
            // Making a Hippo
