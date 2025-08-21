public class Exercise7 {
    class EchoTester{
        int count = 0;
        void hello(){
            System.out.println("Helloooo...");
        }
    }
    public class EchoTestDriver{
        public static void main(String[] args) {
            EchoTester e1 = new EchoTester();
            EchoTester e2 = new EchoTester();
            int x = 0;
            while (x < 4){
                e1.hello();
                e1.count = e1.count + 1;
                if (x > 0){
                    e2.count = e2.count + 1;
                }
                if (x > 1){
                    e2.count = e2.count + e1.count;
                }
            }
            System.out.println(e2.count);
        }
    }
}
