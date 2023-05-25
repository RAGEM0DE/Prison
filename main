public static void main(String[] args){
        System.out.println("cmon");
        BufferedReader f = new BufferedReader(new FileReader("prisons.csv"));
        PrintWriter s = new PrintWriter(System.out);
        
        Prisons dawg = new Prisons();
        
        System.out.println("Hi");
        
        for(int i = 0; i < 6738; i++){
            StringTokenizer l = new StringTokenizer(f.readLine(), ",");
            
            l.nextToken();
            l.nextToken();
            l.nextToken();
            
            String cit = l.nextToken();
            String stat = l.nextToken();
            
            l.nextToken();
            l.nextToken();
            l.nextToken();
            l.nextToken();
            
            int pop = Integer.parseInt(l.nextToken());
            
            Prison p = new Prison(cit, stat, pop);
            
            dawg.addP(p);
        }
        
        System.out.println("made");
        
        Prisons dog = dawg.sortGreatest();
        Prisons dowg = new Prisons();
        
        for(int i = 0; i < 10; i++{
            System.out.println(dog.gert().get(i).toString());
            
            Prisons p = new Prison(dog.gert().get(i).getState(), dog.average(dog.groupS(dog.gert().get(i).getState())));
            
            System.out.println(p.stateString());
            System.out.println("");
        }
        
    }
