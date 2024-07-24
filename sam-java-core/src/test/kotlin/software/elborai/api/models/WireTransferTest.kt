// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import software.elborai.api.core.JsonNull
import software.elborai.api.core.JsonString
import software.elborai.api.core.JsonValue
import software.elborai.api.models.WireTransfer

class WireTransferTest {

    @Test
    fun createWireTransfer() {
      val wireTransfer = WireTransfer.builder()
          .id("id")
          .accountId("account_id")
          .accountNumber("account_number")
          .amount(123L)
          .approval(WireTransfer.Approval.builder()
              .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .approvedBy("approved_by")
              .build())
          .beneficiaryAddressLine1("beneficiary_address_line1")
          .beneficiaryAddressLine2("beneficiary_address_line2")
          .beneficiaryAddressLine3("beneficiary_address_line3")
          .beneficiaryName("beneficiary_name")
          .cancellation(WireTransfer.Cancellation.builder()
              .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .canceledBy("canceled_by")
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdBy(WireTransfer.CreatedBy.builder()
              .apiKey(WireTransfer.CreatedBy.ApiKey.builder()
                  .description("description")
                  .build())
              .category(WireTransfer.CreatedBy.Category.API_KEY)
              .oauthApplication(WireTransfer.CreatedBy.OAuthApplication.builder()
                  .name("name")
                  .build())
              .user(WireTransfer.CreatedBy.User.builder()
                  .email("email")
                  .build())
              .build())
          .currency(WireTransfer.Currency.CAD)
          .externalAccountId("external_account_id")
          .idempotencyKey("idempotency_key")
          .messageToRecipient("message_to_recipient")
          .network(WireTransfer.Network.WIRE)
          .originatorAddressLine1("originator_address_line1")
          .originatorAddressLine2("originator_address_line2")
          .originatorAddressLine3("originator_address_line3")
          .originatorName("originator_name")
          .pendingTransactionId("pending_transaction_id")
          .reversal(WireTransfer.Reversal.builder()
              .amount(123L)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .description("description")
              .financialInstitutionToFinancialInstitutionInformation("financial_institution_to_financial_institution_information")
              .inputCycleDate(LocalDate.parse("2019-12-27"))
              .inputMessageAccountabilityData("input_message_accountability_data")
              .inputSequenceNumber("input_sequence_number")
              .inputSource("input_source")
              .originatorRoutingNumber("originator_routing_number")
              .previousMessageInputCycleDate(LocalDate.parse("2019-12-27"))
              .previousMessageInputMessageAccountabilityData("previous_message_input_message_accountability_data")
              .previousMessageInputSequenceNumber("previous_message_input_sequence_number")
              .previousMessageInputSource("previous_message_input_source")
              .receiverFinancialInstitutionInformation("receiver_financial_institution_information")
              .transactionId("transaction_id")
              .wireTransferId("wire_transfer_id")
              .build())
          .routingNumber("routing_number")
          .status(WireTransfer.Status.CANCELED)
          .submission(WireTransfer.Submission.builder()
              .inputMessageAccountabilityData("input_message_accountability_data")
              .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .transactionId("transaction_id")
          .type(WireTransfer.Type.WIRE_TRANSFER)
          .build()
      assertThat(wireTransfer).isNotNull
      assertThat(wireTransfer.id()).isEqualTo("id")
      assertThat(wireTransfer.accountId()).isEqualTo("account_id")
      assertThat(wireTransfer.accountNumber()).isEqualTo("account_number")
      assertThat(wireTransfer.amount()).isEqualTo(123L)
      assertThat(wireTransfer.approval()).contains(WireTransfer.Approval.builder()
          .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .approvedBy("approved_by")
          .build())
      assertThat(wireTransfer.beneficiaryAddressLine1()).contains("beneficiary_address_line1")
      assertThat(wireTransfer.beneficiaryAddressLine2()).contains("beneficiary_address_line2")
      assertThat(wireTransfer.beneficiaryAddressLine3()).contains("beneficiary_address_line3")
      assertThat(wireTransfer.beneficiaryName()).contains("beneficiary_name")
      assertThat(wireTransfer.cancellation()).contains(WireTransfer.Cancellation.builder()
          .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .canceledBy("canceled_by")
          .build())
      assertThat(wireTransfer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(wireTransfer.createdBy()).contains(WireTransfer.CreatedBy.builder()
          .apiKey(WireTransfer.CreatedBy.ApiKey.builder()
              .description("description")
              .build())
          .category(WireTransfer.CreatedBy.Category.API_KEY)
          .oauthApplication(WireTransfer.CreatedBy.OAuthApplication.builder()
              .name("name")
              .build())
          .user(WireTransfer.CreatedBy.User.builder()
              .email("email")
              .build())
          .build())
      assertThat(wireTransfer.currency()).isEqualTo(WireTransfer.Currency.CAD)
      assertThat(wireTransfer.externalAccountId()).contains("external_account_id")
      assertThat(wireTransfer.idempotencyKey()).contains("idempotency_key")
      assertThat(wireTransfer.messageToRecipient()).contains("message_to_recipient")
      assertThat(wireTransfer.network()).isEqualTo(WireTransfer.Network.WIRE)
      assertThat(wireTransfer.originatorAddressLine1()).contains("originator_address_line1")
      assertThat(wireTransfer.originatorAddressLine2()).contains("originator_address_line2")
      assertThat(wireTransfer.originatorAddressLine3()).contains("originator_address_line3")
      assertThat(wireTransfer.originatorName()).contains("originator_name")
      assertThat(wireTransfer.pendingTransactionId()).contains("pending_transaction_id")
      assertThat(wireTransfer.reversal()).contains(WireTransfer.Reversal.builder()
          .amount(123L)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .description("description")
          .financialInstitutionToFinancialInstitutionInformation("financial_institution_to_financial_institution_information")
          .inputCycleDate(LocalDate.parse("2019-12-27"))
          .inputMessageAccountabilityData("input_message_accountability_data")
          .inputSequenceNumber("input_sequence_number")
          .inputSource("input_source")
          .originatorRoutingNumber("originator_routing_number")
          .previousMessageInputCycleDate(LocalDate.parse("2019-12-27"))
          .previousMessageInputMessageAccountabilityData("previous_message_input_message_accountability_data")
          .previousMessageInputSequenceNumber("previous_message_input_sequence_number")
          .previousMessageInputSource("previous_message_input_source")
          .receiverFinancialInstitutionInformation("receiver_financial_institution_information")
          .transactionId("transaction_id")
          .wireTransferId("wire_transfer_id")
          .build())
      assertThat(wireTransfer.routingNumber()).isEqualTo("routing_number")
      assertThat(wireTransfer.status()).isEqualTo(WireTransfer.Status.CANCELED)
      assertThat(wireTransfer.submission()).contains(WireTransfer.Submission.builder()
          .inputMessageAccountabilityData("input_message_accountability_data")
          .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      assertThat(wireTransfer.transactionId()).contains("transaction_id")
      assertThat(wireTransfer.type()).isEqualTo(WireTransfer.Type.WIRE_TRANSFER)
    }
}
