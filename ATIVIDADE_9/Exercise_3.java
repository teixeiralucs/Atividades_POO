package ATIVIDADE_9;

public class Exercise_3 {
    public class Boo{
        public Boo(int i){}
        public Boo (String s){}
        public Boo (String s, int i){}
    }   
    class SonOfBoo extends Boo{
        public SonOfBoo(){
            super ("boo");
        }
    }
}
// Construtor 3 --> Letra B
// O erro ocorre porque o construtor inverte a lógica
// O certo seria Boo (String, int);


// Consturutor 4 --> Letra A
// O erro ocorre porque não existe nenhum construtor Boo (String, String);

// Construtor 6 --> Letra C
// O erro ocorre porque não existe nenhum construtor Boo (int, String);

