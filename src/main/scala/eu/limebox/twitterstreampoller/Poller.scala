package eu.limebox.twitterstreampoller

import com.danielasfregola.twitter4s.TwitterStreamingClient
import com.danielasfregola.twitter4s.entities.Tweet
import com.danielasfregola.twitter4s.entities.enums.Language
import com.danielasfregola.twitter4s.entities.streaming.StreamingMessage
import com.danielasfregola.twitter4s.processors.TwitterProcessor
import org.slf4j.LoggerFactory


class Poller {

  def logger = LoggerFactory.getLogger(this.getClass)

  def printTweetText: PartialFunction[StreamingMessage, Unit] = {
    case tweet: Tweet => logger.debug(tweet.text)
  }

  def run(): Unit = {

    val client = TwitterStreamingClient()

    println("Running...")
    client.sampleStatuses(stall_warnings = true, languages = List(Language.English))(TwitterProcessor.echo)
    println("Exiting...")
  }
}
