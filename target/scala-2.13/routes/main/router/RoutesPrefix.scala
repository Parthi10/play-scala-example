// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pcadmin/git/play-scala-example/conf/routes
// @DATE:Sat Nov 23 18:13:14 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
