package com.jenkins.messing

class App {
  def doSomething(someString: String): Option[String] = {
    someString match {
      case "Me" => Some("Cool")
      case "You" => Some("Fool")
      case "Them" => Some("Drool")
      case "Us" => Some("Cooler")
      case _ => None
    }
  }
}
