package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zu1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f36381a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM7389n;
        try {
            objM7389n = new yu1(m13794a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM7389n = k43.m7389n(th);
        }
        if (objM7389n instanceof cp3) {
            objM7389n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m13794a(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
    }
}
