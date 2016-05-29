package sri.templates.diode.styles

import sri.templates.diode.components.TopNav
import sri.templates.diode.components.TopNav.styles

import scalacss.Defaults._
import sri.scalacss.Defaults._

import scalacss.mutable.GlobalRegistry

object AppStyles {

  def load() = {
    GlobalRegistry.register(GlobalStyle,
      styles)
    GlobalRegistry.addToDocumentOnRegistration()
  }
}
