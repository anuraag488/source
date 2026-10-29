package p000;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.uh3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ae5 extends AbstractC1350y implements hf5 {
    @Override // p000.hf5
    /* JADX INFO: renamed from: a */
    public final Object mo588a(i11 i11Var, yo3 yo3Var, wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            i11 i11Var2 = i11Var;
            yo3 yo3Var2 = yo3Var;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C1031pe((String) entry.getKey(), (ua5) entry.getValue(), (wm0) null, (Object) i11Var2, (Object) yo3Var2, (byte) 26), 3);
            i11Var = i11Var2;
            yo3Var = yo3Var2;
        }
        return ju4.f22634a;
    }

    @Override // p000.hf5
    /* JADX INFO: renamed from: a */
    public final Object mo589a(uh3 uh3Var, C0213l2 c0213l2, yo3 yo3Var, wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            uh3 uh3Var2 = uh3Var;
            C0213l2 c0213l3 = c0213l2;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0980oe((String) entry.getKey(), (ua5) entry.getValue(), (wm0) null, uh3Var2, c0213l3, yo3Var), 3);
            uh3Var = uh3Var2;
            c0213l2 = c0213l3;
        }
        return ju4.f22634a;
    }
}
