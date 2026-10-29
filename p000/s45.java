package p000;

import essentials.accessibility.EsAccessibilityService;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s45 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29908a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29909b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29910c;

    public /* synthetic */ s45(byte b) {
        this.f29908a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f29908a) {
            case 0:
                ((cb3) obj).m3952k((db3) this.f29909b, 0, 0, ((t45) this.f29910c).f30779o);
                return ju4.f22634a;
            default:
                C1354y3 c1354y3 = (C1354y3) this.f29909b;
                EsAccessibilityService esAccessibilityService = (EsAccessibilityService) this.f29910c;
                int i = EsAccessibilityService.f18443d;
                c1354y3.f34828a.setValue(esAccessibilityService);
                ba3.m3533a();
                C1032pf c1032pf = new C1032pf((byte) 6);
                c1032pf.f27570b = c1354y3;
                VarHandle.storeStoreFence();
                return c1032pf;
        }
    }
}
