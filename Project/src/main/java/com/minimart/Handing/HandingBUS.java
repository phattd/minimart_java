package com.minimart.Handing;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class HandingBUS {
    public boolean checkRepeat(String str, ArrayList<String> sourceList)
    {
        for (String index : sourceList)
        {
            if (str.equals(index))
            {
                return true;
            }
        }
        return false;
    }
    public boolean checkRepeat(String str1,String str2, ArrayList<String[]> sourceList)
    {
        for (String[] index : sourceList)
        {
            if ((index[0].equals(str1) && index[1].equals(str2)) || (index[0].equals(str2) && index[1].equals(str1)))
            {
                return true;
            }
        }
        return false;
    }
    public String createId()
    {
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        return ""+timestamp.getTime();
    }
}
