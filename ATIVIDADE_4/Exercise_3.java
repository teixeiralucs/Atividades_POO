package ATIVIDADE_4;

public class Exercise_3 {
    public class Mix4 { 
        int counter = 0;
    }

    public static void main(String[] args) {
        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while (){
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + i;
        }
        System.out.println(count + " " + mixes[1].counter);
    }

    public int maybeNew (int index){
        if (){
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
    
}

//Neste caso a resposta correta é i < 7 e index < 7, que resulta na saida 14 1
