// normale Fibos
def fibonacci(input: Int): Int = input match {
  case 0 => 0
  case 1 => 1
  case n => fibonacci(n - 1) + fibonacci(n - 2)
}

// fibo mit guards
def fib2(in: Int): Int = in match {
  case n if n <= 0 => 0
  case 1 => 1
  case _ => fib2(n - 1) + fib2(n - 2)
}
