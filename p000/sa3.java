package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sa3 extends xf1 {

    /* JADX INFO: renamed from: e */
    public ra3 f30036e;

    /* JADX INFO: renamed from: f */
    public Object f30037f;

    /* JADX INFO: renamed from: g */
    public boolean f30038g;

    /* JADX INFO: renamed from: h */
    public int f30039h;

    @Override // p000.xf1, java.util.Iterator
    public final Object next() {
        if (this.f30036e.f29118d.f22137e != this.f30039h) {
            C1077qn.m9983c();
            return null;
        }
        Object next = super.next();
        this.f30037f = next;
        this.f30038g = true;
        return next;
    }

    @Override // p000.xf1, java.util.Iterator
    public final void remove() {
        ra3 ra3Var = this.f30036e;
        if (!this.f30038g) {
            xy4.m12787p();
            return;
        }
        as4.m3255n(ra3Var).remove(this.f30037f);
        this.f30037f = null;
        this.f30038g = false;
        this.f30039h = ra3Var.f29118d.f22137e;
        this.f34223c--;
    }
}
