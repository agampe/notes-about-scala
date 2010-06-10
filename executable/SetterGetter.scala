class Person (val id:Int,
              var firstName:String,
              var lastName:String,
              var age:Int) {}

object SetterGetter extends Application{
  val justMe = new Person(1, "Matthias", "Guenther", 24)
  println(justMe.firstName)
  justMe.firstName = "Matze"
  println(justMe.firstName)
}

