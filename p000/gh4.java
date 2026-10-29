package p000;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f19795a = {new jw2(gh4.class, "useSystemOverlayTriggerViews", "getUseSystemOverlayTriggerViews(Lessentials/data/Settings;)Z", 1)};

    /* JADX INFO: renamed from: b */
    public static final tt2 f19796b;

    static {
        f19796b = h44.m6219c("use_system_overlay_trigger_views", Boolean.valueOf(Build.VERSION.SDK_INT < 34), a10.f32a);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m6005a(a44 a44Var) {
        return ((Boolean) f19796b.m11153t(a44Var, f19795a[0])).booleanValue();
    }
}
