const val HERO_NAME: String = "Madrigal"
fun main () {
    //println("Hello, world!")
    println("The hero announces her presence to the world.")

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    
    if (playerLevel == 1) {
        println("Meet Mr. Bubbles in the land of soft things.")
    } else if (playerLevel <= 5) {
            println("Save the town from the barbarian invasion.") }
    }else if (playerLevel == 6) {
        println ("Locate the enchanted sword.")
    } else if (playerLevel ==7) {
        println ("Recover the long-lost artifact of creation.")
    } else if (playerLevel ==8) {
        println ("Defeat Nogartse, bringer of death and eater of worlds.")
    } else {
        println ("There are no quests right now.")
    }


    //println("The hero embarks on her journey to locate the enchanted sword.")
    println ("Time passes...")
    println ("The hero returns from her quest.")

    playerLevel += 1
    println(playerLevel)

    val hasSteed: Boolean = true
    println(hasSteed) }



