package sri.mapboxgl

import sri.mapboxgl.router.AppRouter
import sri.mobile.ReactNative
import sri.mobile.all._
import scala.scalajs.js.JSApp


object MobileApp extends JSApp {

  def main() = {

    val root = createMobileRoot(
      AppRouter.router
    )
    ReactNative.AppRegistry.registerComponent("SriMapBoxGL", () => root)
  }
}
