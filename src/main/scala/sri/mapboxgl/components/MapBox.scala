package sri.mapboxgl.components

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.components._
import sri.mobile.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class MapBox(key: U[String] = undefined,
                  style: U[js.Any] = undefined,
                  ref: U[MapBoxM => _] = undefined,
                  accessToken: String,
                  styleURL: String
                   ) {


  def apply() = {
    val props = JSMacro[MapBox](this)
    val mapbox = load[js.Dynamic]("react-native-mapbox-gl")
    React.createElement(mapbox, props)
  }

}

@js.native
trait MapBoxM extends js.Object