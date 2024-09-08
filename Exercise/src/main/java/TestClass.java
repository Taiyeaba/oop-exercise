public class TestClass {

    public static void main(String[] args) {

        Student student = new Student("Tayeba", 90.0);

        
        int total = student.calculateAverage();
        double average = total / 5.0;
        student.setAverage(average);

        System.out.printf("%nTotal of all 5 grades is %d%n", total);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Average: " + student.getAverage());
        System.out.println("Student Letter Grade: " + student.getLetterGrade());

        
        student.analysis();
    }
}