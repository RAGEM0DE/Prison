import java.util.*;

public class Prison {
    private String city;
    private String state;
    private int population;
    
    public Prison(String c, String s, int p){
        this.city = c;
        this.state = s;
        this.population = p;
    }
    
    public Prison(String s, int p){
        this.city = null;
        this.state = s;
        this.population = p;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getState(){
        return state;
    }
    
    public int getPop(){
        return population;
    }

    public ArrayList<Prison> groupS(String s, ArrayList<Prison> list){
        ArrayList<Prison> st = new ArrayList<Prison>();
        for(int i = 0; i < list.size(); i++){
            if(s.equals(list.get(i).getState())){
                st.add(list.get(i));
            }
        }
        return st;
    }
    
    public ArrayList<Prison> sortGreatest(ArrayList<Prison> list){
        ArrayList<Prison> s = new ArrayList<Prison>();
        for(int i = 0; i < list.size(); i++){
            s.add(list.get(i));
        }
        
        for(int i = 0; i < s.size() - 1; i++){
            for(int j = 0; j < s.size(); j++){
                if(s.get(i).getPop() > s.get(j).getPop()){
                    Prison t = s.get(i);
                    s.set(i, s.get(j));
                    s.set(j, t);
                }
            }
        }
        return s;
    }
    
    public ArrayList<Prison> filter(ArrayList<Prison> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getPop() < 0){
                list.remove(i);
            }
        }
        return list;
    }
    
    public int average(ArrayList<Prison> m){
        int sum = 0;
        for(int i = 0; i < m.size(); i++){
            sum += m.get(i).getPop();
        }
        return sum/m.size();
    }
    
    public String stateString(){
        return "The state of " + state + " has an average of " + population + " prisoners per prison";
    }
    
    public String toString(){
        return "The prison has a population of " + population + " and is in " + city + ", " + state;
    }
}
