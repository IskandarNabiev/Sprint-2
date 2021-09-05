class ProblemB {

    fun main() {

        var requests = readLine()!!.toInt()
        while (requests-- > 0) {

            val nums = readLine()!!.split(' ').map { it.toInt() }
            val length = nums[0]
            val letter = nums[1]

            var result: Char

            for (i in 0 until length) {
                result = ('a' + (i % letter).toChar().toInt())
                print(result)
            }
            println()

        }

    }

}