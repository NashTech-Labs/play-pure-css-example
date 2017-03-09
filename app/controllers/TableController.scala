package controllers

import play.api.mvc.{Action, Controller}

class TableController extends Controller{

  def table=Action{
    Ok(views.html.tabledesign(""))
  }

}
