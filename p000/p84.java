package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p84 {

    /* JADX INFO: renamed from: a */
    public m84 f27433a;

    /* JADX INFO: renamed from: b */
    public int[] f27434b;

    /* JADX INFO: renamed from: c */
    public Object[] f27435c;

    /* JADX INFO: renamed from: d */
    public ArrayList f27436d;

    /* JADX INFO: renamed from: e */
    public HashMap f27437e;

    /* JADX INFO: renamed from: f */
    public lv2 f27438f;

    /* JADX INFO: renamed from: g */
    public int f27439g;

    /* JADX INFO: renamed from: h */
    public int f27440h;

    /* JADX INFO: renamed from: i */
    public int f27441i;

    /* JADX INFO: renamed from: j */
    public int f27442j;

    /* JADX INFO: renamed from: k */
    public int f27443k;

    /* JADX INFO: renamed from: l */
    public int f27444l;

    /* JADX INFO: renamed from: m */
    public int f27445m;

    /* JADX INFO: renamed from: n */
    public int f27446n;

    /* JADX INFO: renamed from: o */
    public int f27447o;

    /* JADX INFO: renamed from: p */
    public x52 f27448p;

    /* JADX INFO: renamed from: q */
    public x52 f27449q;

    /* JADX INFO: renamed from: r */
    public x52 f27450r;

    /* JADX INFO: renamed from: s */
    public lv2 f27451s;

    /* JADX INFO: renamed from: t */
    public int f27452t;

    /* JADX INFO: renamed from: u */
    public int f27453u;

    /* JADX INFO: renamed from: v */
    public int f27454v;

    /* JADX INFO: renamed from: w */
    public boolean f27455w;

    /* JADX INFO: renamed from: x */
    public kv2 f27456x;

    /* JADX INFO: renamed from: h */
    public static int m9388h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX INFO: renamed from: y */
    public static void m9389y(p84 p84Var) {
        int i = p84Var.f27454v;
        int iM9428q = p84Var.m9428q(i);
        int[] iArr = p84Var.f27434b;
        int i2 = (iM9428q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        p84Var.m9411V(p84Var.m9395F(iArr, i));
    }

    /* JADX INFO: renamed from: A */
    public final void m9390A(int i) {
        cr1 cr1Var;
        int i2;
        cr1 cr1Var2;
        int i3;
        int i4;
        int i5 = this.f27440h;
        int i6 = this.f27439g;
        if (i6 != i) {
            if (!this.f27436d.isEmpty()) {
                int iM9425n = m9425n() - this.f27440h;
                ArrayList arrayList = this.f27436d;
                if (i6 < i) {
                    for (int iM8982c = o84.m8982c(arrayList, i6, iM9425n); iM8982c < this.f27436d.size() && (i3 = (cr1Var2 = (cr1) this.f27436d.get(iM8982c)).f16390a) < 0 && (i4 = i3 + iM9425n) < i; iM8982c++) {
                        cr1Var2.f16390a = i4;
                    }
                } else {
                    for (int iM8982c2 = o84.m8982c(arrayList, i, iM9425n); iM8982c2 < this.f27436d.size() && (i2 = (cr1Var = (cr1) this.f27436d.get(iM8982c2)).f16390a) >= 0; iM8982c2++) {
                        cr1Var.f16390a = -(iM9425n - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f27434b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC0990oo.m9199T(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    AbstractC0990oo.m9199T(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM9425n2 = m9425n();
            if (i6 >= iM9425n2) {
                qi0.m9889a("Check failed");
            }
            while (i6 < iM9425n2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f27434b[i10];
                int iM9426o = i11 > -2 ? i11 : (m9426o() + i11) - (-2);
                if (iM9426o >= i) {
                    iM9426o = -((m9426o() - iM9426o) - (-2));
                }
                if (iM9426o != i11) {
                    this.f27434b[i10] = iM9426o;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f27439g = i;
    }

    /* JADX INFO: renamed from: B */
    public final void m9391B(int i, int i2) {
        int i3 = this.f27444l;
        int i4 = this.f27443k;
        int i5 = this.f27445m;
        if (i4 != i) {
            Object[] objArr = this.f27435c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m9426o());
        if (i5 != iMin) {
            int length = this.f27435c.length - i3;
            if (iMin < i5) {
                int iM9428q = m9428q(iMin);
                int iM9428q2 = m9428q(i5);
                int i7 = this.f27439g;
                while (iM9428q < iM9428q2) {
                    int i8 = (iM9428q * 5) + 4;
                    int i9 = this.f27434b[i8];
                    if (!(i9 >= 0)) {
                        qi0.m9889a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f27434b[i8] = -((length - i9) + 1);
                    iM9428q++;
                    if (iM9428q == i7) {
                        iM9428q += this.f27440h;
                    }
                }
            } else {
                int iM9428q3 = m9428q(i5);
                int iM9428q4 = m9428q(iMin);
                while (iM9428q3 < iM9428q4) {
                    int i10 = (iM9428q3 * 5) + 4;
                    int i11 = this.f27434b[i10];
                    if (!(i11 < 0)) {
                        qi0.m9889a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f27434b[i10] = i11 + length + 1;
                    iM9428q3++;
                    if (iM9428q3 == this.f27439g) {
                        iM9428q3 += this.f27440h;
                    }
                }
            }
            this.f27445m = iMin;
        }
        this.f27443k = i;
    }

    /* JADX INFO: renamed from: C */
    public final List m9392C(cr1 cr1Var, p84 p84Var) {
        if (p84Var.f27446n <= 0) {
            qi0.m9889a("Check failed");
        }
        if (this.f27446n != 0) {
            qi0.m9889a("Check failed");
        }
        if (!cr1Var.m4142a()) {
            qi0.m9889a("Check failed");
        }
        int iM9415c = m9415c(cr1Var) + 1;
        int i = this.f27452t;
        if (i > iM9415c || iM9415c >= this.f27453u) {
            qi0.m9889a("Check failed");
        }
        int iM9395F = m9395F(this.f27434b, iM9415c);
        int iM9431t = m9431t(iM9415c);
        int iM9394E = m9435x(iM9415c) ? 1 : m9394E(iM9415c);
        List listM8512v = n40.m8512v(this, iM9415c, p84Var, false, false, true);
        m9411V(iM9395F);
        boolean z = iM9394E > 0;
        while (iM9395F >= i) {
            int iM9428q = m9428q(iM9395F);
            int[] iArr = this.f27434b;
            int i2 = iM9428q * 5;
            iArr[i2 + 3] = o84.m8981b(iArr, iM9428q) - iM9431t;
            if (z) {
                int[] iArr2 = this.f27434b;
                int i3 = iArr2[i2 + 1];
                if ((1073741824 & i3) != 0) {
                    z = false;
                } else {
                    o84.m8986g(iArr2, iM9428q, (i3 & 67108863) - iM9394E);
                }
            }
            iM9395F = m9395F(this.f27434b, iM9395F);
        }
        if (z) {
            if (this.f27447o < iM9394E) {
                qi0.m9889a("Check failed");
            }
            this.f27447o -= iM9394E;
        }
        return listM8512v;
    }

    /* JADX INFO: renamed from: D */
    public final Object m9393D(int i) {
        int iM9428q = m9428q(i);
        int[] iArr = this.f27434b;
        if ((iArr[(iM9428q * 5) + 1] & 1073741824) != 0) {
            return this.f27435c[m9419g(m9418f(iArr, iM9428q))];
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final int m9394E(int i) {
        return this.f27434b[(m9428q(i) * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: F */
    public final int m9395F(int[] iArr, int i) {
        int i2 = iArr[(m9428q(i) * 5) + 2];
        return i2 > -2 ? i2 : (m9426o() + i2) - (-2);
    }

    /* JADX INFO: renamed from: G */
    public final Object m9396G(Object obj) {
        if (this.f27446n > 0) {
            m9434w(1, this.f27454v);
        }
        Object[] objArr = this.f27435c;
        int i = this.f27441i;
        this.f27441i = i + 1;
        Object obj2 = objArr[m9419g(i)];
        if (this.f27441i > this.f27442j) {
            qi0.m9889a("Writing to an invalid slot");
        }
        this.f27435c[m9419g(this.f27441i - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: H */
    public final void m9397H() {
        int i;
        kv2 kv2Var = this.f27456x;
        if (kv2Var != null) {
            while (kv2Var.f23538b != 0) {
                int iM10800I = sj3.m10800I(kv2Var);
                int iM9428q = m9428q(iM10800I);
                int iM9431t = iM10800I + 1;
                int iM9431t2 = m9431t(iM10800I) + iM10800I;
                while (true) {
                    if (iM9431t >= iM9431t2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f27434b[(m9428q(iM9431t) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM9431t += m9431t(iM9431t);
                    }
                }
                int[] iArr = this.f27434b;
                int i2 = (iM9428q * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM9395F = m9395F(iArr, iM10800I);
                    if (iM9395F >= 0) {
                        sj3.m10813i(kv2Var, iM9395F);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9398I() {
        if (this.f27446n != 0) {
            qi0.m9889a("Cannot remove group while inserting");
        }
        int i = this.f27452t;
        int i2 = this.f27441i;
        int iM9418f = m9418f(this.f27434b, m9428q(i));
        int iM9402M = m9402M();
        m9405P(this.f27454v);
        kv2 kv2Var = this.f27456x;
        if (kv2Var != null) {
            while (true) {
                int i3 = kv2Var.f23538b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    kx5.m7737u0("IntList is empty.");
                    throw null;
                }
                if (kv2Var.f23537a[0] < i) {
                    break;
                }
                sj3.m10800I(kv2Var);
            }
        }
        boolean zM9399J = m9399J(i, this.f27452t - i);
        m9400K(iM9418f, this.f27441i - iM9418f, i - 1);
        this.f27452t = i;
        this.f27441i = i2;
        this.f27447o -= iM9402M;
        return zM9399J;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9399J(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.f27436d;
            m9390A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f27437e;
                int i3 = i + i2;
                int iM8982c = o84.m8982c(this.f27436d, i3, m9425n() - this.f27440h);
                if (iM8982c >= this.f27436d.size()) {
                    iM8982c--;
                }
                int i4 = iM8982c + 1;
                int i5 = 0;
                while (iM8982c >= 0) {
                    cr1 cr1Var = (cr1) this.f27436d.get(iM8982c);
                    int iM9415c = m9415c(cr1Var);
                    if (iM9415c < i) {
                        break;
                    }
                    if (iM9415c < i3) {
                        cr1Var.f16390a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM8982c + 1;
                        }
                        i4 = iM8982c;
                    }
                    iM8982c--;
                }
                z = i4 < i5;
                if (z) {
                    this.f27436d.subList(i4, i5).clear();
                }
            }
            this.f27439g = i;
            this.f27440h += i2;
            int i6 = this.f27445m;
            if (i6 > i) {
                this.f27445m = Math.max(i, i6 - i2);
            }
            int i7 = this.f27453u;
            if (i7 >= this.f27439g) {
                this.f27453u = i7 - i2;
            }
            int i8 = this.f27454v;
            if (i8 >= 0 && (this.f27434b[(m9428q(i8) * 5) + 1] & 67108864) != 0) {
                m9411V(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: K */
    public final void m9400K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f27444l;
            int i5 = i + i2;
            m9391B(i5, i3);
            this.f27443k = i;
            this.f27444l = i4 + i2;
            Arrays.fill(this.f27435c, i, i5, (Object) null);
            int i6 = this.f27442j;
            if (i6 >= i) {
                this.f27442j = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final Object m9401L(int i, int i2, Object obj) {
        int iM9404O = m9404O(this.f27434b, m9428q(i));
        int iM9418f = m9418f(this.f27434b, m9428q(i + 1));
        int i3 = iM9404O + i2;
        if (i3 < iM9404O || i3 >= iM9418f) {
            qi0.m9889a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM9419g = m9419g(i3);
        Object[] objArr = this.f27435c;
        Object obj2 = objArr[iM9419g];
        objArr[iM9419g] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: M */
    public final int m9402M() {
        int iM9428q = m9428q(this.f27452t);
        int iM8981b = o84.m8981b(this.f27434b, iM9428q) + this.f27452t;
        this.f27452t = iM8981b;
        this.f27441i = m9418f(this.f27434b, m9428q(iM8981b));
        int i = this.f27434b[(iM9428q * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    /* JADX INFO: renamed from: N */
    public final void m9403N() {
        int i = this.f27453u;
        this.f27452t = i;
        this.f27441i = m9418f(this.f27434b, m9428q(i));
    }

    /* JADX INFO: renamed from: O */
    public final int m9404O(int[] iArr, int i) {
        if (i >= m9425n()) {
            return this.f27435c.length - this.f27444l;
        }
        int iM8984e = o84.m8984e(iArr, i);
        return iM8984e < 0 ? (this.f27435c.length - this.f27444l) + iM8984e + 1 : iM8984e;
    }

    /* JADX INFO: renamed from: P */
    public final kr1 m9405P(int i) {
        cr1 cr1VarM9408S;
        HashMap map = this.f27437e;
        if (map == null || (cr1VarM9408S = m9408S(i)) == null) {
            return null;
        }
        return (kr1) map.get(cr1VarM9408S);
    }

    /* JADX INFO: renamed from: Q */
    public final void m9406Q() {
        if (this.f27446n != 0) {
            qi0.m9889a("Key must be supplied when inserting");
        }
        i50 i50Var = ki0.f23136a;
        m9407R(0, i50Var, false, i50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final void m9407R(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.f27454v;
        byte b = this.f27446n > 0;
        this.f27450r.m12486c(this.f27447o);
        i50 i50Var = ki0.f23136a;
        if (b == true) {
            int i4 = this.f27452t;
            int iM9418f = m9418f(this.f27434b, m9428q(i4));
            m9433v(1);
            this.f27441i = iM9418f;
            this.f27442j = iM9418f;
            int iM9428q = m9428q(i4);
            int i5 = obj != i50Var ? 1 : 0;
            int i6 = (z || obj2 == i50Var) ? 0 : 1;
            int iM9388h = m9388h(iM9418f, this.f27443k, this.f27444l, this.f27435c.length);
            if (iM9388h >= 0 && this.f27445m < i4) {
                iM9388h = -(((this.f27435c.length - this.f27444l) - iM9388h) + 1);
            }
            int[] iArr = this.f27434b;
            int i7 = this.f27454v;
            int i8 = iM9428q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM9388h;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m9434w(i9, i4);
                Object[] objArr = this.f27435c;
                int i10 = this.f27441i;
                if (z) {
                    objArr[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr[i10] = obj2;
                    i10++;
                }
                this.f27441i = i10;
            }
            this.f27447o = 0;
            i2 = i4 + 1;
            this.f27454v = i4;
            this.f27452t = i2;
            if (i3 >= 0) {
                m9405P(i3);
            }
        } else {
            this.f27448p.m12486c(i3);
            this.f27449q.m12486c((m9425n() - this.f27440h) - this.f27453u);
            int i11 = this.f27452t;
            int iM9428q2 = m9428q(i11);
            if (!z62.m13387o(obj2, i50Var)) {
                if (z) {
                    m9412W(this.f27452t, obj2);
                } else {
                    m9410U(obj2);
                }
            }
            this.f27441i = m9404O(this.f27434b, iM9428q2);
            this.f27442j = m9418f(this.f27434b, m9428q(this.f27452t + 1));
            int[] iArr2 = this.f27434b;
            int i12 = iM9428q2 * 5;
            this.f27447o = iArr2[i12 + 1] & 67108863;
            this.f27454v = i11;
            this.f27452t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f27453u = i2;
    }

    /* JADX INFO: renamed from: S */
    public final cr1 m9408S(int i) {
        ArrayList arrayList;
        int iM8983d;
        if (i < 0 || i >= m9426o() || (iM8983d = o84.m8983d((arrayList = this.f27436d), i, m9426o())) < 0) {
            return null;
        }
        return (cr1) arrayList.get(iM8983d);
    }

    /* JADX INFO: renamed from: T */
    public final void m9409T(Object obj) {
        if (this.f27446n <= 0 || this.f27441i == this.f27443k) {
            m9396G(obj);
            return;
        }
        lv2 lv2Var = this.f27451s;
        if (lv2Var == null) {
            lv2Var = new lv2();
        }
        this.f27451s = lv2Var;
        int i = this.f27454v;
        Object objM8197b = lv2Var.m8197b(i);
        if (objM8197b == null) {
            objM8197b = new cw2();
            lv2Var.m8121h(i, objM8197b);
        }
        ((cw2) objM8197b).m4200a(obj);
    }

    /* JADX INFO: renamed from: U */
    public final void m9410U(Object obj) {
        int iM9428q = m9428q(this.f27452t);
        int i = (iM9428q * 5) + 1;
        if ((this.f27434b[i] & 268435456) == 0) {
            qi0.m9889a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f27435c;
        int[] iArr = this.f27434b;
        objArr[m9419g(Integer.bitCount(iArr[i] >> 29) + m9418f(iArr, iM9428q))] = obj;
    }

    /* JADX INFO: renamed from: V */
    public final void m9411V(int i) {
        if (i >= 0) {
            kv2 kv2Var = this.f27456x;
            if (kv2Var == null) {
                kv2Var = new kv2();
                this.f27456x = kv2Var;
            }
            sj3.m10813i(kv2Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: W */
    public final void m9412W(int i, Object obj) {
        boolean z;
        int iM9428q = m9428q(i);
        int[] iArr = this.f27434b;
        if (iM9428q < iArr.length) {
            z = (iArr[(iM9428q * 5) + 1] & 1073741824) != 0;
        }
        if (!z) {
            qi0.m9889a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f27435c[m9419g(m9418f(this.f27434b, iM9428q))] = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m9413a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            qi0.m9889a("Cannot seek backwards");
        }
        if (!(this.f27446n <= 0)) {
            kd3.m7503b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f27452t + i;
        int i3 = this.f27454v;
        if (i2 >= i3 && i2 <= this.f27453u) {
            z = true;
        }
        if (!z) {
            qi0.m9889a("Cannot seek outside the current group (" + i3 + "-" + this.f27453u + ")");
        }
        this.f27452t = i2;
        int iM9418f = m9418f(this.f27434b, m9428q(i2));
        this.f27441i = iM9418f;
        this.f27442j = iM9418f;
    }

    /* JADX INFO: renamed from: b */
    public final cr1 m9414b(int i) {
        ArrayList arrayList = this.f27436d;
        int iM8983d = o84.m8983d(arrayList, i, m9426o());
        if (iM8983d >= 0) {
            return (cr1) arrayList.get(iM8983d);
        }
        if (i > this.f27439g) {
            i = -(m9426o() - i);
        }
        cr1 cr1Var = new cr1(i);
        arrayList.add(-(iM8983d + 1), cr1Var);
        return cr1Var;
    }

    /* JADX INFO: renamed from: c */
    public final int m9415c(cr1 cr1Var) {
        int i = cr1Var.f16390a;
        return i < 0 ? m9426o() + i : i;
    }

    /* JADX INFO: renamed from: d */
    public final void m9416d() {
        int i = this.f27446n;
        this.f27446n = i + 1;
        if (i == 0) {
            this.f27449q.m12486c((m9425n() - this.f27440h) - this.f27453u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9417e(boolean z) {
        m84 m84Var = this.f27433a;
        this.f27455w = true;
        if (z && this.f27448p.f34014b == 0) {
            m9390A(m9426o());
            m9391B(this.f27435c.length - this.f27444l, this.f27439g);
            int i = this.f27443k;
            Arrays.fill(this.f27435c, i, this.f27444l + i, (Object) null);
            m9397H();
        }
        int[] iArr = this.f27434b;
        int i2 = this.f27439g;
        Object[] objArr = this.f27435c;
        int i3 = this.f27443k;
        ArrayList arrayList = this.f27436d;
        HashMap map = this.f27437e;
        lv2 lv2Var = this.f27438f;
        if (!m84Var.f24739g) {
            kd3.m7502a("Unexpected writer close()");
        }
        m84Var.f24739g = false;
        m84Var.f24733a = iArr;
        m84Var.f24734b = i2;
        m84Var.f24735c = objArr;
        m84Var.f24736d = i3;
        m84Var.f24741i = arrayList;
        m84Var.f24742j = map;
        m84Var.f24743k = lv2Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m9418f(int[] iArr, int i) {
        if (i >= m9425n()) {
            return this.f27435c.length - this.f27444l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f27435c.length - this.f27444l) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: g */
    public final int m9419g(int i) {
        return (this.f27444l * (i < this.f27443k ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: i */
    public final void m9420i() {
        cw2 cw2Var;
        x52 x52Var = this.f27450r;
        boolean z = this.f27446n > 0;
        int i = this.f27452t;
        int i2 = this.f27453u;
        int i3 = this.f27454v;
        int iM9428q = m9428q(i3);
        int i4 = this.f27447o;
        int i5 = i - i3;
        int i6 = iM9428q * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f27434b[i7] & 1073741824) != 0;
        if (z) {
            lv2 lv2Var = this.f27451s;
            if (lv2Var != null && (cw2Var = (cw2) lv2Var.m8197b(i3)) != null) {
                Object[] objArr = cw2Var.f16532a;
                int i8 = cw2Var.f16533b;
                for (int i9 = 0; i9 < i8; i9++) {
                    m9396G(objArr[i9]);
                }
            }
            int[] iArr = this.f27434b;
            iArr[i6 + 3] = i5;
            o84.m8986g(iArr, iM9428q, i4);
            int iM12485b = x52Var.m12485b();
            if (z2) {
                i4 = 1;
            }
            this.f27447o = iM12485b + i4;
            int iM9395F = m9395F(this.f27434b, i3);
            this.f27454v = iM9395F;
            int iM9426o = iM9395F < 0 ? m9426o() : m9428q(iM9395F + 1);
            int iM9418f = iM9426o >= 0 ? m9418f(this.f27434b, iM9426o) : 0;
            this.f27441i = iM9418f;
            this.f27442j = iM9418f;
            return;
        }
        if (i != i2) {
            qi0.m9889a("Expected to be at the end of a group");
        }
        int iM8981b = o84.m8981b(this.f27434b, iM9428q);
        int[] iArr2 = this.f27434b;
        int i10 = iArr2[i7] & 67108863;
        iArr2[i6 + 3] = i5;
        o84.m8986g(iArr2, iM9428q, i4);
        int iM12485b2 = this.f27448p.m12485b();
        this.f27453u = (m9425n() - this.f27440h) - this.f27449q.m12485b();
        this.f27454v = iM12485b2;
        int iM9395F2 = m9395F(this.f27434b, i3);
        int iM12485b3 = x52Var.m12485b();
        this.f27447o = iM12485b3;
        if (iM9395F2 == iM12485b2) {
            this.f27447o = iM12485b3 + (z2 ? 0 : i4 - i10);
            return;
        }
        int i11 = i5 - iM8981b;
        int i12 = z2 ? 0 : i4 - i10;
        if (i11 != 0 || i12 != 0) {
            while (iM9395F2 != 0 && iM9395F2 != iM12485b2 && (i12 != 0 || i11 != 0)) {
                int iM9428q2 = m9428q(iM9395F2);
                if (i11 != 0) {
                    this.f27434b[(iM9428q2 * 5) + 3] = o84.m8981b(this.f27434b, iM9428q2) + i11;
                }
                if (i12 != 0) {
                    int[] iArr3 = this.f27434b;
                    o84.m8986g(iArr3, iM9428q2, (iArr3[(iM9428q2 * 5) + 1] & 67108863) + i12);
                }
                int[] iArr4 = this.f27434b;
                if ((iArr4[(iM9428q2 * 5) + 1] & 1073741824) != 0) {
                    i12 = 0;
                }
                iM9395F2 = m9395F(iArr4, iM9395F2);
            }
        }
        this.f27447o += i12;
    }

    /* JADX INFO: renamed from: j */
    public final void m9421j() {
        if (this.f27446n <= 0) {
            kd3.m7503b("Unbalanced begin/end insert");
        }
        int i = this.f27446n - 1;
        this.f27446n = i;
        if (i == 0) {
            if (this.f27450r.f34014b != this.f27448p.f34014b) {
                qi0.m9889a("startGroup/endGroup mismatch while inserting");
            }
            this.f27453u = (m9425n() - this.f27440h) - this.f27449q.m12485b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m9422k(int i) {
        boolean z = false;
        if (!(this.f27446n <= 0)) {
            qi0.m9889a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f27454v;
        if (i2 != i) {
            if (i >= i2 && i < this.f27453u) {
                z = true;
            }
            if (!z) {
                qi0.m9889a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f27452t;
            int i4 = this.f27441i;
            int i5 = this.f27442j;
            this.f27452t = i;
            m9406Q();
            this.f27452t = i3;
            this.f27441i = i4;
            this.f27442j = i5;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9423l(int i, int i2, int i3) {
        if (i >= this.f27439g) {
            i = -((m9426o() - i) + 2);
        }
        while (i3 < i2) {
            this.f27434b[(m9428q(i3) * 5) + 2] = i;
            int iM8981b = o84.m8981b(this.f27434b, m9428q(i3)) + i3;
            m9423l(i3, iM8981b, i3 + 1);
            i3 = iM8981b;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9424m(int i, mq1 mq1Var) {
        int i2;
        int i3;
        int i4;
        int iM9395F = m9395F(this.f27434b, i);
        int iM9426o = m9426o();
        int iM9431t = m9431t(i) + i;
        int i5 = i;
        mv2 mv2Var = null;
        kv2 kv2Var = null;
        while (i5 < iM9431t) {
            int iM9418f = m9418f(this.f27434b, m9428q(i5));
            int i6 = i5 + 1;
            int iM9418f2 = m9418f(this.f27434b, m9428q(i6));
            while (iM9418f < iM9418f2) {
                Object obj = this.f27435c[m9419g(iM9418f)];
                if (obj instanceof mr1) {
                    mr1 mr1Var = (mr1) obj;
                    if (!(mr1Var instanceof mr1)) {
                        mr1Var = null;
                    }
                    if (mr1Var == null) {
                        qi0.m9890b("Inconsistent composition");
                        xy4.m12794w();
                        return;
                    }
                    int i7 = mr1Var.f25169b;
                    if (i7 >= 0) {
                        int iM9431t2 = m9431t(i5) + i5;
                        int iM8981b = i6;
                        int i8 = 0;
                        while (iM8981b < iM9431t2 && i8 < i7) {
                            int i9 = iM9395F;
                            int iM9428q = m9428q(iM8981b);
                            int i10 = iM9431t;
                            iM8981b += o84.m8981b(this.f27434b, iM9428q);
                            if (iM8981b < iM9431t2 && (this.f27434b[(iM9428q * 5) + 1] & 536870912) == 0) {
                                i8++;
                            }
                            iM9395F = i9;
                            iM9431t = i10;
                        }
                        i3 = iM9395F;
                        i4 = iM9431t;
                        if (mv2Var == null) {
                            int[] iArr = v52.f32420a;
                            mv2Var = new mv2();
                        }
                        if (kv2Var == null) {
                            kv2Var = new kv2();
                        }
                        mv2Var.m8403a(iM8981b);
                        kv2Var.m7633a(iM8981b);
                        kv2Var.m7633a(iM9418f);
                    }
                    iM9418f++;
                    iM9395F = i3;
                    iM9431t = i4;
                }
                i3 = iM9395F;
                i4 = iM9431t;
                mq1Var.invoke(Integer.valueOf(iM9418f), obj);
                iM9418f++;
                iM9395F = i3;
                iM9431t = i4;
            }
            int i11 = iM9395F;
            int i12 = iM9431t;
            iM9395F = i6 < iM9426o ? m9395F(this.f27434b, i6) : -1;
            if (iM9395F != i5) {
                int iM9395F2 = i11;
                while (true) {
                    if (kv2Var != null && mv2Var != null && mv2Var.m8407e(i5)) {
                        int i13 = kv2Var.f23538b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int iM7635c = kv2Var.m7635c(i17);
                            if (iM7635c == i5) {
                                int iM7635c2 = kv2Var.m7635c(i17 + 1);
                                mq1Var.invoke(Integer.valueOf(iM7635c2), this.f27435c[m9419g(iM7635c2)]);
                            } else if (i17 != i16) {
                                int i18 = i16 + 1;
                                kv2Var.m7638f(i16, iM7635c);
                                i16 += 2;
                                kv2Var.m7638f(i18, kv2Var.m7635c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            mq1Var = mq1Var;
                        }
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i2 = kv2Var.f23538b) || i13 < 0 || i13 > i2) {
                                kx5.m7733s0("Index must be between 0 and size");
                                throw null;
                            }
                            if (i13 < i16) {
                                kx5.m7731r0("The end index must be < start index");
                                throw null;
                            }
                            if (i13 != i16) {
                                if (i13 < i2) {
                                    int[] iArr2 = kv2Var.f23537a;
                                    AbstractC0990oo.m9199T(iArr2, iArr2, i16, i13, i2);
                                }
                                kv2Var.f23538b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iM9395F2 == iM9395F) {
                        break;
                    }
                    i5 = iM9395F2;
                    iM9395F2 = m9395F(this.f27434b, iM9395F2);
                    mq1Var = mq1Var;
                }
            }
            i5 = i6;
            iM9431t = i12;
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m9425n() {
        return this.f27434b.length / 5;
    }

    /* JADX INFO: renamed from: o */
    public final int m9426o() {
        return m9425n() - this.f27440h;
    }

    /* JADX INFO: renamed from: p */
    public final Object m9427p(int i) {
        int iM9428q = m9428q(i);
        int[] iArr = this.f27434b;
        int i2 = (iM9428q * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return ki0.f23136a;
        }
        return this.f27435c[Integer.bitCount(iArr[i2] >> 29) + m9418f(iArr, iM9428q)];
    }

    /* JADX INFO: renamed from: q */
    public final int m9428q(int i) {
        return (this.f27440h * (i < this.f27439g ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: r */
    public final int m9429r(int i) {
        return this.f27434b[m9428q(i) * 5];
    }

    /* JADX INFO: renamed from: s */
    public final Object m9430s(int i) {
        int iM9428q = m9428q(i);
        int[] iArr = this.f27434b;
        int i2 = iM9428q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f27435c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: t */
    public final int m9431t(int i) {
        return o84.m8981b(this.f27434b, m9428q(i));
    }

    public final String toString() {
        int i = this.f27452t;
        int i2 = this.f27453u;
        int iM9426o = m9426o();
        int i3 = this.f27439g;
        int i4 = this.f27440h + i3;
        StringBuilder sbM13624x = zi4.m13624x("SlotWriter(current = ", i, " end=", i2, " size = ");
        sbM13624x.append(iM9426o);
        sbM13624x.append(" gap=");
        sbM13624x.append(i3);
        sbM13624x.append("-");
        return c75.m3880l(sbM13624x, i4, ")");
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9432u(int i, int i2) {
        int iM9425n;
        int iM9431t;
        x52 x52Var = this.f27448p;
        if (i2 == this.f27454v) {
            iM9425n = this.f27453u;
        } else {
            if (i2 > x52Var.m12484a(0)) {
                iM9431t = m9431t(i2);
            } else {
                int[] iArr = x52Var.f34013a;
                int iMin = Math.min(iArr.length, x52Var.f34014b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM9431t = m9431t(i2);
                } else {
                    iM9425n = (m9425n() - this.f27440h) - this.f27449q.f34013a[i3];
                }
            }
            iM9425n = iM9431t + i2;
        }
        return i > i2 && i < iM9425n;
    }

    /* JADX INFO: renamed from: v */
    public final void m9433v(int i) {
        if (i > 0) {
            int i2 = this.f27452t;
            m9390A(i2);
            int i3 = this.f27439g;
            int i4 = this.f27440h;
            int[] iArr = this.f27434b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC0990oo.m9199T(iArr, iArr2, 0, 0, i3 * 5);
                AbstractC0990oo.m9199T(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.f27434b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.f27453u;
            if (i7 >= i3) {
                this.f27453u = i7 + i;
            }
            int i8 = i3 + i;
            this.f27439g = i8;
            this.f27440h = i4 - i;
            int iM9388h = m9388h(i5 > 0 ? m9418f(iArr, m9428q(i2 + i)) : 0, this.f27445m >= i3 ? this.f27443k : 0, this.f27444l, this.f27435c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f27434b[(i9 * 5) + 4] = iM9388h;
            }
            int i10 = this.f27445m;
            if (i10 >= i3) {
                this.f27445m = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9434w(int i, int i2) {
        if (i > 0) {
            m9391B(this.f27441i, i2);
            int i3 = this.f27443k;
            int i4 = this.f27444l;
            if (i4 < i) {
                Object[] objArr = this.f27435c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f27435c = objArr2;
                i4 = i7;
            }
            int i9 = this.f27442j;
            if (i9 >= i3) {
                this.f27442j = i9 + i;
            }
            this.f27443k = i3 + i;
            this.f27444l = i4 - i;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9435x(int i) {
        return (this.f27434b[(m9428q(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m9436z(m84 m84Var, int i) {
        if (this.f27446n <= 0) {
            qi0.m9889a("Check failed");
        }
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        if (i == 0 && this.f27452t == 0 && this.f27433a.f24734b == 0) {
            int iM8981b = o84.m8981b(m84Var.f24733a, i);
            int i2 = m84Var.f24734b;
            if (iM8981b == i2) {
                int[] iArr = this.f27434b;
                Object[] objArr = this.f27435c;
                ArrayList arrayList = this.f27436d;
                HashMap map = this.f27437e;
                lv2 lv2Var = this.f27438f;
                int[] iArr2 = m84Var.f24733a;
                Object[] objArr2 = m84Var.f24735c;
                int i3 = m84Var.f24736d;
                HashMap map2 = m84Var.f24742j;
                lv2 lv2Var2 = m84Var.f24743k;
                this.f27434b = iArr2;
                this.f27435c = objArr2;
                this.f27436d = m84Var.f24741i;
                this.f27439g = i2;
                this.f27440h = (iArr2.length / 5) - i2;
                this.f27443k = i3;
                this.f27444l = objArr2.length - i3;
                this.f27445m = i2;
                this.f27437e = map2;
                this.f27438f = lv2Var2;
                m84Var.f24733a = iArr;
                m84Var.f24734b = b2 == true ? 1 : 0;
                m84Var.f24735c = objArr;
                m84Var.f24736d = b == true ? 1 : 0;
                m84Var.f24741i = arrayList;
                m84Var.f24742j = map;
                m84Var.f24743k = lv2Var;
                return;
            }
        }
        p84 p84VarM8231l = m84Var.m8231l();
        try {
            n40.m8512v(p84VarM8231l, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            p84VarM8231l.m9417e(z);
        }
    }
}
