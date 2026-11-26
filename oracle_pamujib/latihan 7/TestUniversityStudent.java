import java.util.Date;

public class TestUniversityStudent {
    public static void main(String[] args) {
        UniversityStudent mhs = new UniversityStudent(
                "Budi", "Santoso", "Pratama", new Date(),
                "2026001", "Ilmu Komputer", "Sarjana", 2029
        );

        String[] nilai = {"A", "B+", "A-", "B"};
        mhs.calculateGpa(nilai);

        System.out.println("Nama: " + mhs.getName());
        System.out.println("NIM: " + mhs.getStudentId());
        System.out.println("Gelar: " + mhs.getDegree());
        System.out.println("Tahun Lulus: " + mhs.getExpectedGraduationYear());
        System.out.println("Jurusan Awal: " + mhs.getMajor());

        mhs.setMajor("Sistem Informasi");
        System.out.println("Jurusan Baru: " + mhs.getMajor());
        System.out.println("GPA: " + mhs.getGpa());
    }
}