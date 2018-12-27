package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        Convert the Java method 'task1' of the class 'JavaCode1' into Kotlin.
        In IntelliJ IDEA or Android Studio, you can copy the Java code,
        paste it into the Kotlin file and let IDE convert it.
        Please use automatic conversion for this task only.
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    var finStr: String = "{"
    val lstSize = collection.size
    var lstEl: String
    var colel: Int?
    for(i in 0.rangeTo(lstSize - 1)){ 
        colel = collection.get(i)
        lstEl = colel.toString()
        finStr = finStr + lstEl + ","
    }
    finStr = finStr + collection.get(lstSize-1).toString() + "}"
    return finStr
}
