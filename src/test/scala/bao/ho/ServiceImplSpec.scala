package bao.ho

import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class ServiceImplSpec extends AsyncFlatSpec with Matchers {

  val service = new ServiceImpl
  "function add" should "return add 2 value" in {
    val result = service.add(1, 1)
    result shouldBe 2
  }

  "function minus" should "return minis 2 value" in {
    val result = service.minus(2, 1)
    result shouldBe 1
  }

}
