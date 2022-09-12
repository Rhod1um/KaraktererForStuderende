public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Maria");
        student1.setStudentNumber("mari9863");

        final int NUMBER_OF_GRADES=7;
        int[] grade = new int[NUMBER_OF_GRADES];

        grade[0] = 7; grade[1] = 10; grade[2] = 4; grade[3] = 2; grade[4] = 12; grade[5] = 10; grade[6] = 7;

        student1.setGrades(grade);
        System.out.println(student1);
    }
}
