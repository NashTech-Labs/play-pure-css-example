package controllers

import play.api.mvc.{Action, Controller}

class ButtonController extends Controller{

  def defaultButton=Action{
    Ok(views.html.button("Template with button designs"))
  }
}
