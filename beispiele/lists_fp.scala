val list1 = List("Programming", "Scala")
val list2 = "People" :: "should" :: "read" :: list1
val list2 = ("People" :: ("should" :: ("read" :: list1)))
val list2 = list1.::("read").::("should").::("People")
println(list2)

