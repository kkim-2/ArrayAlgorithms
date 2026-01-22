public class Selection {
    public static void main(String[] args) {
        String [] classes = {"History", "Math","Gym", "English", "Art", "ComputerScience","Chemistry","Chemistry","French"};
    
        for(int i = 1; i < classes.length;i++){
            System.out.println(classes[i-1]+" "+ classes[i]); // make the i subtract 1 instead of add 1 - ensure the index doesn't go above the length in array
        }

    }
    
}
