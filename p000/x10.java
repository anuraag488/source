package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x10 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33905a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f33906b;

    public /* synthetic */ x10(byte b) {
        this.f33905a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        Object vt4Var;
        Integer num;
        switch (this.f33905a) {
            case 0:
                long j = this.f33906b;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l02.m7759a(z62.m13398z(), null, j, ir1Var, 48, 4);
                } else {
                    ir1Var.m6874W();
                }
                return ju4.f22634a;
            default:
                long j2 = this.f33906b;
                nt2 nt2Var = (nt2) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var2 = (ir1) ((mi0) obj2);
                ir1Var2.m6885d0(-1395155498);
                ky0 ky0Var = (ky0) ir1Var2.m6898k(ij0.f21473h);
                Object objM6869O = ir1Var2.m6869O();
                i50 i50Var = ki0.f23136a;
                if (objM6869O == i50Var) {
                    objM6869O = new a83(0);
                    ir1Var2.m6905n0(objM6869O);
                }
                a83 a83Var = (a83) objM6869O;
                Object objM6869O2 = ir1Var2.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = new a83(0);
                    ir1Var2.m6905n0(objM6869O2);
                }
                a83 a83Var2 = (a83) objM6869O2;
                Object objM6869O3 = ir1Var2.m6869O();
                if (objM6869O3 == i50Var) {
                    objM6869O3 = dt0.m4700c(0.0f);
                    ir1Var2.m6905n0(objM6869O3);
                }
                C0910mi c0910mi = (C0910mi) objM6869O3;
                int iM132h = a83Var2.m132h();
                int iM132h2 = a83Var.m132h();
                boolean z = 1 <= iM132h2 && iM132h2 < iM132h;
                lk2 lk2Var = (lk2) ir1Var2.m6898k(rm2.f29413a);
                sw2 sw2VarM7369C = k43.m7369C(Float.valueOf(a83Var.m132h() / 3.0f), ir1Var2);
                Boolean boolValueOf = Boolean.valueOf(z);
                Integer numValueOf = Integer.valueOf(a83Var2.m132h());
                Integer numValueOf2 = Integer.valueOf(a83Var.m132h());
                boolean zM6894i = ir1Var2.m6894i(lk2Var) | ir1Var2.m6894i(c0910mi) | ir1Var2.m6892h(z) | ir1Var2.m6890g(ky0Var) | ir1Var2.m6884d(50.0f) | ir1Var2.m6890g(sw2VarM7369C) | ir1Var2.m6888f(j2);
                Object objM6869O4 = ir1Var2.m6869O();
                if (zM6894i || objM6869O4 == i50Var) {
                    bool = boolValueOf;
                    num = numValueOf;
                    vt4Var = new vt4(lk2Var, c0910mi, z, ky0Var, j2, a83Var2, sw2VarM7369C, null);
                    ir1Var2.m6905n0(vt4Var);
                } else {
                    vt4Var = objM6869O4;
                    bool = boolValueOf;
                    num = numValueOf;
                }
                lb5.m7928i(bool, num, numValueOf2, (mq1) vt4Var, ir1Var2);
                Object objM6869O5 = ir1Var2.m6869O();
                Object obj4 = objM6869O5;
                if (objM6869O5 == i50Var) {
                    sa1 sa1Var = new sa1((byte) 1);
                    sa1Var.f30034b = a83Var;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(sa1Var);
                    obj4 = sa1Var;
                }
                nt2 nt2VarM6620n = i25.m6620n(gq6.m6101z(nt2Var, (yp1) obj4));
                Object objM6869O6 = ir1Var2.m6869O();
                Object obj5 = objM6869O6;
                if (objM6869O6 == i50Var) {
                    C0928n c0928n = new C0928n((byte) 27);
                    c0928n.f25353b = a83Var2;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(c0928n);
                    obj5 = c0928n;
                }
                nt2 nt2VarM10829y = sj3.m10829y(nt2VarM6620n, (nq1) obj5);
                boolean zM6894i2 = ir1Var2.m6894i(c0910mi) | ir1Var2.m6892h(z) | ir1Var2.m6890g(sw2VarM7369C);
                Object objM6869O7 = ir1Var2.m6869O();
                Object obj6 = objM6869O7;
                if (zM6894i2 || objM6869O7 == i50Var) {
                    C0453ag c0453ag = new C0453ag((byte) 5);
                    c0453ag.f14444c = c0910mi;
                    c0453ag.f14443b = z;
                    c0453ag.f14445d = a83Var2;
                    c0453ag.f14446e = sw2VarM7369C;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(c0453ag);
                    obj6 = c0453ag;
                }
                nt2 nt2VarM5544o = C0638f5.m5544o(nt2VarM10829y, (yp1) obj6);
                ir1Var2.m6912r(false);
                return nt2VarM5544o;
        }
    }
}
