package sri.templates.diode.components

import sri.scalacss.Defaults._
import sri.templates.diode.routes.AppRouter
import sri.templates.diode.routes.AppRouter.{CounterPage, HomePage}
import sri.templates.diode.styles.Colors
import AppRouter.{CounterPage, HomePage}
import sri.web.all._
import sri.web.router
import sri.web.router.{WebRouterComponent, WebStaticPage}
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}
import scalacss.Defaults._


object TopNav {

  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      div(className = styles.navMenu)(
        getStaticItem("Home", HomePage),
        getStaticItem("Counter", CounterPage)
      )
    }

    def getStaticItem(text: String, page: WebStaticPage, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
      Button(style = styles.menuItem(page == currentRoute.page),
        onPress = () => navigateTo(page, query = query, state = state))(
          span()(text)
        )
    }

  }

  object styles extends StyleSheet.Inline {

    import dsl._

    val navMenu = style(display.flex,
      flexDirection.row,
      alignItems.center,
      backgroundColor := Colors.gold,
      margin.`0`,
      paddingLeft(40 px))

    val menuItem = styleF.bool(selected => {
      styleS(padding(20.px),
        fontSize :=! "1.5em",
        cursor.pointer,
        color := "rgb(244, 233, 233)",
        marginLeft := "10px",
        marginRight := "10px",
        mixinIfElse(selected)(backgroundColor := Colors.darkGold,
          fontWeight._500)(backgroundColor := Colors.transparent,
            fontWeight.normal)
      )
    })


  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.contextTypes = router.routerContextTypes


  def apply(ref: js.UndefOr[String] = "", key: js.Any = {}) = createElementNoProps(ctor)

}

