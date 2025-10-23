import java.io.*; // Import tất cả các lớp trong java.io
import java.util.ArrayList;

public class QuanLyNhanSu {
    
    // ArrayList tự động cũng là Serializable
    private ArrayList<NhanVien> danhSach;

    public QuanLyNhanSu() {
        this.danhSach = new ArrayList<>();
    }
    
    // Hàm từ Bài 12
    public void themNhanVien(NhanVien nv) {
        this.danhSach.add(nv);
    }
    
    // Hàm từ Bài 12
    public void inDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (NhanVien nv : this.danhSach) {
            System.out.println("Ten: " + nv.getTen() + ", Luong: " + nv.tinhLuong());
        }
    }

    // TODO 2: Tạo phương thức 'public void luuFile(String tenFile)'
    public void luuFile(String tenFile) {
        // Sử dụng try-with-resources để tự động đóng file
        try (FileOutputStream fos = new FileOutputStream(tenFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            // TODO 3: Gọi phương thức 'writeObject()' để lưu
            // TOÀN BỘ đối tượng 'danhSach' (ArrayList) xuống file
            oos.writeObject(this.danhSach);
            
            System.out.println("Luu file thanh cong!");
            
        } catch (IOException e) {
            System.out.println("Loi khi luu file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // TODO 4: Tạo phương thức 'public void docFile(String tenFile)'
    public void docFile(String tenFile) {
        // Sử dụng try-with-resources để tự động đóng file
        try (FileInputStream fis = new FileInputStream(tenFile);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // TODO 5: Gọi phương thức 'readObject()' để đọc đối tượng lên
            // Và ép kiểu (cast) nó về 'ArrayList<NhanVien)'
            // rồi gán vào 'this.danhSach'
            this.danhSach = (ArrayList<NhanVien>) ois.readObject();
            
            System.out.println("Doc file thanh cong!");

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file de doc! Tao danh sach moi.");
            this.danhSach = new ArrayList<>(); // Khởi tạo danh sách rỗng
        } catch (IOException | ClassNotFoundException e) {
            // Bắt 2 loại Exception cùng lúc
            System.out.println("Loi khi doc file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

