package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y52 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34910a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f34911b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f34912c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f34913d;

    public /* synthetic */ y52(byte b) {
        this.f34910a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.f34910a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                u93 u93Var = (u93) this.f34911b;
                boolean z = this.f34912c;
                C0950nl c0950nl = (C0950nl) this.f34913d;
                yp1 yp1Var = (yp1) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6894i(yp1Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    boolean zM6890g = ((iIntValue & 14) == 4) | ir1Var.m6890g(u93Var) | ir1Var.m6892h(z) | ir1Var.m6894i(c0950nl);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        obj4 = objM6869O;
                        C0453ag c0453ag = new C0453ag((byte) 1);
                        c0453ag.f14444c = u93Var;
                        c0453ag.f14445d = yp1Var;
                        c0453ag.f14443b = z;
                        c0453ag.f14446e = c0950nl;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0453ag);
                        obj4 = c0453ag;
                    }
                    obj4 = objM6869O;
                    AbstractC0647fd.m5674l(null, "Permission required", false, (yp1) obj4, ir1Var, 432, 1);
                }
                break;
            case 1:
                u93 u93Var2 = (u93) this.f34911b;
                boolean z2 = this.f34912c;
                C0950nl c0950nl2 = (C0950nl) this.f34913d;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    gl4.m6037b(u93Var2.getDescription(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 0, 0, 262142);
                    if (!z2) {
                        ir1Var2.m6885d0(-1596256481);
                        ir1Var2.m6912r(false);
                    } else {
                        ir1Var2.m6885d0(-1596500575);
                        gl4.m6037b(zi4.m13621u("Find ", c0950nl2.f25921b, " and switch the toggle on!"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xl4.m12708a((xl4) ir1Var2.m6898k(gl4.f19869a), 0L, 0L, xm1.f34416i, null, 0L, 0L, null, 16777211), ir1Var2, 0, 0, 131070);
                        ir1Var2.m6912r(false);
                    }
                }
                break;
            default:
                ((Integer) obj3).getClass();
                a84.f165a.m135a((nv2) this.f34911b, null, (u74) this.f34913d, this.f34912c, 0L, (mi0) obj2, 196608);
                break;
        }
        return ju4Var;
    }
}
