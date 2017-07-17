package mars.on.rover

/**
  * Created by synerzip on 17/7/17.
  */
class Rover(x: Int, y: Int, var f: String, px: Int, py: Int) {
  val plateaux = px
  val plateauy = py
  var lox = x
  var lay = y
  var rf = f

  def rightTurn(): Unit = rf match {
    case "N" => rf = "E"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case "E" => rf = "S"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case "S" => rf = "W"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case "W" => rf = "N"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case _ => None
  }

  def leftTurn(): Unit = rf match {
    case "N" => rf = "W"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case "W" => rf = "S"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case "S" => rf = "E"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case "E" => rf = "N"
      println("turn   " + lox, lay, rf, plateaux, plateauy)

    case _ => None
  }


  def moveForward(): Unit = rf match {
    case "N" =>
      println("before     " + lox, lay, rf, plateaux, plateauy)

      this.lay = if (lay <= plateauy) lay + 1 else lay
//      lay = lay + 1
//      lox = lox
      println("after  >>  " + lox, lay, rf, plateaux, plateauy)

    case "E" =>
      println("before     " + lox, lay, rf, plateaux, plateauy)

      this.lox = if (lox <= plateaux) lox + 1 else lox
//      lox = lox + 1
//      lay = lay
      println("after  >>  " + lox, lay, rf, plateaux, plateauy)

    case "S" =>
      println("before     " + lox, lay, rf, plateaux, plateauy)

      this.lay = if (lay >= 0) lay - 1 else lay
//      lay = lay - 1
//      lox = lox
      println("after  >>  " + lox, lay, rf, plateaux, plateauy)

    case "W" =>
      println("before     " + lox, lay, rf, plateaux, plateauy)

      this.lox = if (lox >=  0) lox - 1 else lox
//      lox = lox - 1
//      lay = lay
      println("after  >>  " + lox, lay, rf, plateaux, plateauy)

    case _ => None
  }

  def now = {

    println(lox + " " + lay + " " + rf)

  }

}
