import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> LogList;



    public Logger(){
        this.LogList = new ArrayList<>();
    }

    public void addLog(String s){
        this.LogList.add(s);
    }

    public void displayLogs(){
        System.out.println(this.LogList.toString());
    }

}
