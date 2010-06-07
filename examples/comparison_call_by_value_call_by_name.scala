def loop: Int = loop

def constOne(x: Int, y: => Int) = 1

constOne(1, loop)  // 1
constOne(loop, 1)  // infty loop
