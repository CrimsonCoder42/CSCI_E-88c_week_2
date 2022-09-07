object MapAndFilter {

  val lst = List(1,2,3,5,7,10,13)
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

  def main(args: Array[String]): Unit = {
    println(lst);
    println(lst.map(_ * 2));
  }

}
