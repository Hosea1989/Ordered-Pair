/*
* Name:Damien Hosea
* Team: 5
* Assignment Quiz 3: Generics
*
* Description: This is the orderPair program. It is a Generic type class that can accept any type
* of data type. I create two objects and passing my student's names as parameters. I then use
* the object that contains the student's name and passes it as parameter along with the student's ID
* number.I think utilize the methods of the OrderedPair class to set the pair of items and to change
* their order.
*
 */
public class OrderedPair < T > {
    private T first, second;

    public OrderedPair() {
    }

    public void setPair (T firstItem, T secondItem)
    {
        first = firstItem;
        second = secondItem;
    } //end setPair

    public void changeOrder()
    {
        T temp = first;
        first = second;
        second = temp;
    } //end changeOrder

    public String toString()
    {
        return "(" + first + ", " + second + ")";
    } //end  toString


    public static void main(String[] args) {
        //Create an instance of the OrderedPair class. It's also a Generic <> type.
        OrderedPair<Student> aStudent = new OrderedPair<>();

        //Initialize the data fields in the StudentName class.
        StudentName studentName1 = new StudentName("Damien","Hosea");
        StudentName studentName2 = new StudentName("Yugi", "Muto");

        //Create instance of the Student class and pass the studentName object and a string of numbers for the ID.
        Student student1 = new Student(studentName1,"123");
        Student student2 = new Student(studentName2,"456");

        //Utilize the methods of the OrderedPair class
        aStudent.setPair(student1,student2);
        System.out.println(aStudent.toString());
        aStudent.changeOrder();
        System.out.println(aStudent.toString());


    } //end of function Main()

} //end orderedPair
