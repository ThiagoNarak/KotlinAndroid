import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {
questao06_2()
}

fun questao06_2(){
    var linhaColuna: Int
    println("digite numero de linhas da matriz")
    linhaColuna = readLine()?.toInt()?:0
    var matriz = Array(linhaColuna,{IntArray(linhaColuna)})
    for (i in 0..linhaColuna-1){
        for (j in 0..linhaColuna-1){
            println("digite a posicao [$i][$j]")
            matriz[i][j] = readLine()?.toInt()?:0

        }
    }





    var menu:Int = 0;
    do{
        println("digite 1 para imprimir todos elementos")
        println("digite 2 para imprimir diagonal pricipal")
        println("digite 3 para imprimir triangulo superior")
        println("digite 4 para imprimir triangulo inferior")
        println("digite 5 para imprimir tudo exceto a diagonal pricipal")

        menu = readLine()?.toInt()?:0
            when(menu){
                1 -> {
                    for (i in 0..linhaColuna-1){
                        for (j in 0..linhaColuna-1){
                            print("[${matriz[i][j]}] ")
                        }
                        println("")
                    }

                }
                2 -> {

                    for (i in 0..linhaColuna-1){
                        for (j in 0..linhaColuna-1){
                            if(i==j) print("[${matriz[i][j]}]") else print("[ ]")
                        }
                        println("")
                    }

                }
                3 ->{
                    for (i in 0..linhaColuna-1){
                        for (j in 0..linhaColuna-1){
                            if(i<=j) print("[${matriz[i][j]}]") else print("[ ]")
                        }
                        println("")
                    }

                }
                4 -> {
                    for (i in 0..linhaColuna-1){
                        for (j in 0..linhaColuna-1){
                            if(i>=j) print("[${matriz[i][j]}]") else print("[ ]")
                        }
                        println("")
                    }
                }
                5 -> {
                    for (i in 0..linhaColuna-1){
                        for (j in 0..linhaColuna-1){
                            if(i==j)print("[ ]")  else print("[${matriz[i][j]}]")
                        }
                        println("")
                    }
                }

            }
    }while (menu!=0)

}
fun questao06() {
    var media = Array<Double>(10, { i -> 0.0 })
    val alunos = arrayOf(doubleArrayOf(1600.0, 7.5, 8.9, 6.5)  //0
                       , doubleArrayOf(1601.0, 8.2, 2.3, 9.4)  //1
                       , doubleArrayOf(1602.0, 10.0, 9.6, 7.1) //2
                       , doubleArrayOf(1603.0, 6.8, 7.5, 8.1)  //3
                       , doubleArrayOf(1604.0, 8.8, 7.4, 9.2)  //4
                       , doubleArrayOf(1605.0, 8.3, 7.9, 9.0)  //5
                       , doubleArrayOf(1606.0, 7.2, 8.7, 9.8)  //6
                       , doubleArrayOf(1607.0, 8.3, 7.7, 8.9)  //7
                       , doubleArrayOf(1608.0, 7.8, 7.0, 9.0)  //8
                       , doubleArrayOf(1609.0, 8.0, 7.0, 9.0)) //9
    var situacao = Array<Array<String?>>(10) { arrayOfNulls(2) } //criar array2dString


    var menu: Int

    do {
        println("digite 1 para imprimir a tabela de nome e notas de alunos")
        println("digite 2 para construir um vetor com a media de cada aluno")
        menu = readLine()?.toInt() ?: 0
        when (menu) {
            1 -> {
                print("matricula \tnota1 \tnota2 \tnota3")
                for (i in 0..9) {
                    println()

                    for (j in 0..3) {
                        print("${alunos[i][j]}   \t")

                    }
                }
            }
            2 -> {
                println("matricula \tmedia")
                for (i in 0..9) {
                    media[i] = 0.0
                    for (j in 1..3) {

                        media[i] += alunos[i][j]
                    }
                    print("${alunos[i][0]} \t    ")
                    media[i] = media[i] / 3
                    println("${media[i]}")

                }
            }
            3 -> {
                println("Matricula\t situação")
                for (i in 0..9) {
                    media[i] = 0.0
                    for (j in 1..3){
                        media[i] += alunos[i][j]
                    }
                    media[i] = media[i] / 3

                    situacao[i][0] = alunos[i][0].toString()
                    situacao[i][1] = if (media[i] >= 7) "aprovado" else "reprovado"
                    println("${situacao[i][0]}\t ${situacao[i][1]}")
                }

            }
        }
    }while (menu!=0)
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