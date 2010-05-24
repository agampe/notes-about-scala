class FancyString(val str: String)

object FancyString2RichString {
    implicit def fancyString2RichString(fs: FancyString) =
        new RichString(fs.str)
}

import FancyString2RichString._

val fs = new FancyString("scala")
println(fs.capitalize.reverse)

