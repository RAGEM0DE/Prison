import core.data.*;
import java.util.ArrayList;

public class MyProgram
{
    public static void main(String[] args)
    {
        DataSource ds = DataSource.connect("prisonsclean.csv").load();
        ds.printUsageString();
        ArrayList<Prison> dawg = ds.fetchList("Prison", "CITY","STATE","POPULATION");
        
        Prison p = new Prison(null, null, 0);
        
        dawg = p.filter(dawg);
        dawg = p.sortGreatest(dawg);
        
        for(int i = 0; i < 10; i++){
           System.out.println(dawg.get(i).toString());
           
           Prison r = new Prison(dawg.get(i).getState(), p.average(p.groupS(dawg.get(i).getState(), dawg)));
           
           System.out.println(r.stateString());
           System.out.println("");
        }   
    }
}
