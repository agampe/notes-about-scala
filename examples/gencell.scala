class GenCell[T](init: T) {
  private var value: T = init
  def get: T = value
  def set(x: T): unit = {value = x}
}
