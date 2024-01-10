public class Course {

    String courseName;
    String InsName;
    int NumOfStudentsEnrolled;

    Course(String courseNameRecieved, String InsNameRecieved, int NumOfStudentsEnrolledRecieved) {
        courseName = courseNameRecieved;
        InsName = InsNameRecieved;
        NumOfStudentsEnrolled = NumOfStudentsEnrolledRecieved;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String newCourseName) {
        courseName = newCourseName;
    }

    public String getInseName() {
        return InsName;
    }

    public void setInsName(String newInsName) {
        InsName = newInsName;

    }

    public int getNumOfStudentsEnrolled() {
        return NumOfStudentsEnrolled;
    }

    public void setNumOfStudentsEnrolled(int newNumOfStudentsEnrolled) {
        NumOfStudentsEnrolled = newNumOfStudentsEnrolled;
    }

    @Override
    public String toString() {
        return " Course Name: " + courseName + "\n Instructor Name: " + InsName + "\n Number Of Students Enrolled: "
                + 25;

    }
}
