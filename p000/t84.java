package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t84 extends AbstractMap {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f30997e = 0;

    /* JADX INFO: renamed from: d */
    public volatile C0619eo f31001d;

    /* JADX INFO: renamed from: c */
    public boolean f31000c = false;

    /* JADX INFO: renamed from: a */
    public Object[] f30998a = null;

    /* JADX INFO: renamed from: b */
    public int f30999b = 0;

    /* JADX INFO: renamed from: a */
    public final void m10988a() {
        int i = this.f30999b - 1;
        if (i < 0) {
            return;
        }
        c75.m3884p(this.f30998a[i >>> 1]);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m10989b() {
        if (this.f31000c) {
            xy4.m12791t();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10990c(int i) {
        Object[] objArr = this.f30998a;
        if (objArr == null || objArr.length == 0) {
            this.f30998a = new Object[Math.max(16, i)];
            return;
        }
        if (i > objArr.length) {
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - 2147483639 > 0) {
                i = 2147483639;
            }
            this.f30998a = Arrays.copyOf(objArr, i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m10989b();
        if (this.f30999b != 0) {
            this.f30998a = null;
            this.f30999b = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            m10988a();
            return false;
        }
        xy4.m12778e();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final r84 m10991d() {
        if (this.f30999b <= 0) {
            throw new ArrayIndexOutOfBoundsException(0);
        }
        c75.m3884p(this.f30998a[0]);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f31001d == null) {
            this.f31001d = new C0619eo(this, (byte) 1);
        }
        return this.f31001d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t84)) {
            return super.equals(obj);
        }
        t84 t84Var = (t84) obj;
        int i = this.f30999b;
        if (i == t84Var.f30999b) {
            Object[] objArr = this.f30998a;
            Object[] objArr2 = t84Var.f30998a;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2].equals(objArr2[i2])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            m10988a();
            return null;
        }
        xy4.m12778e();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f30999b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f30998a[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f30999b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        m10989b();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m10989b();
        boolean z = map instanceof t84;
        int i = this.f30999b;
        if (z) {
            t84 t84Var = (t84) map;
            m10990c(i + t84Var.f30999b);
            int i2 = this.f30999b;
            if (i2 < t84Var.f30999b + i2) {
                throw zi4.m13616p(t84Var.f30998a[0]);
            }
            return;
        }
        m10990c(map.size() + i);
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                xy4.m12778e();
            } else {
                entry.getValue();
                m10989b();
                throw null;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m10989b();
        if (obj == null) {
            m10988a();
            return null;
        }
        xy4.m12778e();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30999b;
    }
}
