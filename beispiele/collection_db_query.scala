trait Person {def first: String }

val d = new Person {def first = "David" }
val e = new Person {def first = "Elwood"}
val a = new Person {def first = "Archer"}

List(d, e, a).map(n => <li>{n.first}</li>)
