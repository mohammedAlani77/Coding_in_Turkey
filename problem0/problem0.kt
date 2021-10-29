fun main() {

    val list  = listOf <String> ("Organic", "Lemon Juice", "Ginger","Eggs")
    val foodIndex = whereMyFood(list,"Ginger")
    println(foodIndex)
}

fun whereMyFood(fridge:List<String>,item:String):Int {
    for (i in fridge.indices)
        if (fridge[i] == item)
            return i + 1

            return -1

}