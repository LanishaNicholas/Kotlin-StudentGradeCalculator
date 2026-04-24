//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
data class Student(val name: String, val scores: List<Int>, val email: String?)
fun main() {
    val s1 = Student("Adam",listOf(85,90,78), null)
    val s2 = Student("Lanisha",listOf(85,90,78), "lanishanicholas@gmail.com")

    //toString
    println(s1)

    //equals
    println(s1 == s2)

    //copy
    val updated = s1.copy(name = "Tony")
    println(updated)

    //destructuring
    val (name, scores) = s1
    println("$name scored $scores")

    println(s2)

    printReport(s1)
    printReport(s2)

    //printReport(studentName,scores)
}

fun printReport(s1: Student) {

    with(s1){

        println("Name : $name")
        println("Email : ${email ?: "No Email Provided"}")
        println("Total : ${scores.sum()}")

        val averageScore = scores.average()
        println("Average : $averageScore")

        val grade = when {
            averageScore >= 90 -> "A"
            averageScore >= 80 -> "B"
            averageScore >= 70 -> "C"
            else -> "F"
        }

        println("Grade: $grade")

        println("Passed : ${scores.filter { it >= 80 }}")
        println("Failed : ${scores.filter { it < 80 }}")
    }
}


/*fun printReport(studentName: String, scores: List<Int>) {
    val totalScores = scores.sum()
    println("Total scores: $totalScores")

    val listSize = scores.size
    println("List size: $listSize")

    val average = scores.average()
    println("Average: $average")

    val passed = scores.filter { it >= 80 }
    println("Passed: $passed")

    val failed = scores.filter { it < 80 }
    println("Failed: $failed")}
}*/