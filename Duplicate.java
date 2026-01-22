public class Duplicate {
    public static void main(String[] args) {
        String [] classes = {"History", "Math","Gym", "English", "Art", "ComputerScience","Chemistry","French"};
        System.out.println(duplicate(classes));
        
    }
    
    public static boolean duplicate(String[]array){
    
        boolean d = false;
        int n =0 ;
        while(n<array.length){
           for(int i = 0; i<array.length;i++){
                if(array[i].equals(array[n])&&i!=n){
                    d =true;
                }
           
            }
            n++;
        }
        return d;
    }

}
