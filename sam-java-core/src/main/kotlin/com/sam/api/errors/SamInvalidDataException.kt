package com.sam.api.errors

class SamInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : SamException(message, cause)
