
public class MinIndex {
    public static void main(String[] args) {
        int [] nums = {0,5,-2,7,9};
        int minValue = nums[0];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minValue){
                minValue = nums[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
