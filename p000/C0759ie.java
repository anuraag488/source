package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ie */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0759ie implements t02 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f21276a;

    public C0759ie(Bitmap bitmap) {
        this.f21276a = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final int m6770a() {
        Bitmap.Config config = this.f21276a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
