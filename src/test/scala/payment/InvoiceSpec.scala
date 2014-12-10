package payment

class InvoiceSpec {

    def test(fun: => Any): Unit = {

    }

    test {
      val payment = Payment(
        payer = Some("payer")  // this still compile if val payer on line 19 is commentted out, where the 'payer' comes from?
      )

      val invoice = Invoice(
        payment = Some(payment)
      )

      // does not compile
      val payer = invoice.payment.get.payer
    }
}
