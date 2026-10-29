package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wc4 extends ev0 implements uc3 {

    /* JADX INFO: renamed from: s */
    public final i92 f33239s;

    /* JADX INFO: renamed from: t */
    public final bk2 f33240t;

    /* JADX INFO: renamed from: u */
    public final AbstractC0856l1 f33241u;

    /* JADX INFO: renamed from: v */
    public int f33242v = -1;

    /* JADX INFO: renamed from: w */
    public final s92 f33243w;

    public wc4(i92 i92Var, bk2 bk2Var, AbstractC0856l1 abstractC0856l1, g24 g24Var) {
        this.f33239s = i92Var;
        this.f33240t = bk2Var;
        this.f33241u = abstractC0856l1;
        this.f33243w = i92Var.f21188a;
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: A */
    public final String mo5377A() {
        return this.f33241u.m7802l();
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: B */
    public final float mo5378B() {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        String strM7804n = abstractC0856l1.m7804n();
        try {
            float f = Float.parseFloat(strM7804n);
            s92 s92Var = this.f33239s.f21188a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            AbstractC0856l1.m7793r(abstractC0856l1, kx5.m7701c0(Float.valueOf(f), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Failed to parse type 'float' for input '", strM7804n), 0, 6);
            throw null;
        }
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: C */
    public final int mo5379C(g24 g24Var) {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        return qa2.m9805b(g24Var, this.f33239s, abstractC0856l1.m7802l(), " at path ".concat(((db2) abstractC0856l1.f23688d).m4417a()));
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: D */
    public final double mo5380D() {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        String strM7804n = abstractC0856l1.m7804n();
        try {
            double d = Double.parseDouble(strM7804n);
            s92 s92Var = this.f33239s.f21188a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            AbstractC0856l1.m7793r(abstractC0856l1, kx5.m7701c0(Double.valueOf(d), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Failed to parse type 'double' for input '", strM7804n), 0, 6);
            throw null;
        }
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: a */
    public final ri0 mo5382a(g24 g24Var) {
        i92 i92Var = this.f33239s;
        bk2 bk2VarM4288C = d24.m4288C(i92Var, g24Var);
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        db2 db2Var = (db2) abstractC0856l1.f23688d;
        int i = db2Var.f16898e + 1;
        db2Var.f16898e = i;
        short s = db2Var.f16894a;
        if (i >= s) {
            zc6.m13506C(s);
            throw null;
        }
        if (i == db2Var.f16896c.length) {
            db2Var.m4418b();
        }
        db2Var.f16896c[i] = g24Var;
        abstractC0856l1.mo4483j(bk2VarM4288C.f15361a);
        if (abstractC0856l1.m7808v() == 4) {
            AbstractC0856l1.m7793r(abstractC0856l1, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = bk2VarM4288C.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new wc4(i92Var, bk2VarM4288C, abstractC0856l1, g24Var);
        }
        if (this.f33240t != bk2VarM4288C) {
            return new wc4(i92Var, bk2VarM4288C, abstractC0856l1, g24Var);
        }
        s92 s92Var = i92Var.f21188a;
        return this;
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: b */
    public final Object mo6942b(jc2 jc2Var) {
        i92 i92Var = this.f33239s;
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        db2 db2Var = (db2) abstractC0856l1.f23688d;
        try {
            try {
                if (!(jc2Var instanceof AbstractC0512c2)) {
                    return jc2Var.mo13b(this);
                }
                s92 s92Var = i92Var.f21188a;
                c75.m3884p(jc2Var);
                throw null;
            } catch (it2 e) {
                if (hd4.m6335a0(e.getMessage(), "at path", false)) {
                    throw e;
                }
                throw new it2(e.getMessage() + " at path: " + db2Var.m4417a(), e, e.f21768a, e.f21769b);
            } catch (o24 e2) {
                throw e2;
            }
        } catch (Exception e3) {
            String strM4417a = db2Var.m4417a();
            String message = e3.getMessage();
            throw new y92(kx5.m7687R(-1, zi4.m13623w(new StringBuilder("Deserialization failed because of "), message == null ? "an exception" : zi4.m13621u("'", message, "' exception"), " in the decoder"), strM4417a, null, i92Var.f21188a.f30011d ? kx5.m7695Z(abstractC0856l1.mo4484t(), -1).toString() : null), e3);
        }
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: c */
    public final long mo5383c() {
        return this.f33241u.m7801k();
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: f */
    public final boolean mo5386f() {
        boolean z;
        boolean z2;
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        int iMo4486x = abstractC0856l1.mo4486x();
        if (iMo4486x == abstractC0856l1.mo4484t().length()) {
            AbstractC0856l1.m7793r(abstractC0856l1, "EOF", 0, 6);
            throw null;
        }
        if (abstractC0856l1.mo4484t().charAt(iMo4486x) == '\"') {
            iMo4486x++;
            z = true;
        } else {
            z = false;
        }
        int iMo4485w = abstractC0856l1.mo4485w(iMo4486x);
        if (iMo4485w >= abstractC0856l1.mo4484t().length() || iMo4485w == -1) {
            AbstractC0856l1.m7793r(abstractC0856l1, "EOF", 0, 6);
            throw null;
        }
        int i = iMo4485w + 1;
        int iCharAt = abstractC0856l1.mo4484t().charAt(iMo4485w) | ' ';
        if (iCharAt == 102) {
            abstractC0856l1.m7799e(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC0856l1.m7793r(abstractC0856l1, "Expected valid boolean literal prefix, but had '" + abstractC0856l1.m7804n() + '\'', 0, 6);
                throw null;
            }
            abstractC0856l1.m7799e(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (abstractC0856l1.f23686b == abstractC0856l1.mo4484t().length()) {
            AbstractC0856l1.m7793r(abstractC0856l1, "EOF", 0, 6);
            throw null;
        }
        if (abstractC0856l1.mo4484t().charAt(abstractC0856l1.f23686b) == '\"') {
            abstractC0856l1.f23686b++;
            return z2;
        }
        AbstractC0856l1.m7793r(abstractC0856l1, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: g */
    public final boolean mo5387g() {
        return !this.f33241u.m7795A(true);
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: h */
    public final char mo5388h() {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        String strM7804n = abstractC0856l1.m7804n();
        if (strM7804n.length() == 1) {
            return strM7804n.charAt(0);
        }
        AbstractC0856l1.m7793r(abstractC0856l1, zi4.m13617q('\'', "Expected single char, but got '", strM7804n), 0, 6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ri0
    /* JADX INFO: renamed from: j */
    public final int mo6325j(g24 g24Var) throws Throwable {
        boolean zM7809z;
        boolean z;
        String strM7802l;
        String str;
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        db2 db2Var = (db2) abstractC0856l1.f23688d;
        bk2 bk2Var = this.f33240t;
        int iOrdinal = bk2Var.ordinal();
        Throwable th = null;
        char c = ':';
        boolean zM7809z2 = false;
        i92 i92Var = this.f33239s;
        int i = -1;
        if (iOrdinal == 0) {
            boolean zM7809z3 = abstractC0856l1.m7809z();
            while (true) {
                if (!abstractC0856l1.mo4480d()) {
                    Throwable th2 = th;
                    if (!zM7809z3) {
                        break;
                    }
                    s92 s92Var = i92Var.f21188a;
                    kx5.m7691V(abstractC0856l1);
                    throw th2;
                }
                String strMo4481f = abstractC0856l1.mo4481f();
                abstractC0856l1.mo4483j(c);
                int iM9804a = qa2.m9804a(g24Var, i92Var, strMo4481f);
                if (iM9804a != -3) {
                    if (this.f33243w.f30010c) {
                        boolean zMo4437k = g24Var.mo4437k(iM9804a);
                        th = th;
                        g24 g24VarMo4436j = g24Var.mo4436j(iM9804a);
                        if (!zMo4437k || g24VarMo4436j.mo5887h() || !abstractC0856l1.m7795A(true)) {
                            if (z62.m13387o(g24VarMo4436j.mo4431c(), l24.f23749j) && (!g24VarMo4436j.mo5887h() || !abstractC0856l1.m7795A(false))) {
                                if (abstractC0856l1.m7808v() != 1) {
                                    str = th;
                                } else {
                                    strM7802l = abstractC0856l1.m7802l();
                                    abstractC0856l1.f23689e = strM7802l;
                                }
                                if (str == 0) {
                                    str = strM7802l;
                                } else {
                                    str = strM7802l;
                                    if (qa2.m9804a(g24VarMo4436j, i92Var, str) == -3 && zMo4437k) {
                                        abstractC0856l1.m7802l();
                                    }
                                }
                            }
                        }
                        zM7809z = abstractC0856l1.m7809z();
                        z = false;
                    }
                    i = iM9804a;
                    break;
                }
                th = th;
                zM7809z = false;
                z = true;
                if (!z) {
                    zM7809z3 = zM7809z;
                } else {
                    if (!qa2.m9806c(i92Var, g24Var)) {
                        int i2 = db2Var.f16898e;
                        int[] iArr = db2Var.f16897d;
                        if (iArr[i2] == -2) {
                            iArr[i2] = -1;
                            i2--;
                            db2Var.f16898e = i2;
                        }
                        if (i2 != -1) {
                            db2Var.f16898e = i2 - 1;
                        }
                        String strMo6641y = abstractC0856l1.mo6641y(0, abstractC0856l1.f23686b);
                        abstractC0856l1.m7806q(zi4.m13617q('\'', "Encountered an unknown key '", strMo4481f), strMo6641y.lastIndexOf(strMo4481f, hd4.m6339e0(strMo6641y)), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                        throw th;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bM7808v = abstractC0856l1.m7808v();
                    if (bM7808v == 8 || bM7808v == 6) {
                        while (true) {
                            byte bM7808v2 = abstractC0856l1.m7808v();
                            if (bM7808v2 == 1) {
                                abstractC0856l1.mo4481f();
                            } else {
                                if (bM7808v2 == 8 || bM7808v2 == 6) {
                                    arrayList.add(Byte.valueOf(bM7808v2));
                                } else if (bM7808v2 == 9) {
                                    if (((Number) hb0.m6306R0(arrayList)).byteValue() != 8) {
                                        AbstractC0856l1.m7793r(abstractC0856l1, "found ] instead of }", 0, 6);
                                        throw th;
                                    }
                                    mb0.m8263D0(arrayList);
                                } else if (bM7808v2 == 7) {
                                    if (((Number) hb0.m6306R0(arrayList)).byteValue() != 6) {
                                        AbstractC0856l1.m7793r(abstractC0856l1, "found } instead of ]", 0, 6);
                                        throw th;
                                    }
                                    mb0.m8263D0(arrayList);
                                } else if (bM7808v2 == 10) {
                                    AbstractC0856l1.m7793r(abstractC0856l1, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                    throw th;
                                }
                                abstractC0856l1.mo4482h();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        abstractC0856l1.m7804n();
                    }
                    zM7809z3 = abstractC0856l1.m7809z();
                }
                c = ':';
            }
        } else if (iOrdinal != 2) {
            boolean zM7809z4 = abstractC0856l1.m7809z();
            if (abstractC0856l1.mo4480d()) {
                int i3 = this.f33242v;
                if (i3 != -1 && !zM7809z4) {
                    AbstractC0856l1.m7793r(abstractC0856l1, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i = i3 + 1;
                this.f33242v = i;
            } else if (zM7809z4) {
                s92 s92Var2 = i92Var.f21188a;
                kx5.m7690U(abstractC0856l1, "array");
                throw null;
            }
        } else {
            int i4 = this.f33242v;
            boolean z2 = i4 % 2 != 0;
            if (!z2) {
                abstractC0856l1.mo4483j(':');
            } else if (i4 != -1) {
                zM7809z2 = abstractC0856l1.m7809z();
            }
            if (abstractC0856l1.mo4480d()) {
                if (z2) {
                    int i5 = this.f33242v;
                    int i6 = abstractC0856l1.f23686b;
                    if (i5 == -1) {
                        if (zM7809z2) {
                            AbstractC0856l1.m7793r(abstractC0856l1, "Unexpected leading comma", i6, 4);
                            throw null;
                        }
                    } else if (!zM7809z2) {
                        AbstractC0856l1.m7793r(abstractC0856l1, "Expected comma after the key-value pair", i6, 4);
                        throw null;
                    }
                }
                i = this.f33242v + 1;
                this.f33242v = i;
            } else if (zM7809z2) {
                s92 s92Var3 = i92Var.f21188a;
                kx5.m7691V(abstractC0856l1);
                throw null;
            }
        }
        if (bk2Var != bk2.MAP) {
            db2Var.f16897d[db2Var.f16898e] = i;
        }
        return i;
    }

    @Override // p000.uc3
    /* JADX INFO: renamed from: m */
    public final i92 mo8191m() {
        return this.f33239s;
    }

    @Override // p000.uc3
    /* JADX INFO: renamed from: p */
    public final aa2 mo8192p() {
        s92 s92Var = this.f33239s.f21188a;
        tb2 tb2Var = new tb2();
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        tb2Var.f31050a = abstractC0856l1;
        tb2Var.f31051b = (short) 400;
        tb2Var.f31052c = ((db2) abstractC0856l1.f23688d).f16898e;
        VarHandle.storeStoreFence();
        return tb2Var.m11019a();
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: s */
    public final int mo5396s() {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        long jM7801k = abstractC0856l1.m7801k();
        int i = (int) jM7801k;
        if (jM7801k == i) {
            return i;
        }
        AbstractC0856l1.m7793r(abstractC0856l1, "Failed to parse int for input '" + jM7801k + '\'', 0, 6);
        throw null;
    }

    @Override // p000.ev0, p000.ri0
    /* JADX INFO: renamed from: u */
    public final void mo5398u(g24 g24Var) {
        int iMo4432d = g24Var.mo4432d();
        i92 i92Var = this.f33239s;
        if (iMo4432d == 0 && qa2.m9806c(i92Var, g24Var)) {
            while (mo6325j(g24Var) != -1) {
            }
        }
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        if (abstractC0856l1.m7809z()) {
            s92 s92Var = i92Var.f21188a;
            kx5.m7690U(abstractC0856l1, "");
            throw null;
        }
        abstractC0856l1.mo4483j(this.f33240t.f15362b);
        db2 db2Var = (db2) abstractC0856l1.f23688d;
        int i = db2Var.f16898e;
        int[] iArr = db2Var.f16897d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            db2Var.f16898e = i;
        }
        if (i != -1) {
            db2Var.f16898e = i - 1;
        }
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: w */
    public final byte mo5400w() {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        long jM7801k = abstractC0856l1.m7801k();
        byte b = (byte) jM7801k;
        if (jM7801k == b) {
            return b;
        }
        AbstractC0856l1.m7793r(abstractC0856l1, "Failed to parse byte for input '" + jM7801k + '\'', 0, 6);
        throw null;
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: x */
    public final iv0 mo5401x(g24 g24Var) {
        return yc4.m13088a(g24Var) ? new x92(this.f33241u) : this;
    }

    @Override // p000.ev0, p000.ri0
    /* JADX INFO: renamed from: y */
    public final Object mo5402y(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        db2 db2Var = (db2) this.f33241u.f23688d;
        boolean z = this.f33240t == bk2.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = db2Var.f16897d;
            int i2 = db2Var.f16898e;
            if (iArr[i2] == -2) {
                db2Var.f16896c[i2] = gb5.f19716g;
            }
        }
        Object objMo6942b = mo6942b(jc2Var);
        if (z) {
            int[] iArr2 = db2Var.f16897d;
            int i3 = db2Var.f16898e;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                db2Var.f16898e = i4;
                if (i4 == db2Var.f16896c.length) {
                    db2Var.m4418b();
                }
            }
            Object[] objArr = db2Var.f16896c;
            int i5 = db2Var.f16898e;
            objArr[i5] = db2Var.f16895b ? objMo6942b : ia5.f21223n;
            db2Var.f16897d[i5] = -2;
        }
        return objMo6942b;
    }

    @Override // p000.ev0, p000.iv0
    /* JADX INFO: renamed from: z */
    public final short mo5403z() {
        AbstractC0856l1 abstractC0856l1 = this.f33241u;
        long jM7801k = abstractC0856l1.m7801k();
        short s = (short) jM7801k;
        if (jM7801k == s) {
            return s;
        }
        AbstractC0856l1.m7793r(abstractC0856l1, "Failed to parse short for input '" + jM7801k + '\'', 0, 6);
        throw null;
    }
}
