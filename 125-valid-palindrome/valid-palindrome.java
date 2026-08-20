class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}