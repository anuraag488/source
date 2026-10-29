package p000;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nc6 {

    /* JADX INFO: renamed from: a */
    public static final if1 f25688a;

    static {
        if1 if1Var;
        Uri uri = qc6.f28388a;
        synchronized (sc6.class) {
            if1Var = sc6.f30164a;
            if (if1Var == null) {
                if1Var = new if1();
                synchronized (sc6.class) {
                    if (sc6.f30164a != null) {
                        throw new IllegalStateException("init() already called");
                    }
                    sc6.f30164a = if1Var;
                }
            }
        }
        f25688a = if1Var;
    }
}
