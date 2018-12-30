package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO


fun task1(collection: Collection<Int>): String {
    var finStr: String = "{"
    val it = collection.iterator()
    while (it.hasNext()) {
        val el = it.next()
        finStr = finStr + el
        if (it.hasNext()) {
            finStr = finStr + ", "
        }
    }
    finStr = finStr + "}"
    
    return finStr
}
