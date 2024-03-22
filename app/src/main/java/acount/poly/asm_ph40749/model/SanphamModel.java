package acount.poly.asm_ph40749.model;

public class SanphamModel {
    private String _id;
    private String ten;
    private double gia;
    private int soluong;

    private String avatar;

    public SanphamModel(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public SanphamModel(String ten, double gia, int soluong) {
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
