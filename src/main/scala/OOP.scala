object OOP extends App {

  class Animal {
    // def fields
    val age: Int = 0

    // def methods
    def eat() = println("I'm eating")

  }

  val anAnimal = new Animal

  // inheritance

  class Dog(val name: String) extends Animal {

  }

  val aDog = new Dog("Lassie")

  aDog.eat()

  val myAnimal: Animal = new Dog("Devin")

  myAnimal.eat()

  // case classes = lightweight data structures

  case class Person(name: String, age: Int)

  val bob = Person("Bob", 54)

  println(bob.name)

  // exceptions

  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => "Some faulty error message."
  } finally {
    // executes code no matter what
  }


}
