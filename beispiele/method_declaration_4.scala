def largest(as: Int*): Int = as.reduceLeft((a,b) => a max b)
