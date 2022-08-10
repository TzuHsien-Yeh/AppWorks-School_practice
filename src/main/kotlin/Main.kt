fun main(){
    val humanInstance = Human(name = "Toby")
    humanInstance.attack()

    val mageInstance = Mage("Diego")
    mageInstance.attack()

    humanInstance.flagMana()
    mageInstance.flagMana()
}

fun Human.flagMana(){
    if (this is Mage){
        println("$name has mana.")
    } else {
        println("$name is a normie.")
    }
}