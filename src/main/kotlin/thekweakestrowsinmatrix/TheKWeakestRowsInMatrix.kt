package thekweakestrowsinmatrix

class TheKWeakestRowsInMatrix {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        return mat.asSequence()
            .map { elements -> elements.sum() }
            .withIndex()
            .sortedBy { it.value }
            .map { it.index }
            .take(k)
            .toList()
            .toIntArray()
    }
}