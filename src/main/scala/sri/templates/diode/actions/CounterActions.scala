package sri.templates.diode.actions

import diode.data.{Empty, Pot, PotAction}

import scala.concurrent.Future

trait CounterActions {

  case class Increase(i: Int)

  case class Decrease(i: Int)

  object Reset

}
