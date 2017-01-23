package net.kinzal.controllers

import com.github.hubot.{Dialog, Conversation}

trait TestController extends Controller {

  respond("teach curl") { msg =>
    val conversation = new Conversation(){}
    val dialog = conversation.startDialog(msg, 60000)
    msg.send("URLを教えてください。")
    dialog.addChoice("(.+)", msg2 =>{
      msg2.send("next question start.")
    })

  }
}
