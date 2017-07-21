package rover.on.Mars

import mars.on.rover.{Plateau, Rover}

import scala.io.StdIn.readLine

/**
  * Created by synerzip on 17/7/17.
  */
object RoverControl extends App {

  val Array(px, py) = readLine.split(" ")
  val plateau_x = px.toInt
  val plateau_y = py.toInt
  Plateau.apply(plateau_x, plateau_y)

  for (_ <- 0 to 1) {
    val Array(x, y, f) = readLine.split(" ")
    val rover_x = x.toInt
    val rover_y = y.toInt
    val rover_face = f
    val R = new Rover(rover_x, rover_y, rover_face, plateau_x, plateau_y)
    val driveString = readLine()
    val str = driveString.toCharArray

    for (i <- str) {
      i match {
        case 'M' => R moveForward
        case 'R' => R rightTurn
        case 'L' => R leftTurn
        case _ => None
      }
    }
    R nowRover
  }
}
