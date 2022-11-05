object LotStorage {
    var storage = mutableMapOf<Long, Lot>()
    fun getUserLots(userId: Long) : List<Lot>{
        return storage.values.filter { el -> el.sellerId == userId }
    }
}