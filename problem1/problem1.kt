fun main() {
    val fridge  = listOf <String> ("Organic", "Lemon Juice", "Eggs","Ginger")
    val ingredients  = listOf <String> ("Organic", "Ginger", "Eggs","Lemon Juice")
    val Index = validateRecipe(fridge,ingredients)
    println(Index)
}

fun validateRecipe(fridge:List<String>, ingredients:List<String>):Boolean{
    return  if (fridge.size != ingredients.size) return false else return true
    for (i in fridge.indices) if (fridge[i] == ingredients[i]) return true


    return false
}