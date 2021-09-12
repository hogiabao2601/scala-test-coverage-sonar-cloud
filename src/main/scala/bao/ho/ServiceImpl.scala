package bao.ho

class ServiceImpl extends ServiceAlg {
  override def add(a: Int, b: Int): Int = a + b

  override def minus(a: Int, b: Int): Int = a - b

  override def divide(a: Int, b: Int): Int = {
    if (b == 0 || a == 0) {
      0
    } else {
      a / b
    }
  }
}
