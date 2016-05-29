package sri.templates.diode.store

import diode.Circuit
import diode.data.Empty
import sri.diode.ReactConnector
import sri.templates.diode.handlers.CounterHandler
import sri.templates.diode.models.{AppModel, Count}


object AppCircuit extends Circuit[AppModel] with ReactConnector[AppModel] {

  override protected def initialModel: AppModel = AppModel(Count(0), Empty)

  override protected def actionHandler: AppCircuit.HandlerFunction = composeHandlers(new CounterHandler[AppModel](zoomRW(_.count)((m, v) => m.copy(count = v))))
}




