//class Collections {
    fun main(args:Array<String>){

        //List

        var num = listOf<Int>(1,2,3)
        for(i in num){
            println(i)
        }

        //Uinsg Index
        for((i,e) in num.withIndex()){
            println(" $i :: $e")

        }


            //Maps-- No order
    var map = HashMap<String,Int>()
    map["Swaran"]=27
    map["tej"]= 25
    for((name,age) in map){
        println("$name :: $age")
    }
    }



//}