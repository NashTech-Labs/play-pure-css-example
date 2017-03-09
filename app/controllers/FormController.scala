package controllers

import javax.inject._

import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class FormController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def inlineForm=Action{
    Ok(views.html.inlineform("Template design for Inline Form Using Pure.css"))
  }

  def stackedForm=Action{
    Ok(views.html.stackedform("Template design for Stacked Form Using Pure.css"))
  }

  def alignedForm=Action{
    Ok(views.html.alignedform("Template design for Aligned Form Using Pure.css"))
  }

  def multicolForm=Action{
    Ok(views.html.multicolform("Template design for Aligned Form Using Pure.css"))
  }

}
