package p000;

/* JADX INFO: renamed from: ib */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0756ib implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21240a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0940nb f21241b;

    public /* synthetic */ C0756ib(byte b) {
        this.f21240a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f21240a;
        C0940nb c0940nb = this.f21241b;
        switch (b) {
            case 0:
                Object value = ((d83) c0940nb.f25609f).getValue();
                if (value != null) {
                    return value;
                }
                float fM13399h = ((z73) c0940nb.f25612i).m13399h();
                d83 d83Var = (d83) c0940nb.f25607d;
                if (Float.isNaN(fM13399h)) {
                    return d83Var.getValue();
                }
                float fM11656f = c0940nb.m8670h().m11656f(d83Var.getValue());
                if (Float.isNaN(fM11656f) || fM13399h == fM11656f) {
                    return d83Var.getValue();
                }
                Object objM11651a = c0940nb.m8670h().m11651a(fM13399h);
                return objM11651a == null ? d83Var.getValue() : objM11651a;
            case 1:
                return c0940nb.m8670h();
            default:
                return new l73(c0940nb.m8670h(), ((wy0) c0940nb.f25611h).getValue());
        }
    }
}
