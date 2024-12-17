package com.sam.api.errors

class SamIoException @JvmOverloads constructor(message: String? = null, cause: Throwable? = null) :
    SamException(message, cause)
