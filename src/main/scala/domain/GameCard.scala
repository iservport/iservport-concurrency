package com.iservport.concurrency
package domain

import domain.data.{CardFace, CardSuit}

import scala.language.postfixOps

case class GameCard(suit: CardSuit, face: CardFace) extends Ordered[GameCard] {

  val colour = suit.getColour

  val id: String = s"$suit$colour${face}"

  def isNumeric: Boolean = face.isNumeric

  override def toString: String = id

  override def compare(that: GameCard): Int = this.id compare that.id
}
