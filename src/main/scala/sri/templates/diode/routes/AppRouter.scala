package sri.templates.diode.routes

import sri.core.ReactElement
import sri.templates.diode.components.TopNav
import sri.templates.diode.screens.{CounterScreen, HomeScreen}
import sri.templates.diode.store.AppCircuit
import sri.templates.diode.styles.GlobalStyle
import sri.templates.diode.screens.CounterScreen
import sri.universal.styles.UniversalStyleSheet
import sri.web.router._
import sri.web.vdom.htmltags._

import scala.scalajs.js.{UndefOr => U, undefined}
import scalacss.Defaults._
import sri.scalacss.Defaults._

object AppRouter {

  object HomePage extends WebStaticPage

  object CounterPage extends WebStaticPage

  object CounterAsyncPage extends WebStaticPage

  object config extends WebRouterConfig {
    override val history: History = HistoryFactory.browserHistory()

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, (route: WebRoute) => HomeScreen())

    staticRoute(CounterPage, "counter", (route: WebRoute) => AppCircuit.connect(_.count)(CounterScreen(_)))

    override def renderScene(route: WebRoute): ReactElement = {
      div(className = GlobalStyle.wholeContainer)(
        TopNav(),
        super.renderScene(route)
      )
    }

    override val notFound = WebRouteNotFound(HomePage)
  }

  val router = WebRouter(config)
}
