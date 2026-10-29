package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class se4 implements qe4 {

    /* JADX INFO: renamed from: c */
    public static final ds3 f30216c = new ds3((byte) 19);

    /* JADX INFO: renamed from: a */
    public volatile qe4 f30217a;

    /* JADX INFO: renamed from: b */
    public Object f30218b;

    @Override // p000.qe4
    public final Object get() {
        qe4 qe4Var = this.f30217a;
        ds3 ds3Var = f30216c;
        if (qe4Var != ds3Var) {
            synchronized (this) {
                try {
                    if (this.f30217a != ds3Var) {
                        Object obj = this.f30217a.get();
                        this.f30218b = obj;
                        this.f30217a = ds3Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f30218b;
    }

    public final String toString() {
        Object obj = this.f30217a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f30216c) {
            obj = "<supplier that returned " + this.f30218b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
