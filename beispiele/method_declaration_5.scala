def mkString[T](as: T*): String = as.foldLeft("")(_ + _.toString)
