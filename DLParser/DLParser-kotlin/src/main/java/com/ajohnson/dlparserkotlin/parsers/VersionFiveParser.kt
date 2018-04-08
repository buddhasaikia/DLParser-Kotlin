package com.ajohnson.dlparserkotlin.parsers

import com.ajohnson.dlparserkotlin.models.FieldKey

/**
 * Published 07-2010.
 */
internal class VersionFiveParser(data: String): DLParser(data) {

    init {
        fields.remove(FieldKey.isOrganDonor)
        fields.remove(FieldKey.isVeteran)
        fields.remove(FieldKey.fVehicleCode)
        fields.remove(FieldKey.driverLicenseName)
        fields.remove(FieldKey.givenName)
    }
}