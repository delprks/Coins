object Coins {
  def main(args: Array[String]) {
    require(args(0).nonEmpty)
    val pences = args(0).toInt
    println(CoinFactory.getCoins(pences))
  }
}
