package p000;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i15 implements h15 {

    /* JADX INFO: renamed from: a */
    public static final i15 f21015a = new i15();

    @Override // p000.h15
    /* JADX INFO: renamed from: c */
    public final d15 mo6203c(Context context) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        return new d15(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }
}
