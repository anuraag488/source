package p000;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lk6 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public Object[] f24111a;

    /* JADX INFO: renamed from: b */
    public int f24112b;

    /* JADX INFO: renamed from: c */
    public Map f24113c;

    /* JADX INFO: renamed from: d */
    public boolean f24114d;

    /* JADX INFO: renamed from: e */
    public volatile C0619eo f24115e;

    /* JADX INFO: renamed from: f */
    public Map f24116f;

    public lk6() {
        Map map = Collections.EMPTY_MAP;
        this.f24113c = map;
        this.f24116f = map;
    }

    /* JADX INFO: renamed from: a */
    public final sk6 m8002a(int i) {
        if (i < this.f24112b) {
            return (sk6) this.f24111a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: b */
    public final Set m8003b() {
        return this.f24113c.isEmpty() ? Collections.EMPTY_SET : this.f24113c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m8007f();
        int iM8006e = m8006e(comparable);
        if (iM8006e >= 0) {
            return ((sk6) this.f24111a[iM8006e]).setValue(obj);
        }
        m8007f();
        Object[] objArr = this.f24111a;
        if (objArr == null) {
            objArr = new Object[16];
            this.f24111a = objArr;
        }
        int i = -(iM8006e + 1);
        if (i >= 16) {
            return m8008h().put(comparable, obj);
        }
        if (this.f24112b == 16) {
            sk6 sk6Var = (sk6) objArr[15];
            this.f24112b = 15;
            m8008h().put(sk6Var.f30357a, sk6Var.f30358b);
        }
        Object[] objArr2 = this.f24111a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.f24111a[i] = new sk6(this, comparable, obj);
        this.f24112b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8007f();
        if (this.f24112b != 0) {
            this.f24111a = null;
            this.f24112b = 0;
        }
        if (this.f24113c.isEmpty()) {
            return;
        }
        this.f24113c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8006e(comparable) >= 0 || this.f24113c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Object m8005d(int i) {
        m8007f();
        Object[] objArr = this.f24111a;
        Object obj = ((sk6) objArr[i]).f30358b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f24112b - i) - 1);
        this.f24112b--;
        if (!this.f24113c.isEmpty()) {
            Iterator it = m8008h().entrySet().iterator();
            Object[] objArr2 = this.f24111a;
            int i2 = this.f24112b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new sk6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f24112b++;
            it.remove();
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final int m8006e(Comparable comparable) {
        int i = this.f24112b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((sk6) this.f24111a[i2]).f30357a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((sk6) this.f24111a[i4]).f30357a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f24115e == null) {
            this.f24115e = new C0619eo(this, (byte) 3);
        }
        return this.f24115e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk6)) {
            return super.equals(obj);
        }
        lk6 lk6Var = (lk6) obj;
        int size = size();
        if (size == lk6Var.size()) {
            int i = this.f24112b;
            if (i != lk6Var.f24112b) {
                return entrySet().equals(lk6Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m8002a(i2).equals(lk6Var.m8002a(i2))) {
                }
            }
            if (i != size) {
                return this.f24113c.equals(lk6Var.f24113c);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m8007f() {
        if (this.f24114d) {
            xy4.m12791t();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM8006e = m8006e(comparable);
        return iM8006e >= 0 ? ((sk6) this.f24111a[iM8006e]).f30358b : this.f24113c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final SortedMap m8008h() {
        m8007f();
        if (this.f24113c.isEmpty() && !(this.f24113c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24113c = treeMap;
            this.f24116f = treeMap.descendingMap();
        }
        return (SortedMap) this.f24113c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f24112b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f24111a[i2].hashCode();
        }
        return this.f24113c.size() > 0 ? this.f24113c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8007f();
        Comparable comparable = (Comparable) obj;
        int iM8006e = m8006e(comparable);
        if (iM8006e >= 0) {
            return m8005d(iM8006e);
        }
        if (this.f24113c.isEmpty()) {
            return null;
        }
        return this.f24113c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24113c.size() + this.f24112b;
    }
}
