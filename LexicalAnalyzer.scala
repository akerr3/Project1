package edu.towson.cosc.cosc455.akerr3

trait LexicalAnalyzer {
  def addChar() : Unit
  def getChar() : Char
  def getNextToken() : String
  def lookup() : Boolean
}