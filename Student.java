public class Student
{
    private  StudentName fullStudentName;  //composition relationship
    private  String id; //composition relationship

    public Student ()
    {
        fullStudentName = new StudentName ();
        id = "";
    } // end default constructor


    public Student (StudentName studentStudentName, String studentId)
    {
        fullStudentName = studentStudentName;
        id = studentId;
    } // end constructor


    public void setStudent (StudentName studentStudentName, String studentId)
    {
        setStudentName (studentStudentName); // or fullStudentName = studentStudentName;
        setId (studentId); // or id = studentId;
    } // end setStudent


    public void setStudentName (StudentName studentStudentName)
    {
        fullStudentName = studentStudentName;
    } // end setStudentName


    public StudentName getStudentName ()
    {
        return fullStudentName;
    } // end getStudentName


    public void setId (String studentId)
    {
        id = studentId;
    } // end setId


    public String getId ()
    {
        return id;
    } // end getId


    public  String toString ()
    {
        return id + " " + fullStudentName.toString ();
    } // end toString


    public void display () {
        System.out.println("Student Class::display() ");
        System.out.println("Student Name : " + this.toString() );

    }


    public void displayAt (int numberOfLines) {
        System.out.println(numberOfLines+": Student class::displayAt() is being called!");
        display();

    }

} // end Student