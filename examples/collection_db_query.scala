trait Person {def first: String }

val d = new Person {def first = "German Lord" }
val e = new Person {def first = "Hobbit"}
val a = new Person {def first = "John Grisham"}

List(d, e, a).map(n => <li>{n.first}</li>)

