class Solution {
    public String solution(int a, int b) {
        int[] days = {31,60,91,121,152,182,213,244,274,305,335,366};
        String[] results = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int sum = 0;
        if (a != 1) {
            sum += days[a-2] + b;
        } else {
            sum += b; 
        }
        
        return sum % 7 == 0 ? "THU" : results[sum % 7 - 1];
    }
}