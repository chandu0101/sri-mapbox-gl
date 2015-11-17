package sri.mapboxgl.components

import org.scalajs.dom
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.ScalaJSDefined


object HelloSriMobile {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
        MapBox(
          style = styles.map,
          accessToken = "your access token",
          styleURL = "asset://styles/dark-v8.json")()
      )
    }
  }

  object styles extends UniversalStyleSheet {

    val container = style(flexOne)
    val map = style(
      flexOne,
      alignSelf.stretch
    )

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply() = createElementNoProps(ctor)

}

