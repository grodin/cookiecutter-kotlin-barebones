import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.tasktree: PluginDependencySpec get() = id("com.dorongold.task-tree")
inline val PluginDependenciesSpec.detekt: PluginDependencySpec get() = id("io.gitlab.arturbosch.detekt")
inline val PluginDependenciesSpec.testlogger: PluginDependencySpec get() = id("com.adarshr.test-logger")
