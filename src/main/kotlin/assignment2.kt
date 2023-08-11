import java.util.Scanner

fun main() {

    //create a program that receives students marks(5subjects), name of the student and the class name
    //the program then calculates the total marks and displays all the student details
    val scanner=Scanner(System.`in`)
    print("Enter Maths:")
    var Math=scanner.nextInt()
    print("Enter English:")
    val English=scanner.nextInt()
    print("Enter Kiswahili: ")
    val Kiswahili=scanner.nextInt()
    print("Enter Science:")
    val Science=scanner.nextInt()
    print("Enter Social: ")
    val Social=scanner.nextInt()

    val Marks=Math+English+Kiswahili+Science+Social
    //student details
    print("Enter Name: ")
    val name= readLine()
    print("Enter Classname:")
    val classname= readLine()

    println("The student is $name from $classname scored $Marks")

}