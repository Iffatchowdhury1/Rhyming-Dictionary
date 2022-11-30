package tests

import org.scalatest._
import rhymes.RhymingDictionary

class TestIsRhymeSounds extends FunSuite {


  test("check for rhyming sound lists") {
    assert(true == RhymingDictionary.isRhymeSounds(List("AH0"), List("AH0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("TH", "AW1", "Z", "D", "N", "AH0"), List("D", "AY1", "M", "D", "N", "AH0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("HH", "AE1", "F"), List("F", "OW1", "T", "AH0", "G", "R", "AE2", "F")))
    assert(true == RhymingDictionary.isRhymeSounds(List("TH", "AW1", "Z", "AH0", "N", "D"), List("D", "AY1", "M", "AH2", "N", "D") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("S", "T", "AE1", "F"), List("L", "AE1", "F")))
    assert(true == RhymingDictionary.isRhymeSounds(List("F", "OW1", "T", "AH0", "G", "R", "AE2", "F"), List("HH", "AE1", "F")))
    assert(true == RhymingDictionary.isRhymeSounds(List("F", "OW1", "T", "AH0", "G", "R", "AE2", "F"), List("HH", "AE1", "F")))
    assert(true == RhymingDictionary.isRhymeSounds(List("AE1", "OW1","AH0"), List("AE1", "OW1", "AH0") ))

    assert(true == RhymingDictionary.isRhymeSounds(List("M", "IH0", "S", "IH0", "M", "P", "R", "EH1", "SH", "AH0", "N"), List("M", "IH2", "S", "IH0", "N", "F", "ER0", "M", "EY1", "SH", "AH0", "N") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("M", "IH0", "S", "S", "P", "EH1", "L", "IH0", "NG"), List("M", "IH0", "S", "S", "P", "EH1", "N", "D", "IH0", "NG") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("R", "AO1", "R", "B", "AW0"), List("R", "AO1", "R", "B", "AW0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("EY2", "EY1"), List("T", "R", "IH2", "P", "AH0", "L", "EY1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("AE1", "B", "AH0", "T"), List("AE1", "B", "AH0", "T") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("AE0", "B", "EH1", "R", "AH0", "N", "T"), List("AE0", "B", "HH", "AO1", "R", "AH0", "N", "T") ))

    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "AA0"), List("ER1", "R", "AA0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "AE0"), List("ER1", "R", "AE0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "AH0"), List("ER1", "R", "AH0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "AO1"), List("ER1", "R", "AO1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "AW2"), List("ER1", "R", "AW2") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "AY1"), List("ER1", "R", "AY1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "EH0"), List("ER1", "R", "EH0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "ER0"), List("ER1", "R", "ER0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "EY2"), List("ER1", "R", "EY2") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "IH1"), List("ER1", "R", "IH1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "IY1"), List("ER1", "R", "IY1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "JH0"), List("ER1", "R", "JH0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "OW0"), List("ER1", "R", "OW0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "OY0"), List("ER1", "R", "OY0") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "UH1"), List("ER1", "R", "UH1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("ER1", "L", "UW2"), List("ER1", "R", "UW1") ))
    assert(true == RhymingDictionary.isRhymeSounds(List("AE0", "B", "EH1", "R", "AH0", "N", "D", "T"), List("AE0", "B", "HH", "AO1", "R", "AH0", "N", "D", "T") ))



    assert(false == RhymingDictionary.isRhymeSounds(List("D", "IH0", "F", "AY1", "N"), List("R", "AY1", "M")))
    assert(false == RhymingDictionary.isRhymeSounds(List("R", "AY1", "M"),List("D", "IH0", "F", "AY1", "N")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D"), List("D", "AY1", "M", "AH0", "N", "D", "Z")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "Z"), List("D", "AY1", "M", "AH0", "N", "D")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "A"), List("D", "AY1", "M", "AH0", "N", "D")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "A"), List("D", "AY1", "M", "AH0", "N", "E")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "E"), List("D", "AY1", "M", "AH0", "N", "A")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "Y"), List("D", "AY1", "M", "AH0", "N", "I")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "I"), List("D", "AY1", "M", "AH0", "N", "O")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0", "N", "D", "O"), List("D", "AY1", "M", "AH0", "N", "U")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AW0", "U"), List("D", "AY1", "M", "AH0", "U")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D", "AY1", "M", "AH0"), List("D", "AY1", "M", "AY0")))
    assert(false == RhymingDictionary.isRhymeSounds(List("AA1", "D"), List("AE2", "T")))
    assert(false == RhymingDictionary.isRhymeSounds(List("D","AE1"), List("T", "AA1")))






  }


}

class TestGetSounds extends FunSuite {
  test("check for rhyming sound parts") {
    assert(List("AA1", "K", "AH0", "N", "ER0") == RhymingDictionary.getSounds("data/cmudict-0.7b", "AACHENER"))
    assert(List("AA1", "K", "AH0", "N") == RhymingDictionary.getSounds("data/cmudict-0.7b", "AACHEN"))
    assert(List() == RhymingDictionary.getSounds("data/cmudict-0.7b", "ALWEDF"))
  }
}



class TestIsRhyme extends FunSuite {
  test("check for rhyming sound parts of two") {

    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "HALF", "PHOTOGRAPH" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ABINGDON", "ABINGTON" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ABBY", "ABC" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ACCOUTERMENT", "ACCOUTREMENT" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ADELIZZI", "ADELIZZI" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ADELL", "ADELLE" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "REED'S", "REEDS" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "REIGNING", "REIGNITING" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "REILLEY", "REILLY" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "TRANSFUSIONS", "TRANSFORMATIONS" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "TRANSFORMATIONAL", "TRANSITIONAL" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "TRANSITORY", "BOROWSKY" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "BOROWY", "BOROWSKY" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "BRANDENBERGER", "BRANDENBURGER" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "BROGDEN", "BROGDON" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "BUNDY'S", "BUNDYS" ))




    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "BUREAUCRACIES", "BUREAUCRACY'S" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "CANADIAN'S", "CANADIANS'" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "CANNISTRARO", "CANNIZZO" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "CANOGA", "CANOLA" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "MURPHEY", "MURPHREE" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "MUSTO", "MUSTOE" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "NAOMI", "NAOKI" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "OBENCHAIN", "OBENSHAIN" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "OJALA", "OJEDA" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "OLEJNICZAK", "OLEKSIAK" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ONE-UP-MANSHIP", "ONE-UPMANSHIP" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "PALMERINO", "PALMERO" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "PALOMETA", "PALOMITA" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "PATRICK'S", "PATRICKS" ))
    assert(true == RhymingDictionary.isRhyme("data/cmudict-0.7b", "PRESCRIPTIONS", "PRESENTATIONS" ))

    assert(false == RhymingDictionary.isRhyme("data/cmudict-0.7b", "MUSCARELLA", "MUSCARELLO" ))














    assert(false == RhymingDictionary.isRhyme("data/cmudict-0.7b", "ABOYRBN", "ABINGTON" ))
    assert(false == RhymingDictionary.isRhyme("data/cmudict-0.7b", "GOD", "ABINGTON" ))
    assert(false == RhymingDictionary.isRhyme("data/cmudict-0.7b", "CRAPEN", "SPACE" ))
    assert(false == RhymingDictionary.isRhyme("data/cmudict-0.7b", "GODDING", "SPACING" ))
  }

}