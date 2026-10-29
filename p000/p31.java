package p000;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p31 {

    /* JADX INFO: renamed from: a */
    public int f27336a;

    /* JADX INFO: renamed from: b */
    public long f27337b;

    /* JADX INFO: renamed from: c */
    public Object f27338c;

    /* JADX INFO: renamed from: d */
    public Object f27339d;

    /* JADX INFO: renamed from: e */
    public Object f27340e;

    /* JADX WARN: Code duplicated, block: B:29:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x002e A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public boolean m9359a(C1394z6 c1394z6, ek3 ek3Var, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.f27340e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            hk3 hk3Var = (hk3) it.next();
            synchronized (hk3Var) {
                if (z) {
                    try {
                        if (!(hk3Var.f20647o != null)) {
                            continue;
                        } else if (hk3Var.m6420Z(c1394z6, arrayList)) {
                            ek3Var.m5150a(hk3Var);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (hk3Var.m6420Z(c1394z6, arrayList)) {
                    ek3Var.m5150a(hk3Var);
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m9360b(hk3 hk3Var, long j) {
        byte[] bArr = zv4.f36415a;
        ArrayList arrayList = hk3Var.f20656x;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String strConcat = "A connection to " + hk3Var.f20642j.f22543a.f35775h + " was leaked. Did you forget to close a response body?";
                hb3 hb3Var = hb3.f20468a;
                hb3 hb3Var2 = hb3.f20468a;
                Throwable th = ((ck3) reference).f16086a;
                hb3Var2.getClass();
                if (th == null) {
                    strConcat = strConcat.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                }
                hb3.m6326f(5, strConcat, th);
                arrayList.remove(i);
                hk3Var.f20650r = true;
                if (arrayList.isEmpty()) {
                    hk3Var.f20657y = j - this.f27337b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
