fun main () {
    println("How many levels do you want for your pyramid?")
    val level = readln()!!.toInt()

    for (i in 1..level){
        for(j in 1..i){
            print("*")
        }
        println()
    }
}