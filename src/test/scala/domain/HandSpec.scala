package com.iservport.concurrency
package domain

import domain.data.{CardFace, CardSuit}

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

class HandSpec extends AnyFreeSpec with Matchers {

  "A Hand" - {

    val cards = Seq.empty

    val hand = Hand(cards)

    "must return a new hand with an added card" in {

      val CB_2 = GameCard(CardSuit.C, CardFace._2)
      hand.add(CB_2) must be(Hand(Seq(CB_2)))
    }
  }
}
