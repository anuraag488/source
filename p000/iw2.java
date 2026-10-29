package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iw2 {

    /* JADX INFO: renamed from: b */
    public static final iw2 f21844b;

    /* JADX INFO: renamed from: a */
    public AtomicReference f21845a;

    static {
        iw2 iw2Var = new iw2();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        wf3 wf3Var = new wf3();
        wf3Var.f33337a = new HashMap(map);
        wf3Var.f33338b = new HashMap(map2);
        VarHandle.storeStoreFence();
        iw2Var.f21845a = new AtomicReference(wf3Var);
        VarHandle.storeStoreFence();
        f21844b = iw2Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6955a(rf3 rf3Var) {
        wf3 wf3Var = (wf3) this.f21845a.get();
        z91 z91Var = new z91();
        z91Var.f35879a = new HashMap(wf3Var.f33337a);
        z91Var.f35880b = new HashMap(wf3Var.f33338b);
        HashMap map = z91Var.f35879a;
        if (rf3Var != null) {
            vf3 vf3Var = new vf3(rf3Var.f29224a, rf3Var.f29225b);
            if (map.containsKey(vf3Var)) {
                rf3 rf3Var2 = (rf3) map.get(vf3Var);
                if (!rf3Var2.equals(rf3Var) || rf3Var != rf3Var2) {
                    xd2.m12666m(vf3Var, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                }
            } else {
                map.put(vf3Var, rf3Var);
            }
        } else {
            xy4.m12782k("primitive constructor must be non-null");
        }
        this.f21845a.set(z91Var.m13455b());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6956b(yf3 yf3Var) {
        wf3 wf3Var = (wf3) this.f21845a.get();
        z91 z91Var = new z91();
        z91Var.f35879a = new HashMap(wf3Var.f33337a);
        z91Var.f35880b = new HashMap(wf3Var.f33338b);
        HashMap map = z91Var.f35880b;
        Class clsMo4516c = yf3Var.mo4516c();
        if (map.containsKey(clsMo4516c)) {
            yf3 yf3Var2 = (yf3) map.get(clsMo4516c);
            if (!yf3Var2.equals(yf3Var) || !yf3Var.equals(yf3Var2)) {
                xd2.m12666m(clsMo4516c, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
            }
        } else {
            map.put(clsMo4516c, yf3Var);
        }
        this.f21845a.set(z91Var.m13455b());
    }
}
