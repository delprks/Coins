import scala.collection.immutable.ListMap
import scala.collection.mutable

object CoinFactory {
  def getCoins(pences: Int) = {
    var mPences = pences
    val coinMap = mutable.Map.empty[String, Int]
    val coins: Map[String, Int] = ListMap("TwoPound" -> 200, "OnePound" -> 100, "FiftyPence" -> 50, "TwentyPence" -> 20, "TenPence" -> 10, "FivePence" -> 5, "TwoPence" -> 2, "OnePence" -> 1)

    coins.foreach(coin => {
      var numOfCoins = 0

      while(mPences >= coin._2) {
        mPences = mPences - coin._2
        numOfCoins = numOfCoins + 1
        coinMap(coin._1) = numOfCoins
      }
    })

    coinMap.toList
  }
}
