package payment

case class Payment(payer: Option[String] = None)

case class Invoice(
  id: Option[String] = None,
  payment: Option[Payment] = None
)