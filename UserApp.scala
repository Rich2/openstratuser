/* Copyright 2024 Richard Oliver. Licensed under Apache Licence version 2.0. */
package osuser
import zio._, ostrat._, geom._, prid.phex._

object UserApp extends App
{
  def iz1: Task[Int] = ZIO.succeed(5)
  Unsafe.unsafe(implicit u => zio.Runtime.default.unsafe.run(iz1))
  val p1 = Pt2(5, 8)
  debvar(p1)

  val hex1 = HCen(4, 4)
  debvar(hex1)
}