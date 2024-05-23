//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val system112 = System112()
    system112.objectInfo()
    println("-------------------------------")
    val fireDepartment = FireDepartment()
    fireDepartment.objectInfo()
    println("\n===============================\n")
//2
    println("Введите 2 числа")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var res = 0

    if (num1 == 0) res = num2
    else if (num2 == 0) res = num1

    while (num1 % num2 != 0){
        if (num1 > num2) num1 %= num2
        else if (num2 > num1) {
            num2 += num1
            num1 = num2 - num1
            num2 -= num1
            num1 %= num2
        }
    }
    println("НОД = $num2")
    println("============================")
//3
    val array = arrayOf(2, 9, 0, 1, 7, 5, 3, 6, 4, 8)
    for (i in array.indices){
        for (j in array.indices){
            if(array[i] < array[j]){
                array[i] += array[j]
                array[j] = array[i] - array[j]
                array[i] -= array[j]
            }
        }
    }
    println("Второе максимальное число = ${array[array.size - 2]}")
}