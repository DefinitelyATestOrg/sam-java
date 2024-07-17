// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferTest {

    @Test
    fun createCheckTransfer() {
        val checkTransfer =
            CheckTransfer.builder()
                .id("string")
                .accountId("string")
                .accountNumber("string")
                .amount(123L)
                .approval(
                    CheckTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("string")
                        .build()
                )
                .approvedInboundCheckDepositId("string")
                .cancellation(
                    CheckTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("string")
                        .build()
                )
                .checkNumber("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy(
                    CheckTransfer.CreatedBy.builder()
                        .apiKey(
                            CheckTransfer.CreatedBy.ApiKey.builder().description("string").build()
                        )
                        .category(CheckTransfer.CreatedBy.Category.API_KEY)
                        .oauthApplication(
                            CheckTransfer.CreatedBy.OAuthApplication.builder()
                                .name("string")
                                .build()
                        )
                        .user(CheckTransfer.CreatedBy.User.builder().email("string").build())
                        .build()
                )
                .currency(CheckTransfer.Currency.CAD)
                .fulfillmentMethod(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
                .idempotencyKey("string")
                .mailing(
                    CheckTransfer.Mailing.builder()
                        .imageId("string")
                        .mailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pendingTransactionId("string")
                .physicalCheck(
                    CheckTransfer.PhysicalCheck.builder()
                        .mailingAddress(
                            CheckTransfer.PhysicalCheck.MailingAddress.builder()
                                .city("string")
                                .line1("string")
                                .line2("string")
                                .name("string")
                                .postalCode("string")
                                .state("string")
                                .build()
                        )
                        .memo("string")
                        .note("string")
                        .recipientName("string")
                        .returnAddress(
                            CheckTransfer.PhysicalCheck.ReturnAddress.builder()
                                .city("string")
                                .line1("string")
                                .line2("string")
                                .name("string")
                                .postalCode("string")
                                .state("string")
                                .build()
                        )
                        .signatureText("string")
                        .build()
                )
                .routingNumber("string")
                .sourceAccountNumberId("string")
                .status(CheckTransfer.Status.PENDING_APPROVAL)
                .stopPaymentRequest(
                    CheckTransfer.StopPaymentRequest.builder()
                        .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
                        .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferId("string")
                        .type(
                            CheckTransfer.StopPaymentRequest.Type
                                .CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        )
                        .build()
                )
                .submission(
                    CheckTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .thirdParty(CheckTransfer.ThirdParty.builder().checkNumber("string").build())
                .type(CheckTransfer.Type.CHECK_TRANSFER)
                .build()
        assertThat(checkTransfer).isNotNull
        assertThat(checkTransfer.id()).isEqualTo("string")
        assertThat(checkTransfer.accountId()).isEqualTo("string")
        assertThat(checkTransfer.accountNumber()).isEqualTo("string")
        assertThat(checkTransfer.amount()).isEqualTo(123L)
        assertThat(checkTransfer.approval())
            .contains(
                CheckTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("string")
                    .build()
            )
        assertThat(checkTransfer.approvedInboundCheckDepositId()).contains("string")
        assertThat(checkTransfer.cancellation())
            .contains(
                CheckTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("string")
                    .build()
            )
        assertThat(checkTransfer.checkNumber()).isEqualTo("string")
        assertThat(checkTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(checkTransfer.createdBy())
            .contains(
                CheckTransfer.CreatedBy.builder()
                    .apiKey(CheckTransfer.CreatedBy.ApiKey.builder().description("string").build())
                    .category(CheckTransfer.CreatedBy.Category.API_KEY)
                    .oauthApplication(
                        CheckTransfer.CreatedBy.OAuthApplication.builder().name("string").build()
                    )
                    .user(CheckTransfer.CreatedBy.User.builder().email("string").build())
                    .build()
            )
        assertThat(checkTransfer.currency()).isEqualTo(CheckTransfer.Currency.CAD)
        assertThat(checkTransfer.fulfillmentMethod())
            .isEqualTo(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(checkTransfer.idempotencyKey()).contains("string")
        assertThat(checkTransfer.mailing())
            .contains(
                CheckTransfer.Mailing.builder()
                    .imageId("string")
                    .mailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkTransfer.pendingTransactionId()).contains("string")
        assertThat(checkTransfer.physicalCheck())
            .contains(
                CheckTransfer.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransfer.PhysicalCheck.MailingAddress.builder()
                            .city("string")
                            .line1("string")
                            .line2("string")
                            .name("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .memo("string")
                    .note("string")
                    .recipientName("string")
                    .returnAddress(
                        CheckTransfer.PhysicalCheck.ReturnAddress.builder()
                            .city("string")
                            .line1("string")
                            .line2("string")
                            .name("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .signatureText("string")
                    .build()
            )
        assertThat(checkTransfer.routingNumber()).isEqualTo("string")
        assertThat(checkTransfer.sourceAccountNumberId()).contains("string")
        assertThat(checkTransfer.status()).isEqualTo(CheckTransfer.Status.PENDING_APPROVAL)
        assertThat(checkTransfer.stopPaymentRequest())
            .contains(
                CheckTransfer.StopPaymentRequest.builder()
                    .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
                    .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transferId("string")
                    .type(CheckTransfer.StopPaymentRequest.Type.CHECK_TRANSFER_STOP_PAYMENT_REQUEST)
                    .build()
            )
        assertThat(checkTransfer.submission())
            .contains(
                CheckTransfer.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkTransfer.thirdParty())
            .contains(CheckTransfer.ThirdParty.builder().checkNumber("string").build())
        assertThat(checkTransfer.type()).isEqualTo(CheckTransfer.Type.CHECK_TRANSFER)
    }
}