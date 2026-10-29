package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e00 implements InterfaceC0618en, ax4 {

    /* JADX INFO: renamed from: c */
    public Object f17554c = new e00[256];

    /* JADX INFO: renamed from: a */
    public int f17552a = 0;

    /* JADX INFO: renamed from: b */
    public int f17553b = 0;

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: b */
    public void mo4826b(int i, Object obj) {
        ((InterfaceC0618en) this.f17554c).mo4826b(i + (this.f17553b == 0 ? this.f17552a : 0), obj);
    }

    @Override // p000.InterfaceC0618en
    public void clear() {
        qi0.m9889a("Clear is not valid on OffsetApplier");
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: d */
    public void mo4827d(Object obj) {
        this.f17553b++;
        ((InterfaceC0618en) this.f17554c).mo4827d(obj);
    }

    /* JADX INFO: renamed from: e */
    public f00 m4828e() {
        f00 f00Var = new f00();
        f00Var.f18622a = this.f17552a;
        f00Var.f18623b = this.f17553b;
        f00Var.f18624c = (String) this.f17554c;
        return f00Var;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: i */
    public void mo4829i() {
        ((InterfaceC0618en) this.f17554c).mo4829i();
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: j */
    public void mo4830j(int i, Object obj) {
        ((InterfaceC0618en) this.f17554c).mo4830j(i + (this.f17553b == 0 ? this.f17552a : 0), obj);
    }

    @Override // p000.ax4
    /* JADX INFO: renamed from: k */
    public int mo3359k() {
        return this.f17553b;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: m */
    public void mo4831m(int i, int i2, int i3) {
        int i4 = this.f17553b == 0 ? this.f17552a : 0;
        ((InterfaceC0618en) this.f17554c).mo4831m(i + i4, i2 + i4, i3);
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: n */
    public Object mo4832n() {
        return ((InterfaceC0618en) this.f17554c).mo4832n();
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: o */
    public void mo4833o(int i, int i2) {
        ((InterfaceC0618en) this.f17554c).mo4833o(i + (this.f17553b == 0 ? this.f17552a : 0), i2);
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((C1283w7) this.f17554c).mo4794p(j, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: q */
    public void mo4834q(mq1 mq1Var, Object obj) {
        ((InterfaceC0618en) this.f17554c).mo4834q(mq1Var, obj);
    }

    @Override // p000.ax4
    /* JADX INFO: renamed from: r */
    public int mo3360r() {
        return this.f17552a;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((C1283w7) this.f17554c).mo4795s(j, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: u */
    public void mo4835u() {
        if (this.f17553b <= 0) {
            qi0.m9889a("OffsetApplier up called with no corresponding down");
        }
        this.f17553b--;
        ((InterfaceC0618en) this.f17554c).mo4835u();
    }
}
