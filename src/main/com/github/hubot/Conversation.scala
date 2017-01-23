package com.github.hubot

import scala.scalajs.js
import js.annotation._

@ScalaJSDefined
trait Conversation extends js.Object {
  def startDialog(msg: Message, timeout: js.Integer): Dialog;
}
