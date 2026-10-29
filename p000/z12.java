package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z12 extends x12 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte f35699d = 0;

    /* JADX INFO: renamed from: e */
    public final transient Object f35700e;

    public z12(Object obj) {
        obj.getClass();
        this.f35700e = obj;
    }

    @Override // p000.x12, p000.o12
    /* JADX INFO: renamed from: a */
    public u12 mo6445a() {
        switch (this.f35699d) {
            case 1:
                r12 r12Var = u12.f31590b;
                Object[] objArr = {this.f35700e};
                se0.m10730k(1, objArr);
                return u12.m11199m(1, objArr);
            default:
                return super.mo6445a();
        }
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: b */
    public int mo5199b(Object[] objArr) {
        switch (this.f35699d) {
            case 1:
                objArr[0] = this.f35700e;
                return 1;
            default:
                return super.mo5199b(objArr);
        }
    }

    @Override // p000.o12, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.f35699d;
        Object obj2 = this.f35700e;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((a22) obj2).mo24a().get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        switch (this.f35699d) {
        }
        return false;
    }

    @Override // p000.x12, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f35699d) {
            case 1:
                return this.f35700e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        switch (this.f35699d) {
            case 0:
                break;
        }
        return iterator();
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: l */
    public final ru4 iterator() {
        byte b = this.f35699d;
        Object obj = this.f35700e;
        switch (b) {
            case 0:
                w12 w12Var = new w12((byte) 0);
                w12Var.f33020e = ((a22) obj).f63a.m7187b().iterator();
                w12Var.f33021f = null;
                w12Var.f33022g = z72.f35803h;
                VarHandle.storeStoreFence();
                return w12Var;
            default:
                y72 y72Var = new y72((byte) 0);
                y72Var.f34994f = obj;
                VarHandle.storeStoreFence();
                return y72Var;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f35699d) {
            case 0:
                return ((a22) this.f35700e).f64b;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f35699d) {
            case 1:
                return "[" + this.f35700e.toString() + ']';
            default:
                return super.toString();
        }
    }

    public z12(a22 a22Var) {
        this.f35700e = a22Var;
    }
}
