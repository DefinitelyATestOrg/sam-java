package software.elborai.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
        headers: ListMultimap<String, String>,
        body: String,
        error: SamError,
) : SamServiceException(422, headers, body, error)
