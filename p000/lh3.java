package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lh3 {

    /* JADX INFO: renamed from: a */
    public static final z91 f24035a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(lh3.class, C1044pr.f27906a);
        map2.remove(lh3.class);
        map.put(ea0.class, C0882lr.f24293a);
        map2.remove(ea0.class);
        map.put(wm4.class, C1118rr.f29541a);
        map2.remove(wm4.class);
        map.put(on2.class, C0993or.f26974a);
        map2.remove(on2.class);
        map.put(mn2.class, C0956nr.f26044a);
        map2.remove(mn2.class);
        map.put(ms1.class, C0919mr.f25161a);
        map2.remove(ms1.class);
        map.put(tc4.class, C1081qr.f28704a);
        map2.remove(tc4.class);
        HashMap map3 = new HashMap(map);
        HashMap map4 = new HashMap(map2);
        z91 z91Var = new z91();
        z91Var.f35879a = map3;
        z91Var.f35880b = map4;
        VarHandle.storeStoreFence();
        f24035a = z91Var;
    }
}
