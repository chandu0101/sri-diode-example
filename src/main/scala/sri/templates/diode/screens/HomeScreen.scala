package sri.templates.diode.screens

import sri.core._
import sri.templates.diode.styles.GlobalStyle
import sri.universal.components._
import sri.web.all._
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scalacss.Defaults._
import sri.scalacss.Defaults._

object HomeScreen {

  val Component = () => {
    h1(className = GlobalStyle.center)("Welcome to Sri Diode Example :) ")
  }

  def apply() = createStatelessFunctionElementNoProps(Component)

}
