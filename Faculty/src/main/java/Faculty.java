



public class Faculty {

    private String dept;
    private String name;
    private int numOfCourses;
    private String gender;
    

    public Faculty() {
        System.out.println("Hello");
    }

    public Faculty(String department) {
        this.dept = department;
    }

    public Faculty(String department, String name) {
        this.dept = department;
        this.name = name;
    }

    public void setDept(String department) {
        this.dept = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfCourses(int num) {
        this.numOfCourses = num;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public String getGender() {
        return gender;
    }

    

    public String teach() {
        String title;
        if ("female".equalsIgnoreCase(gender)) {
            title = "Ms.";
        } else {
            title = "Mr.";
        }
        return title + " " + name + " from department of " + dept + ", their number of courses is " + numOfCourses + ". Gender: " + gender;
    }

    public String advise() {
        return "Advising Students";
    }

    public boolean takeExam() {
        return true;
    }

    public void takeExam(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Exam will be held tomorrow");
        }
    }
}


