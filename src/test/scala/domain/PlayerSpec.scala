package com.iservport.concurrency
package domain

import domain.data.{CardColour, CardFace, CardSuit}

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

class PlayerSpec extends AnyFreeSpec with Matchers {

  "A Player" - {

    val player = Player(CardColour.B)

    val (black: Seq[GameCard], red: Seq[GameCard])  = CardDeck().cards.partition(_.colour == CardColour.B)

    "must be able to pick a card of the same colour" in {

      player.pick(1, black.toBuffer).map(_.colour) must be(Some(CardColour.B))
    }

    "must not be able to pick a card of a different colour" in {

      player.pick(1, red.toBuffer) must be(None)
    }

    "must return a new player with an added card" in {

      val CB_2 = GameCard(CardSuit.C, CardFace._2)
      player.add(CB_2).hand must be(Hand(Seq(CB_2)))
    }

  }
}
