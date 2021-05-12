
fun main(args: Array<String>){
    var result = add(7,3)
    println(result)

    var result1 = sub(11,6)
    println(result1)

    var result2 = max(17,3)
    println(result2)

    var interestAmount = calInterest(amt=20,interest =0.02)
    println("Interst Amount $interestAmount")

    git remote add origin https://github.com/Swarantej/kotlin.gitgit
    parseInt()

}

fun add(a : Int, b: Int) : Int{
    return a+b;
}

fun sub(c : Int, d: Int) : Int = c-d

fun max(e : Int, f: Int) : Int = if(e>f) e else f

@JvmOverloads
fun  calInterest(amt : Int , interest:Double = 0.08) : Int{
    return (amt + amt*interest).toInt()
}

fun parseInt(){
    var str :String = "4"
    var int :Int = str.toInt()
    int++
    println("parse int $int")
}