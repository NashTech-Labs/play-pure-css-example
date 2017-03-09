package controllers

import play.api.mvc.{Action, Controller}

class GridController extends Controller{

  def simpleGrid=Action{
    Ok(views.html.simplegrid(""))
  }

}

