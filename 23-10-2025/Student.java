import java.io.Serializable;

// Lớp Student phải implements Serializable để có thể ghi/đọc file
public class Student implements Serializable {

    // serialVersionUID giúp đảm bảo tương thích giữa các phiên bản lớp
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Hàm toString() giúp in thông tin sinh viên ra màn hình
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
