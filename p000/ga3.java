package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ga3 extends ha3 implements ej0, aj0 {

    /* JADX INFO: renamed from: d */
    public static final ga3 f19690d = new ga3(zp4.f36252e, 0);

    @Override // p000.ha3
    /* JADX INFO: renamed from: a */
    public final ja3 mo5945a() {
        fa3 fa3Var = new fa3(this);
        fa3Var.f18880g = this;
        return fa3Var;
    }

    @Override // p000.aj0
    /* JADX INFO: renamed from: b */
    public final Object mo2998b(xh3 xh3Var) {
        return i25.m6603B(this, xh3Var);
    }

    @Override // p000.ha3
    /* JADX INFO: renamed from: c */
    public final ja3 mo5946c() {
        fa3 fa3Var = new fa3(this);
        fa3Var.f18880g = this;
        return fa3Var;
    }

    @Override // p000.ha3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof xh3) {
            return super.containsKey((xh3) obj);
        }
        return false;
    }

    @Override // p000.ha3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof nw4) {
            return super.containsValue((nw4) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final ga3 m5947e(xh3 xh3Var, nw4 nw4Var) {
        li0 li0VarM13716u = this.f20460a.m13716u(xh3Var.hashCode(), 0, xh3Var, nw4Var);
        return li0VarM13716u == null ? this : new ga3((zp4) li0VarM13716u.f24044c, this.f20461b + (li0VarM13716u.f24043b ? 1 : 0));
    }

    @Override // p000.ha3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof xh3) {
            return (nw4) super.get((xh3) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof xh3) ? obj2 : (nw4) super.getOrDefault((xh3) obj, (nw4) obj2);
    }
}
