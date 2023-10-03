fun main(){
    //initial matrix
    val matrix = listOf(
        listOf(1, 1, 0),
        listOf(2, 2, 0),
        listOf(3, 3, 3)
    )
    matrix.forEach {
        println(it)
    }
    zeroMatrix(matrix)
}

fun zeroMatrix(matrix: List<List<Int>>){
    val numRows = matrix.size
    val numCols = matrix[0].size

    //save the rows and columns that must be nullified
    val map = mutableMapOf<Int, Int>()
    val newMatrix = mutableListOf<List<Int>>()


    /***LETS MAP ALL ZEROS***/
    //iterate through rows
    matrix.forEach{rows ->
        //iterate through items
        rows.forEach {num ->
            if (num == 0){
                //Add Columns and Rows to the Map
                val newMap = mapOf(matrix.indexOf(rows) to rows.indexOf(num))
                map.putAll(newMap)
            }
        }
    }
    map.forEach { key, value ->
        println("Row ${key} || Column ${value}")
    }


    /***TAKEN ALL ZEROS, CREATE NEW MATRIX***/
    matrix.forEach{rows ->
        rows.forEach{num ->
            //row checking
            if (map.containsValue(num)) {
                //add null row
                newMatrix.add(List(numCols) { 0 })
            } else {
                
            }
        }
    }



}