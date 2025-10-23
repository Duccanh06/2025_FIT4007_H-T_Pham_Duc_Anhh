public class KiemThuVien extends NhanVien {
    private int soBugTimDuoc; // số lỗi tìm được

    public KiemThuVien(String maNV, String ten, double luongCoBan, int soBugTimDuoc) {
        super(maNV, ten, luongCoBan);
        this.soBugTimDuoc = soBugTimDuoc;
    }

    @Override
    public double tinhLuong() {
        // Ví dụ: lương = lương cơ bản + số bug tìm được * 50000
        return luongCoBan + soBugTimDuoc * 50000;
    }
}

