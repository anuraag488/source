package p000;

import android.accessibilityservice.AccessibilityService;

/* JADX INFO: renamed from: y3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1354y3 {

    /* JADX INFO: renamed from: a */
    public d83 f34828a;

    /* JADX INFO: renamed from: b */
    public w94 f34829b;

    /* JADX INFO: renamed from: c */
    public w94 f34830c;

    /* JADX INFO: renamed from: d */
    public w94 f34831d;

    /* JADX INFO: renamed from: a */
    public final AccessibilityService m12815a() {
        return (AccessibilityService) this.f34828a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final Object m12816b(int i) {
        try {
            return Boolean.valueOf(m12815a().performGlobalAction(i));
        } catch (Throwable th) {
            sc6.m10643O(th);
            return sj3.m10807c(th);
        }
    }
}
