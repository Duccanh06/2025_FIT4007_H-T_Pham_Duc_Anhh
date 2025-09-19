import java.time.Year;   // Dùng để lấy năm hiện tại

public class bai3lap2 {
    // ===== Thuộc tính =====
    private String maSinhVien;
    private String hoTen;
    private int namSinh;
    private String diaChi;

    // ===== Constructor 1: chỉ có mã và tên =====
    public bai3lap2(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = 0;     // mặc định
        this.diaChi = "";     // mặc định
    }

    // ===== Constructor 2: đầy đủ thông tin =====
    public bai3lap2(String maSinhVien, String hoTen, int namSinh, String diaChi) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    // ===== Getter / Setter =====
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // ===== Phương thức tính tuổi =====
    public int tinhTuoi() {
        int namHienTai = Year.now().getValue(); // Lấy năm hiện tại
        return namHienTai - namSinh;
    }

    // ===== Phương thức xuất thông tin =====
    public void xuatThongTin() {
        System.out.println("- Ma sinh vien: " + maSinhVien);
        System.out.println("- Ho ten: " + hoTen);
        System.out.println("- Nam sinh: " + namSinh);
        System.out.println("- Dia chi: " + diaChi);
    }

    // ===== Main =====
    public static void main(String[] args) {
        // Tạo sinh viên bằng constructor đầy đủ
        bai3lap2 sv = new bai3lap2("151234", "Nguyen Van A", 2006, 
                                 "123 Nguyen Trai, Thanh Xuan, Ha Noi");

        System.out.println("Thong tin sinh vien:");
        sv.xuatThongTin();

        System.out.println("\nTuoi cua sinh vien: " + sv.tinhTuoi() + " tuoi");
    }
}
// UML
// +------------------------------------------------+
// |                  Student                       |
// +------------------------------------------------+
// | - studentId: String                            |
// | - fullName : String                            |
// | - birthYear: int                               |
// | - address  : String                            |
// +------------------------------------------------+
// | + Student(studentId: String, fullName: String) |
// | + Student(studentId: String, fullName: String, |
// |           birthYear: int, address: String)     |
// | + getStudentId(): String                       |
// | + setStudentId(id: String): void               |
// | + getFullName(): String                        |
// | + setFullName(name: String): void              |
// | + getBirthYear(): int                          |
// | + setBirthYear(year: int): void                |
// | + getAddress(): String                         |
// | + setAddress(addr: String): void               |
// | + getAge(): int                                |
// | + display(): void                              |
// +------------------------------------------------+
