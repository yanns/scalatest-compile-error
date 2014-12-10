package payment

class InvoiceSpec {

    def test(fun: => Any): Unit = {

    }

    test {
      val payment = Payment(
        payer = Some("payer")
      )

      val invoice = Invoice(
        payment = Some(payment)
      )

      // does not compile
      val payer = invoice.payment.get.payer

      // compile
//      val payer: Option[String] = invoice.payment.get.payer
    }
}
