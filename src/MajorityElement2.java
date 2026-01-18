import java.util.Arrays;

public class MajorityElement2 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,3,4,2,5,5};
        System.out.println(Arrays.toString(majorityElement(nums)));
    }

    static int[] majorityElement(int nums[]){
        //Find the element whose frequency is greater than n / 3
        //here k = 3 => we need k - 1 candidates = 2

        int count1 = 0;
        int candidate1 = 0;
        int count2 = 0;
        int candidate2 = 0;

        for(int num : nums){
            if(count1 == 0 && candidate2 != num){
                count1 = 1;
                candidate1 = num;
            }
            else if(count2 == 0 && candidate1 != num){
                count2 = 1;
                candidate2 = num;
            }
            else if(candidate1 == num){
                count1++;
            }
            else if(candidate2 == num){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        //reinitializing the counts
        count1 = 0;
        count2 = 0;

        for(int i=0;i < nums.length;i++){
            if(candidate1 == nums[i]){
                count1++;
            }
            else{
                count2++;
            }
        }

        if(count1 > nums.length / 3) {
            return new int[] {candidate1, count1};
        }

        if(count2 > nums.length / 3){
            return new int[] {candidate2, count2};
        }

        return new int[] {-1,-1};
    }
}
