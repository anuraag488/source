package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class re4 implements qe4, Serializable {

    /* JADX INFO: renamed from: a */
    public y63 f29212a;

    /* JADX INFO: renamed from: b */
    public volatile transient boolean f29213b;

    /* JADX INFO: renamed from: c */
    public transient Object f29214c;

    @Override // p000.qe4
    public final Object get() {
        if (!this.f29213b) {
            synchronized (this) {
                try {
                    if (!this.f29213b) {
                        Object obj = this.f29212a.get();
                        this.f29214c = obj;
                        this.f29213b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f29214c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f29213b) {
            obj = "<supplier that returned " + this.f29214c + ">";
        } else {
            obj = this.f29212a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
