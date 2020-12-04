/*
 * Copyright (C) 2017-2020 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package org.ossreviewtoolkit.utils

object LicenseFilenamePatterns {
    /**
     * A list of globs that match default license file names.
     */
    val LICENSE_FILENAMES = listOf(
        "copying*",
        "copyright",
        "licence*",
        "license*",
        "*.licence",
        "*.license",
        "unlicence",
        "unlicense"
    )

    /**
     * A list of globs that match default patent file names. The patterns are supposed to be used case-insenstively.
     */
    val PATENT_FILENAMES = listOf(
        "patents"
    )

    /**
     * A list of globs that match files that often define the root license of a project, but are no license files and
     * are therefore not contained in [LICENSE_FILENAMES]. The patterns are supposed to be used case-insenstively.
     */
    val ROOT_LICENSE_FILENAMES = listOf(
        "readme*"
    )

    /**
     * A list of globs that match all kind of license file names, equaling the union of [LICENSE_FILENAMES],
     * [PATENT_FILENAMES] and [ROOT_LICENSE_FILENAMES]. The patterns are supposed to be used case-insenstively.
     */
    val ALL_LICENSE_FILENAMES = LICENSE_FILENAMES + PATENT_FILENAMES + ROOT_LICENSE_FILENAMES
}
