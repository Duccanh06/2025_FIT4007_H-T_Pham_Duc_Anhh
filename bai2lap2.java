public class bai2lap2 {
     // ===== Thuộc tính =====
    private String maSach;
    private String tenSach;
    private double giaSach;
    private double giamGia;

    // ===== Constructor 1: chỉ có mã sách và tên sách =====
    public bai2lap2(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = 0;      // mặc định 0
        this.giamGia = 0;      // mặc định 0
    }

    // ===== Constructor 2: đầy đủ thông tin =====
    public bai2lap2(String maSach, String tenSach, double giaSach, double giamGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.giamGia = giamGia;
    }

    // ===== Getter / Setter =====
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // ===== Phương thức tính giá bán =====
    public double tinhGiaBan() {
        return giaSach - giamGia;
    }

    // ===== Phương thức xuất thông tin =====
    public void xuatThongTin() {
        System.out.println("- Ma so sach: " + maSach);
        System.out.println("- Ten sach: " + tenSach);
        System.out.println("- Gia sach: " + giaSach);
        System.out.println("- Giam gia: " + giamGia);
    }

    // ===== Main =====
    public static void main(String[] args) {
        // Tạo sách bằng constructor đầy đủ
        bai2lap2 book = new bai2lap2("B9526", "Mindset", 9000, 7000);

        System.out.println("Thong tin quyen sach hien tai:");
        book.xuatThongTin();

        System.out.println("\nGia ban cua sach: " + book.tinhGiaBan());

        // Cập nhật giảm giá
        book.setGiamGia(20000);

        System.out.println("\nThong tin quyen sach sau khi cap nhat:");
        book.xuatThongTin();

        System.out.println("\nGia ban moi cua sach: " + book.tinhGiaBan());
    }
}
// UML
// +-----------------------------------------+
// |                 Book                    |
// +-----------------------------------------+
// | - bookId   : String                     |
// | - bookName : String                     |
// | - price    : double                     |
// | - discount : double                     |
// +-----------------------------------------+
// | + Book(bookId: String, bookName: String)|
// | + Book(bookId: String, bookName: String,|
// |        price: double, discount: double) |
// | + getBookId(): String                   |
// | + setBookId(id: String): void           |
// | + getBookName(): String                 |
// | + setBookName(name: String): void       |
// | + getPrice(): double                    |
// | + setPrice(price: double): void         |
// | + getDiscount(): double                 |
// | + setDiscount(discount: double): void   |
// | + getSellingPrice(): double             |
// | + display(): void                       |
// +-----------------------------------------+