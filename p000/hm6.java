package p000;

import java.io.OutputStream;
import java.lang.invoke.VarHandle;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hm6 {
    protected int zza;

    /* JADX INFO: renamed from: a */
    public abstract void mo6448a(in6 in6Var);

    /* JADX INFO: renamed from: b */
    public final void m6449b(OutputStream outputStream) {
        int iMo6451d = mo6451d();
        Logger logger = in6.f21595f;
        if (iMo6451d > 4096) {
            iMo6451d = 4096;
        }
        in6 in6Var = new in6();
        if (iMo6451d < 0) {
            C1077qn.m9987m("bufferSize must be >= 0");
            return;
        }
        int iMax = Math.max(iMo6451d, 20);
        in6Var.f21598b = new byte[iMax];
        in6Var.f21599c = iMax;
        if (outputStream == null) {
            xy4.m12782k("out");
            return;
        }
        in6Var.f21601e = outputStream;
        VarHandle.storeStoreFence();
        mo6448a(in6Var);
        if (in6Var.f21600d > 0) {
            in6Var.m6829i();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo6450c(kq6 kq6Var);

    /* JADX INFO: renamed from: d */
    public abstract int mo6451d();
}
