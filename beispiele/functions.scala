// erstellen eine Funktion und weisen dieser einer Variable zu
val f: Int => String = x => "Dude: "+x
// f: (Int) => String = <function>

// rufen eine Methode auf dieser Methode auf
f.toString
// java.lang.String = <function>

// nun vergleichen wir Methoden
f == f

f(24)
