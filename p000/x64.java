package p000;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class x64 {

    /* JADX INFO: renamed from: a */
    public int[] f34028a;

    /* JADX INFO: renamed from: b */
    public Object[] f34029b;

    /* JADX INFO: renamed from: c */
    public int f34030c;

    public x64(int i) {
        this.f34028a = i == 0 ? qq2.f28685d : new int[i];
        this.f34029b = i == 0 ? qq2.f28687f : new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m12496a(Object obj) {
        int i = this.f34030c * 2;
        Object[] objArr = this.f34029b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m12497b(int i, Object obj) {
        int i2 = this.f34030c;
        if (i2 == 0) {
            return -1;
        }
        int iM10024h = qq2.m10024h(this.f34028a, i2, i);
        if (iM10024h < 0 || z62.m13387o(obj, this.f34029b[iM10024h << 1])) {
            return iM10024h;
        }
        int i3 = iM10024h + 1;
        while (i3 < i2 && this.f34028a[i3] == i) {
            if (z62.m13387o(obj, this.f34029b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM10024h - 1; i4 >= 0 && this.f34028a[i4] == i; i4--) {
            if (z62.m13387o(obj, this.f34029b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: c */
    public final int m12498c(Object obj) {
        return obj == null ? m12499d() : m12497b(obj.hashCode(), obj);
    }

    public final void clear() {
        int i = this.f34030c;
        if (i > 0) {
            this.f34028a = qq2.f28685d;
            this.f34029b = qq2.f28687f;
            i = 0;
            this.f34030c = 0;
        }
        if (i <= 0) {
            return;
        }
        C1077qn.m9983c();
    }

    public boolean containsKey(Object obj) {
        return m12498c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m12496a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m12499d() {
        int i = this.f34030c;
        if (i == 0) {
            return -1;
        }
        int iM10024h = qq2.m10024h(this.f34028a, i, 0);
        if (iM10024h < 0 || this.f34029b[iM10024h << 1] == null) {
            return iM10024h;
        }
        int i2 = iM10024h + 1;
        while (i2 < i && this.f34028a[i2] == 0) {
            if (this.f34029b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM10024h - 1; i3 >= 0 && this.f34028a[i3] == 0; i3--) {
            if (this.f34029b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: e */
    public final Object m12500e(int i) {
        if (i >= 0 && i < this.f34030c) {
            return this.f34029b[i << 1];
        }
        kx5.m7731r0("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof x64) {
                int i = this.f34030c;
                if (i != ((x64) obj).f34030c) {
                    return false;
                }
                x64 x64Var = (x64) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM12500e = m12500e(i2);
                    Object objM12503i = m12503i(i2);
                    Object obj2 = x64Var.get(objM12500e);
                    if (objM12503i == null) {
                        if (obj2 != null || !x64Var.containsKey(objM12500e)) {
                            return false;
                        }
                    } else if (!objM12503i.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f34030c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f34030c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM12500e2 = m12500e(i4);
                Object objM12503i2 = m12503i(i4);
                Object obj3 = ((Map) obj).get(objM12500e2);
                if (objM12503i2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM12500e2)) {
                        return false;
                    }
                } else if (!objM12503i2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m12501f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f34030c)) {
            kx5.m7731r0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f34029b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f34028a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0990oo.m9199T(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.f34029b;
                AbstractC0990oo.m9198S(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f34029b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f34028a = Arrays.copyOf(iArr, i7);
            this.f34029b = Arrays.copyOf(this.f34029b, i7 << 1);
            if (i2 != this.f34030c) {
                C1077qn.m9983c();
                return null;
            }
            if (i > 0) {
                AbstractC0990oo.m9199T(iArr, this.f34028a, 0, 0, i);
                AbstractC0990oo.m9198S(0, 0, i3, objArr, this.f34029b);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0990oo.m9199T(iArr, this.f34028a, i, i8, i2);
                AbstractC0990oo.m9198S(i3, i8 << 1, i2 << 1, objArr, this.f34029b);
            }
        }
        if (i2 == this.f34030c) {
            this.f34030c = i4;
            return obj;
        }
        C1077qn.m9983c();
        return null;
    }

    public Object get(Object obj) {
        int iM12498c = m12498c(obj);
        if (iM12498c >= 0) {
            return this.f34029b[(iM12498c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM12498c = m12498c(obj);
        return iM12498c >= 0 ? this.f34029b[(iM12498c << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m12502h(int i, Object obj) {
        if (i < 0 || i >= this.f34030c) {
            kx5.m7731r0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f34029b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f34028a;
        Object[] objArr = this.f34029b;
        int i = this.f34030c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m12503i(int i) {
        if (i >= 0 && i < this.f34030c) {
            return this.f34029b[(i << 1) + 1];
        }
        kx5.m7731r0("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f34030c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f34030c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM12497b = obj != null ? m12497b(iHashCode, obj) : m12499d();
        if (iM12497b >= 0) {
            int i2 = (iM12497b << 1) + 1;
            Object[] objArr = this.f34029b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM12497b;
        int[] iArr = this.f34028a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f34028a = Arrays.copyOf(iArr, i4);
            this.f34029b = Arrays.copyOf(this.f34029b, i4 << 1);
            if (i != this.f34030c) {
                C1077qn.m9983c();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f34028a;
            int i5 = i3 + 1;
            AbstractC0990oo.m9199T(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f34029b;
            AbstractC0990oo.m9198S(i5 << 1, i3 << 1, this.f34030c << 1, objArr2, objArr2);
        }
        int i6 = this.f34030c;
        if (i == i6) {
            int[] iArr3 = this.f34028a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f34029b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f34030c = i6 + 1;
                return null;
            }
        }
        C1077qn.m9983c();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM12498c = m12498c(obj);
        if (iM12498c < 0 || !z62.m13387o(obj2, m12503i(iM12498c))) {
            return false;
        }
        m12501f(iM12498c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM12498c = m12498c(obj);
        if (iM12498c < 0 || !z62.m13387o(obj2, m12503i(iM12498c))) {
            return false;
        }
        m12502h(iM12498c, obj3);
        return true;
    }

    public final int size() {
        return this.f34030c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f34030c * 28);
        sb.append('{');
        int i = this.f34030c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM12500e = m12500e(i2);
            if (objM12500e != sb) {
                sb.append(objM12500e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM12503i = m12503i(i2);
            if (objM12503i != sb) {
                sb.append(objM12503i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iM12498c = m12498c(obj);
        if (iM12498c >= 0) {
            return m12501f(iM12498c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM12498c = m12498c(obj);
        if (iM12498c >= 0) {
            return m12502h(iM12498c, obj2);
        }
        return null;
    }

    public x64() {
        this(0);
    }
}
