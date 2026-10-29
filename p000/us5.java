package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class us5 {

    /* JADX INFO: renamed from: a */
    public static final is5 f32149a;

    static {
        is5 is5Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            is5Var = new is5((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            is5Var = new is5((byte) 1);
        }
        f32149a = is5Var;
    }
}
