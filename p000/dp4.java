package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dp4 {

    /* JADX INFO: renamed from: a */
    public final zh0 f17258a;

    /* JADX INFO: renamed from: b */
    public final dp4 f17259b;

    /* JADX INFO: renamed from: c */
    public final String f17260c;

    /* JADX INFO: renamed from: d */
    public final d83 f17261d;

    /* JADX INFO: renamed from: f */
    public final d83 f17263f;

    /* JADX INFO: renamed from: i */
    public final d83 f17266i;

    /* JADX INFO: renamed from: j */
    public final w94 f17267j;

    /* JADX INFO: renamed from: k */
    public final w94 f17268k;

    /* JADX INFO: renamed from: l */
    public final d83 f17269l;

    /* JADX INFO: renamed from: m */
    public final wy0 f17270m;

    /* JADX INFO: renamed from: e */
    public final d83 f17262e = k43.m7398w(null);

    /* JADX INFO: renamed from: g */
    public final b83 f17264g = new b83(0);

    /* JADX INFO: renamed from: h */
    public final b83 f17265h = new b83(Long.MIN_VALUE);

    public dp4(zh0 zh0Var, dp4 dp4Var, String str) {
        this.f17258a = zh0Var;
        this.f17259b = dp4Var;
        this.f17260c = str;
        this.f17261d = k43.m7398w(zh0Var.mo11188l());
        this.f17263f = k43.m7398w(new ap4(zh0Var.mo11188l(), zh0Var.mo11188l()));
        Boolean bool = Boolean.FALSE;
        this.f17266i = k43.m7398w(bool);
        this.f17267j = new w94();
        this.f17268k = new w94();
        this.f17269l = k43.m7398w(bool);
        ly2 ly2Var = new ly2((byte) 2);
        ly2Var.f24465b = this;
        VarHandle.storeStoreFence();
        this.f17270m = s94.m10566b(ly2Var);
        zh0Var.mo13279r(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m4639a(Object obj, mi0 mi0Var, int i) {
        int i2;
        Object obj2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(obj) : ir1Var.m6894i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(this) ? 32 : 16;
        }
        byte b = 1;
        if (!ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            ir1Var.m6874W();
        } else if (m4648j()) {
            ir1Var.m6885d0(467722849);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(466062241);
            m4659u(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj3 = objM6869O;
            if (z || objM6869O == i50Var) {
                ly2 ly2Var = new ly2(b);
                ly2Var.f24465b = this;
                VarHandle.storeStoreFence();
                wy0 wy0VarM10566b = s94.m10566b(ly2Var);
                ir1Var.m6905n0(wy0VarM10566b);
                obj3 = wy0VarM10566b;
            }
            if (((Boolean) ((xb4) obj3).getValue()).booleanValue()) {
                ir1Var.m6885d0(466470356);
                Object objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    obj2 = objM6869O2;
                    zo0 zo0VarM7942w = lb5.m7942w(r71.f29063a, ir1Var);
                    ir1Var.m6905n0(zo0VarM7942w);
                    obj2 = zo0VarM7942w;
                }
                obj2 = objM6869O2;
                zo0 zo0Var = (zo0) obj2;
                int i4 = (ir1Var.m6894i(zo0Var) ? 1 : 0) | (i3 != 32 ? (byte) 0 : (byte) 1);
                Object objM6869O3 = ir1Var.m6869O();
                Object obj4 = objM6869O3;
                if (i4 != 0 || objM6869O3 == i50Var) {
                    cz3 cz3Var = new cz3((byte) 14);
                    cz3Var.f16638b = zo0Var;
                    cz3Var.f16639c = this;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(cz3Var);
                    obj4 = cz3Var;
                }
                lb5.m7924e(zo0Var, this, (yp1) obj4, ir1Var);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(467712929);
                ir1Var.m6912r(false);
            }
            ir1Var.m6912r(false);
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mg0 mg0Var = new mg0((byte) 5);
            mg0Var.f24879c = this;
            mg0Var.f24880d = obj;
            mg0Var.f24878b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mg0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m4640b() {
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((bp4) w94Var.get(i)).f15496l.m3512h());
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((dp4) w94Var2.get(i2)).m4640b());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: c */
    public final void m4641c() {
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            bp4 bp4Var = (bp4) w94Var.get(i);
            bp4Var.f15490f = null;
            bp4Var.f15489e = null;
            bp4Var.f15493i = false;
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((dp4) w94Var2.get(i2)).m4641c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m4642d() {
        return this.f17258a.mo11188l();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4643e() {
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            if (((bp4) w94Var.get(i)).f15489e != null) {
                return true;
            }
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((dp4) w94Var2.get(i2)).m4643e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final long m4644f() {
        dp4 dp4Var = this.f17259b;
        return dp4Var != null ? dp4Var.m4644f() : this.f17264g.m3512h();
    }

    /* JADX INFO: renamed from: g */
    public final zo4 m4645g() {
        return (zo4) this.f17263f.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final Object m4646h() {
        return this.f17261d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4647i() {
        return this.f17265h.m3512h() != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4648j() {
        return ((Boolean) this.f17269l.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m4649k(long j, boolean z) {
        b83 b83Var = this.f17265h;
        long jM3512h = b83Var.m3512h();
        zh0 zh0Var = this.f17258a;
        if (jM3512h == Long.MIN_VALUE) {
            b83Var.m3513i(j);
            ((d83) zh0Var.f36084a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((d83) zh0Var.f36084a).getValue()).booleanValue()) {
            ((d83) zh0Var.f36084a).setValue(Boolean.TRUE);
        }
        m4656r(false);
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            bp4 bp4Var = (bp4) w94Var.get(i);
            d83 d83Var = bp4Var.f15491g;
            d83 d83Var2 = bp4Var.f15491g;
            if (!((Boolean) d83Var.getValue()).booleanValue()) {
                long jMo5814c = z ? bp4Var.m3654a().mo5814c() : j;
                bp4Var.m3656d(bp4Var.m3654a().mo5813b(jMo5814c));
                bp4Var.f15495k = bp4Var.m3654a().mo5817f(jMo5814c);
                if (bp4Var.m3654a().m11569g(jMo5814c)) {
                    d83Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) d83Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dp4 dp4Var = (dp4) w94Var2.get(i2);
            d83 d83Var3 = dp4Var.f17261d;
            zh0 zh0Var2 = dp4Var.f17258a;
            if (!z62.m13387o(d83Var3.getValue(), zh0Var2.mo11188l())) {
                dp4Var.m4649k(j, z);
            }
            if (!z62.m13387o(dp4Var.f17261d.getValue(), zh0Var2.mo11188l())) {
                z2 = false;
            }
        }
        if (z2) {
            m4650l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4650l() {
        this.f17265h.m3513i(Long.MIN_VALUE);
        zh0 zh0Var = this.f17258a;
        if (zh0Var instanceof tw2) {
            zh0Var.mo11190q(this.f17261d.getValue());
        }
        m4655q(0L);
        ((d83) zh0Var.f36084a).setValue(Boolean.FALSE);
        w94 w94Var = this.f17268k;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            ((dp4) w94Var.get(i)).m4650l();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4651m(float f) {
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            bp4 bp4Var = (bp4) w94Var.get(i);
            bp4Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                hi4 hi4Var = bp4Var.f15490f;
                if (hi4Var != null) {
                    bp4Var.m3654a().m6411h(hi4Var.f20605c);
                    bp4Var.f15489e = null;
                    bp4Var.f15490f = null;
                }
                Object obj = f == -4.0f ? bp4Var.m3654a().f20606d : bp4Var.m3654a().f20605c;
                bp4Var.m3654a().m6411h(obj);
                bp4Var.m3654a().m6412i(obj);
                bp4Var.m3656d(obj);
                bp4Var.f15496l.m3513i(bp4Var.m3654a().mo5814c());
            } else {
                bp4Var.f15492h.m13400i(f);
            }
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((dp4) w94Var2.get(i2)).m4651m(f);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4652n(Object obj, Object obj2) {
        this.f17265h.m3513i(Long.MIN_VALUE);
        zh0 zh0Var = this.f17258a;
        ((d83) zh0Var.f36084a).setValue(Boolean.FALSE);
        boolean zM4648j = m4648j();
        d83 d83Var = this.f17261d;
        if (!zM4648j || !z62.m13387o(zh0Var.mo11188l(), obj) || !z62.m13387o(d83Var.getValue(), obj2)) {
            if (!z62.m13387o(zh0Var.mo11188l(), obj) && (zh0Var instanceof tw2)) {
                zh0Var.mo11190q(obj);
            }
            d83Var.setValue(obj2);
            this.f17269l.setValue(Boolean.TRUE);
            this.f17263f.setValue(new ap4(obj, obj2));
        }
        w94 w94Var = this.f17268k;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            dp4 dp4Var = (dp4) w94Var.get(i);
            if (dp4Var.m4648j()) {
                dp4Var.m4652n(dp4Var.f17258a.mo11188l(), dp4Var.f17261d.getValue());
            }
        }
        w94 w94Var2 = this.f17267j;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bp4) w94Var2.get(i2)).m3655b(0L);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4653o(long j) {
        b83 b83Var = this.f17265h;
        if (b83Var.m3512h() == Long.MIN_VALUE) {
            b83Var.m3513i(j);
        }
        m4655q(j);
        m4656r(false);
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            ((bp4) w94Var.get(i)).m3655b(j);
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dp4 dp4Var = (dp4) w94Var2.get(i2);
            if (!z62.m13387o(dp4Var.f17261d.getValue(), dp4Var.f17258a.mo11188l())) {
                dp4Var.m4653o(j);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m4654p(rz3 rz3Var) {
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            bp4 bp4Var = (bp4) w94Var.get(i);
            d83 d83Var = bp4Var.f15494j;
            if (!z62.m13387o(bp4Var.m3654a().f20605c, bp4Var.m3654a().f20606d)) {
                bp4Var.f15490f = bp4Var.m3654a();
                bp4Var.f15489e = rz3Var;
            }
            bp4Var.f15488d.setValue(new hi4(bp4Var.f15498n, bp4Var.f15485a, d83Var.getValue(), d83Var.getValue(), bp4Var.f15495k.mo4035c()));
            bp4Var.f15496l.m3513i(bp4Var.m3654a().mo5814c());
            bp4Var.f15493i = true;
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((dp4) w94Var2.get(i2)).m4654p(rz3Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m4655q(long j) {
        if (this.f17259b == null) {
            this.f17264g.m3513i(j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4656r(boolean z) {
        this.f17266i.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: s */
    public final void m4657s() {
        hi4 hi4Var;
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            bp4 bp4Var = (bp4) w94Var.get(i);
            rz3 rz3Var = bp4Var.f15489e;
            if (rz3Var != null && (hi4Var = bp4Var.f15490f) != null) {
                long jM10011F = qq2.m10011F(rz3Var.f29753g * ((double) rz3Var.f29750d));
                Object objMo5813b = hi4Var.mo5813b(jM10011F);
                if (bp4Var.f15493i) {
                    bp4Var.m3654a().m6412i(objMo5813b);
                }
                bp4Var.m3654a().m6411h(objMo5813b);
                bp4Var.f15496l.m3513i(bp4Var.m3654a().mo5814c());
                if (bp4Var.f15492h.m13399h() == -2.0f || bp4Var.f15493i) {
                    bp4Var.m3656d(objMo5813b);
                } else {
                    bp4Var.m3655b(bp4Var.f15499o.m4644f());
                }
                if (jM10011F >= rz3Var.f29753g) {
                    bp4Var.f15489e = null;
                    bp4Var.f15490f = null;
                } else {
                    rz3Var.f29749c = false;
                }
            }
        }
        w94 w94Var2 = this.f17268k;
        int size2 = w94Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((dp4) w94Var2.get(i2)).m4657s();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4658t(b91 b91Var) {
        d83 d83Var = this.f17262e;
        Object value = d83Var.getValue();
        zh0 zh0Var = this.f17258a;
        d83 d83Var2 = this.f17261d;
        boolean z = value != null && b91Var == null && z62.m13387o(d83Var2.getValue(), zh0Var.mo11188l());
        d83Var.setValue(b91Var);
        if (z) {
            this.f17263f.setValue(new ap4(value, d83Var2.getValue()));
            zh0Var.mo11190q(value);
            if (!m4647i()) {
                m4656r(true);
            }
            w94 w94Var = this.f17267j;
            int size = w94Var.size();
            for (int i = 0; i < size; i++) {
                ((bp4) w94Var.get(i)).f15492h.m13400i(-2.0f);
            }
        }
    }

    public final String toString() {
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((bp4) w94Var.get(i)) + ", ";
        }
        return str;
    }

    /* JADX INFO: renamed from: u */
    public final void m4659u(Object obj) {
        d83 d83Var = this.f17261d;
        if (z62.m13387o(d83Var.getValue(), obj)) {
            return;
        }
        this.f17263f.setValue(new ap4(d83Var.getValue(), obj));
        zh0 zh0Var = this.f17258a;
        if (!z62.m13387o(zh0Var.mo11188l(), d83Var.getValue())) {
            zh0Var.mo11190q(d83Var.getValue());
        }
        d83Var.setValue(obj);
        if (!m4647i()) {
            m4656r(true);
        }
        w94 w94Var = this.f17267j;
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            ((bp4) w94Var.get(i)).f15492h.m13400i(-2.0f);
        }
    }
}
