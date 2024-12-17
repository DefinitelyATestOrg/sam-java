@file:JvmName("JsonHandler")

package com.sam.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.sam.api.core.http.HttpResponse
import com.sam.api.core.http.HttpResponse.Handler
import com.sam.api.errors.SamException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw SamException("Error reading response", e)
            }
        }
    }