package p000;

/* JADX INFO: renamed from: wl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1297wl implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33456a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zo0 f33457b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33458c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f33459d;

    public /* synthetic */ C1297wl(byte b) {
        this.f33456a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f33456a;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                lb5.m7910S(this.f33457b, null, null, new C0594e0(wm0Var, this.f33458c, this.f33459d, (byte) 4), 3);
                break;
            case 1:
                lb5.m7910S(this.f33457b, null, null, new C0594e0(wm0Var, this.f33458c, this.f33459d, (byte) 10), 3);
                break;
            case 2:
                lb5.m7910S(this.f33457b, null, null, new C1260vl((wm0) null, (pz2) this.f33458c, (kr3) this.f33459d), 3);
                break;
            case 3:
                lb5.m7910S((pw3) this.f33457b, null, null, new it1(wm0Var, this.f33458c, (iq1) this.f33459d, (byte) 1), 3);
                break;
            case 4:
                lb5.m7910S(this.f33457b, null, null, new it1(wm0Var, this.f33458c, (iq1) this.f33459d, (byte) 11), 3);
                break;
            default:
                lb5.m7910S(this.f33457b, null, null, new it1(wm0Var, this.f33458c, (iq1) this.f33459d, (byte) 12), 3);
                break;
        }
        return ju4Var;
    }
}
