public class MaxValue {
    public static void main(String[]args){
        int [] nums = {-2,0,5,7,9};
        int maxValue = nums[0];
        for(int num = 0; num<nums.length;num++){
            
            if(nums[num]>maxValue){
                maxValue = nums[num];
            }
    
        }
        System.out.println(maxValue);
        

    }

}
