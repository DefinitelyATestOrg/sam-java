// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileTest {

    @Test
    fun createFile() {
        val file =
            File.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .direction(File.Direction.TO_INCREASE)
                .downloadUrl("download_url")
                .filename("filename")
                .idempotencyKey("idempotency_key")
                .mimeType("mime_type")
                .purpose(File.Purpose.CHECK_IMAGE_FRONT)
                .type(File.Type.FILE)
                .build()
        assertThat(file).isNotNull
        assertThat(file.id()).isEqualTo("id")
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.description()).contains("description")
        assertThat(file.direction()).isEqualTo(File.Direction.TO_INCREASE)
        assertThat(file.downloadUrl()).contains("download_url")
        assertThat(file.filename()).contains("filename")
        assertThat(file.idempotencyKey()).contains("idempotency_key")
        assertThat(file.mimeType()).isEqualTo("mime_type")
        assertThat(file.purpose()).isEqualTo(File.Purpose.CHECK_IMAGE_FRONT)
        assertThat(file.type()).isEqualTo(File.Type.FILE)
    }
}
