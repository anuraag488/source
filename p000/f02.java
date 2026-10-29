package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f02 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18630a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp1 f18631b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f18632c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ pg0 f18633d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f18634e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f18635f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f18636g;

    public /* synthetic */ f02(byte b) {
        this.f18630a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        nt2 nt2VarM7676B;
        byte b = this.f18630a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                wp1 wp1Var = this.f18631b;
                nt2 nt2Var = (nt2) this.f18634e;
                boolean z = this.f18632c;
                c02 c02Var = (c02) this.f18635f;
                p44 p44Var = (p44) this.f18636g;
                ((Integer) obj2).getClass();
                dt0.m4707i(vd6.m11838V(1572865), this.f18633d, (mi0) obj, wp1Var, c02Var, nt2Var, p44Var, z);
                return ju4Var;
            default:
                wp1 wp1Var2 = this.f18631b;
                wp1 wp1Var3 = (wp1) this.f18634e;
                nz3 nz3Var = ((oz3) this.f18635f).f27246c;
                nv2 nv2Var = (nv2) this.f18636g;
                boolean z2 = this.f18632c;
                pg0 pg0Var = this.f18633d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6885d0(-51876920);
                    if (wp1Var2 == null && wp1Var3 == null) {
                        nt2VarM7676B = kt2.f23428a;
                    } else {
                        if (wp1Var2 == null) {
                            ir1Var.m6885d0(-1645416874);
                            Object objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = new nu3((byte) 5);
                                ir1Var.m6905n0(objM6869O);
                            }
                            wp1Var2 = (wp1) objM6869O;
                        } else {
                            ir1Var.m6885d0(-330172969);
                        }
                        ir1Var.m6912r(false);
                        nt2VarM7676B = kx5.m7676B(nv2Var, xp3.m12729a(null, 255), z2, wp1Var3, wp1Var2);
                    }
                    ir1Var.m6912r(false);
                    nt2 nt2VarM5648F = AbstractC0647fd.m5648F(AbstractC0647fd.m5648F(nt2VarM7676B, nz3Var.f26223b), nz3Var.f26224c);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21381e, false);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM5648F);
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(wf2.f33290T);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    pg0Var.invoke(ir1Var, 0);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
        }
    }
}
