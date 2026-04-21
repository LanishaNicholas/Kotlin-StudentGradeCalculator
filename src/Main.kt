//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
data class Student(val name: String, val scores: List<Int>)
fun main() {
    val s1 = Student("Lanisha",listOf(85,90,78))
    val s2 = Student("Lanisha",listOf(85,90,78))

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

    printReport(s1)

    //printReport(studentName,scores)
}

fun printReport(s1: Student) {

    with(s1){
        println("Name : $name")
        println("Total : ${scores.sum()}")
        println("Average : ${scores.average()}")
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