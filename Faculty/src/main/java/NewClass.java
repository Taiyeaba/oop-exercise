

public class NewClass {

    public static void main(String[] args) {
        
        
        Faculty faculty1 = new Faculty();
        faculty1.setDept("Software Engineering");
        faculty1.setName("Wadia Iqbal Chowdhury");
        faculty1.setNumOfCourses(1);
        faculty1.setGender("female");

        Faculty faculty2 = new Faculty("Software Engineering");
        faculty2.setName("Al Akram");
        faculty2.setNumOfCourses(2);
        faculty2.setGender("male");

        Faculty faculty3 = new Faculty("Software Engineering", "Fuad Ahmed");
        faculty3.setNumOfCourses(1);
        faculty3.setGender("male");

        
        System.out.println(faculty1.teach());
        System.out.println(faculty2.teach());
        System.out.println(faculty3.teach());

        System.out.println("Faculty 1 is " + faculty1.advise());
        System.out.println("Faculty 2 can take exams: " + faculty2.takeExam());
        faculty3.takeExam(5);
    }
}
