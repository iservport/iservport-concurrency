package com.iservport.concurrency

import domain.Game

object Application extends App {

  val game = Game.newGame

  println("Game start")

  if (recurse(game).isOver) System.exit(0)

  def recurse(game: Game): Game =
    if(game.isOver) {
      println("GAME OVER!")
      game
    }
    else {
      println("You are player "+game.round.getColorName)
      println("Pick one card from the table")
      val index = scala.io.StdIn.readInt()
      val nextGame = game.play(index)
      println("Game is ")
      println("Black cards are: "+nextGame.playerBlack.hand)
      println("Red cards are: "+nextGame.playerRed.hand)
      println("Next player is "+nextGame.round.getColorName)
      recurse(nextGame)
    }
}
