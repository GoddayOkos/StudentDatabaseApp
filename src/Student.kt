import java.util.Scanner
import kotlin.math.roundToInt

class Student() {
    // Students Info
    private val firstName: String
    private val lastName: String
    private val level: String
    private var studentId: String = ""
    private var courses: String = ""
    private var tuitionBalance: Int = 0
    private val costOfCourse: Int = 5000
   // private var id: Int = (Math.random() * 5991).toInt()

    // Constructor: prompt the user to enter student name and year
    init {
        print("Enter Student's first name: ")
        val scanner = Scanner(System.`in`)
        firstName = scanner.nextLine().capitalize()
        print("Enter Student's last name: ")
        lastName = scanner.nextLine().capitalize()
        print("Enter Student's current level: ")
        level = scanner.nextInt().toString()
        setStudentId()
    }


    // Generate ID
    private fun setStudentId() {
        // Student id = level + id
        var id = (Math.random() * 5991).toInt()
        id++
        studentId = level + id
    }

    // Enroll in courses
    fun enroll() {
        // Keep enrolling until user enter Q
        do {
            print("Enter courses to enroll (Q to quit): ")
            val scanner = Scanner(System.`in`)
            val course = scanner.nextLine().toUpperCase()
            if (!course.equals("Q")) {
                courses += "\n\t$course"
                tuitionBalance += costOfCourse
            } else {
                break
            }
        } while (true)
    }

    // View balance
    fun viewBalance() {
        println("Your balance is: N$tuitionBalance")
    }

    // Pay tuition
    fun payTuition() {
        viewBalance()
        print("Enter your payment: N")
        val scanner = Scanner(System.`in`)
        val payment = scanner.nextInt()
        tuitionBalance -= payment
        println("Thank you for your payment of N$payment")
    }

    // Display student Info
    fun viewInfo() {
        println("\nStudent Information")
        println("___________________________")
        println("Name: $firstName $lastName\nCurrent level: $level\nStudent ID: $studentId" +
                "\nCourses Enrolled: $courses\nTuition Balance: $tuitionBalance")
        println("___________________________\n ")
    }
}