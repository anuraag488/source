package p000;

import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f31331a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public abstract C0736hs mo6928a();

    /* JADX INFO: renamed from: b */
    public final C0773is m11088b(long j, String str, boolean z) {
        C0736hs c0736hsMo6928a = mo6928a();
        sq0 sq0Var = ((C0773is) this).f21732k;
        if (sq0Var != null) {
            C1082qs c1082qsMo10421a = sq0Var.mo10421a();
            c1082qsMo10421a.f28735e = Long.valueOf(j);
            c1082qsMo10421a.f28736f = z;
            c1082qsMo10421a.f28743m = (byte) (c1082qsMo10421a.f28743m | 2);
            if (str != null) {
                C1343xt c1343xt = new C1343xt();
                c1343xt.f34611a = str;
                VarHandle.storeStoreFence();
                c1082qsMo10421a.f28738h = c1343xt;
            }
            c0736hsMo6928a.f20819j = c1082qsMo10421a.m10049a();
        }
        return c0736hsMo6928a.m6491a();
    }
}
