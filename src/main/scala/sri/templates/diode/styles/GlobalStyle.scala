package sri.templates.diode.styles

import scalacss.Defaults._
import sri.scalacss.Defaults._

import scalacss.ext.CssReset

object GlobalStyle extends StyleSheet.Inline {

  import dsl._

  val horizontal = style(display.flex, flexDirection.row)

  val vertical = style(display.flex, flexDirection.column)

  val wholeContainer = style(vertical, flex := "1")

  val center = style(vertical,
    flex := "1",
    justifyContent.center,
    alignItems.center)
  

}
