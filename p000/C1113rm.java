package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: rm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1113rm implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29402a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29403b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29404c;

    public /* synthetic */ C1113rm(byte b) {
        this.f29402a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        byte b = this.f29402a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    C0766im c0766im = (C0766im) this.f29403b;
                    ir1Var.m6885d0(-1632708933);
                    c20.f15761c.mo6204c(c0766im, (yp1) this.f29404c, null, as4.m3253l(sg2Var, ir1Var), ir1Var, 0);
                    ir1Var.m6912r(false);
                }
                break;
            case 1:
                sg2 sg2Var2 = (sg2) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                yp1 yp1Var = (yp1) this.f29404c;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(sg2Var2) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ir1Var2.m6874W();
                } else {
                    lr2 lr2Var = (lr2) this.f29403b;
                    ir1Var2.m6885d0(-612742195);
                    boolean zM6890g = ir1Var2.m6890g(yp1Var) | ir1Var2.m6886e(lr2Var.ordinal());
                    Object objM6869O = ir1Var2.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        C0839kl c0839kl = new C0839kl(b3);
                        c0839kl.f23208b = yp1Var;
                        c0839kl.f23209c = lr2Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0839kl);
                        obj4 = c0839kl;
                    }
                    bh0 bh0Var = new bh0(b2);
                    bh0Var.f15265b = lr2Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(-1280181805, bh0Var, ir1Var2);
                    bh0 bh0Var2 = new bh0(b3);
                    bh0Var2.f15265b = lr2Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, (wp1) obj4, null, null, pg0VarM11834R, null, vd6.m11834R(433481873, bh0Var2, ir1Var2), null, ir1Var2, 102236160, 695);
                    ir1Var2.m6912r(false);
                }
                break;
            case 2:
                sg2 sg2Var3 = (sg2) obj;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((ir1) mi0Var3).m6890g(sg2Var3) ? 4 : 2;
                }
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ir1Var3.m6874W();
                } else {
                    l73 l73Var = (l73) this.f29403b;
                    ir1Var3.m6885d0(677792392);
                    sn0 sn0Var = (sn0) l73Var.f23833a;
                    pn0 pn0Var = (pn0) l73Var.f23834b;
                    nt2 nt2VarM3253l = as4.m3253l(sg2Var3, ir1Var3);
                    pw3 pw3VarM10148d = qw3.m10148d(ir1Var3);
                    yp1 yp1Var2 = (yp1) this.f29404c;
                    nn0 nn0Var = new nn0(b2);
                    nn0Var.f25955b = pw3VarM10148d;
                    nn0Var.f25956c = pn0Var;
                    nn0Var.f25957d = yp1Var2;
                    nn0Var.f25958e = sn0Var;
                    VarHandle.storeStoreFence();
                    mn0 mn0Var = new mn0(b2);
                    mn0Var.f25059b = pn0Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R2 = vd6.m11834R(-1115341472, mn0Var, ir1Var3);
                    mn0 mn0Var2 = new mn0(b3);
                    mn0Var2.f25059b = pn0Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(nt2VarM3253l, null, false, nn0Var, null, null, pg0VarM11834R2, null, vd6.m11834R(-762684958, mn0Var2, ir1Var3), null, ir1Var3, 102236160, 694);
                    ir1Var3.m6912r(false);
                }
                break;
            default:
                sg2 sg2Var4 = (sg2) obj;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                a44 a44Var = (a44) this.f29404c;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((ir1) mi0Var4).m6890g(sg2Var4) ? 4 : 2;
                }
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ir1Var4.m6874W();
                } else {
                    xx2 xx2Var = (xx2) this.f29403b;
                    ir1Var4.m6885d0(-853484934);
                    nt2 nt2VarM3253l2 = as4.m3253l(sg2Var4, ir1Var4);
                    String str = xx2Var.f34696a;
                    sn0 sn0Var2 = (sn0) wx2.m12435c(a44Var).get(xx2Var);
                    boolean zM6890g2 = ir1Var4.m6890g(a44Var) | ir1Var4.m6886e(xx2Var.ordinal());
                    Object objM6869O2 = ir1Var4.m6869O();
                    if (zM6890g2 || objM6869O2 == i50Var) {
                        obj5 = objM6869O2;
                        C0686gf c0686gf = new C0686gf((byte) 12);
                        c0686gf.f19762b = a44Var;
                        c0686gf.f19763c = xx2Var;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0686gf);
                        obj5 = c0686gf;
                    }
                    C0793jc c0793jc = new C0793jc(b3);
                    c0793jc.f22159b = xx2Var;
                    VarHandle.storeStoreFence();
                    qq2.m10017a(sn0Var2, (yp1) obj5, nt2VarM3253l2, false, str, vd6.m11834R(582487698, c0793jc, ir1Var4), ir1Var4, 196608);
                    ir1Var4.m6912r(false);
                }
                break;
        }
        return ju4Var;
    }
}
