fun main() {
    print("Введите количество лайков:")
    val likesStr: String = readLine() ?: return
    val likes = likesStr.toInt()
    val wordPeople: String = if (likes%10 == 1 && likes%100 != 11) "человеку" else "людям"
    println("Понравилось $likes $wordPeople")
}