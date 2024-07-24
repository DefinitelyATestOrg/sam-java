// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositTest {

    @Test
    fun createCheckDeposit() {
        val checkDeposit =
            CheckDeposit.builder()
                .id("id")
                .accountId("account_id")
                .amount(123L)
                .backImageFileId("back_image_file_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .depositAcceptance(
                    CheckDeposit.DepositAcceptance.builder()
                        .accountNumber("account_number")
                        .amount(123L)
                        .auxiliaryOnUs("auxiliary_on_us")
                        .checkDepositId("check_deposit_id")
                        .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                        .routingNumber("routing_number")
                        .serialNumber("serial_number")
                        .build()
                )
                .depositRejection(
                    CheckDeposit.DepositRejection.builder()
                        .amount(123L)
                        .checkDepositId("check_deposit_id")
                        .currency(CheckDeposit.DepositRejection.Currency.CAD)
                        .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .depositReturn(
                    CheckDeposit.DepositReturn.builder()
                        .amount(123L)
                        .checkDepositId("check_deposit_id")
                        .currency(CheckDeposit.DepositReturn.Currency.CAD)
                        .returnReason(
                            CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                        )
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .depositSubmission(
                    CheckDeposit.DepositSubmission.builder()
                        .backFileId("back_file_id")
                        .frontFileId("front_file_id")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .description("description")
                .frontImageFileId("front_image_file_id")
                .idempotencyKey("idempotency_key")
                .inboundMailItemId("inbound_mail_item_id")
                .lockboxId("lockbox_id")
                .status(CheckDeposit.Status.PENDING)
                .transactionId("transaction_id")
                .type(CheckDeposit.Type.CHECK_DEPOSIT)
                .build()
        assertThat(checkDeposit).isNotNull
        assertThat(checkDeposit.id()).isEqualTo("id")
        assertThat(checkDeposit.accountId()).isEqualTo("account_id")
        assertThat(checkDeposit.amount()).isEqualTo(123L)
        assertThat(checkDeposit.backImageFileId()).contains("back_image_file_id")
        assertThat(checkDeposit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(checkDeposit.depositAcceptance())
            .contains(
                CheckDeposit.DepositAcceptance.builder()
                    .accountNumber("account_number")
                    .amount(123L)
                    .auxiliaryOnUs("auxiliary_on_us")
                    .checkDepositId("check_deposit_id")
                    .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                    .routingNumber("routing_number")
                    .serialNumber("serial_number")
                    .build()
            )
        assertThat(checkDeposit.depositRejection())
            .contains(
                CheckDeposit.DepositRejection.builder()
                    .amount(123L)
                    .checkDepositId("check_deposit_id")
                    .currency(CheckDeposit.DepositRejection.Currency.CAD)
                    .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkDeposit.depositReturn())
            .contains(
                CheckDeposit.DepositReturn.builder()
                    .amount(123L)
                    .checkDepositId("check_deposit_id")
                    .currency(CheckDeposit.DepositReturn.Currency.CAD)
                    .returnReason(
                        CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                    )
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(checkDeposit.depositSubmission())
            .contains(
                CheckDeposit.DepositSubmission.builder()
                    .backFileId("back_file_id")
                    .frontFileId("front_file_id")
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkDeposit.description()).contains("description")
        assertThat(checkDeposit.frontImageFileId()).isEqualTo("front_image_file_id")
        assertThat(checkDeposit.idempotencyKey()).contains("idempotency_key")
        assertThat(checkDeposit.inboundMailItemId()).contains("inbound_mail_item_id")
        assertThat(checkDeposit.lockboxId()).contains("lockbox_id")
        assertThat(checkDeposit.status()).isEqualTo(CheckDeposit.Status.PENDING)
        assertThat(checkDeposit.transactionId()).contains("transaction_id")
        assertThat(checkDeposit.type()).isEqualTo(CheckDeposit.Type.CHECK_DEPOSIT)
    }
}
