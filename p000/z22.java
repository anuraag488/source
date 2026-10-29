package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z22 implements c31 {

    /* JADX INFO: renamed from: a */
    public v21 f35711a;

    /* JADX INFO: renamed from: b */
    public u22 f35712b;

    /* JADX INFO: renamed from: c */
    public x22 f35713c;

    /* JADX INFO: renamed from: d */
    public w22 f35714d;

    /* JADX INFO: renamed from: e */
    public v22 f35715e;

    /* JADX INFO: renamed from: f */
    public oh6 f35716f;

    /* JADX INFO: renamed from: g */
    public mx4 f35717g;

    /* JADX INFO: renamed from: h */
    public vv1 f35718h;

    /* JADX INFO: renamed from: i */
    public hf0 f35719i;

    /* JADX INFO: renamed from: j */
    public hf0 f35720j;

    /* JADX INFO: renamed from: c */
    public static void m13291c(z22 z22Var, s22 s22Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        v21 v21Var = z22Var.f35711a;
        w22 w22Var = z22Var.f35714d;
        if (w22Var == null) {
            w22Var = new w22();
            w22Var.f33037U = null;
            w22Var.f33038V = Long.MAX_VALUE;
            w22Var.f33039W = false;
            z22Var.f35714d = w22Var;
        }
        w22Var.f33037U = s22Var;
        w22Var.f33038V = j;
        vv1 vv1Var = z22Var.f35718h;
        d63 d63Var = v21Var.f32335q;
        if (vv1Var == null) {
            z22Var.f35718h = new vv1(d63Var);
        } else {
            vv1Var.f32887b = d63Var;
            vv1Var.f32886a = j2;
        }
        w22Var.f33039W = false;
        z22Var.f35716f = w22Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m13292a() {
        u22 u22Var = this.f35712b;
        if (u22Var == null) {
            t22 t22Var = t22.f30733c;
            u22Var = new u22();
            u22Var.f31621U = t22Var;
            u22Var.f31622V = false;
            u22Var.f31623W = false;
            this.f35712b = u22Var;
        }
        u22Var.f31621U = t22.f30733c;
        u22Var.f31622V = false;
        u22Var.f31623W = false;
        this.f35716f = u22Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m13293b(s22 s22Var, long j, vv1 vv1Var) {
        v22 v22Var = this.f35715e;
        if (v22Var == null) {
            v22Var = new v22();
            v22Var.f32345U = null;
            v22Var.f32346V = Long.MAX_VALUE;
            this.f35715e = v22Var;
        }
        v22Var.f32345U = s22Var;
        v22Var.f32346V = j;
        vv1Var.f32886a = 0L;
        this.f35716f = v22Var;
    }

    /* JADX INFO: renamed from: d */
    public final mx4 m13294d() {
        mx4 mx4Var = this.f35717g;
        if (mx4Var != null) {
            return mx4Var;
        }
        C1077qn.m9987m("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m13295e(s22 s22Var, r22 r22Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = s22Var.f29833c;
        v21 v21Var = this.f35711a;
        d63 d63Var = v21Var.f32335q;
        d31 d31Var = j31.f21983a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (d63Var == d63.f16814a ? j & 4294967295L : j >> 32))) > 2.0f) {
            mx4 mx4VarM13294d = m13294d();
            d63 d63Var2 = v21Var.f32335q;
            hf0 hf0Var = this.f35719i;
            cw2 cw2Var = (cw2) hf0Var.f20529c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (gq6.m6085j(s22Var)) {
                hf0Var.f20528b = 0;
                cw2Var.m4203d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (gq6.m6086k(s22Var) || gq6.m6085j(s22Var)) {
                j2 = 4294967295L;
            } else {
                if (cw2Var.f16533b == 3) {
                    int i = hf0Var.f20528b;
                    hf0Var.f20528b = i + 1;
                    cw2Var.m4214o(i, s22Var);
                } else {
                    cw2Var.m4200a(s22Var);
                }
                if (hf0Var.f20528b == 3) {
                    hf0Var.f20528b = 0;
                }
                Object[] objArr = cw2Var.f16532a;
                int i2 = cw2Var.f16533b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((s22) objArr[i3]).f29833c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = cw2Var.f16533b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = cw2Var.f16532a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((s22) objArr2[i5]).f29833c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / cw2Var.f16533b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (d63Var2 != null) {
                int i6 = r22Var.f28967a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = d63Var2 == d63.f16815b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            mx4VarM13294d.f25284a.m4635a(s22Var.f29832b, jFloatToRawIntBits);
            hf0 hf0Var2 = this.f35720j;
            rv2 rv2Var = (rv2) hf0Var2.f20529c;
            int i7 = rv2Var.f29665b;
            if (i7 == 3) {
                int i8 = hf0Var2.f20528b;
                hf0Var2.f20528b = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    kx5.m7733s0("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = rv2Var.f29664a;
                long j5 = jArr[i8];
                jArr[i8] = j;
            } else {
                rv2Var.m10470a(j);
            }
            if (hf0Var2.f20528b == 3) {
                hf0Var2.f20528b = 0;
            }
            long[] jArr2 = rv2Var.f29664a;
            int i9 = rv2Var.f29665b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = rv2Var.f29665b;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = rv2Var.f29664a;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            v21Var.m11699W0(new e21((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / rv2Var.f29665b)) & j2), true));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13296f(s22 s22Var, s22 s22Var2, r22 r22Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        v21 v21Var = this.f35711a;
        if (this.f35717g == null) {
            this.f35717g = new mx4();
        }
        mx4 mx4VarM13294d = m13294d();
        d63 d63Var = v21Var.f32335q;
        hf0 hf0Var = this.f35719i;
        cw2 cw2Var = (cw2) hf0Var.f20529c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s22Var.f29833c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (s22Var.f29833c & 4294967295L));
        if (gq6.m6085j(s22Var)) {
            hf0Var.f20528b = 0;
            cw2Var.m4203d();
        }
        if (gq6.m6086k(s22Var) || gq6.m6085j(s22Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (cw2Var.f16533b == 3) {
                int i = hf0Var.f20528b;
                hf0Var.f20528b = i + 1;
                cw2Var.m4214o(i, s22Var);
            } else {
                cw2Var.m4200a(s22Var);
            }
            if (hf0Var.f20528b == 3) {
                hf0Var.f20528b = 0;
            }
            Object[] objArr = cw2Var.f16532a;
            int i2 = cw2Var.f16533b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((s22) objArr[i3]).f29833c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = cw2Var.f16533b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = cw2Var.f16532a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((s22) objArr2[i5]).f29833c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / cw2Var.f16533b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (d63Var != null) {
            int i6 = r22Var.f28967a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = d63Var == d63.f16815b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        mx4VarM13294d.f25284a.m4635a(s22Var.f29832b, jFloatToRawIntBits);
        long jM3429g = b33.m3429g(gq6.m6064B(s22Var2, v21Var.f32335q, r22Var), j);
        yp1 yp1Var = v21Var.f32336r;
        tc3 tc3Var = new tc3();
        tc3Var.f31073a = 1;
        VarHandle.storeStoreFence();
        if (((Boolean) yp1Var.invoke(tc3Var)).booleanValue()) {
            v21Var.m11699W0(new f21(jM3429g));
        }
        hf0 hf0Var2 = this.f35720j;
        hf0Var2.f20528b = 0;
        ((rv2) hf0Var2.f20529c).f29665b = 0;
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: m */
    public final d63 mo3839m() {
        return this.f35711a.f32335q;
    }

    @Override // p000.as1
    /* JADX INFO: renamed from: v0 */
    public final String mo3221v0() {
        oh6 oh6Var = this.f35716f;
        if (oh6Var instanceof u22) {
            return ((u22) oh6Var).f31623W ? "waiting" : "idle";
        }
        if ((oh6Var instanceof w22) || (oh6Var instanceof v22)) {
            return "waiting";
        }
        return oh6Var instanceof x22 ? "recognized" : "idle";
    }
}
