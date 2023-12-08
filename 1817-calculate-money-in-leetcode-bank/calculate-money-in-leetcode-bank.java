class Solution {
    public int totalMoney(int n) {
        int total =0;
        int week, day;

        for(int i=1; i<=n; i++)
        {
            week = i/7;
            day = i%7;
            if (day == 0)
            {
                day = 6;
            }
            total = total + week +day;
        }
        return total;
    }
}