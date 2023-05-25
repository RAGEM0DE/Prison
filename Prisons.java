public class Prisons {
    private ArrayList<Prison> list;
    
    public Prisons(ArrayList<Prison> p){
        list = p;
    }
    
    public Prisons(){
        list = new ArrayList<Prison>();
    }
    
    public void addP(Prison p){
        list.add(p);
    }
    
    
    public ArrayList<Prison> gert(){
        return list;
    }
    
    public ArrayList<Prison> groupS(String s){
        ArrayList<Prison> st = new ArrayList<Prison>();
        for(int i = 0; i < list.size(); i++){
            if(s.equals(list.get(i).getState())){
                st.add(list.get(i));
            }
        }
        return st;
    }
    
    public ArrayList<Prison> sortGreatest(){
        ArrayList<Prison> s = new ArrayList<Prison>();
        for(int i = 0; i < list.size(); i++){
            s.add(list.get(i));
        }
        
        for(int i = 0; i < s.size() - 1; i++){
            for(int j = 0; j < s.size(); j++){
                if(s.get(i).getPop() < s.get(j).getPop()){
                    Prison t = s.get(i);
                    s.set(i, s.get(j));
                    s.set(j, t);
                }
            }
        }
        return s;
    }
    
    public int average(ArrayList<Prison> m){
        int sum = 0;
        for(int i = 0; i < m.size() i++){
            sum += m.get(i).getPop();
        }
        return sum/m.size();
    }
}
