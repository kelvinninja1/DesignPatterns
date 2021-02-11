public class Test {

    public static void main(String[] args){

        Logger l1 = new Logger();

        l1.addLog("Error at 10:45pm");

        Logger l2 = new Logger();

        l2.addLog("Error at 10:47pm");

        System.out.println("\n");
        l1.displayLogs();

//
//        Logger l1 = Logger.getInstance();
//
//        l1.addLog("Error at 10:45pm");
//
//        Logger l2 = Logger.getInstance();
//
//        l2.addLog("Error at 10:47pm");
//
//        System.out.println("\n");
//        l1.displayLogs();


    }
}
