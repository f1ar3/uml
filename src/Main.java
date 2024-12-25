import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        University university = new University("Воронежский государственный университет");

        Faculty computerScienceFaculty = new Faculty("Computer Science Faculty",
                new Employee(1, "Крыловецкий Александр Абрамович", "edu@cs.vsu.ru") {
                });

        Institute institute = new Institute("ИСИТ", "Университетская площадь, 1");

        computerScienceFaculty.addInstitute(institute);

        university.addFaculty(computerScienceFaculty);

        System.out.println(university);
    }
}