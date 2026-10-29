package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y92 extends o24 {

    /* JADX INFO: renamed from: a */
    public final String f35041a;

    /* JADX WARN: Illegal instructions before constructor call */
    public y92(String str, String str2, Exception exc, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        this(str.concat((str2 == null || hd4.m6345k0(str2)) ? "" : "\n".concat(str2)), (i & 8) != 0 ? null : exc);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f35041a;
    }

    public y92(String str, Throwable th) {
        super(str, th);
        this.f35041a = str;
    }
}
