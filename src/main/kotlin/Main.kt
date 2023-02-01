fun main() {
    TaskList().start()
}

class TaskList {
    private val list = mutableListOf<String>()

    fun start() {
        while(true) {
            println("Input an action (add, print, end):")
            val input = readln().trim()

            if (input.lowercase() == "end") {
                println("Tasklist exiting!")
                break
            } else if (input.lowercase() == "print") {
                if (list.isEmpty()) {
                    println("No tasks have been input")
                } else {
                    for (item in list) {
                        if (list.indexOf(item) in 0..8) {
                            println("${list.indexOf(item) + 1}  $item")
                        } else {
                            println("${list.indexOf(item) + 1} $item")
                        }
                        println()
                    }
                }
            } else if (input.lowercase() == "add") {
                println("Input a new task (enter a blank line to end):")
                var task = ""
                while (true) {
                    val taskInput = readln().trim()
                    if (taskInput == "") {
                        if (task == "") {
                            println("The task is blank")
                        } else {
                            list.add(task)
                        }
                        break
                    } else {
                        task += if (task == "") {
                            "$taskInput\n"
                        } else {
                            "   $taskInput\n"
                        }
                    }
                }
            } else {
                println("The input action is invalid")
            }
        }
    }
}