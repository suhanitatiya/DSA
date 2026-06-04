//Approch name is "Dutch Flag" which means 3 pointer approch
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid=0;

        while(mid<=j){
            if(nums[mid]==0){
                int tmp=nums[i];
                nums[i]=nums[mid];
                nums[mid]=tmp;
                i++;
                mid++;
            }
            else if(nums[mid]==2){
                    int tmp=nums[mid];
                    nums[mid]=nums[j];
                    nums[j]=tmp;
                    j--;
                }
            else 
                mid++;    

        }
    }
}        

