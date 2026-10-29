package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n21 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ iq1 f25405A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f25406B;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f25407u = 0;

    /* JADX INFO: renamed from: v */
    public byte f25408v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f25409w;

    /* JADX INFO: renamed from: x */
    public Object f25410x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f25411y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ iq1 f25412z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(fj0 fj0Var, i21 i21Var, mq1 mq1Var, wp1 wp1Var, C0729hl c0729hl, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25410x = fj0Var;
        this.f25411y = i21Var;
        this.f25412z = mq1Var;
        this.f25405A = wp1Var;
        this.f25406B = c0729hl;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f25407u;
        Object obj2 = this.f25406B;
        iq1 iq1Var = this.f25405A;
        iq1 iq1Var2 = this.f25412z;
        Object obj3 = this.f25411y;
        switch (b) {
            case 0:
                n21 n21Var = new n21((fj0) this.f25410x, (i21) obj3, (mq1) iq1Var2, (wp1) iq1Var, (C0729hl) obj2, wm0Var);
                n21Var.f25409w = obj;
                return n21Var;
            default:
                n21 n21Var2 = new n21((zo0) obj3, (ek4) iq1Var2, (C0761ih) iq1Var, (df3) obj2, wm0Var);
                n21Var2.f25409w = obj;
                return n21Var2;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25407u;
        ju4 ju4Var = ju4.f22634a;
        uf4 uf4Var = (uf4) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((n21) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        uf4 uf4Var;
        Object objM5717a;
        uf4 uf4Var2;
        t82 t82VarM7910S;
        Object objM5718b;
        wm0 wm0Var;
        Object objM5725i;
        t82 t82Var;
        lc3 lc3Var;
        byte b = this.f25407u;
        ju4 ju4Var = ju4.f22634a;
        iq1 iq1Var = this.f25405A;
        iq1 iq1Var2 = this.f25412z;
        Object obj2 = this.f25406B;
        Object obj3 = this.f25411y;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b4 = this.f25408v;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    uf4Var = (uf4) this.f25409w;
                    fc3 fc3Var = fc3.f18903a;
                    this.f25409w = uf4Var;
                    this.f25408v = (byte) 1;
                    objM5717a = fi4.m5717a(uf4Var, false, fc3Var, this);
                    if (objM5717a != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uf4Var = (uf4) this.f25409w;
                k43.m7376J(obj);
                objM5717a = obj;
                this.f25409w = null;
                this.f25408v = (byte) 2;
                if (q21.m9713h(uf4Var, (lc3) objM5717a, (fj0) this.f25410x, (i21) obj3, (mq1) iq1Var2, (wp1) iq1Var, (C0729hl) obj2, this) != ap0Var) {
                    return ju4Var;
                }
                return ap0Var;
            default:
                zo0 zo0Var = (zo0) obj3;
                df3 df3Var = (df3) obj2;
                ap0 ap0Var2 = ap0.f14763a;
                byte b5 = this.f25408v;
                wm0 wm0Var2 = null;
                if (b5 == 0) {
                    k43.m7376J(obj);
                    uf4Var2 = (uf4) this.f25409w;
                    t82VarM7910S = lb5.m7910S(zo0Var, null, cp0.f16328d, new zh4(df3Var, wm0Var2, b2), 1);
                    this.f25409w = uf4Var2;
                    this.f25410x = t82VarM7910S;
                    this.f25408v = (byte) 1;
                    objM5718b = fi4.m5718b(uf4Var2, this, 3);
                    if (objM5718b != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b5 == 1) {
                    t82VarM7910S = (t82) this.f25410x;
                    uf4Var2 = (uf4) this.f25409w;
                    k43.m7376J(obj);
                    objM5718b = obj;
                } else {
                    if (b5 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t82Var = (t82) this.f25409w;
                    k43.m7376J(obj);
                    objM5725i = obj;
                    wm0Var = null;
                }
                lc3Var = (lc3) objM5725i;
                if (lc3Var == null) {
                    fi4.m5722f(zo0Var, t82Var, new yh4(df3Var, wm0Var, b2));
                    return ju4Var;
                }
                lc3Var.m7952a();
                fi4.m5722f(zo0Var, t82Var, new yh4(df3Var, wm0Var, b3));
                ((C0761ih) iq1Var).invoke(b33.m3423a(lc3Var.f23937c));
                return ju4Var;
                lc3 lc3Var2 = (lc3) objM5718b;
                lc3Var2.m7952a();
                ek4 ek4Var = (ek4) iq1Var2;
                if (ek4Var != fi4.f19017a) {
                    wm0Var = null;
                    fi4.m5722f(zo0Var, t82VarM7910S, new er2(ek4Var, df3Var, lc3Var2, wm0Var2, (byte) 14));
                } else {
                    wm0Var = null;
                }
                this.f25409w = t82VarM7910S;
                this.f25410x = wm0Var;
                this.f25408v = (byte) 2;
                objM5725i = fi4.m5725i(uf4Var2, fc3.f18904b, this);
                if (objM5725i != ap0Var2) {
                    t82Var = t82VarM7910S;
                    lc3Var = (lc3) objM5725i;
                    if (lc3Var == null) {
                        fi4.m5722f(zo0Var, t82Var, new yh4(df3Var, wm0Var, b2));
                        return ju4Var;
                    }
                    lc3Var.m7952a();
                    fi4.m5722f(zo0Var, t82Var, new yh4(df3Var, wm0Var, b3));
                    ((C0761ih) iq1Var).invoke(b33.m3423a(lc3Var.f23937c));
                    return ju4Var;
                }
                return ap0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(zo0 zo0Var, ek4 ek4Var, C0761ih c0761ih, df3 df3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25411y = zo0Var;
        this.f25412z = ek4Var;
        this.f25405A = c0761ih;
        this.f25406B = df3Var;
    }
}
