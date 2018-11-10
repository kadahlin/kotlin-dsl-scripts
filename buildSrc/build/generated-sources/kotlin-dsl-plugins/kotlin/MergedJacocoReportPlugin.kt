/**
 * Precompiled [mergedJacocoReport.gradle.kts][MergedJacocoReport_gradle] script plugin.
 *
 * @see MergedJacocoReport_gradle
 */
class MergedJacocoReportPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("MergedJacocoReport_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java)
                .newInstance(target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
