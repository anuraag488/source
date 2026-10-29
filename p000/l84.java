package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l84 {

    /* JADX INFO: renamed from: a */
    public m84 f23847a;

    /* JADX INFO: renamed from: b */
    public int[] f23848b;

    /* JADX INFO: renamed from: c */
    public int f23849c;

    /* JADX INFO: renamed from: d */
    public Object[] f23850d;

    /* JADX INFO: renamed from: e */
    public int f23851e;

    /* JADX INFO: renamed from: f */
    public boolean f23852f;

    /* JADX INFO: renamed from: g */
    public int f23853g;

    /* JADX INFO: renamed from: h */
    public int f23854h;

    /* JADX INFO: renamed from: i */
    public int f23855i;

    /* JADX INFO: renamed from: j */
    public x52 f23856j;

    /* JADX INFO: renamed from: k */
    public int f23857k;

    /* JADX INFO: renamed from: l */
    public int f23858l;

    /* JADX INFO: renamed from: m */
    public int f23859m;

    /* JADX INFO: renamed from: n */
    public boolean f23860n;

    /* JADX INFO: renamed from: a */
    public final cr1 m7845a(int i) {
        ArrayList arrayList = this.f23847a.f24741i;
        int iM8983d = o84.m8983d(arrayList, i, this.f23849c);
        if (iM8983d >= 0) {
            return (cr1) arrayList.get(iM8983d);
        }
        cr1 cr1Var = new cr1(i);
        arrayList.add(-(iM8983d + 1), cr1Var);
        return cr1Var;
    }

    /* JADX INFO: renamed from: b */
    public final Object m7846b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f23850d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return ki0.f23136a;
    }

    /* JADX INFO: renamed from: c */
    public final void m7847c() {
        this.f23852f = true;
        m84 m84Var = this.f23847a;
        if (m84Var.f24737e <= 0) {
            qi0.m9889a("Unexpected reader close()");
        }
        m84Var.f24737e--;
        this.f23850d = new Object[0];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7848d(int i) {
        return (this.f23848b[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m7849e() {
        int i = this.f23849c;
        int[] iArr = this.f23848b;
        if (this.f23857k == 0) {
            if (!(this.f23853g == this.f23854h)) {
                qi0.m9889a("endGroup() not called at the end of a group");
            }
            int i2 = iArr[(this.f23855i * 5) + 2];
            this.f23855i = i2;
            this.f23854h = i2 < 0 ? i : o84.m8981b(iArr, i2) + i2;
            int iM12485b = this.f23856j.m12485b();
            if (iM12485b < 0) {
                this.f23858l = 0;
                this.f23859m = 0;
            } else {
                this.f23858l = iM12485b;
                this.f23859m = i2 >= i - 1 ? this.f23851e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m7850f() {
        int i = this.f23853g;
        if (i < this.f23854h) {
            return m7846b(this.f23848b, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m7851g() {
        int i = this.f23853g;
        if (i < this.f23854h) {
            return this.f23848b[i * 5];
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final Object m7852h(int i, int i2) {
        int[] iArr = this.f23848b;
        int iM8984e = o84.m8984e(iArr, i);
        int i3 = i + 1;
        int i4 = iM8984e + i2;
        return i4 < (i3 < this.f23849c ? iArr[(i3 * 5) + 4] : this.f23851e) ? this.f23850d[i4] : ki0.f23136a;
    }

    /* JADX INFO: renamed from: i */
    public final int m7853i(int i) {
        return this.f23848b[i * 5];
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7854j(int i) {
        return (this.f23848b[(i * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7855k(int i) {
        return (this.f23848b[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7856l(int i) {
        return (this.f23848b[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final Object m7857m() {
        int i;
        if (this.f23857k > 0 || (i = this.f23858l) >= this.f23859m) {
            this.f23860n = false;
            return ki0.f23136a;
        }
        this.f23860n = true;
        Object[] objArr = this.f23850d;
        this.f23858l = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: n */
    public final Object m7858n(int i) {
        int[] iArr = this.f23848b;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f23850d[iArr[i2 + 4]] : ki0.f23136a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m7859o(int i) {
        return this.f23848b[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: p */
    public final Object m7860p(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f23850d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: q */
    public final int m7861q(int i) {
        return this.f23848b[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: r */
    public final void m7862r(int i) {
        int[] iArr = this.f23848b;
        if (!(this.f23857k == 0)) {
            qi0.m9889a("Cannot reposition while in an empty region");
        }
        this.f23853g = i;
        int i2 = this.f23849c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f23855i) {
            this.f23855i = i3;
            if (i3 < 0) {
                this.f23854h = i2;
            } else {
                this.f23854h = o84.m8981b(iArr, i3) + i3;
            }
            this.f23858l = 0;
            this.f23859m = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m7863s() {
        if (!(this.f23857k == 0)) {
            qi0.m9889a("Cannot skip while in an empty region");
        }
        int[] iArr = this.f23848b;
        int i = this.f23853g;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.f23853g = o84.m8981b(iArr, i) + i;
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public final void m7864t() {
        if (!(this.f23857k == 0)) {
            qi0.m9889a("Cannot skip the enclosing group while in an empty region");
        }
        this.f23853g = this.f23854h;
        this.f23858l = 0;
        this.f23859m = 0;
    }

    public final String toString() {
        int i = this.f23853g;
        int iM7851g = m7851g();
        int i2 = this.f23855i;
        int i3 = this.f23854h;
        StringBuilder sbM13624x = zi4.m13624x("SlotReader(current=", i, ", key=", iM7851g, ", parent=");
        sbM13624x.append(i2);
        sbM13624x.append(", end=");
        sbM13624x.append(i3);
        sbM13624x.append(")");
        return sbM13624x.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m7865u() {
        int[] iArr = this.f23848b;
        if (this.f23857k <= 0) {
            int i = this.f23855i;
            int i2 = this.f23853g;
            if (iArr[(i2 * 5) + 2] != i) {
                kd3.m7502a("Invalid slot table detected");
            }
            x52 x52Var = this.f23856j;
            int i3 = this.f23858l;
            int i4 = this.f23859m;
            if (i3 == 0 && i4 == 0) {
                x52Var.m12486c(-1);
            } else {
                x52Var.m12486c(i3);
            }
            this.f23855i = i2;
            this.f23854h = o84.m8981b(iArr, i2) + i2;
            int i5 = i2 + 1;
            this.f23853g = i5;
            this.f23858l = o84.m8984e(iArr, i2);
            this.f23859m = i2 >= this.f23849c + (-1) ? this.f23851e : iArr[(i5 * 5) + 4];
        }
    }
}
