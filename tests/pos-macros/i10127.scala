import scala.quoted._

object T {
  def impl[A](using Type[A])(using Quotes): Expr[Unit] = {
    Expr.summon[A]
    '{}
  }
}