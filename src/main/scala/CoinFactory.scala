import scala.collection.mutable

trait Coin

case class OnePence(val value: Int = 1) extends Coin
case class TwoPence(val value: Int = 2) extends Coin
case class FivePence(val value: Int = 5) extends Coin
case class TenPence(val value: Int = 10) extends Coin
case class TwentyPence(val value: Int = 20) extends Coin
case class FiftyPence(val value: Int = 50) extends Coin
case class OnePound(val value: Int = 100) extends Coin

object CoinFactory {
  def getCoins(pences: Int) = {
    val coinMap = mutable.Map.empty[String, Int]
    val coins = List(OnePound, FiftyPence, TwentyPence, TenPence, FiftyPence, TwoPence, OnePence)

    for (coin <- coins) {
      if (coinMap.contains("test"))
        coinMap += ("test" -> (coinMap("test") + 1))
      else coinMap("test") = 0
    }

    coinMap
  }
}
