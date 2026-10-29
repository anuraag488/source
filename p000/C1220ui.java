package p000;

/* JADX INFO: renamed from: ui */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1220ui extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f31890i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f31891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1220ui(Object obj, byte b) {
        super(2);
        this.f31890i = b;
        this.f31891j = obj;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        eb0 eb0Var;
        long jM3430h;
        long jM12830H;
        boolean z;
        boolean zM9686b;
        qn3 qn3VarM10374a;
        Object obj3;
        byte b = this.f31890i;
        Object obj4 = this.f31891j;
        switch (b) {
            case 0:
                b91 b91Var = (b91) obj;
                b91 b91Var2 = (b91) obj2;
                b91 b91Var3 = b91.f15170c;
                return Boolean.valueOf(b91Var == b91Var3 && b91Var2 == b91Var3 && !((mc1) obj4).f24813a.f16338e);
            default:
                long j = ((b33) obj2).f15059a;
                ((lc3) obj).m7952a();
                rn3 rn3Var = ((en3) obj4).f18272a;
                gx2 gx2Var = rn3Var.f29449j;
                py3 py3Var = rn3Var.f29445f;
                wd3 wd3Var = rn3Var.f29440a;
                d83 d83Var = rn3Var.f29452m;
                d83Var.setValue(b33.m3423a(b33.m3430h(((b33) d83Var.getValue()).f15059a, j)));
                qn3 qn3VarM10375b = rn3Var.m10375b();
                if (qn3VarM10375b != null) {
                    long jM10381h = rn3Var.m10381h(rn3Var.m10376c());
                    rn3Var.m10382i(jM10381h);
                    long jM9991a = qn3VarM10375b.m9991a();
                    long jM3430h2 = b33.m3430h(i20.m6580e((int) (jM9991a >> 32), (int) (jM9991a & 4294967295L)), jM10381h);
                    long jM13369a0 = z62.m13369a0(qn3VarM10375b.m9992b());
                    long jM6580e = i20.m6580e(h74.m6273e(jM13369a0) + b33.m3427e(jM3430h2), h74.m6271c(jM13369a0) + b33.m3428f(jM3430h2));
                    w42 w42VarM12236d = wd3Var.m12236d();
                    C1313x c1313x = rn3Var.f29444e;
                    int iOrdinal = ((mi2) w42VarM12236d.f33090b).f24955p.ordinal();
                    if (iOrdinal == 0) {
                        eb0Var = new eb0(c1313x.f33889c, c1313x.f33890d);
                    } else {
                        if (iOrdinal != 1) {
                            C0670g.m5864c();
                            return null;
                        }
                        eb0Var = new eb0(c1313x.f33887a, c1313x.f33888b);
                    }
                    vw3 vw3VarM12086l = w42VarM12236d.m12086l(eb0Var);
                    float f = vw3VarM12086l.f32897a;
                    float f2 = vw3VarM12086l.f32898b;
                    ((mi2) wd3Var.m12236d().f33090b).getClass();
                    boolean z2 = rn3Var.f29447h == df2.f17012b && rn3Var.m10377d() == d63.f16815b;
                    if (z2) {
                        jM3430h = b33.m3429g(jM6580e, rn3Var.f29456q);
                    } else {
                        if (z2) {
                            C0670g.m5864c();
                            return null;
                        }
                        jM3430h = b33.m3430h(jM3430h2, rn3Var.f29456q);
                    }
                    d63 d63VarM10377d = rn3Var.m10377d();
                    int i = -((mi2) wd3Var.m12236d().f33090b).f24952m;
                    int iOrdinal2 = d63VarM10377d.ordinal();
                    if (iOrdinal2 == 0) {
                        jM12830H = y42.m12830H(0, i);
                    } else {
                        if (iOrdinal2 != 1) {
                            C0670g.m5864c();
                            return null;
                        }
                        jM12830H = y42.m12830H(i, 0);
                    }
                    long jM3430h3 = b33.m3430h(jM3430h, i20.m6580e((int) (jM12830H >> 32), (int) (jM12830H & 4294967295L)));
                    float fM4319t = d24.m4319t(jM3430h3, rn3Var.m10377d()) - f;
                    if (fM4319t < 0.0f) {
                        fM4319t = 0.0f;
                    }
                    float fM4319t2 = f2 - d24.m4319t(jM3430h3, rn3Var.m10377d());
                    if (fM4319t2 < 0.0f) {
                        fM4319t2 = 0.0f;
                    }
                    float f3 = rn3Var.f29443d;
                    if (fM4319t < f3) {
                        zM9686b = py3Var.m9686b(ky3.f23619a, (1.0f - sc6.m10674o((fM4319t + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new gn3(rn3Var, (byte) 2), new kn3(rn3Var, null, (byte) 0));
                        z = true;
                    } else if (fM4319t2 < f3) {
                        z = true;
                        zM9686b = py3Var.m9686b(ky3.f23620b, (1.0f - sc6.m10674o((fM4319t2 + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new gn3(rn3Var, (byte) 3), new kn3(rn3Var, null, (byte) 1));
                    } else {
                        z = true;
                        lb5.m7910S(py3Var.f28097b, null, null, new ny3(py3Var, null, (byte) 1), 3);
                        zM9686b = false;
                    }
                    if (gx2Var.m6192f()) {
                        t82 t82Var = py3Var.f28099d;
                        if ((t82Var != null && t82Var.mo4995b() == z) || zM9686b || (qn3VarM10374a = rn3.m10374a(rn3Var, AbstractC0647fd.m5671i(jM3430h2, jM6580e), wd3Var.m12236d().m12087m(), null, new C1183ti(qn3VarM10375b, (byte) 8), 4)) == null) {
                            obj3 = null;
                        } else {
                            obj3 = null;
                            lb5.m7910S(rn3Var.f29441b, null, null, new in3(rn3Var, qn3VarM10375b, qn3VarM10374a, null, (byte) 1), 3);
                        }
                        gx2Var.m6193g(obj3);
                    }
                }
                return ju4.f22634a;
        }
    }
}
