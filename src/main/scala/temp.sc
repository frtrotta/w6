def isPrime(n: Int): Boolean = 2 until n forall (x => n % x != 0)

isPrime(5)
isPrime(6)
6 % 4
6 % 3

def scalarProduct2(xs: List[Int], ys: List[Int]): Int = (for (i <- 0 until xs.length) yield xs(i) * ys(i)).sum

def scalarProduct(xs: List[Int], ys: List[Int]): Int = (for ((x, y) <- xs zip ys) yield x * y).sum


scalarProduct2(List(1,2), List(1,3))
scalarProduct(List(1,2), List(1,3))