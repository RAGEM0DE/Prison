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
    
    public String stateString(){
        return "The state " + state + " has an average of " + population + " prisoners per prison";
    }
    
    public String toString(){
        return "The prison has a population of " + population + " and is in " + city + ", " + state;
    }
}
