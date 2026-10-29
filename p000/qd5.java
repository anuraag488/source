package p000;

import ads_mobile_sdk.C0042b3;
import ads_mobile_sdk.sy3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qd5 extends AbstractC1350y implements ve5 {
    @Override // p000.ve5
    /* JADX INFO: renamed from: c */
    public final void mo2696c(of4 of4Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 6), 3);
        }
    }

    @Override // p000.ve5
    /* JADX INFO: renamed from: j */
    public final Object mo2056j(wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 11), 3);
        }
        return ju4.f22634a;
    }

    @Override // p000.ve5
    /* JADX INFO: renamed from: m */
    public final void mo2697m(of4 of4Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 9), 3);
        }
    }
}
