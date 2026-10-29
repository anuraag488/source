package p000;

import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1168t3 {
    /* JADX INFO: renamed from: a */
    public static int m10963a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    /* JADX INFO: renamed from: b */
    public static int m10964b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m10965c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10966d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    /* JADX INFO: renamed from: e */
    public static void m10967e(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}
