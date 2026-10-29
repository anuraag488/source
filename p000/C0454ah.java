package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ah */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0454ah implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14502a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0651fh f14503b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ej4 f14504c;

    public /* synthetic */ C0454ah(byte b) {
        this.f14502a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        switch (this.f14502a) {
            case 0:
                C0651fh c0651fh = this.f14503b;
                ej4 ej4Var = this.f14504c;
                C1404zg c1404zg = c0651fh.f18976f;
                C1053q c1053q = new C1053q((byte) 3);
                c1053q.f28113b = ej4Var;
                VarHandle.storeStoreFence();
                return (dj4) c0651fh.m5709b("dataBuilder", c1404zg, c1053q);
            case 1:
                C0651fh c0651fh2 = this.f14503b;
                ej4 ej4Var2 = this.f14504c;
                C1404zg c1404zg2 = c0651fh2.f18977g;
                C0454ah c0454ah = new C0454ah((byte) 2);
                c0454ah.f14503b = c0651fh2;
                c0454ah.f14504c = ej4Var2;
                VarHandle.storeStoreFence();
                return (jl3) c0651fh2.m5709b("positioner", c1404zg2, c0454ah);
            default:
                C0651fh c0651fh3 = this.f14503b;
                ej4 ej4Var3 = this.f14504c;
                Object objInvoke = c0651fh3.f18973c.invoke();
                if (!((cf2) objInvoke).mo4000K()) {
                    objInvoke = null;
                }
                cf2 cf2Var = (cf2) objInvoke;
                return cf2Var == null ? jl3.f22395e : ej4Var3.mo5135s(cf2Var).m7174j(cf2Var.mo4005S(0L));
        }
    }
}
