package com.iservport.concurrency
package domain

import domain.data.{CardFace, CardSuit}

import scala.language.postfixOps

case class GameCard(suit: CardSuit, face: CardFace) extends Ordered[GameCard] {

  val colour = suit.getColour

  val getPrefix: String = s"$suit$colour"

  val getId: String = s"$suit$colour${face}"

  def isNumeric: Boolean = face.isNumeric

  override def toString: String = getId

  override def compare(that: GameCard): Int = this.getId compare that.getId
}
