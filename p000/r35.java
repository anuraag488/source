package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r35 {

    /* JADX INFO: renamed from: b */
    public static final r35 f28983b;

    /* JADX INFO: renamed from: a */
    public y63 f28984a;

    static {
        r35 r35Var = new r35();
        r35Var.f28984a = null;
        f28983b = r35Var;
    }

    /* JADX INFO: renamed from: a */
    public static y63 m10189a(Context context) {
        y63 y63Var;
        r35 r35Var = f28983b;
        synchronized (r35Var) {
            try {
                y63Var = r35Var.f28984a;
                if (y63Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    y63Var = new y63();
                    y63Var.f34949a = context;
                    VarHandle.storeStoreFence();
                    r35Var.f28984a = y63Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y63Var;
    }
}
