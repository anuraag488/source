package p000;

import ads_mobile_sdk.C0042b3;
import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.C0101ef;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.sy3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hj5 extends AbstractC1350y implements zk5 {
    @Override // p000.zk5
    /* JADX INFO: renamed from: a */
    public final Object mo613a(lp3 lp3Var, wm0 wm0Var) {
        l73 l73VarM12807a = AbstractC1350y.m12807a((Map) this.f34753b);
        Map map = (Map) l73VarM12807a.f23833a;
        Map map2 = (Map) l73VarM12807a.f23834b;
        wm0 wm0Var2 = null;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                ua5 ua5Var = (ua5) entry.getValue();
                kh3 kh3Var = (kh3) this.f34754c;
                C0101ef c0101ef = new C0101ef(str, ua5Var, null, lp3Var);
                kh3Var.getClass();
                kh3Var.f6220b.mo5493n(c0101ef);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            lp3 lp3Var2 = lp3Var;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0079d3((String) entry2.getKey(), (ua5) entry2.getValue(), wm0Var2, (Object) lp3Var2, (byte) 21), 3);
            lp3Var = lp3Var2;
        }
        return ju4.f22634a;
    }

    @Override // p000.zk5
    /* JADX INFO: renamed from: d */
    public final Object mo1098d(wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 15), 3);
        }
        return ju4.f22634a;
    }

    @Override // p000.zk5
    /* JADX INFO: renamed from: n */
    public final Object mo1100n(wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 17), 3);
        }
        return ju4.f22634a;
    }
}
