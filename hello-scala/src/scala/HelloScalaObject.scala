import java.util.{Date, Locale};
import java.text.DateFormat._

object HelloScalaObject {
  def main(args: Array[String]): Unit = {
    
    val now = new Date();
    val df = getDateInstance(LONG, Locale.KOREA)
    println(df format now);
  }
}