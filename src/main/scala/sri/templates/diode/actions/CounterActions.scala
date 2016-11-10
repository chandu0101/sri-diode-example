package sri.templates.diode.actions

import diode.Action

trait CounterActions {

  case class Increase(i: Int) extends Action

  case class Decrease(i: Int) extends Action

  object Reset extends Action

}
