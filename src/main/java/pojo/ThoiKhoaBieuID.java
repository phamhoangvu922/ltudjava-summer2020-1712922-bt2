package pojo;

import java.io.Serializable;

public class ThoiKhoaBieuID implements Serializable {
    private String maMonHoc;
    private String lop;

    public ThoiKhoaBieuID(String maMonHoc, String lop) {
        this.maMonHoc = maMonHoc;
        this.lop = lop;
    }

    public String getMaMonHoc() {
        return this.maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
    public String getLop() {
        return this.lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

}
