fun main() {
    println("Введите строчку: ")
    val Strochka = readLine()  ?:""

    var currentChar = Strochka[0]
    var count = 1
    val result = StringBuilder()

    for (i in 1 until Strochka.length) {
        if (Strochka[i] == currentChar) {
            count++
        } else { result.append(currentChar)
            if (count>1) {
                result.append(count)
            }
            currentChar = Strochka[i]
            count=1
        }
    }
    result.append(currentChar)
    if (count>1) {
        result.append(count)
    }
    println("Количество подряд идущих символов: ${result.toString()}")
}