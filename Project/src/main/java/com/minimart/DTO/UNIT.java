package com.minimart.DTO;

public enum UNIT {
    Goi,
    Chai,
    Cai,
    Phan,
    Loc;

    public String getString()
    {
        switch (this)
        {
            case Goi:
            {
                return "Gói";
            }
            case Chai:
            {
                return "Chai";
            }
            case Cai:
            {
                return "Cái";
            }
            case Phan:
            {
                return "Phần";
            }
            case Loc:
            {
                return  "Lốc";
            }
        }
        return "Error";
    }
    //Đổi String thành enum Unit
    public static UNIT getUnit(String str)
    {
        switch (str)
        {
            case "Gói":
            {
                return Goi;
            }
            case "Chai":
            {
                return Chai;
            }
            case "Cái":
            {
                return Cai;
            }
            case "Phần":
            {
                return Phan;
            }
            case "Lốc":
            {
                return  Loc;
            }
        }
        return null;
    }
    public static String[] getUnitArray()
    {
        return  new String[] {"Gói","Chai","Cái","Phần","Lốc"};
    }
}
