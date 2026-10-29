package p000;

import ads_mobile_sdk.C0042b3;
import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.uh3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qa5 extends AbstractC1350y implements dc5, ua5 {
    @Override // p000.dc5
    /* JADX INFO: renamed from: a */
    public final Object mo1359a(AbstractC1384yx abstractC1384yx, wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            AbstractC1384yx abstractC1384yx2 = abstractC1384yx;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0079d3((String) entry.getKey(), (ua5) entry.getValue(), (wm0) null, (Object) abstractC1384yx2, (byte) 8), 3);
            abstractC1384yx = abstractC1384yx2;
        }
        return ju4.f22634a;
    }

    @Override // p000.dc5
    /* JADX INFO: renamed from: e */
    public final void mo2714e() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 5), 3);
        }
    }

    @Override // p000.dc5
    /* JADX INFO: renamed from: i */
    public final Object mo883i(wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 2), 3);
        }
        return ju4.f22634a;
    }

    @Override // p000.dc5
    /* JADX INFO: renamed from: a */
    public final Object mo703a(uh3 uh3Var, wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            uh3 uh3Var2 = uh3Var;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0079d3((String) entry.getKey(), (ua5) entry.getValue(), (wm0) null, (Object) uh3Var2, (byte) 2), 3);
            uh3Var = uh3Var2;
        }
        return ju4.f22634a;
    }

    @Override // p000.dc5
    /* JADX INFO: renamed from: a */
    public final Object mo468a(Map map, wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            Map map2 = map;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0079d3((String) entry.getKey(), (ua5) entry.getValue(), (wm0) null, (Object) map2, (byte) 3), 3);
            map = map2;
        }
        return ju4.f22634a;
    }
}
