import java.util.Scanner;

public class bai4lap2 {
    // ===== Thuộc tính =====
    private double r;

    // ===== Constructor mặc định =====
    public bai4lap2() {
        this.r = 2;   // bán kính mặc định = 1
    }

    // ===== Constructor có tham số =====
    public bai4lap2(double r) {
        this.r = r;
    }

    // ===== Getter / Setter =====
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // ===== Phương thức nhập =====
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        this.r = sc.nextDouble();
    }

    // ===== Phương thức xuất =====
    public void output() {
        System.out.println("Ban kinh r: " + r);
    }

    // ===== Tính diện tích =====
    public double tinhDienTich() {
        return Math.PI * r * r;
    }

    // ===== Tính chu vi =====
    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    // ===== Main =====
    public static void main(String[] args) {
        // 1️⃣ Tạo hình tròn mặc định
        bai4lap2 c = new bai4lap2();
        System.out.println("Thong tin hinh tron (mac dinh):");
        c.output();

        // 2️⃣ Nhập bán kính mới từ bàn phím
        System.out.println("\nNhap hinh tron:");
        c.input();

        // 3️⃣ Xuất thông tin và tính toán
        System.out.println("\nThong tin hinh tron:");
        c.output();
        System.out.println("Dien tich hinh tron: " + c.tinhDienTich());
        System.out.println("Chu vi hinh tron: " + c.tinhChuVi());
    }
}
// +------------------+
// |      Circle      |
// +------------------+
// | - radius: double |
// +------------------+
// | + Circle()                   |
// | + Circle(radius: double)      |
// | + getRadius(): double         |
// | + setRadius(radius: double): void |
// | + input(): void               |
// | + output(): void              |
// | + getArea(): double           |
// | + getCircumference(): double  |
// +------------------+
