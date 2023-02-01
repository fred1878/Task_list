fun main() {
    println("Input the tasks (enter a blank line to end):")
    TaskList().start()

}

class TaskList {
    private val list = mutableListOf<String>()

    fun start() {
        while(true) {
            val input = readln().trim()

            if (input == "") {
                if (list.isEmpty()) {
                    println("No tasks have been input")
                } else {
                    for (item in list) {
                        if (list.indexOf(item) in 0..8) {
                            println("${list.indexOf(item) + 1}  $item")
                        } else {
                            println("${list.indexOf(item) + 1} $item")
                        }
                    }
                }
                break
            } else {
                list.add(input)
            }
        }
    }
}
