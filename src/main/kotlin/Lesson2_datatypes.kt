fun main(){
    //data types
    //numbers
    //byte,short,long,int
    var size:Byte=100 //-128 to 127
    var short:Short=30000//-32k to 32k
    val int:Int=2000000000 //-2b to 2b
    val long:Long=3000000000//quintillion
    println(size)
    println(short)
    println(int)
    println(long)

    //string
    var country="kenya"
    println("My country is $country")

    //char
    var Grade:Char='A'
    println("Kenyan student got Grade $Grade in Home science")

    //Double
    var BMI:Double=24.6
    println("My BMI value is $BMI")

    //float
    val height:Float=1.8f
    println("I am $height M tall")

    //boolean
    val status:Boolean=true
    println(status)
    val answer=(76>45)
    println(answer)
}