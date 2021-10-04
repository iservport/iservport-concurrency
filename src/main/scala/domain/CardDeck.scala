package com.iservport.concurrency
package domain

import domain.data.{CardFace, CardSuit}

import scala.util.Random

case class CardDeck(cards: Seq[GameCard])

object CardDeck {

  def apply(): CardDeck = CardDeck(shuffle())

  val all: Array[GameCard] = {
    for {
      faces <- CardFace.values()
      suits <- CardSuit.values()
    } yield {
      GameCard(suits, faces)
    }
  }

  def shuffle(): Seq[GameCard] = Random.shuffle(all.toSeq)
}
