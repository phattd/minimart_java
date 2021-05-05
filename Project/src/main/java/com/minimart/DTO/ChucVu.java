package com.minimart.DTO;

public class ChucVu {
    private String idChucVu;
    private String tenChucVu;

    public ChucVu(){
        idChucVu=null;
        tenChucVu=null;
    }
    public ChucVu(String idChucVu,String tenChucVu)
    {
        this.idChucVu=idChucVu;
        this.tenChucVu=tenChucVu;
    }
    public ChucVu(ChucVu chucVu)
    {
        this(chucVu.idChucVu, chucVu.tenChucVu);
    }

    public String getIdChucVu() {
        return idChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setIdChucVu(String idChucVu) {
        this.idChucVu = idChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }
    public void setChucVu(String idChucVu,String tenChucVu)
    {
        this.idChucVu=idChucVu;
        this.tenChucVu=tenChucVu;
    }
    public void setChucVu(ChucVu chucVu)
    {
        this.idChucVu=chucVu.idChucVu;
        this.tenChucVu=chucVu.tenChucVu;
    }
    public ChucVu getChucVu()
    {
        return this;
    }

    public Object[] toArray()
    {
        return new Object[] {idChucVu,tenChucVu};
    }
}
