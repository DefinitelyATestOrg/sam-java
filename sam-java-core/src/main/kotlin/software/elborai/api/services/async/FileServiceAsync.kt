// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.File
import software.elborai.api.models.FileCreateParams
import software.elborai.api.models.FileListPageAsync
import software.elborai.api.models.FileListParams
import software.elborai.api.models.FileRetrieveParams

interface FileServiceAsync {

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    @JvmOverloads
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<File>

    /** Retrieve a File */
    @JvmOverloads
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<File>

    /** List Files */
    @JvmOverloads
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FileListPageAsync>
}
