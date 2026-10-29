package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: lf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0870lf implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23988a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cd3 f23989b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f23990c;

    public /* synthetic */ C0870lf(byte b) {
        this.f23988a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23988a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        switch (b) {
            case 0:
                cd3 cd3Var = this.f23989b;
                sw2 sw2Var = this.f23990c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zh3 zh3VarMo7523a = AbstractC1217uf.f31817b.mo7523a(Boolean.TRUE);
                    C0870lf c0870lf = new C0870lf(b2);
                    c0870lf.f23989b = cd3Var;
                    c0870lf.f23990c = sw2Var;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a, vd6.m11834R(1022273628, c0870lf, ir1Var), ir1Var, 56);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            default:
                cd3 cd3Var2 = this.f23989b;
                sw2 sw2Var2 = this.f23990c;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM6869O = ir1Var2.m6869O();
                    i50 i50Var = ki0.f23136a;
                    if (objM6869O == i50Var) {
                        objM6869O = new C0891m((byte) 16);
                        ir1Var2.m6905n0(objM6869O);
                    }
                    nt2 nt2VarM5458a = f14.m5458a(kt2.f23428a, false, (yp1) objM6869O);
                    boolean zM6894i = ir1Var2.m6894i(cd3Var2);
                    Object objM6869O2 = ir1Var2.m6869O();
                    Object obj3 = objM6869O2;
                    if (zM6894i || objM6869O2 == i50Var) {
                        C0833kf c0833kf = new C0833kf((byte) 0);
                        c0833kf.f23095b = cd3Var2;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0833kf);
                        obj3 = c0833kf;
                    }
                    nt2 nt2VarM6101z = gq6.m6101z(nt2VarM5458a, (yp1) obj3);
                    float f = cd3Var2.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        nt2VarM6101z = se0.m10694G(nt2VarM6101z, f, 0.0f, null, true, 1044475);
                    }
                    mq1 mq1Var = (mq1) sw2Var2.getValue();
                    Object objM6869O3 = ir1Var2.m6869O();
                    if (objM6869O3 == i50Var) {
                        objM6869O3 = C1180tf.f31100b;
                        ir1Var2.m6905n0(objM6869O3);
                    }
                    xq2 xq2Var = (xq2) objM6869O3;
                    int iHashCode = Long.hashCode(ir1Var2.f21683T);
                    ga3 ga3VarM6902m = ir1Var2.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarM6101z);
                    bi0.f15310ap.getClass();
                    if (ir1Var2.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var2.m6893h0();
                    if (ir1Var2.f21682S) {
                        ir1Var2.m6900l(wf2.f33290T);
                    } else {
                        ir1Var2.m6911q0();
                    }
                    C0006a5.m53I(ir1Var2, ia5.f21216g, xq2Var);
                    C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var2);
                    C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
                    mq1Var.invoke(ir1Var2, 0);
                    ir1Var2.m6912r(true);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
        }
    }
}
