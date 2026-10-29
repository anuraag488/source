package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ xl4 f34438a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uj2 f34439b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f34440c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f34441d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f34442e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ hk4 f34443f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ xk4 f34444g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ xy4 f34445h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ nt2 f34446i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ nt2 f34447j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ nt2 f34448k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ nt2 f34449l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ e30 f34450m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ pk4 f34451n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ boolean f34452o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ yz4 f34453p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ zo0 f34454q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ yp1 f34455r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ vi3 f34456s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ ky0 f34457t;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        nt2 nt2Var;
        xl4 xl4Var = this.f34438a;
        uj2 uj2Var = this.f34439b;
        boolean z = this.f34440c;
        int i = this.f34441d;
        boolean z2 = this.f34442e;
        hk4 hk4Var = this.f34443f;
        xk4 xk4Var = this.f34444g;
        xy4 xy4Var = this.f34445h;
        nt2 nt2Var2 = this.f34446i;
        nt2 nt2Var3 = this.f34447j;
        nt2 nt2Var4 = this.f34448k;
        nt2 nt2Var5 = this.f34449l;
        e30 e30Var = this.f34450m;
        pk4 pk4Var = this.f34451n;
        boolean z3 = this.f34452o;
        yz4 yz4Var = this.f34453p;
        zo0 zo0Var = this.f34454q;
        yp1 yp1Var = this.f34455r;
        vi3 vi3Var = this.f34456s;
        ky0 ky0Var = this.f34457t;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = ((p11) uj2Var.f31918g.getValue()).f27285a;
            nt2 nt2VarM8576d = n74.m8576d(kt2.f23428a, f, p11.m9352c(f, 0.0f) ? Float.NaN : f);
            as4.m3241T(z ? 1 : 0, i);
            if ((!z || i != Integer.MAX_VALUE) && z2) {
                aw1 aw1Var = new aw1();
                aw1Var.f14911a = xl4Var;
                aw1Var.f14912b = z;
                aw1Var.f14913c = i;
                VarHandle.storeStoreFence();
                nt2VarM8576d = nt2VarM8576d.mo7630d(aw1Var);
            }
            boolean zM6894i = ir1Var.m6894i(uj2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj3 = objM6869O;
                C1053q c1053q = new C1053q((byte) 19);
                c1053q.f28113b = uj2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1053q);
                obj3 = c1053q;
            }
            obj3 = objM6869O;
            wp1 wp1Var = (wp1) obj3;
            d63 d63Var = (d63) hk4Var.f20664f.getValue();
            long j = xk4Var.f34342b;
            int i2 = ql4.f28557c;
            int iM9903g = (int) (j >> 32);
            long j2 = hk4Var.f20663e;
            if (iM9903g == ((int) (j2 >> 32)) && (iM9903g = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                iM9903g = ql4.m9903g(j);
            }
            hk4Var.f20663e = xk4Var.f34342b;
            uo4 uo4VarM4679A = dt0.m4679A(xy4Var, xk4Var.f34341a);
            int iOrdinal = d63Var.ordinal();
            if (iOrdinal == 0) {
                vx4 vx4Var = new vx4();
                vx4Var.f32911a = hk4Var;
                vx4Var.f32912b = iM9903g;
                vx4Var.f32913c = uo4VarM4679A;
                vx4Var.f32914d = wp1Var;
                VarHandle.storeStoreFence();
                nt2Var = vx4Var;
            } else {
                if (iOrdinal != 1) {
                    C0670g.m5864c();
                    return null;
                }
                hx1 hx1Var = new hx1();
                hx1Var.f20907a = hk4Var;
                hx1Var.f20908b = iM9903g;
                hx1Var.f20909c = uo4VarM4679A;
                hx1Var.f20910d = wp1Var;
                VarHandle.storeStoreFence();
                nt2Var = hx1Var;
            }
            nt2 nt2VarMo7630d = i25.m6620n(n63.m8545a(nt2VarM8576d)).mo7630d(nt2Var).mo7630d(nt2Var2).mo7630d(nt2Var3);
            vk4 vk4Var = new vk4();
            vk4Var.f32705a = xl4Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarM7939t = lb5.m7939t(nt2VarMo7630d.mo7630d(vk4Var).mo7630d(nt2Var4).mo7630d(nt2Var5), e30Var);
            yn0 yn0Var = new yn0();
            yn0Var.f35343a = pk4Var;
            yn0Var.f35344b = uj2Var;
            yn0Var.f35345c = z3;
            yn0Var.f35346d = yz4Var;
            yn0Var.f35347e = zo0Var;
            yn0Var.f35348f = yp1Var;
            yn0Var.f35349g = xk4Var;
            yn0Var.f35350h = vi3Var;
            yn0Var.f35351i = ky0Var;
            yn0Var.f35352j = e30Var;
            yn0Var.f35353k = i;
            VarHandle.storeStoreFence();
            AbstractC1356y5.m12912f(nt2VarM7939t, vd6.m11834R(1412697320, yn0Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
