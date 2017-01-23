package net.kinzal.controllers

trait TestController extends Controller {

  respond("teach curl") { msg =>
    val conversation = new Conversation(){}
    val dialog = conversation.startDialog(msg, 60000)
    msg.send("URLを教えてください。")
    dialog.addChoice("(.+)", msg =>{
      res.send("next question start.")
    })

  }
}
