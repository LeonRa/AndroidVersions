package com.leonra.versions.model

import kotlinx.datetime.LocalDate

/**
 * A released version of Android.
 */
data class Version(
    val codename: String,
    val apiLevel: Int,
    val osVersion: String,
    val release: LocalDate,
    val imageUrl: String,
    val wikiUrl: String,
)
