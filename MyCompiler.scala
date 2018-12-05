package edu.towson.cosc.cosc455.akerr3

object MyCompiler {
  //check args
  //check file extension
  //initialization
  //get first token
  //call start state

  val currentToken : String = ""

  def main(args: Array[String]): Unit =
  {
    //check if an input file is provided
    if(args.length == 0) {
      //usage error
      println("USAGE ERROR: Must provide an input file.")
      System.exit(0)
    }

    if(!checkFilenameExtension(args(0))){
      //usage error
      println("USAGE ERROR: Must provide an input file.")
      System.exit(0)
    }

    val Scanner = new MyLexicalAnalyzer
    val Parser = new MySyntaxAnalyzer

    setCurrentToken(Scanner.getNextToken())

    Parser.gittex()

  }

  def checkFilenameExtension(filename : String) : Boolean = filename.endsWith(".gtx")


  def getCurrentToken() : String = this.currentToken
  def setCurrentToken(t : String) : Unit = this.currentToken

}
