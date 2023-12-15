fun main() {

    val tamanhoVetor = 5
    val vetor = DoubleArray(tamanhoVetor)

    println("Digite $tamanhoVetor números para preencher o vetor")

    for (i in 0 until tamanhoVetor) {
        vetor[i] = readLine()?.toDoubleOrNull() ?: 0.0

    }


    vetor.sort();

    for (valor in vetor) {
        println(valor)
    }
}