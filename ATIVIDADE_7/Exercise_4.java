package ATIVIDADE_7;

public class Exercise_4 {
    public class Rowboat extends Boat{
        void rowTheBoat(){
            System.out.println("Stroke natasha!");
        }
    }
    public class Boat{
        private int length;

        public void setLength(int len){
            length = len;
        }
        public int getLength(){
            return length;
        }
        public void move(){
            System.out.println("drift");
        }
    }
    public class TestBoats{
        public static void (String[] args){
            Boat b1 = new Boat();
            Sailboat b2 = new Sailboat();
            Rowboat b3 = new Rowboat();
            b1.move();
            b3.move();
            b2.move();
        }
    }
    public class Sailboat extends Boat{
        public void move(){
            System.out.print("hoist sail");
        }
    }
}
