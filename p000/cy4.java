package p000;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cy4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f16619a = 0;

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m4232a(ViewGroup viewGroup, AbstractC0513c3 abstractC0513c3) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC0513c3.f15778b);
    }
}
