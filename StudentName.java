public class StudentName
{
    private String first; // first name
    private String last; // last name

    public StudentName ()
    {
        first = "";
        last =  "";
    } // end default constructor


    public StudentName (String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    } // end constructor



    public String toString ()
    {
        return first + " " + last;
    } // end toString
} // end Name
