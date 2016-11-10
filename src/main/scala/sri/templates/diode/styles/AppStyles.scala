package sri.templates.diode.styles

import sri.templates.diode.components.TopNav.styles
import scalacss.Defaults._
import scalacss.internal.mutable.GlobalRegistry

object AppStyles {

  def load() = {
    GlobalRegistry.register(GlobalStyle,
      styles)
    GlobalRegistry.addToDocumentOnRegistration()
  }
}
