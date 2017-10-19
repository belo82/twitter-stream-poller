package eu.limebox.twitterstreampoller


object Main extends App {

  case class Config(foo: String = "", xyz: Boolean = false)

  val parser = new scopt.OptionParser[Config]("twitter-stream-poller") {
    head("twitter-stream-poller", "0.1-SNAPSHOT")
//    For now we don't need any command line arguments

//    opt[String]('f', "foo").required().valueName("<api_key>").text("Twitter API key").action((f, c) => c.copy(foo = f))
//    opt[Boolean]("xyz").text("Test proprerty").action((v, c) => c.copy(xyz = v))
  }

  val arguments = args.toList

  parser.parse(arguments, Config()) match {
    case Some(config) =>
      new Poller().run()

    case None =>
      println("ERROR???")
  }
}

