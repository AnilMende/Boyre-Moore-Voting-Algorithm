import java.util.Arrays;

public class BoyreMoore {
    public static void main(String[] args) {
        int nums[] = {2,2,2,1};
        System.out.println(Arrays.toString(boyreMore(nums)));
    }

    //We maintain:
    //Candidate : Possible Majority Element
    //Count : Votes for the Candidate

    //if the count is 0 then make the count as 1 and candidate to current num
    //if the candidate is equal to num increment the count
    //if candidate is not equal to the num decrement the count
    //if the count becomes 0 after an element resign the count to 1 and candidate to that num

    //For element appearing
    //-> n / 3 => You need 2 Candidates
    //-> n / 2 => You need 1 candidates
    //-> n / k => You need k - 1 candidates

    static int[] boyreMore(int nums[]){

        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                count = 1;
                candidate = num;
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;
        for(int i=0;i < nums.length;i++){
            if(nums[i] == candidate){
                count++;
            }
        }
        return new int[]{candidate, count};
    }
}
