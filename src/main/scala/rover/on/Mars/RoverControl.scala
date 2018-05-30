package rover.on.Mars

import mars.on.rover.{Plateau, Rover}

object RoverControl extends App {

  println("enter px")
  val px = Console.readInt()
  println("enter py")
  val py = Console.readInt()
  Plateau.apply(px, py)

  println("enter x")
  val tx = Console.readInt()
  println("enter y")
  val ty = Console.readInt()

  println("enter f")
  val tf = Console.readLine()

  //  val R = new RoRoverver(tx,ty,tf)

  val R = new Rover(tx, ty, tf, px, py)
  println("Instructions ")
  val driveString = readLine()
  val str = driveString.toCharArray
  for (i <- str) {
    i match {
      case 'M' => R.moveForward()
        println(i)
      case 'R' => R.rightTurn()
        println(i)
      case 'L' => R.leftTurn()
        println(i)
      case _ => None
    }
  }
  R.now


  /*R.rightTurn()

  R.now
*/
}
