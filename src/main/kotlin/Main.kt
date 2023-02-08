fun main() {

greeting("Ada")
remainder(43,3)
    var answer= remainder(43,3)
    println(answer)
    sum(4,12,10,1234)
    var addition = sum(4,12,10,1234)
    println(addition)
    mySelf()

}
fun greeting  (name:String){

    println( "Hello $name " )

}
fun remainder (num1: Int , num2: Int): Int{
    var remainder = num1 % num2
    return remainder

}
fun sum (num3:Int, num4: Int, num5:Int, num6: Int): Int{
    var sum = num3 + num4 + num5 + num6
    return sum
}
fun mySelf(){
  var interestingFactAbtMe = ( "I love charity and giving back to the society")
println(interestingFactAbtMe)

}