// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking.simulations

import software.elborai.api.core.RequestOptions
import software.elborai.api.models.AccountTransfer
import software.elborai.api.models.SimulationAccountTransferCompleteParams

interface AccountTransferService {

    /**
     * If your account is configured to require approval for each transfer, this endpoint simulates
     * the approval of an [Account Transfer](#account-transfers). You can also approve sandbox
     * Account Transfers in the dashboard. This transfer must first have a `status` of
     * `pending_approval`.
     */
    @JvmOverloads
    fun complete(
        params: SimulationAccountTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransfer
}
