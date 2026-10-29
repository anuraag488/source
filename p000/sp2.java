package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sp2 implements Map, Serializable, fc2 {

    /* JADX INFO: renamed from: n */
    public static final sp2 f30459n;

    /* JADX INFO: renamed from: a */
    public Object[] f30460a;

    /* JADX INFO: renamed from: b */
    public Object[] f30461b;

    /* JADX INFO: renamed from: c */
    public int[] f30462c;

    /* JADX INFO: renamed from: d */
    public int[] f30463d;

    /* JADX INFO: renamed from: e */
    public int f30464e;

    /* JADX INFO: renamed from: f */
    public int f30465f;

    /* JADX INFO: renamed from: g */
    public int f30466g;

    /* JADX INFO: renamed from: h */
    public int f30467h;

    /* JADX INFO: renamed from: i */
    public int f30468i;

    /* JADX INFO: renamed from: j */
    public tp2 f30469j;

    /* JADX INFO: renamed from: k */
    public up2 f30470k;

    /* JADX INFO: renamed from: l */
    public tp2 f30471l;

    /* JADX INFO: renamed from: m */
    public boolean f30472m;

    static {
        sp2 sp2Var = new sp2(0);
        sp2Var.f30472m = true;
        f30459n = sp2Var;
    }

    public sp2(int i) {
        if (i < 0) {
            C1077qn.m9987m("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f30460a = objArr;
        this.f30461b = null;
        this.f30462c = iArr;
        this.f30463d = new int[iHighestOneBit];
        this.f30464e = 2;
        this.f30465f = 0;
        this.f30466g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m10892a(Object obj) {
        m10894c();
        while (true) {
            int iM10898h = m10898h(obj);
            int i = this.f30464e * 2;
            int length = this.f30463d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f30463d;
                int i3 = iArr[iM10898h];
                if (i3 == 0) {
                    int i4 = this.f30465f;
                    Object[] objArr = this.f30460a;
                    if (i4 >= objArr.length) {
                        m10896e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f30465f = i5;
                    objArr[i4] = obj;
                    this.f30462c[i4] = iM10898h;
                    iArr[iM10898h] = i5;
                    this.f30468i++;
                    this.f30467h++;
                    if (i2 > this.f30464e) {
                        this.f30464e = i2;
                    }
                    return i4;
                }
                if (z62.m13387o(this.f30460a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m10899i(this.f30463d.length * 2);
                    break;
                }
                iM10898h = iM10898h == 0 ? this.f30463d.length - 1 : iM10898h - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final sp2 m10893b() {
        m10894c();
        this.f30472m = true;
        return this.f30468i > 0 ? this : f30459n;
    }

    /* JADX INFO: renamed from: c */
    public final void m10894c() {
        if (this.f30472m) {
            xy4.m12791t();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m10894c();
        int i = this.f30465f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f30462c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f30463d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        oh6.m9077B(this.f30460a, 0, this.f30465f);
        Object[] objArr = this.f30461b;
        if (objArr != null) {
            oh6.m9077B(objArr, 0, this.f30465f);
        }
        this.f30468i = 0;
        this.f30465f = 0;
        this.f30467h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m10897f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f30465f;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f30462c[i2] >= 0 && z62.m13387o(this.f30461b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m10895d(boolean z) {
        int i;
        Object[] objArr = this.f30461b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f30465f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f30462c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f30460a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f30463d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        oh6.m9077B(this.f30460a, i3, i);
        if (objArr != null) {
            oh6.m9077B(objArr, i3, this.f30465f);
        }
        this.f30465f = i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m10896e(int i) {
        Object[] objArr = this.f30460a;
        int length = objArr.length;
        int i2 = this.f30465f;
        int i3 = length - i2;
        int i4 = i2 - this.f30468i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m10895d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f30460a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f30461b;
            this.f30461b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f30462c = Arrays.copyOf(this.f30462c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f30463d.length) {
                m10899i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        tp2 tp2Var = this.f30471l;
        if (tp2Var != null) {
            return tp2Var;
        }
        tp2 tp2Var2 = new tp2(this, (byte) 0);
        this.f30471l = tp2Var2;
        return tp2Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f30468i == map.size()) {
                for (Object obj2 : map.entrySet()) {
                    if (obj2 != null) {
                        try {
                            Map.Entry entry = (Map.Entry) obj2;
                            int iM10897f = m10897f(entry.getKey());
                            if (!(iM10897f < 0 ? false : z62.m13387o(this.f30461b[iM10897f], entry.getValue()))) {
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m10897f(Object obj) {
        int iM10898h = m10898h(obj);
        int i = this.f30464e;
        while (true) {
            int i2 = this.f30463d[iM10898h];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (z62.m13387o(this.f30460a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM10898h = iM10898h == 0 ? this.f30463d.length - 1 : iM10898h - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM10897f = m10897f(obj);
        if (iM10897f < 0) {
            return null;
        }
        return this.f30461b[iM10897f];
    }

    /* JADX INFO: renamed from: h */
    public final int m10898h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f30466g;
    }

    @Override // java.util.Map
    public final int hashCode() {
        qp2 qp2Var = new qp2(this, (byte) 0);
        int i = 0;
        while (qp2Var.hasNext()) {
            int i2 = qp2Var.f28656b;
            sp2 sp2Var = qp2Var.f28655a;
            if (i2 >= sp2Var.f30465f) {
                xy4.m12795x();
                return 0;
            }
            qp2Var.f28656b = i2 + 1;
            qp2Var.f28657c = i2;
            Object obj = sp2Var.f30460a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = sp2Var.f30461b[qp2Var.f28657c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            qp2Var.m10002b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m10899i(int i) {
        int[] iArr;
        this.f30467h++;
        int i2 = 0;
        if (this.f30465f > this.f30468i) {
            m10895d(false);
        }
        this.f30463d = new int[i];
        this.f30466g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f30465f) {
            int i3 = i2 + 1;
            int iM10898h = m10898h(this.f30460a[i2]);
            int i4 = this.f30464e;
            while (true) {
                iArr = this.f30463d;
                if (iArr[iM10898h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C1077qn.m9989o("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM10898h = iM10898h == 0 ? iArr.length - 1 : iM10898h - 1;
            }
            iArr[iM10898h] = i3;
            this.f30462c[i2] = iM10898h;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f30468i == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m10900j(int i) {
        int i2;
        int i3;
        int iM10898h;
        int[] iArr;
        this.f30460a[i] = null;
        Object[] objArr = this.f30461b;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f30462c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f30463d.length - 1 : length - 1;
                int[] iArr2 = this.f30463d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f30464e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM10898h = m10898h(this.f30460a[i3]) - length;
                    iArr = this.f30463d;
                }
            } while ((iM10898h & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f30462c[i3] = i4;
        }
        this.f30462c[i] = -1;
        this.f30468i--;
        this.f30467h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        tp2 tp2Var = this.f30469j;
        if (tp2Var != null) {
            return tp2Var;
        }
        tp2 tp2Var2 = new tp2(this, (byte) 1);
        this.f30469j = tp2Var2;
        return tp2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m10894c();
        int iM10892a = m10892a(obj);
        Object[] objArr = this.f30461b;
        if (objArr == null) {
            int length = this.f30460a.length;
            if (length < 0) {
                C1077qn.m9987m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f30461b = objArr;
        }
        if (iM10892a >= 0) {
            objArr[iM10892a] = obj2;
            return null;
        }
        int i = (-iM10892a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m10894c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m10896e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM10892a = m10892a(entry.getKey());
            Object[] objArr = this.f30461b;
            if (objArr == null) {
                int length = this.f30460a.length;
                if (length < 0) {
                    C1077qn.m9987m("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f30461b = objArr;
                }
            }
            if (iM10892a >= 0) {
                objArr[iM10892a] = entry.getValue();
            } else {
                int i = (-iM10892a) - 1;
                if (!z62.m13387o(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m10894c();
        int iM10897f = m10897f(obj);
        if (iM10897f < 0) {
            return null;
        }
        Object obj2 = this.f30461b[iM10897f];
        m10900j(iM10897f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f30468i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f30468i * 3) + 2);
        sb.append("{");
        int i = 0;
        qp2 qp2Var = new qp2(this, (byte) 0);
        while (qp2Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = qp2Var.f28656b;
            sp2 sp2Var = qp2Var.f28655a;
            if (i2 >= sp2Var.f30465f) {
                xy4.m12795x();
                return null;
            }
            qp2Var.f28656b = i2 + 1;
            qp2Var.f28657c = i2;
            Object obj = sp2Var.f30460a[i2];
            if (obj == sp2Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = sp2Var.f30461b[qp2Var.f28657c];
            if (obj2 == sp2Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            qp2Var.m10002b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        up2 up2Var = this.f30470k;
        if (up2Var != null) {
            return up2Var;
        }
        up2 up2Var2 = new up2(this, (byte) 0);
        this.f30470k = up2Var2;
        return up2Var2;
    }

    public sp2() {
        this(8);
    }
}
