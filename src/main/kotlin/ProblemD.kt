class ProblemD {

    fun main() {

        var requests = readLine()!!.toInt()

        while (requests-- > 0) {

            val clients = readLine()!!.toInt()
            val clientsMoney = readLine()!!.split(' ').map { it.toLong() }.sorted()
            var maxMoney = 0L

            for (i in 0 until clients) {
                val result = (clients - i) * clientsMoney[i]
                if (maxMoney < result)
                    maxMoney = result
            }

            println(maxMoney)


        }

    }

}