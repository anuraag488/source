package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hm0 extends mt2 implements s31, lf2 {

    /* JADX INFO: renamed from: o */
    public i73 f20691o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0520ca f20692p;

    /* JADX INFO: renamed from: q */
    public jm0 f20693q;

    /* JADX INFO: renamed from: r */
    public float f20694r;

    /* JADX INFO: renamed from: s */
    public o00 f20695s;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        if (this.f20691o.mo40g() == 9205357640488583168L) {
            return sq2Var.mo5825b0(i);
        }
        int iMo5825b0 = sq2Var.mo5825b0(kl0.m7539i(m6441P0(ll0.m8010b(0, i, 0, 0, 13))));
        return Math.max(qq2.m10010E(h74.m6271c(m6440O0(i20.m6583h(i, iMo5825b0)))), iMo5825b0);
    }

    /* JADX INFO: renamed from: O0 */
    public final long m6440O0(long j) {
        if (h74.m6274f(j)) {
            return 0L;
        }
        long jMo40g = this.f20691o.mo40g();
        if (jMo40g != 9205357640488583168L) {
            float fM6273e = h74.m6273e(jMo40g);
            if (Float.isInfinite(fM6273e) || Float.isNaN(fM6273e)) {
                fM6273e = h74.m6273e(j);
            }
            float fM6271c = h74.m6271c(jMo40g);
            if (Float.isInfinite(fM6271c) || Float.isNaN(fM6271c)) {
                fM6271c = h74.m6271c(j);
            }
            long jM6583h = i20.m6583h(fM6273e, fM6271c);
            long jMo6670c = this.f20693q.mo6670c(jM6583h, j);
            int i = sv3.f30595a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo6670c >> 32));
            if (!Float.isInfinite(fIntBitsToFloat) && !Float.isNaN(fIntBitsToFloat)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jMo6670c));
                if (!Float.isInfinite(fIntBitsToFloat2) && !Float.isNaN(fIntBitsToFloat2)) {
                    return c20.m3801F(jM6583h, jMo6670c);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: P0 */
    public final long m6441P0(long j) {
        float fM7541k;
        int iM7540j;
        float fM10674o;
        boolean zM7537g = kl0.m7537g(j);
        boolean zM7536f = kl0.m7536f(j);
        if (!zM7537g || !zM7536f) {
            boolean z = kl0.m7535e(j) && kl0.m7534d(j);
            long jMo40g = this.f20691o.mo40g();
            if (jMo40g != 9205357640488583168L) {
                if (!z || (!zM7537g && !zM7536f)) {
                    float fM6273e = h74.m6273e(jMo40g);
                    float fM6271c = h74.m6271c(jMo40g);
                    if (Float.isInfinite(fM6273e) || Float.isNaN(fM6273e)) {
                        fM7541k = kl0.m7541k(j);
                    } else {
                        sk3 sk3Var = fw4.f19357b;
                        fM7541k = sc6.m10674o(fM6273e, kl0.m7541k(j), kl0.m7539i(j));
                    }
                    if (Float.isInfinite(fM6271c) || Float.isNaN(fM6271c)) {
                        iM7540j = kl0.m7540j(j);
                    } else {
                        sk3 sk3Var2 = fw4.f19357b;
                        fM10674o = sc6.m10674o(fM6271c, kl0.m7540j(j), kl0.m7538h(j));
                    }
                    long jM6440O0 = m6440O0(i20.m6583h(fM7541k, fM10674o));
                    return kl0.m7532b(j, ll0.m8015g(qq2.m10010E(h74.m6273e(jM6440O0)), j), 0, ll0.m8014f(qq2.m10010E(h74.m6271c(jM6440O0)), j), 0, 10);
                }
                fM7541k = kl0.m7539i(j);
                iM7540j = kl0.m7538h(j);
                fM10674o = iM7540j;
                long jM6440O1 = m6440O0(i20.m6583h(fM7541k, fM10674o));
                return kl0.m7532b(j, ll0.m8015g(qq2.m10010E(h74.m6273e(jM6440O1)), j), 0, ll0.m8014f(qq2.m10010E(h74.m6271c(jM6440O1)), j), 0, 10);
            }
            if (z) {
                return kl0.m7532b(j, kl0.m7539i(j), 0, kl0.m7538h(j), 0, 10);
            }
        }
        return j;
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        j70 j70Var = yf2Var.f35194a;
        long jM6440O0 = m6440O0(j70Var.mo11227d());
        InterfaceC0520ca interfaceC0520ca = this.f20692p;
        sk3 sk3Var = fw4.f19357b;
        long jM10010E = (((long) qq2.m10010E(h74.m6273e(jM6440O0))) << 32) | (((long) qq2.m10010E(h74.m6271c(jM6440O0))) & 4294967295L);
        long jMo11227d = j70Var.mo11227d();
        long jMo3927a = interfaceC0520ca.mo3927a(jM10010E, (((long) qq2.m10010E(h74.m6273e(jMo11227d))) << 32) | (((long) qq2.m10010E(h74.m6271c(jMo11227d))) & 4294967295L), yf2Var.getLayoutDirection());
        float f = (int) (jMo3927a >> 32);
        float f2 = (int) (jMo3927a & 4294967295L);
        ((ar3) j70Var.f22064b.f22481b).m3130A(f, f2);
        this.f20691o.m6688f(yf2Var, jM6440O0, this.f20694r, this.f20695s);
        ((ar3) j70Var.f22064b.f22481b).m3130A(-f, -f2);
        yf2Var.m13113a();
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        if (this.f20691o.mo40g() == 9205357640488583168L) {
            return sq2Var.mo5823W(i);
        }
        int iMo5823W = sq2Var.mo5823W(kl0.m7538h(m6441P0(ll0.m8010b(0, 0, 0, i, 7))));
        return Math.max(qq2.m10010E(h74.m6273e(m6440O0(i20.m6583h(iMo5823W, i)))), iMo5823W);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(m6441P0(j));
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 4);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        if (this.f20691o.mo40g() == 9205357640488583168L) {
            return sq2Var.mo5824Z(i);
        }
        int iMo5824Z = sq2Var.mo5824Z(kl0.m7538h(m6441P0(ll0.m8010b(0, 0, 0, i, 7))));
        return Math.max(qq2.m10010E(h74.m6273e(m6440O0(i20.m6583h(iMo5824Z, i)))), iMo5824Z);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        if (this.f20691o.mo40g() == 9205357640488583168L) {
            return sq2Var.mo5827h(i);
        }
        int iMo5827h = sq2Var.mo5827h(kl0.m7539i(m6441P0(ll0.m8010b(0, i, 0, 0, 13))));
        return Math.max(qq2.m10010E(h74.m6271c(m6440O0(i20.m6583h(i, iMo5827h)))), iMo5827h);
    }
}
