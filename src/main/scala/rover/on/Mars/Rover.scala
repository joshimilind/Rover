package mars.on.rover

/**
  * Created by synerzip on 17/7/17.
  */
class Rover(x: Int, y: Int, f: String, px: Int, py: Int) {
  val plateau_x: Int = px
  val plateau_y: Int = py
  var rover_x: Int = x
  var rover_y: Int = y
  var rover_facing: String = f

  def rightTurn: Any = rover_facing match {
    case "N" => rover_facing = "E"
    case "E" => rover_facing = "S"
    case "S" => rover_facing = "W"
    case "W" => rover_facing = "N"
    case _ => None
  }

  def leftTurn: Any = rover_facing match {
    case "N" => rover_facing = "W"
    case "W" => rover_facing = "S"
    case "S" => rover_facing = "E"
    case "E" => rover_facing = "N"
    case _ => None
  }

  def moveForward: Any = rover_facing match {
    case "N" =>
      rover_y = if (rover_y <= plateau_y) rover_y + 1 else rover_y
    case "E" =>
      rover_x = if (rover_x <= plateau_x) rover_x + 1 else rover_x
    case "S" =>
      rover_y = if (rover_y >= 0) rover_y - 1 else rover_y
    case "W" =>
      rover_x = if (rover_x >= 0) rover_x - 1 else rover_x
    case _ => None
  }

  def nowRover: Unit = println(rover_x + " " + rover_y + " " + rover_facing)
}
