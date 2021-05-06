
fun main(){
var x=introduction("Julius",19)
var i=serve(3)
    var n=name(arrayListOf("jane","joseph","jyden"))
    var c=calc(30,5)



}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old")
}
fun serve(age:Int){
    if (age<6){
        println("serves a glass of milk")}
    else if (age>6&&age<15){
        println("serves a bottle of fanta")}
        else{ println("serves cocacola")}
    }
fun name(name:ArrayList<String>){
    var nameArray= arrayListOf<String>()
    for (name in nameArray){
        if (name.length==4) {
println(name)
        }
    }}
fun calc(num1:Int,num2:Int):Int{
    var multiply=num1*num2
    println(multiply)
}
  fun divide(num1:Int,num2: Int) {
      var divide = num1 / num2
println(divide)
  }
fun modulus(num1:Int,num2: Int) {
    var modulus = num1 % num2
    println(modulus)
}
class Human( var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        PrintLN “I am eating {foodWeight} kgs of food”

    }
}