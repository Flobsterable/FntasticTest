fun main() {
    
    fun encoder  (string: String): String{

        var word = string
        word = word.lowercase()
        var result = "";
        for (item in word) {

            var isNotDouble = word.lastIndexOf(item) == word.indexOf(item)
            result += when(isNotDouble){
                true ->  "("
                else ->  ")"
            }

        }
        return result
    }

    var string = readLine()
    println(encoder(string?:""))

}