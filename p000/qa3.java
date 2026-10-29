package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qa3 extends AbstractC1019p2 implements y12, Collection, cc2 {

    /* JADX INFO: renamed from: d */
    public static final qa3 f28341d;

    /* JADX INFO: renamed from: a */
    public final Object f28342a;

    /* JADX INFO: renamed from: b */
    public final Object f28343b;

    /* JADX INFO: renamed from: c */
    public final ha3 f28344c;

    static {
        o85 o85Var = o85.f26446f;
        f28341d = new qa3(o85Var, o85Var, ha3.f20459c);
    }

    public qa3(Object obj, Object obj2, ha3 ha3Var) {
        this.f28342a = obj;
        this.f28343b = obj2;
        this.f28344c = ha3Var;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        ha3 ha3Var = this.f28344c;
        ha3Var.getClass();
        return ha3Var.f20461b;
    }

    /* JADX INFO: renamed from: b */
    public final qa3 m9808b(Object obj) {
        ha3 ha3Var = this.f28344c;
        if (ha3Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new qa3(obj, obj, ha3Var.m6289d(obj, new ql2()));
        }
        Object obj2 = this.f28343b;
        return new qa3(this.f28342a, obj, ha3Var.m6289d(obj2, new ql2(((ql2) ha3Var.get(obj2)).f28553a, obj)).m6289d(obj, new ql2(obj2)));
    }

    /* JADX INFO: renamed from: c */
    public final qa3 m9809c(Object obj) {
        ha3 ha3VarM6289d = this.f28344c;
        ql2 ql2Var = (ql2) ha3VarM6289d.get(obj);
        if (ql2Var == null) {
            return this;
        }
        Object obj2 = ql2Var.f28553a;
        Object obj3 = ql2Var.f28554b;
        zp4 zp4Var = ha3VarM6289d.f20460a;
        zp4 zp4VarM13717v = zp4Var.m13717v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (zp4Var != zp4VarM13717v) {
            ha3VarM6289d = zp4VarM13717v == null ? ha3.f20459c : new ha3(zp4VarM13717v, ha3VarM6289d.f20461b - 1);
        }
        o85 o85Var = o85.f26446f;
        if (obj2 != o85Var) {
            ha3VarM6289d = ha3VarM6289d.m6289d(obj2, new ql2(((ql2) ha3VarM6289d.get(obj2)).f28553a, obj3));
        }
        if (obj3 != o85Var) {
            ha3VarM6289d = ha3VarM6289d.m6289d(obj3, new ql2(obj2, ((ql2) ha3VarM6289d.get(obj3)).f28554b));
        }
        Object obj4 = obj2 != o85Var ? this.f28342a : obj3;
        if (obj3 != o85Var) {
            obj2 = this.f28343b;
        }
        return new qa3(obj4, obj2, ha3VarM6289d);
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f28344c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new xf1(this.f28342a, this.f28344c);
    }
}
