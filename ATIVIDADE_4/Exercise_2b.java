package ATIVIDADE_4;

public class Exercise_2b {
    class Clock{
        String time;
    }

    void setTime (String t){
        time = t;
    }

    void getTime(){
        return time;
    }

class ClockTesteDriver{
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " +tod);
    }
}
}

//O código em questão não é compilavel pois contem erro
//Na função setTime a variavel time foi declarada sem um tipo definido fazendo com que o código não funcione