class ProblemC {

    fun main() {

        val numOfStudents = readLine()!!.toInt()
        val levels = readLine()!!.split(' ').map { it.toInt() }.sorted()

        var result = 0
        for (i in 0 until numOfStudents step 2) {
            result += levels[i+1] - levels[i]
        }
        println(result)

    }

}