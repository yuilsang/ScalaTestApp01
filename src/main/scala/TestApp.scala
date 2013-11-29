/**
 * Created with IntelliJ IDEA.
 * User: ilzzang
 * Date: 2013. 11. 29.
 * Time: 오후 1:27
 * To change this template use File | Settings | File Templates.
 */
object TestApp {
  def main(args: Array[String]){
    val hello = new People
    val test = new Voice(hello)
    test.say
    test.obj.say

    val mung = new Animal
    val test2 = new Voice(mung)
    test2.say
    test2.obj.say
  }
}
