package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aw2 implements List, dc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14914a;

    /* JADX INFO: renamed from: b */
    public Object f14915b;

    public /* synthetic */ aw2(byte b) {
        this.f14914a = b;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                if (i < 0 || i > (i2 = cw2Var.f16533b)) {
                    StringBuilder sbM3883o = c75.m3883o("Index ", i, " must be in 0..");
                    sbM3883o.append(cw2Var.f16533b);
                    kx5.m7733s0(sbM3883o.toString());
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = cw2Var.f16532a;
                if (objArr.length < i3) {
                    cw2Var.m4213n(i3, objArr);
                }
                Object[] objArr2 = cw2Var.f16532a;
                int i4 = cw2Var.f16533b;
                if (i != i4) {
                    AbstractC0990oo.m9198S(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                cw2Var.f16533b++;
                return;
            default:
                ((uw2) this.f14915b).m11662a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                if (i < 0 || i > cw2Var.f16533b) {
                    StringBuilder sbM3883o = c75.m3883o("Index ", i, " must be in 0..");
                    sbM3883o.append(cw2Var.f16533b);
                    kx5.m7733s0(sbM3883o.toString());
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + cw2Var.f16533b;
                Object[] objArr = cw2Var.f16532a;
                if (objArr.length < size) {
                    cw2Var.m4213n(size, objArr);
                }
                Object[] objArr2 = cw2Var.f16532a;
                if (i != cw2Var.f16533b) {
                    AbstractC0990oo.m9198S(collection.size() + i, i, cw2Var.f16533b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    objArr2[i2 + i] = obj;
                    i2 = i3;
                }
                cw2Var.f16533b = collection.size() + cw2Var.f16533b;
                return true;
            default:
                return ((uw2) this.f14915b).m11666e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f14914a) {
            case 0:
                ((cw2) this.f14915b).m4203d();
                break;
            default:
                ((uw2) this.f14915b).m11668g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f14914a) {
            case 0:
                return ((cw2) this.f14915b).m4204e(obj);
            default:
                return ((uw2) this.f14915b).m11669h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!cw2Var.m4204e(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                uw2 uw2Var = (uw2) this.f14915b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!uw2Var.m11669h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f14914a) {
            case 0:
                q23.m9714a(this, i);
                return ((cw2) this.f14915b).m4206g(i);
            default:
                vw2.m12009a(this, i);
                return ((uw2) this.f14915b).f32211a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f14914a) {
            case 0:
                return ((cw2) this.f14915b).m4207h(obj);
            default:
                return ((uw2) this.f14915b).m11670j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f14914a) {
            case 0:
                return ((cw2) this.f14915b).m4208i();
            default:
                return ((uw2) this.f14915b).f32213c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f14914a) {
            case 0:
                return new zv2(this, 0, (byte) 0);
            default:
                return new zv2(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                Object[] objArr = cw2Var.f16532a;
                int i2 = cw2Var.f16533b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                uw2 uw2Var = (uw2) this.f14915b;
                Object[] objArr2 = uw2Var.f32211a;
                for (int i3 = uw2Var.f32213c - 1; i3 >= 0; i3--) {
                    if (z62.m13387o(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f14914a) {
            case 0:
                return new zv2(this, 0, (byte) 0);
            default:
                return new zv2(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f14914a) {
            case 0:
                q23.m9714a(this, i);
                return ((cw2) this.f14915b).m4211l(i);
            default:
                vw2.m12009a(this, i);
                return ((uw2) this.f14915b).m11672l(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                int i = cw2Var.f16533b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    cw2Var.m4210k(it.next());
                }
                return i != cw2Var.f16533b;
            default:
                uw2 uw2Var = (uw2) this.f14915b;
                if (!collection.isEmpty()) {
                    int i2 = uw2Var.f32213c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        uw2Var.m11671k(it2.next());
                    }
                    if (i2 != uw2Var.f32213c) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                int i = cw2Var.f16533b;
                Object[] objArr = cw2Var.f16532a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        cw2Var.m4211l(i2);
                    }
                }
                return i != cw2Var.f16533b;
            default:
                uw2 uw2Var = (uw2) this.f14915b;
                int i3 = uw2Var.f32213c;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(uw2Var.f32211a[i4])) {
                        uw2Var.m11672l(i4);
                    }
                }
                return i3 != uw2Var.f32213c;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f14914a) {
            case 0:
                q23.m9714a(this, i);
                return ((cw2) this.f14915b).m4214o(i, obj);
            default:
                vw2.m12009a(this, i);
                Object[] objArr = ((uw2) this.f14915b).f32211a;
                Object obj2 = objArr[i];
                objArr[i] = obj;
                return obj2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f14914a) {
            case 0:
                return ((cw2) this.f14915b).f16533b;
            default:
                return ((uw2) this.f14915b).f32213c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f14914a) {
            case 0:
                q23.m9715b(this, i, i2);
                return new bw2(this, i, i2, (byte) 0);
            default:
                vw2.m12010b(this, i, i2);
                return new bw2(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f14914a) {
            case 0:
                break;
        }
        return zy5.m13859W(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f14914a) {
            case 0:
                break;
        }
        return zy5.m13860X(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f14914a) {
            case 0:
                return new zv2(this, i, (byte) 0);
            default:
                return new zv2(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f14914a) {
            case 0:
                return ((cw2) this.f14915b).m4210k(obj);
            default:
                return ((uw2) this.f14915b).m11671k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f14914a) {
            case 0:
                ((cw2) this.f14915b).m4200a(obj);
                break;
            default:
                ((uw2) this.f14915b).m11663b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f14914a) {
            case 0:
                cw2 cw2Var = (cw2) this.f14915b;
                int i = cw2Var.f16533b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    cw2Var.m4200a(it.next());
                }
                return i != cw2Var.f16533b;
            default:
                uw2 uw2Var = (uw2) this.f14915b;
                return uw2Var.m11666e(uw2Var.f32213c, collection);
        }
    }
}
