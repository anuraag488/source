package p000;

import android.os.Looper;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mi4 {

    /* JADX INFO: renamed from: a */
    public static final bu3 f24958a;

    /* JADX INFO: renamed from: b */
    public static final sz0 f24959b;

    static {
        bu3 bu3Var = new bu3((byte) 5);
        km5 km5Var = new km5(Looper.getMainLooper());
        Looper.getMainLooper();
        bu3Var.f15636b = km5Var;
        VarHandle.storeStoreFence();
        f24958a = bu3Var;
        f24959b = new sz0((byte) 2);
    }
}
