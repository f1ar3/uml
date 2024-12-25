import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Faculty> faculties = new ArrayList<>();
    private  final String name;

    public University(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return this.faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "УНИВЕРСИТЕТ " + name + "\n" +
                "Факультеты:\n" + faculties;
    }
}