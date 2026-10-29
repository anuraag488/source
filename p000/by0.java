package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15676a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cy0 f15677b;

    public /* synthetic */ by0(byte b) {
        this.f15676a = b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.wp1
    public final Object invoke() {
        hq3 hq3Var;
        dq3 dq3Var;
        fq3 fq3Var;
        bq3 bq3Var;
        byte b = this.f15676a;
        cy0 cy0Var = this.f15677b;
        switch (b) {
            case 0:
                tp3 tp3Var = (tp3) sj3.m10825u(cy0Var, xp3.f34517b);
                px0 px0Var = cy0Var.f16608y;
                if (tp3Var == null) {
                    if (px0Var != null) {
                        cy0Var.m10155P0(px0Var);
                    }
                    cy0Var.f16608y = null;
                } else if (px0Var == null) {
                    nv2 nv2Var = cy0Var.f16600q;
                    by0 by0Var = cy0Var.f16599E;
                    rq4 rq4Var = wp3.f33579a;
                    yp3 yp3Var = new yp3();
                    C1366yf c1366yf = new C1366yf();
                    c1366yf.f35177o = nv2Var;
                    c1366yf.f35178p = by0Var;
                    c1366yf.f35180r = 0L;
                    c1366yf.f35182t = new cw2();
                    c1366yf.f35183u = dt0.m4700c(0.0f);
                    c1366yf.f35184v = dt0.m4700c(0.0f);
                    VarHandle.storeStoreFence();
                    yp3Var.m10154O0(c1366yf);
                    cy0Var.m10154O0(yp3Var);
                    cy0Var.f16608y = yp3Var;
                }
                return ju4.f22634a;
            default:
                lu2 lu2Var = ((lq2) sj3.m10825u(cy0Var, pq2.f27894b)).f24280d;
                kq3 kq3Var = (kq3) sj3.m10825u(cy0Var, xp3.f34516a);
                tp3 tp3Var2 = (tp3) sj3.m10825u(cy0Var, xp3.f34517b);
                iq3 iq3Var = cy0Var.f16597C;
                if (iq3Var != null && z62.m13387o(cy0Var.f16595A, kq3Var) && z62.m13387o(cy0Var.f16609z, tp3Var2) && z62.m13387o(cy0Var.f16596B, lu2Var)) {
                    return iq3Var;
                }
                if (cy0Var.f16604u) {
                    float f = (tp3Var2 == null || tp3Var2.f31308b == null) ? 0.1f : 0.35999998f;
                    gq3 gq3Var = new gq3();
                    gq3Var.f20028a = f;
                    VarHandle.storeStoreFence();
                    hq3Var = gq3Var;
                } else {
                    hq3Var = wv1.f33772o;
                }
                if (cy0Var.f16605v) {
                    kq3Var.getClass();
                    float f2 = (tp3Var2 == null || tp3Var2.f31308b == null) ? 0.1f : 0.35999998f;
                    cq3 cq3Var = new cq3();
                    cq3Var.f16375a = f2;
                    VarHandle.storeStoreFence();
                    dq3Var = cq3Var;
                } else {
                    dq3Var = gb5.f19721l;
                }
                if (cy0Var.f16606w) {
                    float f3 = (tp3Var2 == null || tp3Var2.f31308b == null) ? 0.08f : 0.12f;
                    eq3 eq3Var = new eq3();
                    eq3Var.f18374a = f3;
                    VarHandle.storeStoreFence();
                    fq3Var = eq3Var;
                } else {
                    fq3Var = ig1.f21363B;
                }
                if (cy0Var.f16607x) {
                    float f4 = (tp3Var2 == null || tp3Var2.f31308b == null) ? 0.16f : 0.24f;
                    aq3 aq3Var = new aq3();
                    aq3Var.f14777a = f4;
                    VarHandle.storeStoreFence();
                    bq3Var = aq3Var;
                } else {
                    bq3Var = ia5.f21228s;
                }
                boolean z = cy0Var.f16601r;
                float f5 = cy0Var.f16602s;
                js1 js1Var = cy0Var.f16598D;
                iq3 iq3Var2 = new iq3();
                iq3Var2.f21636a = z;
                iq3Var2.f21637b = f5;
                iq3Var2.f21638c = js1Var;
                iq3Var2.f21639d = hq3Var;
                iq3Var2.f21640e = dq3Var;
                iq3Var2.f21641f = fq3Var;
                iq3Var2.f21642g = bq3Var;
                VarHandle.storeStoreFence();
                cy0Var.f16597C = iq3Var2;
                cy0Var.f16595A = kq3Var;
                cy0Var.f16609z = tp3Var2;
                cy0Var.f16596B = lu2Var;
                return iq3Var2;
        }
    }
}
