class Solution {
    public int dayOfYear(String date) {
        
        int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int iyear = Integer.parseInt(date.substring(0,4));
        int imonth = Integer.parseInt(date.substring(5,7));
        int idays = Integer.parseInt(date.substring(8));
        int ans = idays;
        if(imonth>2)
        {
            if((iyear%4==0) && (iyear%100!=0)) ans++;
            else if (iyear%400==0) ans++;
        }

        for(int i=1;i<imonth;i++)
        {
            ans = ans + month[i];
        }

        
        return ans;
        }
}