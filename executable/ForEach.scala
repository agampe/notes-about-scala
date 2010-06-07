object ForEach extends Application{
  var my_list = List("Test1", "Test2", "Test3", 1)
  my_list.foreach(elem => println(elem))
  //  my_list.foreach((elem: Int) => println(elem)) funzt nicht
  my_list.foreach((elem: Any) => println(elem)) // funzt
  
  List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }  
}

