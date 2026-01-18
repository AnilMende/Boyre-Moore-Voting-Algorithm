public class MajorityElement1 {
    public static void main(String[] args) {
        int nums[] = {1,1,3,1};
        System.out.println("Majority Element is " + majorityElement(nums));
    }

    static int majorityElement(int nums[]){
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                count = 1;
                candidate = num;
            }
            else if(candidate == num){
                count++;
            }
            else{
                count--;
            }
        }

        //Counting the candidate element count
        count = 0;
        for(int num : nums){
            if(candidate == num){
                count++;
            }
        }

        //A Majority Element is the one whose frequency is strictly greater than nums.length / k
        //Here k = 2 => potential majority elements will be k-1 i.e. 2-1 = 1
        if(count > nums.length / 2) {
            return candidate;
        }

        return -1;
    }
}
