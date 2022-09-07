object ObjectsAndCompanions {

  class Person(firstName: String, lastName: String) {
    // fields and methods
  }


  class Kid(name: String, age: Int) {
    def greet(): String = s"Hello, my name is $name and I'm $age years old. Do you like vegetables? ${Kid.LIKES_VEGETABLES} "
  }

  object Kid { // companion object
    private val LIKES_VEGETABLES: Boolean = false

  }

  def main(args: Array[String]): Unit = {

  }

}
