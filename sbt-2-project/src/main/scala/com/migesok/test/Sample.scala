package com.migesok.test

object Sample {
  trait Hole[F[_]]

  implicit val holeEither: Hole[Either[String, *]] = new Hole[Either[String, *]] {}
}
