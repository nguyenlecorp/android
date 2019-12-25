package com.nextcloud.client.mixins

import android.content.Intent
import android.os.Bundle

/**
 * Interface allowing to implement part of [android.app.Activity] logic as
 * a mix-in.
 */
interface ActivityMixin {
    fun onNewIntent(intent: Intent) { /* no-op */ }
    fun onSaveInstanceState(outState: Bundle) { /* no-op */ }
    fun onCreate(savedInstanceState: Bundle?) { /* no-op */ }
    fun onRestart() { /* no-op */ }
    fun onStart() { /* no-op */ }
    fun onResume() { /* no-op */ }
    fun onPause() { /* no-op */ }
    fun onStop() { /* no-op */ }
    fun onDestroy() { /* no-op */ }
}
