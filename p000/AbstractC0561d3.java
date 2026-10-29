package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0561d3 {
    /* JADX INFO: renamed from: a */
    public static float m4327a(float f, DisplayMetrics displayMetrics) {
        return TypedValue.deriveDimension(1, f, displayMetrics);
    }

    /* JADX INFO: renamed from: b */
    public static AccessibilityNodeInfo.AccessibilityAction m4328b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: c */
    public static void m4329c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m4330d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: e */
    public static int[] m4331e(hl4 hl4Var, RectF rectF, int i, C1017p0 c1017p0) {
        SegmentFinder c1259vk = i == 1 ? new C1259vk(new yg3(hl4Var.f20679f.getText(), hl4Var.m6439l(), (byte) 9)) : new GraphemeClusterSegmentFinder(hl4Var.f20679f.getText(), hl4Var.f20674a);
        Layout layout = hl4Var.f20679f;
        C0832ke c0832ke = new C0832ke();
        c0832ke.f23080a = c1017p0;
        VarHandle.storeStoreFence();
        return layout.getRangeForRect(rectF, c1259vk, c0832ke);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4332f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4333g(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    /* JADX INFO: renamed from: h */
    public static void m4334h(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: i */
    public static void m4335i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }
}
