package sri.templates.diode

import org.scalajs.dom
import sri.templates.diode.routes.AppRouter
import sri.templates.diode.styles.AppStyles
import sri.web.ReactDOM

import scala.scalajs.js.Dynamic.{global => g, literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {
    AppStyles.load()
    ReactDOM.render(AppRouter.router, dom.document.getElementById("app"))
  }

}
