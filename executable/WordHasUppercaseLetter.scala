object WordHasUppercaseLetter extends Application{
  val name = "imupperString"
  println(name.exists(_.isUpperCase))
}

/*

// the ugly Java-Variant
boolean nameHasUpperCase = false;
for (int i = 0; i < name.length(); ++i) {
    if (Character.isUpperCase(name.charAt(i))) {
        nameHasUpperCase = true;
        break;
    }
}
*/
