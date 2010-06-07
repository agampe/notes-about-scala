def sum[T <: Number](as: T*): Double = as.foldLeft(0d)(_ + _.doubleValue)
