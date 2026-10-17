// Task 13.3
package io.kotest.provided

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.spec.IsolationMode

object ProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true
    override val isolationMode = IsolationMode.InstancePerRoot
}