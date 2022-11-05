public class User(val userId: Long) {
    var mail = ""
    constructor(userId: Long, _mail: String): this(userId){
        mail = _mail
    }
    fun removeLot(lotId: Long): Unit{
        LotStorage.storage.remove(lotId)
    }
    fun addLot(newLot: Lot): Unit{
        LotStorage.storage[newLot.lotId] = newLot
    }
    fun suggestNewPrice(lotId: Long, newPrice: Float){
        val lot = LotStorage.storage[lotId]
        if (lot != null) {
            if (lot.minPrice <= newPrice && lot.currentPrice!! <= newPrice){
                lot.currentPrice = newPrice
            }
        }
    }
}