// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferTest {

    @Test
    fun createRealTimePaymentsTransfer() {
        val realTimePaymentsTransfer =
            RealTimePaymentsTransfer.builder()
                .id("id")
                .accountId("account_id")
                .amount(123L)
                .approval(
                    RealTimePaymentsTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("approved_by")
                        .build()
                )
                .cancellation(
                    RealTimePaymentsTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("canceled_by")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy(
                    RealTimePaymentsTransfer.CreatedBy.builder()
                        .apiKey(
                            RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .category(RealTimePaymentsTransfer.CreatedBy.Category.API_KEY)
                        .oauthApplication(
                            RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            RealTimePaymentsTransfer.CreatedBy.User.builder().email("email").build()
                        )
                        .build()
                )
                .creditorName("creditor_name")
                .currency(RealTimePaymentsTransfer.Currency.CAD)
                .debtorName("debtor_name")
                .destinationAccountNumber("destination_account_number")
                .destinationRoutingNumber("destination_routing_number")
                .externalAccountId("external_account_id")
                .idempotencyKey("idempotency_key")
                .pendingTransactionId("pending_transaction_id")
                .rejection(
                    RealTimePaymentsTransfer.Rejection.builder()
                        .rejectReasonAdditionalInformation("reject_reason_additional_information")
                        .rejectReasonCode(
                            RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .remittanceInformation("remittance_information")
                .sourceAccountNumberId("source_account_number_id")
                .status(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
                .submission(
                    RealTimePaymentsTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionIdentification("transaction_identification")
                        .build()
                )
                .transactionId("transaction_id")
                .type(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
                .ultimateCreditorName("ultimate_creditor_name")
                .ultimateDebtorName("ultimate_debtor_name")
                .build()
        assertThat(realTimePaymentsTransfer).isNotNull
        assertThat(realTimePaymentsTransfer.id()).isEqualTo("id")
        assertThat(realTimePaymentsTransfer.accountId()).isEqualTo("account_id")
        assertThat(realTimePaymentsTransfer.amount()).isEqualTo(123L)
        assertThat(realTimePaymentsTransfer.approval())
            .contains(
                RealTimePaymentsTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("approved_by")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.cancellation())
            .contains(
                RealTimePaymentsTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("canceled_by")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimePaymentsTransfer.createdBy())
            .contains(
                RealTimePaymentsTransfer.CreatedBy.builder()
                    .apiKey(
                        RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                            .description("description")
                            .build()
                    )
                    .category(RealTimePaymentsTransfer.CreatedBy.Category.API_KEY)
                    .oauthApplication(
                        RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                            .name("name")
                            .build()
                    )
                    .user(RealTimePaymentsTransfer.CreatedBy.User.builder().email("email").build())
                    .build()
            )
        assertThat(realTimePaymentsTransfer.creditorName()).isEqualTo("creditor_name")
        assertThat(realTimePaymentsTransfer.currency())
            .isEqualTo(RealTimePaymentsTransfer.Currency.CAD)
        assertThat(realTimePaymentsTransfer.debtorName()).contains("debtor_name")
        assertThat(realTimePaymentsTransfer.destinationAccountNumber())
            .isEqualTo("destination_account_number")
        assertThat(realTimePaymentsTransfer.destinationRoutingNumber())
            .isEqualTo("destination_routing_number")
        assertThat(realTimePaymentsTransfer.externalAccountId()).contains("external_account_id")
        assertThat(realTimePaymentsTransfer.idempotencyKey()).contains("idempotency_key")
        assertThat(realTimePaymentsTransfer.pendingTransactionId())
            .contains("pending_transaction_id")
        assertThat(realTimePaymentsTransfer.rejection())
            .contains(
                RealTimePaymentsTransfer.Rejection.builder()
                    .rejectReasonAdditionalInformation("reject_reason_additional_information")
                    .rejectReasonCode(
                        RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(realTimePaymentsTransfer.remittanceInformation())
            .isEqualTo("remittance_information")
        assertThat(realTimePaymentsTransfer.sourceAccountNumberId())
            .isEqualTo("source_account_number_id")
        assertThat(realTimePaymentsTransfer.status())
            .isEqualTo(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
        assertThat(realTimePaymentsTransfer.submission())
            .contains(
                RealTimePaymentsTransfer.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionIdentification("transaction_identification")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.transactionId()).contains("transaction_id")
        assertThat(realTimePaymentsTransfer.type())
            .isEqualTo(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
        assertThat(realTimePaymentsTransfer.ultimateCreditorName())
            .contains("ultimate_creditor_name")
        assertThat(realTimePaymentsTransfer.ultimateDebtorName()).contains("ultimate_debtor_name")
    }
}
