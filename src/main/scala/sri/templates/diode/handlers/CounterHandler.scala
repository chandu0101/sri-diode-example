package sri.templates.diode.handlers

import diode.{ActionHandler, ActionResult, ModelRW}
import sri.templates.diode.actions.AppAction
import sri.templates.diode.models.Count
import AppAction._


class CounterHandler[M](modelRW: ModelRW[M, Count]) extends ActionHandler(modelRW) {

  override protected def handle: PartialFunction[Any, ActionResult[M]] = {
    case Increase(i) => updated(value.copy(value.i + i))
    case Decrease(i) => updated(value.copy(value.i - i))
    case Reset => updated(Count(0))

  }
}