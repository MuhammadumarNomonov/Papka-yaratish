import java.io.File

fun main() {
  val file = File("C:\\Users\\asr\\Documents\\Scanned Documents\\Documents\\File.txt\\")
    println(file.createNewFile())
   file.writeText("Ismingizni kiriting: ")
    file.appendText("Muhammadumar , ")
    file.appendText("Familyam: ")
    file.appendText("Nomonov, ")
    file.appendText("Yoshim: ")
    file.appendText("15")


}



