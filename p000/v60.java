package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v60 implements cl1 {

    /* JADX INFO: renamed from: a */
    public static final v60 f32426a = new v60();

    /* JADX INFO: renamed from: b */
    public static Boolean f32427b;

    @Override // p000.cl1
    /* JADX INFO: renamed from: b */
    public final boolean mo4039b() {
        Boolean bool = f32427b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw d55.m4363h("canFocus is read before it is written");
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: c */
    public final void mo4040c(boolean z) {
        f32427b = Boolean.valueOf(z);
    }
}
