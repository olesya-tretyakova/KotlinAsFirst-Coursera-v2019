@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.*

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int) = x * x

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double) = x * x

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

/**
 * Пример главной функции
 */
fun main() {
    /*val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    println("Root product: $x1x2")
    val sec = seconds(24, 0, 0)
    println("Seconds: $sec")
    val meters = lengthInMeters(8, 2, 11)
    println("Meters " + "%.2f".format(meters))*/
    //val radians = angleInRadian(36, 14, 35)
    //println("Radians " + "%.5f".format(radians))
    //val dis = trackLength(3.0, 0.0, 0.0, 4.0)
    //println("TrackLength: $dis")
    //val thirdNum = thirdDigit (3806)
    // rintln("result = $thirdNum")
    //val min = travelMinutes(9, 25, 13, 1)
    //println("Minutes: $min")
    //val thirdChar = thirdDigit(3801)
    //println("$thirdChar")
    //val accountInBank = accountInThreeYears(100,10)
    //println(accountInBank)
    val revertNumber =  numberRevert(478)
    println("Перевернутое число = $revertNumber")

}

/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    val hoursInSecond = hours * 60 * 60
    val minutesInSecond = minutes * 60
    return (hoursInSecond + minutesInSecond + seconds)

}

/**
 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double {
    val sagenesInMeters = sagenes * 2.133
    val arshinsInMeters = arshins * 0.711
    val vershoksInMeters = vershoks * 0.0445
    return (sagenesInMeters + arshinsInMeters + vershoksInMeters)

}

/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double {
    val degreeInRadian = deg * (PI / 180)
    val minutesInRadian = min * (PI / (180 * 60))
    val secondsInRadian = sec * (PI / (180 * 3600))
    return (degreeInRadian + minutesInRadian + secondsInRadian)
}

/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val distance = sqr(x1 - x2) + sqr(y1 - y2)
    return sqrt(distance)
}

/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit(number: Int): Int {
    /*val toStr = number.toString()
    val StrLen = toStr.length
    val thirdNumber = toStr[StrLen - 3]
    return thirdNumber.toString().toInt()*/
    val restDivision = (number/100) % 10
    return restDivision
}

/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val arriveInMinutes = hoursArrive * 60 + minutesArrive
    val departInMinutes = hoursDepart * 60 + minutesDepart
    return (arriveInMinutes - departInMinutes)
}

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double {
    val percentCalc:Double = percent.toDouble()/100
    val accountInYear: Double =initial+initial*(percentCalc)
    val accountInTwoYear=accountInYear+accountInYear*(percentCalc)
    val accountInThreeYear = accountInTwoYear+accountInTwoYear*(percentCalc)
    return accountInThreeYear
}
/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int {
    val firstDigit=(number%10)*100
    val secondDigit= ((number/10)%10)*10
    val thirdDigit = (number/100)%10
    val result = firstDigit+secondDigit+thirdDigit
    return result
}
