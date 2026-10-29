package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k73 extends mt2 implements lf2, s31 {

    /* JADX INFO: renamed from: o */
    public i73 f22962o;

    /* JADX INFO: renamed from: p */
    public boolean f22963p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0520ca f22964q;

    /* JADX INFO: renamed from: r */
    public i50 f22965r;

    /* JADX INFO: renamed from: s */
    public float f22966s;

    /* JADX INFO: renamed from: t */
    public o00 f22967t;

    /* JADX INFO: renamed from: P0 */
    public static boolean m7419P0(long j) {
        return !h74.m6270b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: Q0 */
    public static boolean m7420Q0(long j) {
        return !h74.m6270b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        if (!m7421O0()) {
            return sq2Var.mo5825b0(i);
        }
        long jM7422R0 = m7422R0(ll0.m8010b(0, i, 0, 0, 13));
        return Math.max(kl0.m7540j(jM7422R0), sq2Var.mo5825b0(i));
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m7421O0() {
        return this.f22963p && this.f22962o.mo40g() != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: R0 */
    public final long m7422R0(long j) {
        boolean z = false;
        boolean z2 = kl0.m7535e(j) && kl0.m7534d(j);
        if (kl0.m7537g(j) && kl0.m7536f(j)) {
            z = true;
        }
        if ((!m7421O0() && z2) || z) {
            return kl0.m7532b(j, kl0.m7539i(j), 0, kl0.m7538h(j), 0, 10);
        }
        long jMo40g = this.f22962o.mo40g();
        int iRound = m7420Q0(jMo40g) ? Math.round(Float.intBitsToFloat((int) (jMo40g >> 32))) : kl0.m7541k(j);
        int iRound2 = m7419P0(jMo40g) ? Math.round(Float.intBitsToFloat((int) (jMo40g & 4294967295L))) : kl0.m7540j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ll0.m8014f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(ll0.m8015g(iRound, j))) << 32);
        if (m7421O0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m7420Q0(this.f22962o.mo40g()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f22962o.mo40g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m7419P0(this.f22962o.mo40g()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f22962o.mo40g() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : c20.m3801F(jFloatToRawIntBits2, this.f22965r.mo6670c(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return kl0.m7532b(j, ll0.m8015g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, ll0.m8014f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        j70 j70Var = yf2Var.f35194a;
        long jMo40g = this.f22962o.mo40g();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m7420Q0(jMo40g) ? Float.intBitsToFloat((int) (jMo40g >> 32)) : Float.intBitsToFloat((int) (j70Var.mo11227d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m7419P0(jMo40g) ? Float.intBitsToFloat((int) (jMo40g & 4294967295L)) : Float.intBitsToFloat((int) (j70Var.mo11227d() & 4294967295L)))) & 4294967295L);
        long jM3801F = (Float.intBitsToFloat((int) (j70Var.mo11227d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (j70Var.mo11227d() & 4294967295L)) == 0.0f) ? 0L : c20.m3801F(jFloatToRawIntBits, this.f22965r.mo6670c(jFloatToRawIntBits, j70Var.mo11227d()));
        long jMo3927a = this.f22964q.mo3927a((((long) Math.round(Float.intBitsToFloat((int) (jM3801F >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM3801F & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (j70Var.mo11227d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (j70Var.mo11227d() & 4294967295L)))) & 4294967295L), yf2Var.getLayoutDirection());
        float f = (int) (jMo3927a >> 32);
        float f2 = (int) (jMo3927a & 4294967295L);
        ((ar3) j70Var.f22064b.f22481b).m3130A(f, f2);
        try {
            this.f22962o.m6688f(yf2Var, jM3801F, this.f22966s, this.f22967t);
            ((ar3) j70Var.f22064b.f22481b).m3130A(-f, -f2);
            yf2Var.m13113a();
        } catch (Throwable th) {
            ((ar3) j70Var.f22064b.f22481b).m3130A(-f, -f2);
            throw th;
        }
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        if (!m7421O0()) {
            return sq2Var.mo5823W(i);
        }
        long jM7422R0 = m7422R0(ll0.m8010b(0, 0, 0, i, 7));
        return Math.max(kl0.m7541k(jM7422R0), sq2Var.mo5823W(i));
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(m7422R0(j));
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 9);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        if (!m7421O0()) {
            return sq2Var.mo5824Z(i);
        }
        long jM7422R0 = m7422R0(ll0.m8010b(0, 0, 0, i, 7));
        return Math.max(kl0.m7541k(jM7422R0), sq2Var.mo5824Z(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f22962o + ", sizeToIntrinsics=" + this.f22963p + ", alignment=" + this.f22964q + ", alpha=" + this.f22966s + ", colorFilter=" + this.f22967t + ")";
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        if (!m7421O0()) {
            return sq2Var.mo5827h(i);
        }
        long jM7422R0 = m7422R0(ll0.m8010b(0, i, 0, 0, 13));
        return Math.max(kl0.m7540j(jM7422R0), sq2Var.mo5827h(i));
    }
}
