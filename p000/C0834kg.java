package p000;

/* JADX INFO: renamed from: kg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0834kg implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23101a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1409zl f23102b;

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f23101a;
        C1409zl c1409zl = this.f23102b;
        switch (b) {
            case 0:
                return tf1.m11046Q0(c1409zl.f36165b, "datastore/default.preferences_pb");
            default:
                return tf1.m11046Q0(c1409zl.f36165b, "datastore/app_crashes");
        }
    }
}
