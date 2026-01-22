public class Critera {
    public static void main(String[] args) {
        String[]names={"Jack","Uri","Kiana","Kellen","Remi"};
        int sum = 0;
        for(String name :names){
        if(name.length()==4 ){
            sum++;
        }    
        }
        System.out.println(sum);
        
    }
    
}
