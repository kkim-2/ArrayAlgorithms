public class Search {
    public static void main(String[] args) {
        String[]names={"Jack","Uri","Kiana","Kellen","Remi"};
        String kNames ="";
        for(String name:names){
        if(name.substring(0,1).equalsIgnoreCase("K")){
            kNames +=name;
        }    
        }
        System.out.println(kNames);
        
    }
    
}
