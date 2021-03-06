package exercises

import org.scalatest.FlatSpec

import Collections._

/**
 * These tests are taken from ScalaLabs:
 * 		https://github.com/scala-labs/scala-labs/blob/master/labs/src/test/scala/org/scalalabs/basic/lab02/
 */

class CollectionsTest extends FlatSpec {

  val listOfStrings: List[String] = List("One", "Two", "Three")

  "Collections" should "get first Element in list" in {
    val result: String = firstElementInList(listOfStrings)
    "One" === result
  }


  it should "calculate sum of list" in {
    15 === sumOfList(List(1, 2, 3, 4, 5))
  }

  it should "get last element in list" in {
    "Three" === lastElementInList(listOfStrings)
    9 === lastElementInList(List(1, 6, 10, 33, 54, 9))
  }

  it should "get nth element in list" in {
    "One" === nthElementInList(0, listOfStrings)
    "Two" === nthElementInList(1, listOfStrings)
    "Three" === nthElementInList(2, listOfStrings)
  }

  it should "concat two lists" in {
    List("One", "Two", "Three", "Four", "Five") === concatLists(listOfStrings, List("Four", "Five"))
  }

  it should "sort list of strings" in {
    val l = List("Sjors", "Arjan", "Age", "Lieke", "J-Fall", "ScalaLabs")
    List("Age", "Arjan", "J-Fall", "Lieke", "ScalaLabs", "Sjors") === sortList(l)
  }

  it should "contains One Two And Three" in {
    elementExists(listOfStrings, "One")
    elementExists(listOfStrings, "Two")
    elementExists(listOfStrings, "Three")
  }

  it should "get list contains two odd elements" in {
    List(1, 3, 5) === oddElements(List(1, 2, 3, 4, 5))
  }

  it should "get tails of list" in {
    List(List(1, 2, 3, 4, 5), List(2, 3, 4, 5), List(3, 4, 5), List(4, 5), List(5), List()) === tails(List(1, 2, 3, 4, 5))
  }
  
}
