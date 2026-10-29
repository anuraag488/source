package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qm5 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9910a() throws ms5 {
        throw new ms5();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9911b(int i) {
        throw new IllegalArgumentException("Length too large: " + i + i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9912c(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9913d(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9914e(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9915f(Object obj, int i) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) obj.toString()));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m9916g(String str) throws ss5 {
        throw new ss5(str);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9917h(String str) throws g86 {
        throw new g86(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m9918i(String str) throws qi6 {
        throw new qi6(str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m9919j(String str) {
        throw new UnsupportedOperationException(str);
    }
}
