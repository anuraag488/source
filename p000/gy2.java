package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gy2 implements oq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20187a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20188b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f20189c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20190d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20191e;

    public /* synthetic */ gy2(byte b) {
        this.f20187a = b;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f20187a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                dp4 dp4Var = (dp4) this.f20188b;
                w94 w94Var = (w94) this.f20189c;
                ql3 ql3Var = (ql3) this.f20190d;
                Map map = (Map) this.f20191e;
                Object obj5 = (C0456aj) obj;
                wv3 wv3Var = (wv3) obj2;
                mi0 mi0Var = (mi0) obj3;
                ((Integer) obj4).getClass();
                mh0 mh0VarM8516z = n40.m8516z((z62.m13387o(dp4Var.f17258a.mo11188l(), dp4Var.f17261d.getValue()) && w94Var.isEmpty()) ? fk2.f19058e : fk2.f19057d, mi0Var);
                ir1 ir1Var = (ir1) mi0Var;
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == ki0.f23136a) {
                    ir1Var.m6905n0(obj5);
                } else {
                    obj5 = objM6869O;
                }
                ql3Var.f28555a = (C0456aj) obj5;
                zh3 zh3VarMo7523a = rm2.f29413a.mo7523a(mh0VarM8516z);
                kj0 kj0Var = sm2.f30395a;
                Object obj6 = ql3Var.f28555a;
                if (obj6 == null) {
                    z62.m13366Y("animatedContentScope");
                    throw null;
                }
                zh3[] zh3VarArr = {zh3VarMo7523a, kj0Var.mo7523a((C0456aj) obj6), u44.f31652a.mo7523a(wv3Var), zv3.f36414a.mo7523a(eq2.m5273L(new C0874lj(wv3Var), map))};
                C1017p0 c1017p0 = new C1017p0((byte) 26);
                c1017p0.f27254b = wv3Var;
                VarHandle.storeStoreFence();
                as4.m3245d(zh3VarArr, vd6.m11834R(-1734941436, c1017p0, ir1Var), ir1Var, 56);
                return ju4Var;
            default:
                lf0 lf0Var = (lf0) this.f20188b;
                sw2 sw2Var = (sw2) this.f20189c;
                sw2 sw2Var2 = (sw2) this.f20190d;
                sw2 sw2Var3 = (sw2) this.f20191e;
                b33 b33Var = (b33) obj;
                Object cs1Var = (fs1) obj2;
                wf4 wf4Var = (wf4) lf0Var.f23994d.getValue();
                wf4 wf4VarM13853Q = wf4Var != null ? zy5.m13853Q(wf4Var, sw2Var) : null;
                pq1 pq1Var = (pq1) sw2Var2.getValue();
                boolean z = cs1Var instanceof cs1;
                long jM13852P = (!z && (cs1Var instanceof ds1)) ? zy5.m13852P(sw2Var, b33.m3431i(b33.m3429g(b33Var.f15059a, ((b33) sw2Var3.getValue()).f15059a), ((ds1) cs1Var).f17331a)) : zy5.m13852P(sw2Var, b33.m3429g(b33Var.f15059a, ((b33) sw2Var3.getValue()).f15059a));
                b33 b33VarM3423a = b33.m3423a(jM13852P);
                if (z) {
                    cs1Var = new cs1(wf4VarM13853Q, ((cs1) cs1Var).f16425b);
                }
                pq1Var.mo6994d(wf4VarM13853Q, b33VarM3423a, cs1Var, null, b33Var);
                return ju4Var;
        }
    }
}
