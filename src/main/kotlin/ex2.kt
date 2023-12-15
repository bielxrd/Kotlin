import kotlin.random.Random;

fun estimarPi(numPontos: Int): Double {
    var pontosDentroCirculo = 0;
    for (i in 0 until numPontos) {
        val x = Random.nextDouble(-1.0, 1.0);
        val y = Random.nextDouble(-1.0, 1.0);
        if (x * x + y * y <= 1) {
            pontosDentroCirculo++;
        }
    }
    val proporcao = pontosDentroCirculo.toDouble() / numPontos.toDouble();

    return proporcao * 4.0;
}


fun main() {
    val numPontos = 10000000;
    val pi = estimarPi(numPontos);

    println("Estimativa de pi usando metódo Monte Carlo: $pi")
}