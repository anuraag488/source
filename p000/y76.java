package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y76 implements Serializable, p56 {

    /* JADX INFO: renamed from: a */
    public transient h60 f35005a;

    /* JADX INFO: renamed from: b */
    public p56 f35006b;

    /* JADX INFO: renamed from: c */
    public volatile transient boolean f35007c;

    /* JADX INFO: renamed from: d */
    public transient Object f35008d;

    @Override // p000.p56
    /* JADX INFO: renamed from: f */
    public final Object mo4490f() {
        if (!this.f35007c) {
            synchronized (this.f35005a) {
                try {
                    if (!this.f35007c) {
                        Object objMo4490f = this.f35006b.mo4490f();
                        this.f35008d = objMo4490f;
                        this.f35007c = true;
                        return objMo4490f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f35008d;
    }

    public final String toString() {
        return zi4.m13617q(')', "Suppliers.memoize(", (this.f35007c ? zi4.m13617q('>', "<supplier that returned ", String.valueOf(this.f35008d)) : this.f35006b).toString());
    }
}
