package p000;

/* JADX INFO: renamed from: mb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0903mb {

    /* JADX INFO: renamed from: a */
    public Object f24790a;

    /* JADX INFO: renamed from: b */
    public Object f24791b;

    /* JADX INFO: renamed from: c */
    public float f24792c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0940nb f24793d;

    /* JADX INFO: renamed from: a */
    public final void m8259a(float f, float f2) {
        C0940nb c0940nb = this.f24793d;
        d83 d83Var = (d83) c0940nb.f25607d;
        z73 z73Var = (z73) c0940nb.f25612i;
        float fM13399h = z73Var.m13399h();
        z73Var.m13400i(f);
        ((z73) c0940nb.f25613j).m13400i(f2);
        if (Float.isNaN(fM13399h)) {
            return;
        }
        boolean z = f >= fM13399h;
        if (z73Var.m13399h() == c0940nb.m8670h().m11656f(d83Var.getValue())) {
            Object objM11652b = c0940nb.m8670h().m11652b(z73Var.m13399h() + (z ? 1.0f : -1.0f), z);
            if (objM11652b == null) {
                objM11652b = d83Var.getValue();
            }
            if (z) {
                this.f24790a = d83Var.getValue();
                this.f24791b = objM11652b;
            } else {
                this.f24790a = objM11652b;
                this.f24791b = d83Var.getValue();
            }
        } else {
            Object objM11652b2 = c0940nb.m8670h().m11652b(z73Var.m13399h(), false);
            if (objM11652b2 == null) {
                objM11652b2 = d83Var.getValue();
            }
            Object objM11652b3 = c0940nb.m8670h().m11652b(z73Var.m13399h(), true);
            if (objM11652b3 == null) {
                objM11652b3 = d83Var.getValue();
            }
            this.f24790a = objM11652b2;
            this.f24791b = objM11652b3;
        }
        this.f24792c = Math.abs(c0940nb.m8670h().m11656f(this.f24790a) - c0940nb.m8670h().m11656f(this.f24791b));
        if (Math.abs(z73Var.m13399h() - c0940nb.m8670h().m11656f(d83Var.getValue())) >= this.f24792c / 2.0f) {
            Object value = z ? this.f24791b : this.f24790a;
            if (value == null) {
                value = d83Var.getValue();
            }
            if (((Boolean) ((yp1) c0940nb.f25605b).invoke(value)).booleanValue()) {
                d83Var.setValue(value);
            }
        }
    }
}
