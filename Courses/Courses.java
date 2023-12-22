class course{
    private String course_name;
    private int course_Id;
    private int max_student;
    private int enrolled_student;

    public course(){
        this.course_name="No course";
        this.course_Id=0;
        this.max_student=0;
        this.enrolled_student=0;
    }
    public course(String course_name, int course_Id){
        this.course_name="course_name";
        this.course_Id=course_Id;
        this.max_student=50;
    }
    public course(String course_name, int course_Id, int max_student){
        this.course_name="course_name";
        this.course_Id=course_Id;
        this.max_student=max_student;
    }
    public void enrolled_student(){
        if(enrolled_student<max_student){
            enrolled_student++;
            System.out.println("Student enrolled in the course.");
        }
        else{
            System.out.println("Course is full, can't enroll student.");
        }

    }
    public boolean coursefull(){
        return (enrolled_student>=max_student);
    }
    
    public int calculate_availableseats(){
        return (max_student-enrolled_student);
    }
        public void displaycourseinfo(){
        System.out.println("Course information: ");
        System.out.println("Course name: "+course_name);
        System.out.println("Course Id: "+course_Id);
        System.out.println("Maximum student: "+max_student);
        System.out.println("Enrolled student: "+enrolled_student);
        System.out.println("Available seats: "+calculate_availableseats());
    }
}


public class Courses {
public static void main(String[] args) {
    course p1=new course("Object Oriented Programming", 115);
    course st=new course("Statistics", 115, 55);
    System.out.println("-------Anything-------");
    p1.enrolled_student();
    p1.displaycourseinfo();
    st.displaycourseinfo();
}
}