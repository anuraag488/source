package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dm2 implements AccessibilityManager.AccessibilityServicesStateChangeListener {

    /* JADX INFO: renamed from: a */
    public d83 f17187a;

    /* JADX INFO: renamed from: b */
    public d83 f17188b;

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f17187a.setValue(Boolean.valueOf(fm2.m5743a(accessibilityManager)));
        this.f17188b.setValue(Boolean.valueOf(fm2.m5744b(accessibilityManager)));
    }
}
