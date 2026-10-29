package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513c3 {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f15776c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f15777a = f15776c;

    /* JADX INFO: renamed from: b */
    public final C0477b3 f15778b;

    public AbstractC0513c3() {
        C0477b3 c0477b3 = new C0477b3();
        c0477b3.f15047a = this;
        VarHandle.storeStoreFence();
        this.f15778b = c0477b3;
    }

    /* JADX INFO: renamed from: a */
    public ar3 mo3837a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f15777a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider == null) {
            return null;
        }
        ar3 ar3Var = new ar3((byte) 5);
        ar3Var.f14813b = accessibilityNodeProvider;
        VarHandle.storeStoreFence();
        return ar3Var;
    }

    /* JADX INFO: renamed from: b */
    public void mo3838b(View view, C1242v3 c1242v3) {
        this.f15777a.onInitializeAccessibilityNodeInfo(view, c1242v3.f32353a);
    }
}
