package ATIVIDADE_9;

public class Exercise_4 {
    public class GC{
        public static GC doStuff(){
            GC newGC = new GC();
            doStufff2(newGC);
            return newGC;
        }
    }
    public static void main (String[] args){
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        //A

        //call more methods
    }
    public static void doStuff2(GC copyGC){
        GC localGC = copyGC;
    }
}

// 1. 2 --> gc2 = null;
// 2. 4 --> gc1 = null;
// 3. 8 --> gc1 = gc4;
