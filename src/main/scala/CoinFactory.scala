trait Coin

case class OnePence() extends Coin
case class TwoPence() extends Coin
case class FivePence() extends Coin
case class TenPence() extends Coin
case class TwentyPence() extends Coin
case class FiftyPence() extends Coin
case class OnePound() extends Coin

object CoinFactory {
  def getCoins(pounds: Int): Map[Coin, Int] = ???
}
