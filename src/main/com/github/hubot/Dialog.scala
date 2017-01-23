package com.github.hubot

import scala.scalajs.js
import js.annotation._

@ScalaJSDefined
trait Dialog extends js.Object {
  def timeout(callback: Message => Unit): Unit;
  def addChoice(pattern: js.RegExp, callback: js.Function1[Message, Unit]): Unit;
}
