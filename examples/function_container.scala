def bf: Int => Int => Int = i => v => i + v
// (Int) => (Int) => Int

val fs = (1 to 100).map(bf).toArray
// fs: Array[(Int) => Int] = Array(<function>, <function>, <function>, <function>, <function>, <function>, ...
