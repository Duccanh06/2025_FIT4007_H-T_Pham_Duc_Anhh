public class bai1lap2 {
    // ===== Thuộc tính =====
    private String maSoTaiKhoan;
    private double soTien;

    // ===== Phương thức khởi tạo =====
    public bai1lap2(String maSoTaiKhoan, double soTien) {
        this.maSoTaiKhoan = maSoTaiKhoan;
        this.soTien = soTien;
    }

    // ===== Getter / Setter =====
    public String getMaSoTaiKhoan() {
        return maSoTaiKhoan;
    }

    public void setMaSoTaiKhoan(String maSoTaiKhoan) {
        this.maSoTaiKhoan = maSoTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    // ===== Phương thức hiển thị thông tin =====
    public void xuatThongTin() {
        System.out.println("- Ma so tai khoan: " + maSoTaiKhoan);
        System.out.println("- So tien: " + soTien);
    }

    // ===== Main =====
    public static void main(String[] args) {
        // Tạo tài khoản bằng constructor
        bai1lap2 acc = new bai1lap2("098563", 90000000);

        System.out.println("Thong tin tai khoan hien tai:");
        acc.xuatThongTin();

        // Cập nhật số tiền
        acc.setSoTien(450000000);

        System.out.println("\nThong tin tai khoan sau khi cap nhat:");
        acc.xuatThongTin();
    }
}
// UML
// +------------------+
// |     bai1lap2     |
// +------------------+
// | - maSoTaiKhoan: String |
// | - soTien: double      |
// +------------------+
// | + bai1lap2(maSoTaiKhoan: String, soTien: double) |
// | + getMaSoTaiKhoan(): String                      |
// | + setMaSoTaiKhoan(maSoTaiKhoan: String): void    |
// | + getSoTien(): double                             |
// | + setSoTien(soTien: double): void                 |
// | + xuatThongTin(): void                            |
// | + main(args: String[]): void                      |
// +------------------+
