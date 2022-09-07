class Test {

  def main(args: Array[String]): Unit = {
    val e1 = Employee(101, "Devin", 180000, 'm', 11);
    println("empno:" + e1.empno, "ename:" + e1.ename, "sal:" + e1.sal, "gender:" + e1.gender, "dno:" + e1.dno)
    val e2 = Employee(102, "Isabel", 180000, 'f', 12);
    println("empno:" + e2.empno, "ename:" + e2.ename, "sal:" + e2.sal, "gender:" + e2.gender, "dno:" + e2.dno)
    val e3 = Employee(103, "Luna", 180000, 'f', 13);
    println("empno:" + e3.empno, "ename:" + e3.ename, "sal:" + e3.sal, "gender:" + e3.gender, "dno:" + e3.dno)

  }

}
