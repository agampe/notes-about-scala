def w42(f: Int => String) = f(42)
// w42: ((Int) => String)String

//fm nimmt einen Int als Input und gibt String zurueck
def fm(i: Int): String = "fm:" + i
// def fm(i: Int): String = "fm:" + i

// nun erstellen wir eine Funktion, die w42 uebergeben wird und als Ergebnis die Rueckgabe von Funkion fm hat
w42((i: Int) => fm(i))
// String = fm:42
