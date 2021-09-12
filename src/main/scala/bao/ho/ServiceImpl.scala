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

  override def multi(a: Int, b: Int): Int = a * b

  def run(a: Int, b: Int): Int = {
    (add(a, _))
      .andThen(minus(3, _))
      .andThen(multi(3, _))
      .andThen(minus(3, _))
      .andThen(add(3, _))
      .andThen(multi(3, _))
      .andThen(divide(3, _))
      .andThen(add(3, _))
      .andThen(multi(3, _))
      .andThen(minus(3, _))
      .andThen(add(3, _))
      .andThen(minus(3, _))
      .andThen(minus(3, _))
      .andThen(divide(3, _))
      .andThen(add(3, _))
      .andThen(multi(3, _))
      .andThen(minus(3, _))
      .andThen(add(3, _))
      .andThen(minus(3, _))
      .andThen(minus(3, _))
      .apply(b)
  }

  def run2(a: Int, b: Int): Int = {
    (add(a, _))
      .andThen(minus(3, _))
      .andThen(multi(3, _))
      .andThen(minus(3, _))
      .andThen(add(3, _))
      .andThen(multi(3, _))
      .andThen(divide(3, _))
      .andThen(add(3, _))
      .andThen(multi(3, _))
      .andThen(minus(3, _))
      .andThen(add(3, _))
      .andThen(minus(3, _))
      .andThen(minus(3, _))
      .andThen(divide(3, _))
      .andThen(add(3, _))
      .andThen(multi(3, _))
      .andThen(minus(3, _))
      .andThen(add(3, _))
      .andThen(minus(3, _))
      .andThen(minus(3, _))
      .apply(b)
  }
}
