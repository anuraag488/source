package p000;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class q61 {

    /* JADX INFO: renamed from: a */
    public static final float f28238a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f28239b;

    /* JADX INFO: renamed from: c */
    public static final double f28240c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f28239b = dLog;
        f28240c = dLog - 1.0d;
    }
}
