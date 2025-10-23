public class LapTrinhVien extends NhanVien {
    private int soGioOT; // số giờ làm thêm

    public LapTrinhVien(String maNV, String ten, double luongCoBan, int soGioOT) {
        super(maNV, ten, luongCoBan);
        this.soGioOT = soGioOT;
    }

    @Override
    public double tinhLuong() {
        // Ví dụ: lương = lương cơ bản + số giờ OT * 100000
        return luongCoBan + soGioOT * 100000;
    }
}

