# Twitter Stream Poller

Console application which pulls tweets from Twitter Stream API.

## Compiling and running
Application requires the following configuration to be set:

```bash
export TWITTER_CONSUMER_TOKEN_KEY='my-consumer-key'
export TWITTER_CONSUMER_TOKEN_SECRET='my-consumer-secret'
export TWITTER_ACCESS_TOKEN_KEY='my-access-key'
export TWITTER_ACCESS_TOKEN_SECRET='my-access-secret'
```

Then to run the application using SBT run:

```bash
sbt run
```

To build the Java JAR: 

```bash
sbt clean assembly
```

To run as `java -jar`:

```bash
java -jar target/scala-2.11/twitter-stream-poller-assembly-0.1-SNAPSHOT.jar
```


## Useful links

* Tweet JSON docs: https://dev.twitter.com/overview/api/tweets
* Twitter4s github repo & docs: https://github.com/DanielaSfregola/twitter4s