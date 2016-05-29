package sri.templates.diode.actions

import diode.data.{Empty, Pot, PotAction}

import scala.concurrent.Future

trait CounterAsyncActions {

  case class IncreaseAsync(i: Int)

  case class DecreaseAsync(i: Int)

  case class UpdateCountAsync(potResult: Pot[Int] = Empty, f: Future[Int]) extends PotAction[Int, UpdateCountAsync] {
    def next(newResult: Pot[Int]) = UpdateCountAsync(newResult, f)
  }

  object ResetAsync

}
