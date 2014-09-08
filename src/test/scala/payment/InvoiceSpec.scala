package payment

import org.scalatest.{OptionValues, Matchers, WordSpec}

class InvoiceSpec extends WordSpec with Matchers with OptionValues {

  "The model with invoice" when {
    "used with payment" should {

      val payment = Payment(
        payer = Some("payer")
      )
      val invoice = Invoice(
        payment = Some(payment)
      )

      "contains the field payment" in {
        invoice.payment should be ('defined)
      }

      // compiles fine
      val zePayer = invoice.payment.value.payer
      "contains the field payment.payer" in {
        zePayer.value shouldEqual "payer"
      }

      // does not compile
      val payer = invoice.payment.value.payer
      "contains the field payment.payer2" in {
        payer.value shouldEqual "payer"
      }

    }
  }

}
