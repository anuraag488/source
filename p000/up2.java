package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class up2 extends AbstractCollection implements Collection, dc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32057a;

    /* JADX INFO: renamed from: b */
    public final Object f32058b;

    public /* synthetic */ up2(Object obj, byte b) {
        this.f32057a = b;
        this.f32058b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f32057a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f32057a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.f32057a;
        Object obj = this.f32058b;
        switch (b) {
            case 0:
                ((sp2) obj).clear();
                break;
            default:
                ((ja3) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.f32057a;
        Object obj2 = this.f32058b;
        switch (b) {
            case 0:
                return ((sp2) obj2).containsValue(obj);
            default:
                return ((ja3) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f32057a) {
            case 0:
                return ((sp2) this.f32058b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f32057a;
        Object obj = this.f32058b;
        switch (b) {
            case 0:
                return new qp2((sp2) obj, (byte) 2);
            default:
                ja3 ja3Var = (ja3) obj;
                aq4[] aq4VarArr = new aq4[8];
                for (int i = 0; i < 8; i++) {
                    aq4VarArr[i] = new bq4((byte) 2);
                }
                return new na3(ja3Var, aq4VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i;
        switch (this.f32057a) {
            case 0:
                sp2 sp2Var = (sp2) this.f32058b;
                sp2Var.m10894c();
                int i2 = sp2Var.f30465f;
                while (true) {
                    i = -1;
                    i2--;
                    if (i2 >= 0) {
                        if (sp2Var.f30462c[i2] >= 0 && z62.m13387o(sp2Var.f30461b[i2], obj)) {
                            i = i2;
                        }
                    }
                }
                if (i < 0) {
                    return false;
                }
                sp2Var.m10900j(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f32057a) {
            case 0:
                ((sp2) this.f32058b).m10894c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f32057a) {
            case 0:
                ((sp2) this.f32058b).m10894c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.f32057a;
        Object obj = this.f32058b;
        switch (b) {
            case 0:
                return ((sp2) obj).f30468i;
            default:
                return ((ja3) obj).f22138f;
        }
    }
}
