/* Copyright 2024-5 Richard Oliver. Licensed under Apache Licence version 2.0. */
package osuser
import ostrat._, geom._, prid.phex._//, zio._

object UserApp extends App
{
  //def iz1: Task[Int] = ZIO.succeed(5)
  //val iz2 = iz1.catchAll(_ => ZIO.succeed(4))
  //Unsafe.unsafe(implicit u => zio.Runtime.default.unsafe.run(iz2))
  val p1: Pt2 = Pt2(5, 8)
  debvar(p1)

  val hex1: HCen = HCen(4, 4)
  debvar(hex1)
  println("Hello OS user")
}