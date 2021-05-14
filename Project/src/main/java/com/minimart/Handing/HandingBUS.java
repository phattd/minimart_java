package com.minimart.Handing;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HandingBUS {
    // kiểm tra nếu str có trong sourceList trả về true, nếu không trùng trả về false.
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

    public String standardDate(Date date)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
        return formatter.format(date);
    }

    public Date toDate(String dateStr)
    {
        Date date=null;
        try {
            date= new SimpleDateFormat("yyyy-M-dd hh:mm:ss").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;    
    }
}
