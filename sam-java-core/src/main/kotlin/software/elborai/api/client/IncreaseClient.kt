// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.client

import software.elborai.api.models.*
import software.elborai.api.services.blocking.*

interface IncreaseClient {

    fun async(): IncreaseClientAsync

    fun accounts(): AccountService

    fun accountNumbers(): AccountNumberService

    fun bookkeepingAccounts(): BookkeepingAccountService

    fun bookkeepingEntrySets(): BookkeepingEntrySetService

    fun bookkeepingEntries(): BookkeepingEntryService

    fun realTimeDecisions(): RealTimeDecisionService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun cards(): CardService

    fun cardDisputes(): CardDisputeService

    fun cardPurchaseSupplements(): CardPurchaseSupplementService

    fun externalAccounts(): ExternalAccountService

    fun exports(): ExportService

    fun digitalWalletTokens(): DigitalWalletTokenService

    fun transactions(): TransactionService

    fun pendingTransactions(): PendingTransactionService

    fun programs(): ProgramService

    fun declinedTransactions(): DeclinedTransactionService

    fun accountTransfers(): AccountTransferService

    fun achTransfers(): AchTransferService

    fun achPrenotifications(): AchPrenotificationService

    fun documents(): DocumentService

    fun wireTransfers(): WireTransferService

    fun checkTransfers(): CheckTransferService

    fun entities(): EntityService

    fun inboundAchTransfers(): InboundAchTransferService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun wireDrawdownRequests(): WireDrawdownRequestService

    fun events(): EventService

    fun eventSubscriptions(): EventSubscriptionService

    fun files(): FileService

    fun groups(): GroupService

    fun oauthConnections(): OAuthConnectionService

    fun checkDeposits(): CheckDepositService

    fun routingNumbers(): RoutingNumberService

    fun accountStatements(): AccountStatementService

    fun simulations(): SimulationService

    fun physicalCards(): PhysicalCardService

    fun cardPayments(): CardPaymentService

    fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestService

    fun proofOfAuthorizationRequestSubmissions(): ProofOfAuthorizationRequestSubmissionService

    fun intrafi(): IntrafiService

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentService

    fun oauthTokens(): OAuthTokenService

    fun inboundWireTransfers(): InboundWireTransferService

    fun digitalCardProfiles(): DigitalCardProfileService

    fun physicalCardProfiles(): PhysicalCardProfileService

    fun inboundCheckDeposits(): InboundCheckDepositService

    fun inboundMailItems(): InboundMailItemService

    fun lockboxes(): LockboxService
}
