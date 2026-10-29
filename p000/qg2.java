package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qg2 implements bi3 {

    /* JADX INFO: renamed from: c */
    public static final Object f28452c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f28453a = f28452c;

    /* JADX INFO: renamed from: b */
    public volatile bi3 f28454b;

    public qg2(bi3 bi3Var) {
        this.f28454b = bi3Var;
    }

    @Override // p000.bi3
    public final Object get() {
        Object obj;
        Object obj2 = this.f28453a;
        Object obj3 = f28452c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f28453a;
                if (obj == obj3) {
                    obj = this.f28454b.get();
                    this.f28453a = obj;
                    this.f28454b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
