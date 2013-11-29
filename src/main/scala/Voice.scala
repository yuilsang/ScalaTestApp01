import java.lang.reflect.Method

/**
 * Created with IntelliJ IDEA.
 * User: ilzzang
 * Date: 2013. 11. 29.
 * Time: 오후 3:37
 * To change this template use File | Settings | File Templates.
 */
class Voice[T >: Null](instance:T) {
  var obj:T = instance

  def say = {
    val method: Method = obj.getClass.getMethod("say", classOf[String])
    method.invoke(obj, "111")
  }
}
