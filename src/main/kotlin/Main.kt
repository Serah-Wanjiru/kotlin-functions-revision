fun main() {
    names("Serah")
    modulus()
    moduluss(25,6)
    var results=addition(12,16,56,76)
    println(results)
    factme()
    funfact("I love coding")

}
fun names(name:String){
    println("Hello" +" " + "$name")
}
fun modulus(){
    var num1=15
    var num2=7
    var remainder=num1%num2
    println(remainder)
}
fun moduluss(num1:Int,num2: Int){
    var remainders=num1%num2
    println(remainders)
}
fun addition(num1: Int,num2: Int,num3: Int,num4: Int):Int{
    var sum=num1+num2+num3+num4
    return sum
}
fun factme(){
    var fact="i love reading novels"
    println(fact)
}
fun funfact(facts:String){
    println(facts)

}
