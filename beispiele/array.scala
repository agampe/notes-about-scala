// exist an element in xs with property p?
def exists[T](xs: Array[T], p: T => boolean) = {
  var i: int = 0
  while (i < xs.length && !p(xs(i))) i = i +1
  i < xs.length
}

def forall[T](xs: Array[T], p: T => boolean) = {
  // nested function
  def not_p(x: T) = !p(x)
  !exists(xs, not_p)
}

// shorter and eleganter than forAll (works with anonymous function)
def forallAnonymous[T](xs: Array[T], p: T => boolean) =
  !exists(xs, (x: T) => !p(x))
