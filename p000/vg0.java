package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vg0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32590a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zo0 f32591b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ qe3 f32592c;

    public /* synthetic */ vg0(byte b) {
        this.f32590a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f32590a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                lb5.m7910S(this.f32591b, null, null, new ug0(null, this.f32592c, (byte) 0), 3);
                break;
            default:
                lb5.m7910S(this.f32591b, null, null, new ug0(null, this.f32592c, (byte) 1), 3);
                break;
        }
        return ju4Var;
    }
}
