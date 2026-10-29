package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 implements AccessibilityManager.AccessibilityStateChangeListener, xb4 {

    /* JADX INFO: renamed from: a */
    public boolean f19119a;

    /* JADX INFO: renamed from: b */
    public d83 f19120b;

    /* JADX INFO: renamed from: c */
    public em2 f19121c;

    /* JADX INFO: renamed from: d */
    public dm2 f19122d;

    /* JADX INFO: renamed from: a */
    public static boolean m5743a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && hd4.m6335a0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5744b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && hd4.m6335a0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    @Override // p000.xb4
    public final Object getValue() {
        boolean z;
        dm2 dm2Var = this.f19122d;
        if (((Boolean) this.f19120b.getValue()).booleanValue()) {
            em2 em2Var = this.f19121c;
            z = true;
            if ((em2Var == null || !((Boolean) em2Var.f18258a.getValue()).booleanValue()) && (!this.f19119a || dm2Var == null || !((Boolean) dm2Var.f17187a.getValue()).booleanValue())) {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f19120b.setValue(Boolean.valueOf(z));
    }
}
