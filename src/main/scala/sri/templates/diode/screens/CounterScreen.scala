package sri.templates.diode.screens

import sri.core._
import sri.diode.ModelProxy
import sri.templates.diode.actions.Action
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
          button(name = "Increase", onClick = (e: ReactEventH) => AppCircuit.dispatch(Action.Increase(2)))(h4()("Increase")),
          button(name = "Increase", onClick = (e: ReactEventH) => AppCircuit.dispatch(Action.Decrease(2)))(h4()("Dcrease")),
          button(name = "Increase", onClick = (e: ReactEventH) => AppCircuit.dispatch(Action.Reset))(h4()("Reset"))
        )
      )
    }

    override def componentDidMount(): Unit = {
      props.dispatch(Action.Reset)
    }
  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(p: ModelProxy[Count], key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, p, key = key, ref = ref)
}