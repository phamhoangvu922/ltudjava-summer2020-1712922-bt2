package pojo;

import java.io.Serializable;

public class DanhSachChoMonHoc implements Serializable {
    private IDDanhSachChoMonHoc id;
    private String hoTen;
    private String gioiTinh;
    private String cmnd;

    public  DanhSachChoMonHoc()
    {

    }
    public DanhSachChoMonHoc (IDDanhSachChoMonHoc id, String hoTen, String gioiTinh, String cmnd) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public IDDanhSachChoMonHoc getId() {
        return this.id;
    }

    public void setId(IDDanhSachChoMonHoc id) {
        this.id = id;
    }
    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

}
