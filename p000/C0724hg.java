package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: hg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0724hg implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20539a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f20540b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f20541c;

    public /* synthetic */ C0724hg(byte b) {
        this.f20539a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f20539a;
        ju4 ju4Var = ju4.f22634a;
        i50 i50Var = ki0.f23136a;
        switch (b) {
            case 0:
                wp1 wp1Var = (wp1) this.f20541c;
                boolean z = this.f20540b;
                nt2 nt2Var = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj2);
                ir1Var.m6885d0(-196777734);
                long j = ((rl4) ir1Var.m6898k(sl4.f30376a)).f29397a;
                boolean zM6888f = ir1Var.m6888f(j) | ir1Var.m6890g(wp1Var) | ir1Var.m6892h(z);
                Object objM6869O = ir1Var.m6869O();
                Object obj4 = objM6869O;
                if (zM6888f || objM6869O == i50Var) {
                    C0760ig c0760ig = new C0760ig();
                    c0760ig.f21354a = j;
                    c0760ig.f21355b = wp1Var;
                    c0760ig.f21356c = z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0760ig);
                    obj4 = c0760ig;
                }
                nt2 nt2VarM5543n = C0638f5.m5543n(nt2Var, (yp1) obj4);
                ir1Var.m6912r(false);
                return nt2VarM5543n;
            case 1:
                boolean z2 = this.f20540b;
                nq1 nq1Var = (nq1) this.f20541c;
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var;
                if (ir1Var2.m6871T(1 & iIntValue, (iIntValue & 19) != 18)) {
                    zh3 zh3VarMo7523a = mz3.f25344a.mo7523a(new yy3(false, false, false, z2));
                    er1 er1Var = new er1((byte) 14);
                    er1Var.f18412b = nq1Var;
                    er1Var.f18413c = sg2Var;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a, vd6.m11834R(-1617384871, er1Var, ir1Var2), ir1Var2, 56);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 2:
                int iIntValue2 = ((Integer) obj3).intValue();
                a84.f165a.m137c((k84) obj, null, this.f20540b, (u74) this.f20541c, null, null, 0.0f, 0.0f, (mi0) obj2, (iIntValue2 & 14) | 100663296);
                return ju4Var;
            default:
                hk4 hk4Var = (hk4) this.f20541c;
                d83 d83Var = hk4Var.f20664f;
                boolean z3 = this.f20540b;
                ((Integer) obj3).getClass();
                ir1 ir1Var3 = (ir1) ((mi0) obj2);
                ir1Var3.m6885d0(-2137546592);
                boolean z4 = ((d63) d83Var.getValue()) == d63.f16814a || !(ir1Var3.m6898k(ij0.f21479n) == df2.f17012b);
                boolean zM6890g = ir1Var3.m6890g(hk4Var);
                Object objM6869O2 = ir1Var3.m6869O();
                Object obj5 = objM6869O2;
                if (zM6890g || objM6869O2 == i50Var) {
                    o04 o04Var = new o04((byte) 15);
                    o04Var.f26271b = hk4Var;
                    VarHandle.storeStoreFence();
                    ir1Var3.m6905n0(o04Var);
                    obj5 = o04Var;
                }
                sw2 sw2VarM7369C = k43.m7369C((yp1) obj5, ir1Var3);
                Object objM6869O3 = ir1Var3.m6869O();
                if (objM6869O3 == i50Var) {
                    C0761ih c0761ih = new C0761ih((byte) 10);
                    c0761ih.f21416b = sw2VarM7369C;
                    VarHandle.storeStoreFence();
                    objM6869O3 = qq2.m10019c(c0761ih);
                    ir1Var3.m6905n0(objM6869O3);
                }
                jy3 jy3Var = (jy3) objM6869O3;
                boolean zM6890g2 = ir1Var3.m6890g(jy3Var) | ir1Var3.m6890g(hk4Var);
                Object objM6869O4 = ir1Var3.m6869O();
                Object obj6 = objM6869O4;
                if (zM6890g2 || objM6869O4 == i50Var) {
                    gk4 gk4Var = new gk4();
                    gk4Var.f19836a = jy3Var;
                    fk4 fk4Var = new fk4((byte) 0);
                    fk4Var.f19062b = hk4Var;
                    VarHandle.storeStoreFence();
                    gk4Var.f19837b = s94.m10566b(fk4Var);
                    fk4 fk4Var2 = new fk4((byte) 1);
                    fk4Var2.f19062b = hk4Var;
                    VarHandle.storeStoreFence();
                    gk4Var.f19838c = s94.m10566b(fk4Var2);
                    VarHandle.storeStoreFence();
                    ir1Var3.m6905n0(gk4Var);
                    obj6 = gk4Var;
                }
                nt2 nt2VarM4797a = dy3.m4797a((gk4) obj6, (d63) d83Var.getValue(), z3 && hk4Var.f20660b.m13399h() != 0.0f, z4);
                ir1Var3.m6912r(false);
                return nt2VarM4797a;
        }
    }
}
