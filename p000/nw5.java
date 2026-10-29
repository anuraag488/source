package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nw5 extends AbstractMap {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f26154e = 0;

    /* JADX INFO: renamed from: d */
    public volatile C0619eo f26158d;

    /* JADX INFO: renamed from: c */
    public boolean f26157c = false;

    /* JADX INFO: renamed from: a */
    public Object[] f26155a = null;

    /* JADX INFO: renamed from: b */
    public int f26156b = 0;

    /* JADX INFO: renamed from: a */
    public final r84 m8877a() {
        if (this.f26156b <= 0) {
            throw new ArrayIndexOutOfBoundsException(0);
        }
        c75.m3884p(this.f26155a[0]);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m8878b() {
        int i = this.f26156b - 1;
        if (i < 0) {
            return;
        }
        c75.m3884p(this.f26155a[i >>> 1]);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m8879c() {
        if (this.f26157c) {
            xy4.m12791t();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8879c();
        if (this.f26156b != 0) {
            this.f26155a = null;
            this.f26156b = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            m8878b();
            return false;
        }
        xy4.m12778e();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m8880d(int i) {
        int length;
        Object[] objArr = this.f26155a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.f26155a = new Object[Math.max(16, i)];
            return;
        }
        if (i > length) {
            int length2 = objArr.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.f26155a = Arrays.copyOf(objArr, i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f26158d == null) {
            this.f26158d = new C0619eo(this, (byte) 2);
        }
        return this.f26158d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw5)) {
            return super.equals(obj);
        }
        nw5 nw5Var = (nw5) obj;
        int i = this.f26156b;
        if (i == nw5Var.f26156b) {
            Object[] objArr = this.f26155a;
            Object[] objArr2 = nw5Var.f26155a;
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
            m8878b();
            return null;
        }
        xy4.m12778e();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f26156b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f26155a[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f26156b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        m8879c();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m8879c();
        boolean z = map instanceof nw5;
        int i = this.f26156b;
        if (z) {
            nw5 nw5Var = (nw5) map;
            m8880d(i + nw5Var.f26156b);
            int i2 = this.f26156b;
            if (i2 < nw5Var.f26156b + i2) {
                throw zi4.m13616p(nw5Var.f26155a[0]);
            }
            return;
        }
        m8880d(map.size() + i);
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                xy4.m12778e();
            } else {
                entry.getValue();
                m8879c();
                throw null;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8879c();
        if (obj == null) {
            m8878b();
            return null;
        }
        xy4.m12778e();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26156b;
    }
}
