package p000;

import java.lang.invoke.VarHandle;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r10 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28944a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f28945b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f28946c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ iq1 f28947d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28948e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f28949f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ iq1 f28950g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f28951h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f28952i;

    public /* synthetic */ r10(byte b) {
        this.f28944a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        boolean z2;
        byte b = this.f28944a;
        ju4 ju4Var = ju4.f22634a;
        da2 da2Var = wf2.f33290T;
        kt2 kt2Var = kt2.f23428a;
        byte b2 = 2;
        switch (b) {
            case 0:
                mq1 mq1Var = (mq1) this.f28947d;
                float f = this.f28945b;
                d64 d64Var = (d64) this.f28949f;
                mq1 mq1Var2 = (mq1) this.f28948e;
                wp1 wp1Var = (wp1) this.f28950g;
                zo0 zo0Var = (zo0) this.f28951h;
                boolean z3 = this.f28946c;
                pg0 pg0Var = (pg0) this.f28952i;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nt2 nt2VarM12841M0 = y42.m12841M0(n74.m8574b(kt2Var, 1.0f), (a05) mq1Var.invoke(ir1Var, 0));
                    o10 o10Var = new o10();
                    o10Var.f26280a = f;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarM10693F = se0.m10693F(nt2VarM12841M0, o10Var);
                    int i = v54.f32423a;
                    q10 q10Var = new q10(b2);
                    q10Var.f28137b = d64Var;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarM10693F2 = se0.m10693F(nt2VarM10693F, q10Var);
                    id0 id0VarM6333a = hd0.m6333a(AbstractC1337xn.f34436c, ig1.f21390n, ir1Var, 0);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM10693F2);
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(da2Var);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, id0VarM6333a);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    if (mq1Var2 != null) {
                        ir1Var.m6885d0(-444181086);
                        String strM11818B = vd6.m11818B(C0995R.string.m3c_bottom_sheet_collapse_description, ir1Var);
                        String strM11818B2 = vd6.m11818B(C0995R.string.m3c_bottom_sheet_dismiss_description, ir1Var);
                        String strM11818B3 = vd6.m11818B(C0995R.string.m3c_bottom_sheet_expand_description, ir1Var);
                        boolean zM6890g = ir1Var.m6890g(d64Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6894i(zo0Var);
                        Object objM6869O = ir1Var.m6869O();
                        i50 i50Var = ki0.f23136a;
                        if (zM6890g || objM6869O == i50Var) {
                            z = false;
                            j10 j10Var = new j10(false ? 1 : 0);
                            j10Var.f21946b = d64Var;
                            j10Var.f21948d = wp1Var;
                            j10Var.f21947c = zo0Var;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(j10Var);
                            obj3 = j10Var;
                        } else {
                            z = false;
                            obj3 = objM6869O;
                        }
                        nt2 nt2VarM7745z = kx5.m7745z(kt2Var, z, null, (wp1) obj3, 15);
                        boolean zM6892h = ir1Var.m6892h(z3) | ir1Var.m6890g(d64Var) | ir1Var.m6890g(strM11818B2) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(strM11818B3) | ir1Var.m6894i(zo0Var) | ir1Var.m6890g(strM11818B);
                        Object objM6869O2 = ir1Var.m6869O();
                        Object obj4 = objM6869O2;
                        if (zM6892h || objM6869O2 == i50Var) {
                            k10 k10Var = new k10();
                            k10Var.f22807a = z3;
                            k10Var.f22808b = d64Var;
                            k10Var.f22809c = strM11818B2;
                            k10Var.f22810d = strM11818B3;
                            k10Var.f22811e = strM11818B;
                            k10Var.f22812f = wp1Var;
                            k10Var.f22813g = zo0Var;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(k10Var);
                            obj4 = k10Var;
                        }
                        v54.m11750a(f14.m5458a(nt2VarM7745z, true, (yp1) obj4), mq1Var2, ir1Var, 0);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(-441815104);
                        ir1Var.m6912r(false);
                    }
                    pg0Var.invoke(jd0.f22171a, ir1Var, 6);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            default:
                nq1 nq1Var = (nq1) this.f28947d;
                float f2 = this.f28945b;
                ma0 ma0Var = (ma0) this.f28948e;
                yp1 yp1Var = (yp1) this.f28949f;
                yp1 yp1Var2 = (yp1) this.f28950g;
                yp1 yp1Var3 = (yp1) this.f28951h;
                boolean z4 = this.f28946c;
                z73 z73Var = (z73) this.f28952i;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                boolean zM6871T = ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                InterfaceC0618en interfaceC0618en = ir1Var2.f21685a;
                if (!zM6871T) {
                    ir1Var2.m6874W();
                    return ju4Var;
                }
                pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34434a, ig1.f21388l, ir1Var2, 48);
                int iHashCode2 = Long.hashCode(ir1Var2.f21683T);
                ga3 ga3VarM6902m2 = ir1Var2.m6902m();
                nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var2, kt2Var);
                bi0.f15310ap.getClass();
                if (interfaceC0618en == null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var2.m6893h0();
                if (ir1Var2.f21682S) {
                    ir1Var2.m6900l(da2Var);
                } else {
                    ir1Var2.m6911q0();
                }
                jh0 jh0Var = ia5.f21216g;
                C0006a5.m53I(ir1Var2, jh0Var, pr3VarM9243a);
                jh0 jh0Var2 = ia5.f21215f;
                C0006a5.m53I(ir1Var2, jh0Var2, ga3VarM6902m2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                jh0 jh0Var3 = ia5.f21217h;
                C0006a5.m53I(ir1Var2, jh0Var3, numValueOf);
                C0006a5.m50F(ir1Var2);
                jh0 jh0Var4 = ia5.f21214e;
                C0006a5.m53I(ir1Var2, jh0Var4, nt2VarM10006A2);
                zh3 zh3VarMo7523a = f62.f18786c.mo7523a(p11.m9350a(Float.NaN));
                bz3 bz3Var = new bz3();
                bz3Var.f15704a = f2;
                bz3Var.f15705b = ma0Var;
                bz3Var.f15706c = yp1Var;
                bz3Var.f15707d = yp1Var2;
                bz3Var.f15708e = yp1Var3;
                bz3Var.f15709f = z4;
                bz3Var.f15710g = z73Var;
                VarHandle.storeStoreFence();
                as4.m3244c(zh3VarMo7523a, vd6.m11834R(-852439710, bz3Var, ir1Var2), ir1Var2, 56);
                if (nq1Var != null) {
                    ir1Var2.m6885d0(-176527412);
                    nc4 nc4Var = pq2.f27894b;
                    long j = ((lq2) ir1Var2.m6898k(nc4Var)).f24277a.f16953j;
                    fr3 fr3Var = gr3.f20083a;
                    s93 s93VarM5664b = AbstractC0647fd.m5664b(50);
                    nt2 nt2VarM5650H = AbstractC0647fd.m5650H(n74.m8573a(as4.m3258q(kt2Var, j, new fr3(s93VarM5664b, s93VarM5664b, s93VarM5664b, s93VarM5664b)), 40.0f, 32.0f), 8.0f, 4.0f);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
                    int iHashCode3 = Long.hashCode(ir1Var2.f21683T);
                    ga3 ga3VarM6902m3 = ir1Var2.m6902m();
                    nt2 nt2VarM10006A3 = qq2.m10006A(ir1Var2, nt2VarM5650H);
                    ir1Var2.m6893h0();
                    if (ir1Var2.f21682S) {
                        ir1Var2.m6900l(da2Var);
                    } else {
                        ir1Var2.m6911q0();
                    }
                    C0006a5.m53I(ir1Var2, jh0Var, xq2VarM9704c);
                    C0006a5.m53I(ir1Var2, jh0Var2, ga3VarM6902m3);
                    d55.m4373r(iHashCode3, ir1Var2, jh0Var3, ir1Var2);
                    C0006a5.m53I(ir1Var2, jh0Var4, nt2VarM10006A3);
                    long j2 = ((lq2) ir1Var2.m6898k(nc4Var)).f24277a.f16954k;
                    xl4 xl4Var = ((lq2) ir1Var2.m6898k(nc4Var)).f24278b.f22583n;
                    er1 er1Var = new er1((byte) 12);
                    er1Var.f18412b = nq1Var;
                    er1Var.f18413c = z73Var;
                    VarHandle.storeStoreFence();
                    k43.m7380b(j2, xl4Var, vd6.m11834R(164786027, er1Var, ir1Var2), ir1Var2, 384);
                    z2 = true;
                    ir1Var2.m6912r(true);
                    ir1Var2.m6912r(false);
                } else {
                    z2 = true;
                    ir1Var2.m6885d0(-175923904);
                    ir1Var2.m6912r(false);
                }
                ir1Var2.m6912r(z2);
                return ju4Var;
        }
    }
}
