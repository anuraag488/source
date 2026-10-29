package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ra3 extends AbstractC1352y1 implements Collection, dc2 {

    /* JADX INFO: renamed from: a */
    public qa3 f29115a;

    /* JADX INFO: renamed from: b */
    public Object f29116b;

    /* JADX INFO: renamed from: c */
    public Object f29117c;

    /* JADX INFO: renamed from: d */
    public final ja3 f29118d;

    public ra3(qa3 qa3Var) {
        this.f29115a = qa3Var;
        this.f29116b = qa3Var.f28342a;
        this.f29117c = qa3Var.f28343b;
        this.f29118d = qa3Var.f28344c.mo5945a();
    }

    @Override // p000.AbstractC1352y1
    /* JADX INFO: renamed from: a */
    public final int mo7889a() {
        return this.f29118d.f22138f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ja3 ja3Var = this.f29118d;
        if (ja3Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f29116b = obj;
            this.f29117c = obj;
            ja3Var.put(obj, new ql2());
            return true;
        }
        ja3Var.put(this.f29117c, new ql2(((ql2) ja3Var.get(this.f29117c)).f28553a, obj));
        ja3Var.put(obj, new ql2(this.f29117c));
        this.f29117c = obj;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final qa3 m10253b() {
        ha3 ha3VarMo5625b = this.f29118d.mo5625b();
        qa3 qa3Var = this.f29115a;
        if (ha3VarMo5625b != qa3Var.f28344c) {
            qa3Var = new qa3(this.f29116b, this.f29117c, ha3VarMo5625b);
        }
        this.f29115a = qa3Var;
        return qa3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29118d.clear();
        o85 o85Var = o85.f26446f;
        this.f29116b = o85Var;
        this.f29117c = o85Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29118d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Object obj = this.f29116b;
        ja3 ja3Var = this.f29118d;
        sa3 sa3Var = new sa3(obj, ja3Var);
        sa3Var.f30036e = this;
        sa3Var.f30039h = ja3Var.f22137e;
        VarHandle.storeStoreFence();
        return sa3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ja3 ja3Var = this.f29118d;
        ql2 ql2Var = (ql2) ja3Var.remove(obj);
        if (ql2Var == null) {
            return false;
        }
        Object obj2 = ql2Var.f28554b;
        Object obj3 = ql2Var.f28553a;
        o85 o85Var = o85.f26446f;
        if (obj3 != o85Var) {
            ja3Var.put(obj3, new ql2(((ql2) ja3Var.get(obj3)).f28553a, obj2));
        } else {
            this.f29116b = obj2;
        }
        if (obj2 != o85Var) {
            ja3Var.put(obj2, new ql2(obj3, ((ql2) ja3Var.get(obj2)).f28554b));
            return true;
        }
        this.f29117c = obj3;
        return true;
    }
}
