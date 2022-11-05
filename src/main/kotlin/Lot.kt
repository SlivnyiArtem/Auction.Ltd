public class Lot(val lotId: Long, val lotName:String, var textDesc:String, val minPrice: Float,
          val recommendedPrice: Float, val sellerId: Long,
          val currentTopBuyerId: Long, val lotPhotos: MutableList<String>) {
    var currentPrice: Float? = null
    var isOpened:Boolean = true
    fun closeLot(): Unit{
        this.isOpened = false
    }



    //val lotName:String = name
    //val textDesc:String = textDesc

}