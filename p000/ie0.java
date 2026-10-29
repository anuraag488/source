package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zo0 f21278b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21279c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f21280d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21281e;

    public /* synthetic */ ie0(byte b) {
        this.f21277a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f21277a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                lb5.m7910S((pw3) this.f21278b, null, null, new C0824k6(obj, null, (od1) this.f21279c, (yp1) this.f21280d, (sw2) this.f21281e), 3);
                break;
            case 1:
                lb5.m7910S(this.f21278b, null, null, new C1031pe(obj, (wm0) null, (InterfaceC0755ia) this.f21279c, (LinkedHashMap) this.f21280d, (Map) this.f21281e), 3);
                break;
            default:
                lb5.m7910S(this.f21278b, null, null, new C0980oe(obj, (wm0) null, (pn0) this.f21279c, (yp1) this.f21280d, (wp1) this.f21281e), 3);
                break;
        }
        return ju4Var;
    }
}
