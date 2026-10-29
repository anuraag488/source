package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xc4 extends y42 implements ha2 {

    /* JADX INFO: renamed from: k */
    public final li0 f34152k;

    /* JADX INFO: renamed from: l */
    public final i92 f34153l;

    /* JADX INFO: renamed from: m */
    public final bk2 f34154m;

    /* JADX INFO: renamed from: n */
    public final ha2[] f34155n;

    /* JADX INFO: renamed from: o */
    public boolean f34156o;

    /* JADX INFO: renamed from: p */
    public String f34157p;

    /* JADX INFO: renamed from: q */
    public String f34158q;

    public xc4(li0 li0Var, i92 i92Var, bk2 bk2Var, ha2[] ha2VarArr) {
        this.f34152k = li0Var;
        this.f34153l = i92Var;
        this.f34154m = bk2Var;
        this.f34155n = ha2VarArr;
        int iOrdinal = bk2Var.ordinal();
        if (ha2VarArr != null) {
            ha2 ha2Var = ha2VarArr[iOrdinal];
            if (ha2Var == null && ha2Var == this) {
                return;
            }
            ha2VarArr[iOrdinal] = this;
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: B */
    public final void mo5916B(String str) {
        this.f34152k.mo7981j(str);
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: C */
    public final void mo5917C(g24 g24Var, int i) {
        mo5916B(g24Var.mo4433e(i));
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: a */
    public final si0 mo5918a(g24 g24Var) {
        ha2 ha2Var;
        i92 i92Var = this.f34153l;
        bk2 bk2VarM4288C = d24.m4288C(i92Var, g24Var);
        char c = bk2VarM4288C.f15361a;
        li0 li0Var = this.f34152k;
        li0Var.m7976d(c);
        li0Var.f24043b = true;
        String str = this.f34157p;
        if (str != null) {
            String strMo3641b = this.f34158q;
            if (strMo3641b == null) {
                strMo3641b = g24Var.mo3641b();
            }
            li0Var.m7974b();
            mo5916B(str);
            li0Var.m7976d(':');
            mo5916B(strMo3641b);
            this.f34157p = null;
            this.f34158q = null;
        }
        if (this.f34154m == bk2VarM4288C) {
            return this;
        }
        ha2[] ha2VarArr = this.f34155n;
        return (ha2VarArr == null || (ha2Var = ha2VarArr[bk2VarM4288C.ordinal()]) == null) ? new xc4(li0Var, i92Var, bk2VarM4288C, ha2VarArr) : ha2Var;
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: c */
    public final void mo5919c() {
        this.f34152k.m7979h("null");
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: d */
    public final void mo5920d(jc2 jc2Var, Object obj) {
        String strM4313n;
        i92 i92Var = this.f34153l;
        try {
            try {
                s92 s92Var = i92Var.f21188a;
                boolean z = jc2Var instanceof AbstractC0512c2;
                if (z) {
                    strM4313n = ((q90) s92Var.f30012e) != q90.f28306a ? d24.m4313n(i92Var, jc2Var.mo15d()) : null;
                } else {
                    int iOrdinal = ((q90) s92Var.f30012e).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            zc6 zc6VarMo4431c = jc2Var.mo15d().mo4431c();
                            if (z62.m13387o(zc6VarMo4431c, rd4.f29188j) || z62.m13387o(zc6VarMo4431c, rd4.f29191m)) {
                            }
                        } else if (iOrdinal != 2) {
                            throw new gf0();
                        }
                    }
                }
                if (z) {
                    c75.m3884p(jc2Var);
                    if (obj != null) {
                        throw null;
                    }
                    c75.m3884p(jc2Var);
                    throw null;
                }
                if (strM4313n != null) {
                    d24.m4310k(i92Var, jc2Var, jc2Var, strM4313n);
                    d24.m4311l(jc2Var.mo15d().mo4431c());
                    String strMo3641b = jc2Var.mo15d().mo3641b();
                    this.f34157p = strM4313n;
                    this.f34158q = strMo3641b;
                }
                jc2Var.mo14c(this, obj);
            } catch (Exception e) {
                String message = e.getMessage();
                String strMo3641b2 = jc2Var.mo15d().mo3641b();
                StringBuilder sb = new StringBuilder("Serialization ");
                sb.append(hd4.m6345k0(strMo3641b2) ? "" : zi4.m13621u("of '", strMo3641b2, "' "));
                sb.append("failed because of ");
                throw new y92(zi4.m13623w(sb, message == null ? "an exception" : zi4.m13621u("'", message, "' exception"), " in the encoder"), null, e, 4);
            }
        } catch (o24 e2) {
            throw e2;
        }
    }

    @Override // p000.y42, p000.si0
    /* JADX INFO: renamed from: f */
    public final void mo6728f() {
        li0 li0Var = this.f34152k;
        li0Var.getClass();
        li0Var.f24043b = false;
        li0Var.m7976d(this.f34154m.f15362b);
    }

    @Override // p000.y42
    /* JADX INFO: renamed from: f0 */
    public final void mo12650f0(g24 g24Var, int i) {
        int iOrdinal = this.f34154m.ordinal();
        li0 li0Var = this.f34152k;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!li0Var.f24043b) {
                li0Var.m7976d(',');
            }
            li0Var.m7974b();
            return;
        }
        if (iOrdinal == 2) {
            if (li0Var.f24043b) {
                this.f34156o = true;
                li0Var.m7974b();
                return;
            }
            if (i % 2 == 0) {
                li0Var.m7976d(',');
                li0Var.m7974b();
            } else {
                li0Var.m7976d(':');
                li0Var.m7982k();
                z = false;
            }
            this.f34156o = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!li0Var.f24043b) {
                li0Var.m7976d(',');
            }
            li0Var.m7974b();
            qa2.m9807d(this.f34153l, g24Var);
            mo5916B(g24Var.mo4433e(i));
            li0Var.m7976d(':');
            li0Var.m7982k();
            return;
        }
        if (i == 0) {
            this.f34156o = true;
        }
        if (i == 1) {
            li0Var.m7976d(',');
            li0Var.m7982k();
            this.f34156o = false;
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: g */
    public final void mo5921g(double d) {
        if (this.f34156o) {
            mo5916B(String.valueOf(d));
        } else {
            ((m62) this.f34152k.f24044c).mo6372d(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new y92(kx5.m7701c0(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", null, 10);
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: h */
    public final void mo5922h(short s) {
        if (this.f34156o) {
            mo5916B(String.valueOf((int) s));
        } else {
            this.f34152k.mo7980i(s);
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: j */
    public final void mo5923j(byte b) {
        if (this.f34156o) {
            mo5916B(String.valueOf((int) b));
        } else {
            this.f34152k.mo7975c(b);
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: k */
    public final void mo5924k(boolean z) {
        if (this.f34156o) {
            mo5916B(String.valueOf(z));
        } else {
            ((m62) this.f34152k.f24044c).mo6372d(String.valueOf(z));
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: l */
    public final g81 mo5925l(g24 g24Var) {
        li0 li0Var;
        li0 li0Var2;
        boolean zM13088a = yc4.m13088a(g24Var);
        bk2 bk2Var = this.f34154m;
        i92 i92Var = this.f34153l;
        li0 li0Var3 = this.f34152k;
        if (zM13088a) {
            if (!(li0Var3 instanceof pi0)) {
                li0Var2 = li0Var3;
                m62 m62Var = (m62) li0Var3.f24044c;
                boolean z = this.f34156o;
                pi0 pi0Var = new pi0(m62Var);
                pi0Var.f27630d = z;
                VarHandle.storeStoreFence();
                li0Var2 = pi0Var;
            }
            li0Var2 = li0Var3;
            return new xc4(li0Var2, i92Var, bk2Var, null);
        }
        if (!g24Var.mo5886f() || !g24Var.equals(ca2.f15904a)) {
            if (this.f34157p != null) {
                this.f34158q = g24Var.mo3641b();
            }
            return this;
        }
        if (!(li0Var3 instanceof oi0)) {
            li0Var = li0Var3;
            m62 m62Var2 = (m62) li0Var3.f24044c;
            boolean z2 = this.f34156o;
            oi0 oi0Var = new oi0(m62Var2);
            oi0Var.f26760d = z2;
            VarHandle.storeStoreFence();
            li0Var = oi0Var;
        }
        li0Var = li0Var3;
        return new xc4(li0Var, i92Var, bk2Var, null);
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: p */
    public final void mo5927p(int i) {
        if (this.f34156o) {
            mo5916B(String.valueOf(i));
        } else {
            this.f34152k.mo7977e(i);
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: t */
    public final void mo5928t(float f) {
        if (this.f34156o) {
            mo5916B(String.valueOf(f));
        } else {
            ((m62) this.f34152k.f24044c).mo6372d(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new y92(kx5.m7701c0(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", null, 10);
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: v */
    public final void mo5929v(long j) {
        if (this.f34156o) {
            mo5916B(String.valueOf(j));
        } else {
            this.f34152k.mo7978g(j);
        }
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: x */
    public final void mo5930x(char c) {
        mo5916B(String.valueOf(c));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: y */
    public final boolean mo6737y() {
        return false;
    }
}
