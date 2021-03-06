package route.node

import route.inter.{Complete, Context}

import scala.collection.mutable


/**
 * @param matchedPath request url matched path until this route node
 * @param children    this node's children nodes
 * @param handlers    handlers map , Request Method String => Handler
 *                    (The Handler is a lambda which type is HttpExchange=>Complete)
 */


abstract trait RouteNode {

  val matchedPath: String

  val children: mutable.HashMap[String, RouteNode]

  val handlers: mutable.HashMap[String, Context => Complete]

}
