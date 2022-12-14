package com.jenkins.messing

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AppSpec extends AnyFlatSpec with Matchers with OptionValues {
  "An App" should "know me" in {
    val app = new App
    val result = app.doSomething("Me")
    result.value should equal ("Cool")
  }
  "An App" should "know you" in {
    val app = new App
    val result = app.doSomething("You")
    result.value should equal ("Fool")
  }
  "An App" should "know us" in {
    val app = new App
    val result = app.doSomething("Us")
    result.value should equal ("Cooler")
  }
}
