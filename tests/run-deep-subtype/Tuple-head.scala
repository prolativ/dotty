import scala.reflect.ClassTag

object Test {
  def main(args: Array[String]): Unit = {

    def testArray[T: ClassTag](n: Int, elem: Int => T): Unit = {
      val t: Int *: Tuple = 0 *: Tuple.fromArray(Array.tabulate(n)(elem))
      assert(0 == t.head)
    }

    for (i <- 0 to 25)
      testArray(i, j => j)

    assert(1 == Tuple1(1).head)
    assert(1 == (1, 2).head)
    assert(1 == (1, 2, 3).head)
    assert(1 == (1, 2, 3, 4).head)
    assert(1 == (1, 2, 3, 4, 5).head)
    assert(1 == (1, 2, 3, 4, 5, 6).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24).head)
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25).head)

    assert(1 == (1 *: Tuple()).head)
    assert(1 == (1 *: 2 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: Tuple()).head)
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: 25 *: Tuple()).head)
  }
}
