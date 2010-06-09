object SimplifyingCode extends Application{
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }
  
  def containsNegShort(num: List[Int]) = num.exists(_ < 0)
  
  containsNeg(List(1, 2, 3, 4))
  containsNegShort(List(-1, 2, 4))
}
