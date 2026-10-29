package p000;

import ads_mobile_sdk.C0017a1;
import ads_mobile_sdk.sy3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y75 extends AbstractC1350y implements b95 {
    @Override // p000.b95
    public final void a$3() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 6), 3);
        }
    }

    @Override // p000.b95
    /* JADX INFO: renamed from: b */
    public final void mo1975b() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 0), 3);
        }
    }

    @Override // p000.b95
    /* JADX INFO: renamed from: c */
    public final void mo1976c() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 2), 3);
        }
    }

    @Override // p000.b95
    /* JADX INFO: renamed from: g */
    public final void mo1977g() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 3), 3);
        }
    }

    @Override // p000.b95
    public final void onDestroy() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 4), 3);
        }
    }

    @Override // p000.b95
    public final void onPause() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 5), 3);
        }
    }

    @Override // p000.b95
    public final void onResume() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 7), 3);
        }
    }

    @Override // p000.b95
    public final void onStop() {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0017a1((String) entry.getKey(), (ua5) entry.getValue(), null, (byte) 1), 3);
        }
    }
}
