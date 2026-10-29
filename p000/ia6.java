package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ia6 implements p56 {

    /* JADX INFO: renamed from: a */
    public h60 f21237a;

    /* JADX INFO: renamed from: b */
    public volatile p56 f21238b;

    /* JADX INFO: renamed from: c */
    public Object f21239c;

    @Override // p000.p56
    /* JADX INFO: renamed from: f */
    public final Object mo4490f() {
        if (this.f21238b != null) {
            synchronized (this.f21237a) {
                try {
                    if (this.f21238b != null) {
                        Object objMo4490f = this.f21238b.mo4490f();
                        this.f21239c = objMo4490f;
                        this.f21238b = null;
                        return objMo4490f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f21239c;
    }

    public final String toString() {
        Object objM13617q = this.f21238b;
        if (objM13617q == null) {
            objM13617q = zi4.m13617q('>', "<supplier that returned ", String.valueOf(this.f21239c));
        }
        return zi4.m13617q(')', "Suppliers.memoize(", objM13617q.toString());
    }
}
