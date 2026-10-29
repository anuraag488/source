package p000;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface bf5 {
    void onActivityResumed(Activity activity);

    default void onActivityDestroyed(Activity activity) {
    }

    default void onActivityPaused(Activity activity) {
    }

    default void onActivityStarted(Activity activity) {
    }

    default void onActivityStopped(Activity activity) {
    }

    default void onActivityCreated(Activity activity, Bundle bundle) {
    }

    default void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
