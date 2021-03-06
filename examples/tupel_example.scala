def sumSq(in: List[Double]): (Int, Double, Double) =
    in.foldLeft((0, 0d, 0d))((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v))

// obiges pattern-Matching lesbarer

def sumSqReadable(in: List[Double]) : (Int, Double, Double) =
    in.foldLeft((0, 0d, 0d)){
    case ((cnt, sum, sq), v) => (cnt + 1, sum + v, sq + v * v)}
