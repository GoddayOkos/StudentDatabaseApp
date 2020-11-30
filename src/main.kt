import java.util.Scanner

fun main() {
    // Ask for the number of students to enroll
    print("Welcome to student database management. How many students do you want to enroll? ")
    val scanner = Scanner(System.`in`)
    val numOfStudents = scanner.nextInt()

    // Create n number of students
    var students: Array<Student>
    for (n in 1..numOfStudents) {
        students = arrayOf(Student())
        students[0].enroll()
        students[0].payTuition()
        students[0].viewInfo()
    }
}