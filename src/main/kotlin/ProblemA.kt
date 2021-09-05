class ProblemA {

    fun main() {

        var requests = readLine()!!.toInt()

        while (requests-- > 0) {

            var position = 0L
            val requests = readLine()!!.split(' ').map { it.toLong() }
            val rightJump = requests[0]
            val leftJump = requests[1]
            var numberOfJumps = requests[2].toInt()

            while (numberOfJumps > 0) {
                if (numberOfJumps % 2 != 0) {
                    position += rightJump
                } else {
                    position -= leftJump
                }
                numberOfJumps--
            }

            println(position)

        }

    }

}