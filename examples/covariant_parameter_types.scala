class Getable[+T](val data: T)
def get(in: Getable[Any]) {println("It's "+in.data)}
val gs = new Getable("String")
