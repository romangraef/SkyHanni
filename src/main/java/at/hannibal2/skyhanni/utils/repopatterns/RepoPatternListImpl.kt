package at.hannibal2.skyhanni.utils.repopatterns

import java.util.regex.Pattern

class RepoPatternListImpl(fallback: List<String>, override val key: String) : RepoPatternList() {
    override var isLoadedRemotely: Boolean = false
    override var wasOverridden: Boolean = false
    override val defaultPattern: List<String> = fallback
    override var value: List<Pattern> = fallback.map(Pattern::compile)
    override fun dump(): Map<String, String> {
        return defaultPattern.withIndex().associate { (key + "." + it.index) to it.value }
    }
}