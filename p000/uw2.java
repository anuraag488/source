package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uw2 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public Object[] f32211a;

    /* JADX INFO: renamed from: b */
    public aw2 f32212b;

    /* JADX INFO: renamed from: c */
    public int f32213c = 0;

    public uw2(Object[] objArr) {
        this.f32211a = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m11662a(int i, Object obj) {
        int i2 = this.f32213c + 1;
        if (this.f32211a.length < i2) {
            m11674p(i2);
        }
        Object[] objArr = this.f32211a;
        int i3 = this.f32213c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f32213c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m11663b(Object obj) {
        int i = this.f32213c + 1;
        if (this.f32211a.length < i) {
            m11674p(i);
        }
        Object[] objArr = this.f32211a;
        int i2 = this.f32213c;
        objArr[i2] = obj;
        this.f32213c = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m11664c(int i, uw2 uw2Var) {
        int i2 = uw2Var.f32213c;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f32213c + i2;
        if (this.f32211a.length < i3) {
            m11674p(i3);
        }
        Object[] objArr = this.f32211a;
        int i4 = this.f32213c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(uw2Var.f32211a, 0, objArr, i, i2);
        this.f32213c += i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m11665d(List list, int i) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f32213c + size;
        if (this.f32211a.length < i2) {
            m11674p(i2);
        }
        Object[] objArr = this.f32211a;
        int i3 = this.f32213c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f32213c += size;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11666e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f32213c + size;
        if (this.f32211a.length < i3) {
            m11674p(i3);
        }
        Object[] objArr = this.f32211a;
        int i4 = this.f32213c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                kx5.m7735t0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f32213c += size;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final List m11667f() {
        aw2 aw2Var = this.f32212b;
        if (aw2Var != null) {
            return aw2Var;
        }
        aw2 aw2Var2 = new aw2((byte) 1);
        aw2Var2.f14915b = this;
        VarHandle.storeStoreFence();
        this.f32212b = aw2Var2;
        return aw2Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m11668g() {
        Object[] objArr = this.f32211a;
        int i = this.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f32213c = 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11669h(Object obj) {
        int i = this.f32213c - 1;
        if (i >= 0) {
            for (int i2 = 0; !z62.m13387o(this.f32211a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m11670j(Object obj) {
        Object[] objArr = this.f32211a;
        int i = this.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            if (z62.m13387o(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11671k(Object obj) {
        int iM11670j = m11670j(obj);
        if (iM11670j < 0) {
            return false;
        }
        m11672l(iM11670j);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m11672l(int i) {
        Object[] objArr = this.f32211a;
        Object obj = objArr[i];
        int i2 = this.f32213c;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f32213c - 1;
        this.f32213c = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m11673m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f32213c;
            if (i2 < i3) {
                Object[] objArr = this.f32211a;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f32213c;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f32211a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f32213c = i5;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11674p(int i) {
        Object[] objArr = this.f32211a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f32211a = objArr2;
    }
}
