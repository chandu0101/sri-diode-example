package sri.templates.diode.services

import scala.concurrent.Future
import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.util.Failure


object CounterService {

  var count: Int = 0

  def increase(i: Int): Future[Int] = {
    count += i
    Future(count)
  }

  def increaseFail(i: Int): Future[Int] = {
    count += i
    Future.failed(new Exception("yeah...."))
  }

  def decrease(i: Int): Future[Int] = {
    count -= i
    Future(count)
  }

  def reset: Future[Int] = {
    count = 0;
    Future(count)
  }

}
