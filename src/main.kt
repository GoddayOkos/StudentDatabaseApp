import java.util.Scanner

fun main() {
    // Ask for the number of students to enroll
    print("Welcome to student database management. How many students do you want to enroll? ")
    val scanner = Scanner(System.`in`)
    val numOfStudents = scanner.nextInt()

    // Create n number of students

    val arrayOfStudents = arrayListOf<Student>()
    for (n in 0 until numOfStudents) {
        arrayOfStudents.add(n, Student())
        arrayOfStudents[n].enroll()
        arrayOfStudents[n].payTuition()
        arrayOfStudents[n].viewInfo()
    }

}