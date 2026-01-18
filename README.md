Algorithm Logic:

We maintain:
candidate → possible majority element
count → votes for the candidate

Rules:

If count == 0:
→ Pick current element as new candidate
If current element == candidate:
→ count++
Else
→ count-- (cancellation)

Time and Space Complexity:
Time : O(n)
Space : O(1)

Boyre Moore Voting Algorithm can be used to solve problems like,
Ex 1 : Majority Element 1 i.e. frequency of element > nums.length / 2
Ex 2 : Majority Element 2 i.e. frequency of element > nums.length / 3

To Identify the number of candidates that can probably have the frequency greater than(strictly greater) n / k:
For n / k => You need k-1 candidates
For n / 2 => You need 2 - 1 = 1 candidate
For n / 3 => You need 3 - 1 = 2 candidates
