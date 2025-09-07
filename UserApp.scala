/* Copyright 2024-5 Richard Oliver. Licensed under Apache Licence version 2.0. */
package osuser
import ostrat.*, geom.*, prid.phex.*

object UserApp
{
  def main(args: Array[String]): Unit =
  { val m1 = 3.metres
    val p1 = Pt2(5, 8)
    val p2 = Pt2(5.5, 16)
    val ls1 = LSeg2(p1, p2)
    debvar(ls1)

    val hex1 = HCen(4, 4)
    debvar(hex1)
    val eg1 = eg13.Scen13All.gridSys
    val numTiles = eg1.numTiles
    debvar(numTiles)
    println(m1)
  }
}