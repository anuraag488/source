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
public final class mq6 extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f25154g = 0;

    /* JADX INFO: renamed from: a */
    public Object[] f25155a;

    /* JADX INFO: renamed from: b */
    public int f25156b;

    /* JADX INFO: renamed from: c */
    public Map f25157c;

    /* JADX INFO: renamed from: d */
    public boolean f25158d;

    /* JADX INFO: renamed from: e */
    public volatile C0619eo f25159e;

    /* JADX INFO: renamed from: f */
    public Map f25160f;

    public mq6() {
        Map map = Collections.EMPTY_MAP;
        this.f25157c = map;
        this.f25160f = map;
    }

    /* JADX INFO: renamed from: a */
    public final Set m8378a() {
        return this.f25157c.isEmpty() ? Collections.EMPTY_SET : this.f25157c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m8384h();
        int iM8381d = m8381d(comparable);
        if (iM8381d >= 0) {
            return ((nq6) this.f25155a[iM8381d]).setValue(obj);
        }
        m8384h();
        Object[] objArr = this.f25155a;
        if (objArr == null) {
            objArr = new Object[16];
            this.f25155a = objArr;
        }
        int i = -(iM8381d + 1);
        if (i >= 16) {
            return m8383f().put(comparable, obj);
        }
        if (this.f25156b == 16) {
            nq6 nq6Var = (nq6) objArr[15];
            this.f25156b = 15;
            m8383f().put(nq6Var.f26041a, nq6Var.f26042b);
        }
        Object[] objArr2 = this.f25155a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.f25155a[i] = new nq6(this, comparable, obj);
        this.f25156b++;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final nq6 m8380c(int i) {
        if (i < this.f25156b) {
            return (nq6) this.f25155a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8384h();
        if (this.f25156b != 0) {
            this.f25155a = null;
            this.f25156b = 0;
        }
        if (this.f25157c.isEmpty()) {
            return;
        }
        this.f25157c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8381d(comparable) >= 0 || this.f25157c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final int m8381d(Comparable comparable) {
        int i = this.f25156b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((nq6) this.f25155a[i2]).f26041a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((nq6) this.f25155a[i4]).f26041a);
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

    /* JADX INFO: renamed from: e */
    public final Object m8382e(int i) {
        m8384h();
        Object[] objArr = this.f25155a;
        Object obj = ((nq6) objArr[i]).f26042b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f25156b - i) - 1);
        this.f25156b--;
        if (!this.f25157c.isEmpty()) {
            Iterator it = m8383f().entrySet().iterator();
            Object[] objArr2 = this.f25155a;
            int i2 = this.f25156b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new nq6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f25156b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f25159e == null) {
            this.f25159e = new C0619eo(this, (byte) 4);
        }
        return this.f25159e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq6)) {
            return super.equals(obj);
        }
        mq6 mq6Var = (mq6) obj;
        int size = size();
        if (size == mq6Var.size()) {
            int i = this.f25156b;
            if (i != mq6Var.f25156b) {
                return entrySet().equals(mq6Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m8380c(i2).equals(mq6Var.m8380c(i2))) {
                }
            }
            if (i != size) {
                return this.f25157c.equals(mq6Var.f25157c);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final SortedMap m8383f() {
        m8384h();
        if (this.f25157c.isEmpty() && !(this.f25157c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25157c = treeMap;
            this.f25160f = treeMap.descendingMap();
        }
        return (SortedMap) this.f25157c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM8381d = m8381d(comparable);
        return iM8381d >= 0 ? ((nq6) this.f25155a[iM8381d]).f26042b : this.f25157c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final void m8384h() {
        if (this.f25158d) {
            xy4.m12791t();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f25156b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f25155a[i2].hashCode();
        }
        return this.f25157c.size() > 0 ? this.f25157c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8384h();
        Comparable comparable = (Comparable) obj;
        int iM8381d = m8381d(comparable);
        if (iM8381d >= 0) {
            return m8382e(iM8381d);
        }
        if (this.f25157c.isEmpty()) {
            return null;
        }
        return this.f25157c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25157c.size() + this.f25156b;
    }
}
