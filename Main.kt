fun sumDigit(num : Int):Int {
    var sum = 0
    var tmpNum = num
    
    while(tmpNum != 0){
        sum += tmpNum % 10
        tmpNum /= 10
    }
    return sum
}

fun main(args: Array<String>) {
    val (n,a,b) = readLine()!!.split(" ").map(String::toInt)
    var total = 0
    
    for(i in 1..n) {
        val sum =  sumDigit(i)
        if( sum in a..b){
            total += i
        } 
    }
    
    println(total)
}
