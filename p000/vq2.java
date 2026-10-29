package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32798a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wq2 f32799b;

    public /* synthetic */ vq2(byte b) {
        this.f32798a = b;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0119  */
    @Override // p000.wp1
    public final Object invoke() {
        boolean z;
        cb3 placementScope;
        byte b = this.f32798a;
        cw2 cw2Var = null;
        ju4 ju4Var = ju4.f22634a;
        wq2 wq2Var = this.f32799b;
        switch (b) {
            case 0:
                wq2Var.f33621f.m2982a().mo5826e(wq2Var.f33610C);
                break;
            case 1:
                ag2 ag2Var = wq2Var.f33621f;
                ag2Var.f14476i = 0;
                wf2 wf2Var = ag2Var.f14468a;
                uw2 uw2VarM12248A = wf2Var.m12248A();
                Object[] objArr = uw2VarM12248A.f32211a;
                int i = uw2VarM12248A.f32213c;
                for (int i2 = 0; i2 < i; i2++) {
                    wq2 wq2Var2 = ((wf2) objArr[i2]).f33300H.f14483p;
                    wq2Var2.f33623h = wq2Var2.f33624i;
                    wq2Var2.f33624i = Integer.MAX_VALUE;
                    wq2Var2.f33636u = false;
                    if (wq2Var2.f33627l == uf2.f31822b) {
                        wq2Var2.f33627l = uf2.f31823c;
                    }
                }
                uw2 uw2VarM12248A2 = wf2Var.m12248A();
                Object[] objArr2 = uw2VarM12248A2.f32211a;
                int i3 = uw2VarM12248A2.f32213c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((wf2) objArr2[i4]).f33300H.f14483p.f33640y.f34228d = false;
                }
                List listM12288o = wf2Var.m12288o();
                int size = listM12288o.size();
                for (int i5 = 0; i5 < size; i5++) {
                    wf2 wf2Var2 = (wf2) ((aw2) listM12288o).get(i5);
                    if (((e13) wf2Var2.f33299G.f25608e).f30441o) {
                        if (cw2Var == null) {
                            cw2Var = new cw2();
                        }
                        cw2Var.m4200a(wf2Var2);
                    }
                    ((e13) wf2Var2.f33299G.f25608e).f30441o = wq2Var.mo6286u().f30441o;
                }
                wq2Var.mo6286u().mo4855F0().mo4503b();
                List listM12288o2 = wf2Var.m12288o();
                int size2 = listM12288o2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    wf2 wf2Var3 = (wf2) ((aw2) listM12288o2).get(i6);
                    if (cw2Var != null) {
                        z = true;
                        if (!cw2Var.m4204e(wf2Var3)) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    ((e13) wf2Var3.f33299G.f25608e).f30441o = z;
                }
                uw2 uw2VarM12248A3 = wf2Var.m12248A();
                Object[] objArr3 = uw2VarM12248A3.f32211a;
                int i7 = uw2VarM12248A3.f32213c;
                for (int i8 = 0; i8 < i7; i8++) {
                    wf2 wf2Var4 = (wf2) objArr3[i8];
                    ag2 ag2Var2 = wf2Var4.f33300H;
                    if (ag2Var2.f14483p.f33623h != wf2Var4.m12296w()) {
                        wf2Var.m12263Q();
                        wf2Var.m12251D();
                        if (wf2Var4.m12296w() == Integer.MAX_VALUE) {
                            if (ag2Var2.f14470c || qq2.m10039w(wf2Var4)) {
                                ag2Var2.f14484q.m13201u0(false);
                            }
                            ag2Var2.f14483p.m12381v0();
                        }
                    }
                }
                uw2 uw2VarM12248A4 = wf2Var.m12248A();
                Object[] objArr4 = uw2VarM12248A4.f32211a;
                int i9 = uw2VarM12248A4.f32213c;
                for (int i10 = 0; i10 < i9; i10++) {
                    xf2 xf2Var = ((wf2) objArr4[i10]).f33300H.f14483p.f33640y;
                    xf2Var.f34229e = xf2Var.f34228d;
                }
                break;
            default:
                ag2 ag2Var3 = wq2Var.f33621f;
                e13 e13Var = ag2Var3.m2982a().f17629y;
                if (e13Var == null || (placementScope = e13Var.f30442p) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(ag2Var3.f14468a)).getPlacementScope();
                }
                yp1 yp1Var = wq2Var.f33615H;
                bu1 bu1Var = wq2Var.f33616I;
                if (bu1Var != null) {
                    e13 e13VarM2982a = ag2Var3.m2982a();
                    long j = wq2Var.f33617J;
                    float f = wq2Var.f33618K;
                    placementScope.m3951j(e13VarM2982a);
                    e13VarM2982a.mo4425p0(o52.m8958e(j, e13VarM2982a.f16903e), f, bu1Var);
                } else if (yp1Var == null) {
                    e13 e13VarM2982a2 = ag2Var3.m2982a();
                    long j2 = wq2Var.f33617J;
                    float f2 = wq2Var.f33618K;
                    placementScope.m3951j(e13VarM2982a2);
                    e13VarM2982a2.mo4424n0(o52.m8958e(j2, e13VarM2982a2.f16903e), f2, null);
                } else {
                    e13 e13VarM2982a3 = ag2Var3.m2982a();
                    long j3 = wq2Var.f33617J;
                    float f3 = wq2Var.f33618K;
                    placementScope.m3951j(e13VarM2982a3);
                    e13VarM2982a3.mo4424n0(o52.m8958e(j3, e13VarM2982a3.f16903e), f3, yp1Var);
                }
                break;
        }
        return ju4Var;
    }
}
