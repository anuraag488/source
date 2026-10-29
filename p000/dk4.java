package p000;

import java.text.BreakIterator;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dk4 {

    /* JADX INFO: renamed from: a */
    public C0875lk f17121a;

    /* JADX INFO: renamed from: b */
    public long f17122b;

    /* JADX INFO: renamed from: c */
    public jl4 f17123c;

    /* JADX INFO: renamed from: d */
    public vi3 f17124d;

    /* JADX INFO: renamed from: e */
    public pl4 f17125e;

    /* JADX INFO: renamed from: f */
    public long f17126f;

    /* JADX INFO: renamed from: g */
    public C0875lk f17127g;

    /* JADX INFO: renamed from: h */
    public xk4 f17128h;

    /* JADX INFO: renamed from: i */
    public kl4 f17129i;

    /* JADX INFO: renamed from: a */
    public final List m4525a(yp1 yp1Var) {
        if (!ql4.m9900d(this.f17126f)) {
            return kx5.m7694Y(new xd0("", 0), new w34(ql4.m9903g(this.f17126f), ql4.m9903g(this.f17126f)));
        }
        a71 a71Var = (a71) yp1Var.invoke(this);
        if (a71Var != null) {
            return Collections.singletonList(a71Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m4526b() {
        vi3 vi3Var = this.f17124d;
        jl4 jl4Var = this.f17123c;
        if (jl4Var == null) {
            return null;
        }
        yu2 yu2Var = jl4Var.f22401b;
        int iM9902f = ql4.m9902f(this.f17126f);
        vi3Var.m11898a(iM9902f);
        int iM13244c = yu2Var.m13244c(yu2Var.m13245d(iM9902f), true);
        vi3Var.m11899b(iM13244c);
        return Integer.valueOf(iM13244c);
    }

    /* JADX INFO: renamed from: c */
    public final Integer m4527c() {
        vi3 vi3Var = this.f17124d;
        jl4 jl4Var = this.f17123c;
        if (jl4Var == null) {
            return null;
        }
        int iM9903g = ql4.m9903g(this.f17126f);
        vi3Var.m11898a(iM9903g);
        int iM7180f = jl4Var.m7180f(jl4Var.f22401b.m13245d(iM9903g));
        vi3Var.m11899b(iM7180f);
        return Integer.valueOf(iM7180f);
    }

    /* JADX INFO: renamed from: d */
    public final Integer m4528d() {
        int length;
        jl4 jl4Var = this.f17123c;
        if (jl4Var == null) {
            return null;
        }
        C0875lk c0875lk = this.f17121a;
        for (int iM4542r = m4542r(); iM4542r < c0875lk.f24092b.length(); iM4542r++) {
            int length2 = this.f17127g.f24092b.length() - 1;
            if (iM4542r <= length2) {
                length2 = iM4542r;
            }
            long jM7183i = jl4Var.m7183i(length2);
            int i = ql4.f28557c;
            int i2 = (int) (jM7183i & 4294967295L);
            if (i2 > iM4542r) {
                this.f17124d.m11899b(i2);
                length = i2;
                return Integer.valueOf(length);
            }
        }
        length = c0875lk.f24092b.length();
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: e */
    public final Integer m4529e() {
        int i;
        jl4 jl4Var = this.f17123c;
        if (jl4Var == null) {
            return null;
        }
        for (int iM4542r = m4542r(); iM4542r > 0; iM4542r--) {
            int length = this.f17127g.f24092b.length() - 1;
            if (iM4542r <= length) {
                length = iM4542r;
            }
            long jM7183i = jl4Var.m7183i(length);
            int i2 = ql4.f28557c;
            int i3 = (int) (jM7183i >> 32);
            if (i3 < iM4542r) {
                this.f17124d.m11899b(i3);
                i = i3;
                return Integer.valueOf(i);
            }
        }
        i = 0;
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4530f() {
        jl4 jl4Var = this.f17123c;
        return (jl4Var != null ? jl4Var.m7181g(m4542r()) : null) != oo3.f26926b;
    }

    /* JADX INFO: renamed from: g */
    public final int m4531g(jl4 jl4Var, int i) {
        int iM4542r = m4542r();
        pl4 pl4Var = this.f17125e;
        if (pl4Var.f27737a == null) {
            pl4Var.f27737a = Float.valueOf(jl4Var.m7177c(iM4542r).f22396a);
        }
        yu2 yu2Var = jl4Var.f22401b;
        int iM13245d = yu2Var.m13245d(iM4542r) + i;
        if (iM13245d < 0) {
            return 0;
        }
        if (iM13245d >= yu2Var.f35537f) {
            return this.f17127g.f24092b.length();
        }
        float fM13243b = yu2Var.m13243b(iM13245d) - 1.0f;
        Float f = pl4Var.f27737a;
        float fFloatValue = f.floatValue();
        if ((m4530f() && fFloatValue >= jl4Var.m7179e(iM13245d)) || (!m4530f() && fFloatValue <= jl4Var.m7178d(iM13245d))) {
            return yu2Var.m13244c(iM13245d, true);
        }
        int iM13248g = yu2Var.m13248g((((long) Float.floatToRawIntBits(fM13243b)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32));
        this.f17124d.m11899b(iM13248g);
        return iM13248g;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: h */
    public final int m4532h(kl4 kl4Var, int i) {
        jl3 jl3VarMo4003Q;
        vi3 vi3Var = this.f17124d;
        cf2 cf2Var = kl4Var.f23217b;
        jl4 jl4Var = kl4Var.f23216a;
        if (cf2Var == null) {
            jl3VarMo4003Q = jl3.f22395e;
        } else {
            cf2 cf2Var2 = kl4Var.f23218c;
            jl3VarMo4003Q = cf2Var2 != null ? cf2Var2.mo4003Q(cf2Var, true) : null;
            if (jl3VarMo4003Q == null) {
                jl3VarMo4003Q = jl3.f22395e;
            }
        }
        long j = this.f17128h.f34342b;
        int i2 = ql4.f28557c;
        int i3 = (int) (j & 4294967295L);
        vi3Var.m11898a(i3);
        jl3 jl3VarM7177c = jl4Var.m7177c(i3);
        float f = jl3VarM7177c.f22396a;
        int iM13248g = jl4Var.f22401b.m13248g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jl3VarMo4003Q.m7168d() & 4294967295L)) * i) + jl3VarM7177c.f22397b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        vi3Var.m11899b(iM13248g);
        return iM13248g;
    }

    /* JADX INFO: renamed from: i */
    public final void m4533i() {
        pl4 pl4Var = this.f17125e;
        pl4Var.f27737a = null;
        C0875lk c0875lk = this.f17127g;
        if (c0875lk.f24092b.length() > 0) {
            if (m4530f()) {
                m4535k();
                return;
            }
            pl4Var.f27737a = null;
            if (c0875lk.f24092b.length() > 0) {
                String str = c0875lk.f24092b;
                long j = this.f17126f;
                int i = ql4.f28557c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    m4541q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4534j() {
        this.f17125e.f27737a = null;
        C0875lk c0875lk = this.f17127g;
        String str = c0875lk.f24092b;
        String str2 = c0875lk.f24092b;
        if (str.length() > 0) {
            int iM7685P = kx5.m7685P(str2, ql4.m9902f(this.f17126f));
            if (iM7685P == ql4.m9902f(this.f17126f) && iM7685P != str2.length()) {
                iM7685P = kx5.m7685P(str2, iM7685P + 1);
            }
            m4541q(iM7685P, iM7685P);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4535k() {
        this.f17125e.f27737a = null;
        C0875lk c0875lk = this.f17127g;
        if (c0875lk.f24092b.length() > 0) {
            String str = c0875lk.f24092b;
            long j = this.f17126f;
            int i = ql4.f28557c;
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iPreceding = characterInstance.preceding((int) (j & 4294967295L));
            if (iPreceding != -1) {
                m4541q(iPreceding, iPreceding);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4536l() {
        this.f17125e.f27737a = null;
        C0875lk c0875lk = this.f17127g;
        String str = c0875lk.f24092b;
        String str2 = c0875lk.f24092b;
        if (str.length() > 0) {
            int iM7686Q = kx5.m7686Q(str2, ql4.m9903g(this.f17126f));
            if (iM7686Q == ql4.m9903g(this.f17126f) && iM7686Q != 0) {
                iM7686Q = kx5.m7686Q(str2, iM7686Q - 1);
            }
            m4541q(iM7686Q, iM7686Q);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4537m() {
        pl4 pl4Var = this.f17125e;
        pl4Var.f27737a = null;
        C0875lk c0875lk = this.f17127g;
        if (c0875lk.f24092b.length() > 0) {
            if (!m4530f()) {
                m4535k();
                return;
            }
            pl4Var.f27737a = null;
            if (c0875lk.f24092b.length() > 0) {
                String str = c0875lk.f24092b;
                long j = this.f17126f;
                int i = ql4.f28557c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    m4541q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4538n() {
        Integer numM4526b;
        this.f17125e.f27737a = null;
        if (this.f17127g.f24092b.length() <= 0 || (numM4526b = m4526b()) == null) {
            return;
        }
        int iIntValue = numM4526b.intValue();
        m4541q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: o */
    public final void m4539o() {
        Integer numM4527c;
        this.f17125e.f27737a = null;
        if (this.f17127g.f24092b.length() <= 0 || (numM4527c = m4527c()) == null) {
            return;
        }
        int iIntValue = numM4527c.intValue();
        m4541q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: p */
    public final void m4540p() {
        if (this.f17127g.f24092b.length() > 0) {
            long j = this.f17122b;
            int i = ql4.f28557c;
            this.f17126f = sc6.m10657b((int) (j >> 32), (int) (this.f17126f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m4541q(int i, int i2) {
        this.f17126f = sc6.m10657b(i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final int m4542r() {
        vi3 vi3Var = this.f17124d;
        long j = this.f17126f;
        int i = ql4.f28557c;
        int i2 = (int) (j & 4294967295L);
        vi3Var.m11898a(i2);
        return i2;
    }
}
