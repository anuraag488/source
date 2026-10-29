package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33547a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yo2 f33548b;

    public /* synthetic */ wo2(byte b) {
        this.f33547a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        uo2 uo2VarMo4869X0;
        byte b = this.f33547a;
        ju4 ju4Var = ju4.f22634a;
        cw2 cw2Var = null;
        placementScope = null;
        placementScope = null;
        cb3 placementScope = null;
        yo2 yo2Var = this.f33548b;
        switch (b) {
            case 0:
                ag2 ag2Var = yo2Var.f35403f;
                ag2Var.f14475h = 0;
                wf2 wf2Var = ag2Var.f14468a;
                uw2 uw2VarM12248A = wf2Var.m12248A();
                Object[] objArr = uw2VarM12248A.f32211a;
                int i = uw2VarM12248A.f32213c;
                for (int i2 = 0; i2 < i; i2++) {
                    yo2 yo2Var2 = ((wf2) objArr[i2]).f33300H.f14484q;
                    yo2Var2.f35405h = yo2Var2.f35406i;
                    yo2Var2.f35406i = Integer.MAX_VALUE;
                    if (yo2Var2.f35407j == uf2.f31822b) {
                        yo2Var2.f35407j = uf2.f31823c;
                    }
                }
                uw2 uw2VarM12248A2 = wf2Var.m12248A();
                Object[] objArr2 = uw2VarM12248A2.f32211a;
                int i3 = uw2VarM12248A2.f32213c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((wf2) objArr2[i4]).f33300H.f14484q.f35416s.f34228d = false;
                }
                v32 v32Var = yo2Var.mo6286u().f33060f0;
                if (v32Var == null) {
                    C1077qn.m9989o("Expected lookahead delegate");
                    return null;
                }
                List listM12288o = wf2Var.m12288o();
                int size = listM12288o.size();
                for (int i5 = 0; i5 < size; i5++) {
                    wf2 wf2Var2 = (wf2) ((aw2) listM12288o).get(i5);
                    uo2 uo2VarMo4869X1 = ((e13) wf2Var2.f33299G.f25608e).mo4869X0();
                    if (uo2VarMo4869X1 != null) {
                        if (uo2VarMo4869X1.f30441o) {
                            if (cw2Var == null) {
                                cw2Var = new cw2();
                            }
                            cw2Var.m4200a(wf2Var2);
                        }
                        uo2VarMo4869X1.f30441o = v32Var.f30441o;
                    }
                }
                v32Var.mo4855F0().mo4503b();
                List listM12288o2 = wf2Var.m12288o();
                int size2 = listM12288o2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        uw2 uw2VarM12248A3 = wf2Var.m12248A();
                        Object[] objArr3 = uw2VarM12248A3.f32211a;
                        int i7 = uw2VarM12248A3.f32213c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            yo2 yo2Var3 = ((wf2) objArr3[i8]).f33300H.f14484q;
                            int i9 = yo2Var3.f35405h;
                            int i10 = yo2Var3.f35406i;
                            if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                yo2Var3.m13201u0(true);
                            }
                        }
                        uw2 uw2VarM12248A4 = wf2Var.m12248A();
                        Object[] objArr4 = uw2VarM12248A4.f32211a;
                        int i11 = uw2VarM12248A4.f32213c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            xf2 xf2Var = ((wf2) objArr4[i12]).f33300H.f14484q.f35416s;
                            xf2Var.f34229e = xf2Var.f34228d;
                        }
                        return ju4Var;
                    }
                    wf2 wf2Var3 = (wf2) ((aw2) listM12288o2).get(i6);
                    boolean z = cw2Var != null && cw2Var.m4204e(wf2Var3);
                    uo2 uo2VarMo4869X2 = ((e13) wf2Var3.f33299G.f25608e).mo4869X0();
                    if (uo2VarMo4869X2 != null) {
                        uo2VarMo4869X2.f30441o = z;
                    }
                    i6++;
                }
                break;
            case 1:
                yo2Var.f35403f.m2982a().mo4869X0().mo5826e(yo2Var.f35423z);
                return ju4Var;
            default:
                ag2 ag2Var2 = yo2Var.f35403f;
                if (qq2.m10039w(ag2Var2.f14468a) || ag2Var2.f14470c) {
                    e13 e13Var = ag2Var2.m2982a().f17629y;
                    if (e13Var != null) {
                        placementScope = e13Var.f30442p;
                    }
                } else {
                    e13 e13Var2 = ag2Var2.m2982a().f17629y;
                    if (e13Var2 != null && (uo2VarMo4869X0 = e13Var2.mo4869X0()) != null) {
                        placementScope = uo2VarMo4869X0.f30442p;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(ag2Var2.f14468a)).getPlacementScope();
                }
                cb3.m3943m(placementScope, ag2Var2.m2982a().mo4869X0(), yo2Var.f35412o);
                return ju4Var;
        }
    }
}
