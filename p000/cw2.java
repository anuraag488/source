package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cw2 {

    /* JADX INFO: renamed from: a */
    public Object[] f16532a;

    /* JADX INFO: renamed from: b */
    public int f16533b;

    /* JADX INFO: renamed from: c */
    public aw2 f16534c;

    public cw2(int i) {
        this.f16532a = i == 0 ? q23.f28158a : new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m4200a(Object obj) {
        int i = this.f16533b + 1;
        Object[] objArr = this.f16532a;
        if (objArr.length < i) {
            m4213n(i, objArr);
        }
        Object[] objArr2 = this.f16532a;
        int i2 = this.f16533b;
        objArr2[i2] = obj;
        this.f16533b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m4201b(cw2 cw2Var) {
        if (cw2Var.m4208i()) {
            return;
        }
        int i = this.f16533b + cw2Var.f16533b;
        Object[] objArr = this.f16532a;
        if (objArr.length < i) {
            m4213n(i, objArr);
        }
        AbstractC0990oo.m9198S(this.f16533b, 0, cw2Var.f16533b, cw2Var.f16532a, this.f16532a);
        this.f16533b += cw2Var.f16533b;
    }

    /* JADX INFO: renamed from: c */
    public final void m4202c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f16533b;
        int size = list.size() + i;
        Object[] objArr = this.f16532a;
        if (objArr.length < size) {
            m4213n(size, objArr);
        }
        Object[] objArr2 = this.f16532a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f16533b = list.size() + this.f16533b;
    }

    /* JADX INFO: renamed from: d */
    public final void m4203d() {
        Arrays.fill(this.f16532a, 0, this.f16533b, (Object) null);
        this.f16533b = 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4204e(Object obj) {
        return m4207h(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cw2) {
            cw2 cw2Var = (cw2) obj;
            int i = cw2Var.f16533b;
            int i2 = this.f16533b;
            if (i == i2) {
                Object[] objArr = this.f16532a;
                Object[] objArr2 = cw2Var.f16532a;
                r52 r52VarM10660c0 = sc6.m10660c0(0, i2);
                int i3 = r52VarM10660c0.f27382a;
                int i4 = r52VarM10660c0.f27383b;
                if (i3 > i4) {
                    return true;
                }
                while (z62.m13387o(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m4205f() {
        if (!m4208i()) {
            return this.f16532a[0];
        }
        kx5.m7737u0("ObjectList is empty.");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4206g(int i) {
        if (i >= 0 && i < this.f16533b) {
            return this.f16532a[i];
        }
        m4215p(i);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final int m4207h(Object obj) {
        Object[] objArr = this.f16532a;
        int i = 0;
        if (obj == null) {
            int i2 = this.f16533b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f16533b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        Object[] objArr = this.f16532a;
        int i = this.f16533b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4208i() {
        return this.f16533b == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4209j() {
        return this.f16533b != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4210k(Object obj) {
        int iM4207h = m4207h(obj);
        if (iM4207h < 0) {
            return false;
        }
        m4211l(iM4207h);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m4211l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f16533b)) {
            m4215p(i);
            throw null;
        }
        Object[] objArr = this.f16532a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC0990oo.m9198S(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.f16533b - 1;
        this.f16533b = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m4212m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f16533b) || i2 < 0 || i2 > i3) {
            StringBuilder sbM13624x = zi4.m13624x("Start (", i, ") and end (", i2, ") must be in 0..");
            sbM13624x.append(this.f16533b);
            kx5.m7733s0(sbM13624x.toString());
            throw null;
        }
        if (i2 < i) {
            kx5.m7731r0("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f16532a;
                AbstractC0990oo.m9198S(i, i2, i3, objArr, objArr);
            }
            int i4 = this.f16533b;
            int i5 = i4 - (i2 - i);
            Arrays.fill(this.f16532a, i5, i4, (Object) null);
            this.f16533b = i5;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4213n(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f16532a = objArr2;
    }

    /* JADX INFO: renamed from: o */
    public final Object m4214o(int i, Object obj) {
        if (i < 0 || i >= this.f16533b) {
            m4215p(i);
            throw null;
        }
        Object[] objArr = this.f16532a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: p */
    public final void m4215p(int i) {
        StringBuilder sbM3883o = c75.m3883o("Index ", i, " must be in 0..");
        sbM3883o.append(this.f16533b - 1);
        kx5.m7733s0(sbM3883o.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f16532a;
        int i = this.f16533b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ cw2() {
        this(16);
    }
}
