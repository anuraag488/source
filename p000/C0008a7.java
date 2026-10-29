package p000;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a7 {

    /* JADX INFO: renamed from: a */
    public String f144a;

    /* JADX INFO: renamed from: b */
    public boolean f145b;

    public final String toString() {
        String str = this.f144a;
        boolean z = this.f145b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
