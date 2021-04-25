package com.minimart.dto;

public enum BacTichLuy {
    /*
    Đây là enum vì đây được xem là cố định không có sự thay đổi.
     */
    Normal,
    Silver,
    Gold,
    Diamond,
    Premium;
    // Đổi enum Bậc Tích Lũy thành String
    public String getString()
    {
        switch (this)
        {
            case Normal:
            {
                return "Normal";
            }
            case Silver:
            {
                return "Silver";
            }
            case Gold:
            {
                return "Gold";
            }
            case Diamond:
            {
                return "Diamond";
            }
            case Premium:
            {
                return "Premium";
            }

        }
        return "Error";
    }
    //Đổi String thành enum Bậc Tích Lũy
    public static BacTichLuy getBacTichLuy(String str)
    {
        switch (str)
        {
            case "Normal":
            {
                return Normal;
            }
            case "Silver":
            {
                return Silver;
            }
            case "Gold":
            {
                return Gold;
            }
            case "Diamond":
            {
                return Diamond;
            }
            case "Premium":
            {
                return Premium;
            }

        }
        return null;
    }
    // Tăng enum Bậc Tích Lũy lên một bậc
    public BacTichLuy increase()
    {
        switch (this)
        {
            case Normal:
            {
                return Silver;
            }
            case Silver:
            {
                return Gold;
            }
            case Gold:
            {
                return Diamond;
            }
            case Diamond:
            {
                return Premium;
            }
        }
        return null;
    }
    //So sánh nếu current nhỏ hơn compare thì true. Nếu không trả về false.
    public boolean isLess( BacTichLuy compare)
    {
        switch (this)
        {
            case Normal:
            {
                if (compare.equals(Normal))
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            case Silver:
            {
                if (compare.equals(Normal) || compare.equals(Silver))
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            case Gold:
            {
                if (compare.equals(Normal) || compare.equals(Silver) || compare.equals(Gold))
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            case Diamond:
            {
                if (compare.equals(Premium))
                {
                    return true;
                }
                return false;
            }
            case Premium:
            {
                return false;
            }

        }
        return false;

    }
    public boolean isBigger(BacTichLuy compare)
    {
        return compare.isLess(this);
    }




}
