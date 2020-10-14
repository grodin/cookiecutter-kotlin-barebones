@file:Suppress("NOTHING_TO_INLINE")

import org.gradle.api.artifacts.dsl.DependencyHandler

inline fun DependencyHandler.kotest(artifact: String): String = "io.kotest:kotest-$artifact:${Versions.KOTEST}"
