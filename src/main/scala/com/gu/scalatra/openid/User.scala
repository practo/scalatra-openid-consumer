package com.gu.scalatra.openid

case class User(email: String, firstName: String, lastName: String)

object User {
    lazy val key = User.getClass.getName
}