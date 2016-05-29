package sri.templates.diode.actions

trait TodoActions {

  case object InitTodos

  case class AddTodo(todo : String)

  case class UpdateTodo()

}
