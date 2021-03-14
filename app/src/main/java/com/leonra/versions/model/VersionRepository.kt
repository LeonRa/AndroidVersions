package com.leonra.versions.model

import android.os.Build
import kotlinx.datetime.LocalDate

/**
 * Source of truth for all known [Version]s of Android.
 */
object VersionRepository {

    /**
     * Returns all known [Version]s of Android.
     */
    fun getAll(): List<Version> = VERSIONS_BY_CODENAME.values.toList()

    /**
     * Returns the [Version] of Android corresponding to the given [apiLevel].
     *
     * @throws IllegalArgumentException if the given [apiLevel] doesn't exist.
     */
    @Throws(IllegalArgumentException::class)
    fun getForApiLevel(apiLevel: Int): Version = requireNotNull(VERSIONS_BY_CODENAME[apiLevel])

    /**
     * Data taken from https://android.fandom.com/wiki/Category:Versions and
     * [Build.VERSION_CODES]. Images from various sources.
     */
    private val VERSIONS_BY_CODENAME = listOf(
        Version(
            codename = "Cupcake",
            apiLevel = Build.VERSION_CODES.CUPCAKE,
            osVersion = "1.5",
            release = LocalDate(2009, 4, 27),
            imageUrl = "https://static.wikia.nocookie.net/android/images/e/ef/Android-cupcake-733299.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_1.5_Cupcake",
        ),
        Version(
            codename = "Donut",
            apiLevel = Build.VERSION_CODES.DONUT,
            osVersion = "1.6",
            release = LocalDate(2009, 9, 15),
            imageUrl = "https://static.wikia.nocookie.net/android/images/f/f4/Androiddonut.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_1.6_Doughnut",
        ),
        Version(
            codename = "Eclair",
            apiLevel = Build.VERSION_CODES.ECLAIR,
            osVersion = "2.0",
            release = LocalDate(2009, 10, 26),
            imageUrl = "https://static.wikia.nocookie.net/android/images/7/77/Screen_Shot_2011-12-16_at_1.08.09_PM.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_2.0_Eclair",
        ),
        Version(
            codename = "Eclair MR1",
            apiLevel = Build.VERSION_CODES.ECLAIR_MR1,
            osVersion = "2.1",
            release = LocalDate(2010, 1, 12),
            imageUrl = "https://static.wikia.nocookie.net/android/images/7/77/Screen_Shot_2011-12-16_at_1.08.09_PM.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_2.1_Eclair",
        ),
        Version(
            codename = "Froyo",
            apiLevel = Build.VERSION_CODES.FROYO,
            osVersion = "2.2",
            release = LocalDate(2010, 5, 20),
            imageUrl = "https://static.wikia.nocookie.net/android/images/8/89/Froyo.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_2.2_Froyo",
        ),
        Version(
            codename = "Gingerbread",
            apiLevel = Build.VERSION_CODES.GINGERBREAD,
            osVersion = "2.3",
            release = LocalDate(2010, 12, 6),
            imageUrl = "https://static.wikia.nocookie.net/android/images/1/15/Android-gingerbread-1.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_2.3_Gingerbread",
        ),
        Version(
            codename = "Gingerbread",
            apiLevel = Build.VERSION_CODES.GINGERBREAD_MR1,
            osVersion = "2.3.3",
            release = LocalDate(2011, 2, 9),
            imageUrl = "https://static.wikia.nocookie.net/android/images/1/15/Android-gingerbread-1.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_2.3_Gingerbread",
        ),
        Version(
            codename = "Honeycomb",
            apiLevel = Build.VERSION_CODES.HONEYCOMB,
            osVersion = "3.0",
            release = LocalDate(2011, 2, 22),
            imageUrl = "https://static.wikia.nocookie.net/android/images/d/d2/Honeycomb-logo2-e1298681115525.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_3.0_Honeycomb",
        ),
        Version(
            codename = "Honeycomb MR1",
            apiLevel = Build.VERSION_CODES.HONEYCOMB_MR1,
            osVersion = "3.1",
            release = LocalDate(2011, 5, 10),
            imageUrl = "https://static.wikia.nocookie.net/android/images/d/d2/Honeycomb-logo2-e1298681115525.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_3.1_Honeycomb",
        ),
        Version(
            codename = "Honeycomb MR2",
            apiLevel = Build.VERSION_CODES.HONEYCOMB_MR2,
            osVersion = "3.2",
            release = LocalDate(2011, 7, 15),
            imageUrl = "https://static.wikia.nocookie.net/android/images/d/d2/Honeycomb-logo2-e1298681115525.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_3.2_Honeycomb",
        ),
        Version(
            codename = "Ice Cream Sandwich",
            apiLevel = Build.VERSION_CODES.ICE_CREAM_SANDWICH,
            osVersion = "4.0",
            release = LocalDate(2011, 10, 19),
            imageUrl = "https://static.wikia.nocookie.net/android/images/d/de/11x05101719.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_4.0_Ice_Cream_Sandwich",
        ),
        Version(
            codename = "Ice Cream Sandwich MR1",
            apiLevel = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1,
            osVersion = "4.0.3",
            release = LocalDate(2011, 12, 16),
            imageUrl = "https://static.wikia.nocookie.net/android/images/d/de/11x05101719.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_4.0_Ice_Cream_Sandwich",
        ),
        Version(
            codename = "Jelly Bean",
            apiLevel = Build.VERSION_CODES.JELLY_BEAN,
            osVersion = "4.1",
            release = LocalDate(2012, 7, 9),
            imageUrl = "https://static.wikia.nocookie.net/android/images/c/c3/Android-Jelly-Bean-Logo.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_4.1_Jelly_Bean",
        ),
        Version(
            codename = "Jelly Bean MR1",
            apiLevel = Build.VERSION_CODES.JELLY_BEAN_MR1,
            osVersion = "4.2",
            release = LocalDate(2012, 11, 13),
            imageUrl = "https://static.wikia.nocookie.net/android/images/c/c3/Android-Jelly-Bean-Logo.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_4.2_Jelly_Bean",
        ),
        Version(
            codename = "KitKat",
            apiLevel = Build.VERSION_CODES.KITKAT,
            osVersion = "4.4",
            release = LocalDate(2013, 10, 31),
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Android_KitKat_logo.svg/600px-Android_KitKat_logo.svg.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_4.4_KitKat",
        ),
        Version(
            codename = "Lollipop",
            apiLevel = Build.VERSION_CODES.LOLLIPOP,
            osVersion = "5.0",
            release = LocalDate(2014, 11, 12),
            imageUrl = "https://1.bp.blogspot.com/-U9MP8MVJfRc/VECiwuK8QmI/AAAAAAAAA1w/27T9dWOLdhg/s400/l_image.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_5.0_Lollipop",
        ),
        Version(
            codename = "Lollipop MR1",
            apiLevel = Build.VERSION_CODES.LOLLIPOP_MR1,
            osVersion = "5.1",
            release = LocalDate(2015, 3, 9),
            imageUrl = "https://1.bp.blogspot.com/-U9MP8MVJfRc/VECiwuK8QmI/AAAAAAAAA1w/27T9dWOLdhg/s400/l_image.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_5.1_Lollipop",
        ),
        Version(
            codename = "Marshmallow",
            apiLevel = Build.VERSION_CODES.M,
            osVersion = "6.0",
            release = LocalDate(2015, 11, 5),
            imageUrl = "https://1.bp.blogspot.com/-k3chiPh9F-Y/VdFmE9k4hpI/AAAAAAAAB9A/H2_MqasmAgw/s400/image00.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_6.0_Marshmallow",
        ),
        Version(
            codename = "Nougat",
            apiLevel = Build.VERSION_CODES.N,
            osVersion = "7.0",
            release = LocalDate(2016, 8, 22),
            imageUrl = "https://www.android.com/static/2016/img/share/n-lg.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_7.0_Nougat",
        ),
        Version(
            codename = "Nougat MR1",
            apiLevel = Build.VERSION_CODES.N_MR1,
            osVersion = "7.1",
            release = LocalDate(2016, 12, 5),
            imageUrl = "https://www.android.com/static/2016/img/share/n-lg.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_7.1_Nougat",
        ),
        Version(
            codename = "Oreo",
            apiLevel = Build.VERSION_CODES.O,
            osVersion = "8.0",
            release = LocalDate(2017, 8, 21),
            imageUrl = "https://www.android.com/static/2016/img/share/oreo-lg.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_8.0_Oreo",
        ),
        Version(
            codename = "Oreo MR1",
            apiLevel = Build.VERSION_CODES.O_MR1,
            osVersion = "8.1",
            release = LocalDate(2017, 12, 15),
            imageUrl = "https://www.android.com/static/2016/img/share/oreo-lg.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_8.1_Oreo",
        ),
        Version(
            codename = "Pie",
            apiLevel = Build.VERSION_CODES.P,
            osVersion = "9.0",
            release = LocalDate(2018, 3, 7),
            imageUrl = "https://developer.android.com/images/home/android-p-clear-bg-with-shadow.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_9.0_Pie",
        ),
        Version(
            codename = "Android 10",
            apiLevel = Build.VERSION_CODES.Q,
            osVersion = "10",
            release = LocalDate(2019, 9, 3),
            imageUrl = "https://storage.googleapis.com/gweb-uniblog-publish-prod/images/In-lineImage_1500x850.max-1000x1000.jpg",
            wikiUrl = "https://android.fandom.com/wiki/Android_10",
        ),
        Version(
            codename = "Android 11",
            apiLevel = Build.VERSION_CODES.R,
            osVersion = "11",
            release = LocalDate(2020, 9, 8),
            imageUrl = "https://2.bp.blogspot.com/-9NU3hYP8vds/Xk1vy92jn5I/AAAAAAAAOKU/iYw7pMix3CcDjuerT5M0mYoDegdjPEwGQCLcBGAsYHQ/s1600/Dialscreenshot.png",
            wikiUrl = "https://android.fandom.com/wiki/Android_11",
        ),
    ).associateBy { it.apiLevel }
}