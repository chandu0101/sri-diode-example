package sri.templates.diode.screens

import sri.core._
import sri.diode.ModelProxy
import sri.templates.diode.actions.AppAction
import sri.templates.diode.models.Count
import sri.templates.diode.store.AppCircuit
import sri.templates.diode.styles.GlobalStyle
import sri.web.all._
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.scalacss.Defaults._

object CounterScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[ModelProxy[Count], Unit] {

    def render() = {
      div(className = GlobalStyle.center)(
        h1()(s"Count : ${props().i}"),
        div()(
          button(name = "Increase", onClick = (e: ReactEventH) => AppCircuit.dispatch(AppAction.Increase(2)))(h4()("Increase")),
          button(name = "Increase", onClick = (e: ReactEventH) => AppCircuit.dispatch(AppAction.Decrease(2)))(h4()("Dcrease")),
          button(name = "Increase", onClick = (e: ReactEventH) => AppCircuit.dispatch(AppAction.Reset))(h4()("Reset"))
        )
      )
    }

    override def componentDidMount(): Unit = {
      props.dispatch(AppAction.Reset)
    }
  }


  def apply(p: ModelProxy[Count], key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](p, key = key, ref = ref)
}