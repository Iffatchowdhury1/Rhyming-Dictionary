package rhymes

import scala.io.Source


object RhymingDictionary {

  def findRhymes(dictionaryFilename: String, word: String): List[String] = {
    var fin: List[String] = List()
    var syb = List("AA0", "AA1", "AA2", "AE0", "AE1", "AE2", "AH0", "AH1", "AH2", "AO0", "AO1", "AO2", "AW0", "AW1", "AW2",
      "AY0", "AY1", "AY2", "EH0", "EH1", "EH2", "ER0", "ER1", "ER2", "EY0", "EY1", "EY2", "IH0", "IH1", "IH2",
      "IY0", "IY1", "IY2", "JH0", "JH1", "JH2", "OW0", "OW1", "OW2", "OY0", "OY1", "OY2", "UH0", "UH1", "UH2", "UW0", "UW1", "UW2")
    var b: List[String] = getSounds(dictionaryFilename: String, word: String)
    var c: List[String] = List()
    val f = Source.fromFile(dictionaryFilename)
    var fLine = f.getLines
    for (line <- fLine) {
      var part = line.split("  ")
      if(part.length==2 && b != List()) {
        c = part(1).split(" ").toList
        if(b.length == 1){
          if(syb.contains(c.last)&& c.last.head == b.last.head && c.last.dropRight(1).last == b.last.dropRight(1).last){
            fin = fin :+ part(0)
          }
        }
        else if(syb.contains(c.last)){
          if(c.last.head == b.last.head && c.last.dropRight(1).last == b.last.dropRight(1).last){
            fin = fin :+ part(0)
          }
        }
        else if(syb.contains(c.dropRight(1).last)){
          var cc = c.dropRight(1)
          var bb = b.dropRight(1)
          if(cc.last.head == bb.last.head && cc.last.dropRight(1).last == bb.last.dropRight(1).last && c.last == b.last){
            fin = fin :+ part(0)
          }
        }
        else if(b.length > 2 &&  syb.contains(b.dropRight(2).last)){
          var cccc = c.dropRight(3)
          var bbbb = b.dropRight(3)
          var ccc = c.dropRight(2)
          var bbb = b.dropRight(2)
          var cc = c.dropRight(1)
          var bb = b.dropRight(1)
          if(syb.contains(c.dropRight(2).last)){
            if(ccc.last.head == bbb.last.head && ccc.last.dropRight(1).last == bbb.last.dropRight(1).last && c.dropRight(1).last == b.dropRight(1).last && c.last == b.last)
              fin = fin :+ part(0)
          }
        }
        else if(c.last == b.last && c.dropRight(1).last == b.dropRight(1).last && c.dropRight(2).last == b.dropRight(2).last && c.dropRight(3).last.head == b.dropRight(3).last.head && c.dropRight(3).last.dropRight(1).last == b.dropRight(3).last.dropRight(1).last){
          fin = fin :+ part(0)
        }

        else{
          List()
        }







      }




    }


    f.close()
    fin
  }































  def getSounds(dictionaryFilename: String, word: String): List[String] = {
    var b: List[String] = List()
    val f = Source.fromFile(dictionaryFilename)
    var fLine = f.getLines
    for(line <- fLine ){
      var part = line.split("  ")
      if(part(0) == word){
        b = part(1).split(" ").toList
      }
    }
    f.close()
    b
  }








  def isRhymeSounds(xlist: List[String], ylist: List[String]): Boolean= {
    var revx = xlist.reverse
    var revy = ylist.reverse
    var syb = List("AA0", "AA1", "AA2", "AE0", "AE1", "AE2", "AH0", "AH1", "AH2", "AO0", "AO1", "AO2", "AW0", "AW1", "AW2",
      "AY0", "AY1", "AY2", "EH0", "EH1", "EH2", "ER0", "ER1", "ER2", "EY0", "EY1", "EY2", "IH0", "IH1", "IH2",
      "IY0", "IY1", "IY2", "JH0", "JH1", "JH2", "OW0", "OW1", "OW2", "OY0", "OY1", "OY2", "UH0", "UH1", "UH2", "UW0", "UW1", "UW2")
    if (revx(0).head == revy(0).head && syb.contains(revx(0)) && (revx(0).dropRight(1).last == revy(0).dropRight(1).last) ) {
      true
    }
    else if((revx(1).head == revy(1).head && syb.contains(revx(1)) && (revx(1).dropRight(1).last == revy(1).dropRight(1).last) )) {
      if(revx(0) == revy(0)){
        true
      }
      else{
        false
      }

    }
    else{
      if(revx(0) == revy(0) && revx(1) == revy(1)) {
        true
      }
      else{
        false
      }
    }



  }

  def isRhyme(dictionaryFilename:String, word1: String, word2:String): Boolean ={
    var b:List[String] = getSounds(dictionaryFilename:String, word1: String)
    var c:List[String] = getSounds(dictionaryFilename: String, word2: String)
    if(c == List() || b == List()){
      false
    }
    else if (isRhymeSounds(b: List[String], c: List[String])== true){
      true
    }
    else if(isRhymeSounds(b: List[String], c: List[String])!= true){
      false
    }
    else{
      false
    }
  }













  def main(args: Array[String]): Unit = {
    val dictionaryFilename: String = "data/cmudict-0.7b"

  }

}