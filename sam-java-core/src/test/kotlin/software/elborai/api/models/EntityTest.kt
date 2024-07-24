// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityTest {

    @Test
    fun createEntity() {
        val entity =
            Entity.builder()
                .id("id")
                .corporation(
                    Entity.Corporation.builder()
                        .address(
                            Entity.Corporation.Address.builder()
                                .city("city")
                                .line1("line1")
                                .line2("line2")
                                .state("state")
                                .zip("zip")
                                .build()
                        )
                        .beneficialOwners(
                            listOf(
                                Entity.Corporation.BeneficialOwner.builder()
                                    .beneficialOwnerId("beneficial_owner_id")
                                    .companyTitle("company_title")
                                    .individual(
                                        Entity.Corporation.BeneficialOwner.Individual.builder()
                                            .address(
                                                Entity.Corporation.BeneficialOwner.Individual
                                                    .Address
                                                    .builder()
                                                    .city("city")
                                                    .line1("line1")
                                                    .line2("line2")
                                                    .state("state")
                                                    .zip("zip")
                                                    .build()
                                            )
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .identification(
                                                Entity.Corporation.BeneficialOwner.Individual
                                                    .Identification
                                                    .builder()
                                                    .method(
                                                        Entity.Corporation.BeneficialOwner
                                                            .Individual
                                                            .Identification
                                                            .Method
                                                            .SOCIAL_SECURITY_NUMBER
                                                    )
                                                    .numberLast4("number_last4")
                                                    .build()
                                            )
                                            .name("name")
                                            .build()
                                    )
                                    .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                                    .build()
                            )
                        )
                        .incorporationState("incorporation_state")
                        .industryCode("industry_code")
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .website("website")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .detailsConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .governmentAuthority(
                    Entity.GovernmentAuthority.builder()
                        .address(
                            Entity.GovernmentAuthority.Address.builder()
                                .city("city")
                                .line1("line1")
                                .line2("line2")
                                .state("state")
                                .zip("zip")
                                .build()
                        )
                        .authorizedPersons(
                            listOf(
                                Entity.GovernmentAuthority.AuthorizedPerson.builder()
                                    .authorizedPersonId("authorized_person_id")
                                    .name("name")
                                    .build()
                            )
                        )
                        .category(Entity.GovernmentAuthority.Category.MUNICIPALITY)
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .website("website")
                        .build()
                )
                .idempotencyKey("idempotency_key")
                .joint(
                    Entity.Joint.builder()
                        .individuals(
                            listOf(
                                Entity.Joint.Individual.builder()
                                    .address(
                                        Entity.Joint.Individual.Address.builder()
                                            .city("city")
                                            .line1("line1")
                                            .line2("line2")
                                            .state("state")
                                            .zip("zip")
                                            .build()
                                    )
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .identification(
                                        Entity.Joint.Individual.Identification.builder()
                                            .method(
                                                Entity.Joint.Individual.Identification.Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .numberLast4("number_last4")
                                            .build()
                                    )
                                    .name("name")
                                    .build()
                            )
                        )
                        .name("name")
                        .build()
                )
                .naturalPerson(
                    Entity.NaturalPerson.builder()
                        .address(
                            Entity.NaturalPerson.Address.builder()
                                .city("city")
                                .line1("line1")
                                .line2("line2")
                                .state("state")
                                .zip("zip")
                                .build()
                        )
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .identification(
                            Entity.NaturalPerson.Identification.builder()
                                .method(
                                    Entity.NaturalPerson.Identification.Method
                                        .SOCIAL_SECURITY_NUMBER
                                )
                                .numberLast4("number_last4")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .status(Entity.Status.ACTIVE)
                .structure(Entity.Structure.CORPORATION)
                .supplementalDocuments(
                    listOf(
                        Entity.SupplementalDocument.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .fileId("file_id")
                            .idempotencyKey("idempotency_key")
                            .type(Entity.SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                            .build()
                    )
                )
                .trust(
                    Entity.Trust.builder()
                        .address(
                            Entity.Trust.Address.builder()
                                .city("city")
                                .line1("line1")
                                .line2("line2")
                                .state("state")
                                .zip("zip")
                                .build()
                        )
                        .category(Entity.Trust.Category.REVOCABLE)
                        .formationDocumentFileId("formation_document_file_id")
                        .formationState("formation_state")
                        .grantor(
                            Entity.Trust.Grantor.builder()
                                .address(
                                    Entity.Trust.Grantor.Address.builder()
                                        .city("city")
                                        .line1("line1")
                                        .line2("line2")
                                        .state("state")
                                        .zip("zip")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Trust.Grantor.Identification.builder()
                                        .method(
                                            Entity.Trust.Grantor.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("number_last4")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .trustees(
                            listOf(
                                Entity.Trust.Trustee.builder()
                                    .individual(
                                        Entity.Trust.Trustee.Individual.builder()
                                            .address(
                                                Entity.Trust.Trustee.Individual.Address.builder()
                                                    .city("city")
                                                    .line1("line1")
                                                    .line2("line2")
                                                    .state("state")
                                                    .zip("zip")
                                                    .build()
                                            )
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .identification(
                                                Entity.Trust.Trustee.Individual.Identification
                                                    .builder()
                                                    .method(
                                                        Entity.Trust.Trustee.Individual
                                                            .Identification
                                                            .Method
                                                            .SOCIAL_SECURITY_NUMBER
                                                    )
                                                    .numberLast4("number_last4")
                                                    .build()
                                            )
                                            .name("name")
                                            .build()
                                    )
                                    .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                                    .build()
                            )
                        )
                        .build()
                )
                .type(Entity.Type.ENTITY)
                .build()
        assertThat(entity).isNotNull
        assertThat(entity.id()).isEqualTo("id")
        assertThat(entity.corporation())
            .contains(
                Entity.Corporation.builder()
                    .address(
                        Entity.Corporation.Address.builder()
                            .city("city")
                            .line1("line1")
                            .line2("line2")
                            .state("state")
                            .zip("zip")
                            .build()
                    )
                    .beneficialOwners(
                        listOf(
                            Entity.Corporation.BeneficialOwner.builder()
                                .beneficialOwnerId("beneficial_owner_id")
                                .companyTitle("company_title")
                                .individual(
                                    Entity.Corporation.BeneficialOwner.Individual.builder()
                                        .address(
                                            Entity.Corporation.BeneficialOwner.Individual.Address
                                                .builder()
                                                .city("city")
                                                .line1("line1")
                                                .line2("line2")
                                                .state("state")
                                                .zip("zip")
                                                .build()
                                        )
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .identification(
                                            Entity.Corporation.BeneficialOwner.Individual
                                                .Identification
                                                .builder()
                                                .method(
                                                    Entity.Corporation.BeneficialOwner.Individual
                                                        .Identification
                                                        .Method
                                                        .SOCIAL_SECURITY_NUMBER
                                                )
                                                .numberLast4("number_last4")
                                                .build()
                                        )
                                        .name("name")
                                        .build()
                                )
                                .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                                .build()
                        )
                    )
                    .incorporationState("incorporation_state")
                    .industryCode("industry_code")
                    .name("name")
                    .taxIdentifier("tax_identifier")
                    .website("website")
                    .build()
            )
        assertThat(entity.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entity.description()).contains("description")
        assertThat(entity.detailsConfirmedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entity.governmentAuthority())
            .contains(
                Entity.GovernmentAuthority.builder()
                    .address(
                        Entity.GovernmentAuthority.Address.builder()
                            .city("city")
                            .line1("line1")
                            .line2("line2")
                            .state("state")
                            .zip("zip")
                            .build()
                    )
                    .authorizedPersons(
                        listOf(
                            Entity.GovernmentAuthority.AuthorizedPerson.builder()
                                .authorizedPersonId("authorized_person_id")
                                .name("name")
                                .build()
                        )
                    )
                    .category(Entity.GovernmentAuthority.Category.MUNICIPALITY)
                    .name("name")
                    .taxIdentifier("tax_identifier")
                    .website("website")
                    .build()
            )
        assertThat(entity.idempotencyKey()).contains("idempotency_key")
        assertThat(entity.joint())
            .contains(
                Entity.Joint.builder()
                    .individuals(
                        listOf(
                            Entity.Joint.Individual.builder()
                                .address(
                                    Entity.Joint.Individual.Address.builder()
                                        .city("city")
                                        .line1("line1")
                                        .line2("line2")
                                        .state("state")
                                        .zip("zip")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Joint.Individual.Identification.builder()
                                        .method(
                                            Entity.Joint.Individual.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("number_last4")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                    )
                    .name("name")
                    .build()
            )
        assertThat(entity.naturalPerson())
            .contains(
                Entity.NaturalPerson.builder()
                    .address(
                        Entity.NaturalPerson.Address.builder()
                            .city("city")
                            .line1("line1")
                            .line2("line2")
                            .state("state")
                            .zip("zip")
                            .build()
                    )
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .identification(
                        Entity.NaturalPerson.Identification.builder()
                            .method(
                                Entity.NaturalPerson.Identification.Method.SOCIAL_SECURITY_NUMBER
                            )
                            .numberLast4("number_last4")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(entity.status()).isEqualTo(Entity.Status.ACTIVE)
        assertThat(entity.structure()).isEqualTo(Entity.Structure.CORPORATION)
        assertThat(entity.supplementalDocuments())
            .containsExactly(
                Entity.SupplementalDocument.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fileId("file_id")
                    .idempotencyKey("idempotency_key")
                    .type(Entity.SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                    .build()
            )
        assertThat(entity.trust())
            .contains(
                Entity.Trust.builder()
                    .address(
                        Entity.Trust.Address.builder()
                            .city("city")
                            .line1("line1")
                            .line2("line2")
                            .state("state")
                            .zip("zip")
                            .build()
                    )
                    .category(Entity.Trust.Category.REVOCABLE)
                    .formationDocumentFileId("formation_document_file_id")
                    .formationState("formation_state")
                    .grantor(
                        Entity.Trust.Grantor.builder()
                            .address(
                                Entity.Trust.Grantor.Address.builder()
                                    .city("city")
                                    .line1("line1")
                                    .line2("line2")
                                    .state("state")
                                    .zip("zip")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                Entity.Trust.Grantor.Identification.builder()
                                    .method(
                                        Entity.Trust.Grantor.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .numberLast4("number_last4")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .name("name")
                    .taxIdentifier("tax_identifier")
                    .trustees(
                        listOf(
                            Entity.Trust.Trustee.builder()
                                .individual(
                                    Entity.Trust.Trustee.Individual.builder()
                                        .address(
                                            Entity.Trust.Trustee.Individual.Address.builder()
                                                .city("city")
                                                .line1("line1")
                                                .line2("line2")
                                                .state("state")
                                                .zip("zip")
                                                .build()
                                        )
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .identification(
                                            Entity.Trust.Trustee.Individual.Identification.builder()
                                                .method(
                                                    Entity.Trust.Trustee.Individual.Identification
                                                        .Method
                                                        .SOCIAL_SECURITY_NUMBER
                                                )
                                                .numberLast4("number_last4")
                                                .build()
                                        )
                                        .name("name")
                                        .build()
                                )
                                .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(entity.type()).isEqualTo(Entity.Type.ENTITY)
    }
}
