package p000;

/* JADX INFO: renamed from: mf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0907mf implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24848a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24849b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24850c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24851d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f24852e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f24853f;

    public /* synthetic */ C0907mf(byte b) {
        this.f24848a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f24848a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((cd3) this.f24849b).m3980n((wp1) this.f24850c, (ed3) this.f24851d, (String) this.f24852e, (df2) this.f24853f);
                break;
            case 1:
                kv1 kv1Var = (kv1) this.f24849b;
                mx4 mx4Var = (mx4) this.f24850c;
                yp1 yp1Var = (yp1) this.f24851d;
                z73 z73Var = (z73) this.f24852e;
                sw2 sw2Var = (sw2) this.f24853f;
                kv1Var.f23535a = null;
                dp2 dp2Var = mx4Var.f25284a;
                lx4 lx4Var = (lx4) dp2Var.f17255b;
                AbstractC0990oo.m9206a0(null, lx4Var.f24448d);
                lx4Var.f24449e = 0;
                lx4 lx4Var2 = (lx4) dp2Var.f17256c;
                AbstractC0990oo.m9206a0(null, lx4Var2.f24448d);
                lx4Var2.f24449e = 0;
                dp2Var.f17254a = 0L;
                z73Var.m13400i(0.0f);
                Float f = (Float) sw2Var.getValue();
                sw2Var.setValue(null);
                if (f != null && yp1Var != null) {
                    yp1Var.invoke(f);
                }
                break;
            default:
                lb5.m7910S((pw3) this.f24849b, null, null, new C1031pe((yp1) this.f24850c, (mq1) this.f24851d, (yp1) this.f24852e, (sw2) this.f24853f, (wm0) null), 3);
                break;
        }
        return ju4Var;
    }
}
