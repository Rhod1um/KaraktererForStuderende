import java.util.Arrays;

public class Student {
    private String name, studentNumber; //det hedder dataindkapsling at lave det private
    final int NUMBER_OF_GRADES = 7;
    private double averageGrade;
    int[] grades = new int[NUMBER_OF_GRADES];

    Student(){} //invarians - konstruktørenn bestemmer at objektet ikke kan variere,
    // fx karakter kan ikke være over 12 - det hedder også kontrakten
    void setName(String name){
        this.name = name;
    }
    void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    void setGrades(int[] grades){
        this.grades = grades;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                ", student number: " + studentNumber +
                ", grades: " + Arrays.toString(grades);
    }
}
//Er der en toString kan man bare kalde den i main, så fx sout student.toString(); frem for student.??

//brug samme-variabelnavn i de forskellige metoder, det er best practice. og brug this. når nødvendigt
//shadowing? Er det at overskygge den ene variabel med en anden gennem this.?

//normalt sælger man ikke kildekoden, man sælger den kompilerede fil. I java kan man dog altid dekopilere
//filen men i andre sprog kan man ikke. Dog ligger koden ofte på en server så der kan man ikke få fat i den