package com.example.pilhelloworld

import android.app.Activity
import java.lang.ref.WeakReference

open class ActivityView(activity: Activity) {
    private val activityReference: WeakReference<Activity> = WeakReference(activity)

    val activity: Activity?
        get() = activityReference.get()
}
