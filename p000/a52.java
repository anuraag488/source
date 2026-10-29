package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a52 implements c52 {

    /* JADX INFO: renamed from: a */
    public String f109a;

    /* JADX INFO: renamed from: b */
    public String f110b;

    public a52(String str, String str2) {
        this.f109a = str;
        this.f110b = str2;
    }

    @Override // p000.c52
    public x42 toInstant() {
        throw new z42(this.f109a + " when parsing an Instant from \"" + y42.m12835J0(64, this.f110b) + '\"');
    }
}
