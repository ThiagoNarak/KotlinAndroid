fun main(args: Array<String>) {

}

fun questao05(){
    val np1: Double
    val np2: Double

    println("digite sua frequencia")
    var freq : Int = (readLine()?.toInt() ?:0)
    if (freq <75 ){
        println("reprovado por frequencia")
    }else{
        println("digite np1")
        np1 = (readLine()?.toDouble() ?:0.0 )
        println("digite np2")
        np2 = (readLine()?.toDouble() ?:0.0 )
        if ((np1+np2)/2 >=8){
            println("parabens voce passou com media: ${(np1+np2)/2}")
        }else if ((np1+np2) / 2 >= 4){
            println("digite sua nota final")
            val nf : Double = (readLine()?.toDouble() ?:0.0)
            if((np1+np2+nf )/3 >=5  && nf>=4){
                println("passou por media final${(np1+np2+nf)/3}")
            }else{
                if (nf<4) println("nota nf descartada pois foi abaixo de 4")
                println("reprovado por media final${(np1+np2+nf)/3}")

            }
        }else{
            println("nao atingiu media minima de 4  sua nota foi ${(np1+np2)/2} ")
        }
    }


}

fun questao04(){
    val litro : Int = 20
    var comp : Double
    var lar : Double
    var prof : Double
    var peixes: Int
    do{
        println("digite comprimento em CM")
        comp = (readLine()?.toDouble() ?: 0.0)

    }while (comp<60)
    println("digite largura em CM")
    lar = (readLine()?.toDouble() ?: 0.0)
    println("digite profundidade em CM")
    prof = (readLine()?.toDouble() ?: 0.0)
    var total = ((comp*lar*prof)/1000)
    println("digite o numero de peixes")
    peixes= (readLine()?.toInt() ?: 0)
    if(peixes*litro > total*1000) println("aquario adequado") else println("aquario inadequado")


}
fun questao03(){
    var diarias : Int = 0
    var entrada:String
    var valor : Double
    var nome: String
    println("digite seu nome")
    nome = readLine() ?: ""
    println("digite numeros de diarias")
    diarias = (readLine()?.toInt() ?: 0)
    if (diarias > 10){
        valor =     (diarias * 60)+(diarias*5.50)
    }else if(diarias == 10){
        valor =     (diarias * 60)+ (diarias*6.0)

    }else{
        valor =     (diarias * 60)+ (diarias*8.0)

    }
    println("Sr. $nome valor total a pagar $valor durante $diarias diarias")

}
fun questao02(){
    var timeA: Int =0
    var timeB: Int =0
    var entrada: String
    for (f in 1..3 step 1){
        print("digite o numero de cestas de $f ponto Time A")
        entrada = readLine() ?: ""
        timeA += entrada.toInt()*f

        print("digite o numero de cestas de $f ponto Time B")
        entrada = readLine() ?: ""
        timeB += entrada.toInt()*f
    }
    if (timeA>timeB) print("timeA venceu")else if(timeB>timeA) print("timeB venceu")else print("empate")

}
fun questao01(){
    var entrada:String
    var v1: Int
    var v2: Int
    var v3: Int
    var total: Int =0

    println("digite primeiro numero")
    entrada = readLine() ?: ""
    v1 = entrada.toInt()

    println("digite segundo numero")
    entrada = readLine() ?: ""
    v2 = entrada.toInt()
    println("digite terceiro numero")
    entrada = readLine() ?: ""
    v3 = entrada.toInt()

    var lista = listOf<Int>(v1,v2,v3)


    lista.filter { i ->  true }
            .sortedByDescending { it }
            .forEachIndexed { index, i ->  if (index <=1) print(" $i "); if(index==1)total= lista[0]+ lista[1] }


    print("\n $total")
}